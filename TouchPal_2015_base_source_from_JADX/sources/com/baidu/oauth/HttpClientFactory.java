package com.baidu.oauth;

import android.net.Proxy;
import android.util.Log;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.HttpHost;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

class HttpClientFactory {
    private static final int DEFAULT_TIMEOUT_MILLIS = 30000;
    private static final String HTTP_USER_AGENT = "PCS_3rdApp";
    private static final int KEEP_ALIVE_DURATION_SECS = 25;
    private static final int KEEP_ALIVE_INTERVAL_SECS = 30;

    HttpClientFactory() {
    }

    public static HttpClient makeHttpClient() {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRoute() {
            public int getMaxForRoute(HttpRoute httpRoute) {
                return 6;
            }
        });
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 20);
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load((InputStream) null, (char[]) null);
            MySSLSocketFactory mySSLSocketFactory = new MySSLSocketFactory(instance);
            mySSLSocketFactory.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeRegistry.register(new Scheme("https", mySSLSocketFactory, 443));
            ClientConnectionManager clientConnectionManager = new ClientConnectionManager(basicHttpParams, schemeRegistry);
            BasicHttpParams basicHttpParams2 = new BasicHttpParams();
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            if (!(defaultHost == null || defaultPort == -1)) {
                Log.i("hybrid", "host: " + defaultHost + "," + "port: " + defaultPort);
                basicHttpParams2.setParameter("http.route.default-proxy", new HttpHost(defaultHost, defaultPort));
            }
            HttpConnectionParams.setConnectionTimeout(basicHttpParams2, DEFAULT_TIMEOUT_MILLIS);
            HttpConnectionParams.setSoTimeout(basicHttpParams2, DEFAULT_TIMEOUT_MILLIS);
            HttpProtocolParams.setVersion(basicHttpParams2, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(basicHttpParams2, Utils.UTF8);
            HttpProtocolParams.setUserAgent(basicHttpParams2, HTTP_USER_AGENT);
            return new DefaultHttpClient(clientConnectionManager, basicHttpParams2);
        } catch (KeyStoreException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        } catch (CertificateException e3) {
            e3.printStackTrace();
            return null;
        } catch (IOException e4) {
            e4.printStackTrace();
            return null;
        } catch (KeyManagementException e5) {
            e5.printStackTrace();
            return null;
        } catch (UnrecoverableKeyException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    private static class ClientConnectionManager extends ThreadSafeClientConnManager {
        public ClientConnectionManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
            super(httpParams, schemeRegistry);
        }

        public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
            IdleConnectionMonitorThread.ensureRunning(this, 25, 30);
            return HttpClientFactory.super.requestConnection(httpRoute, obj);
        }
    }

    private static class IdleConnectionMonitorThread extends Thread {
        private static IdleConnectionMonitorThread thread = null;
        private final int checkIntervalSeconds;
        private final int idleTimeoutSeconds;
        private final ClientConnectionManager manager;

        public IdleConnectionMonitorThread(ClientConnectionManager clientConnectionManager, int i, int i2) {
            this.manager = clientConnectionManager;
            this.idleTimeoutSeconds = i;
            this.checkIntervalSeconds = i2;
        }

        public static synchronized void ensureRunning(ClientConnectionManager clientConnectionManager, int i, int i2) {
            synchronized (IdleConnectionMonitorThread.class) {
                if (thread == null) {
                    thread = new IdleConnectionMonitorThread(clientConnectionManager, i, i2);
                    thread.start();
                }
            }
        }

        public void run() {
            while (true) {
                try {
                    synchronized (this) {
                        wait((long) (this.checkIntervalSeconds * 1000));
                    }
                    this.manager.closeExpiredConnections();
                    this.manager.closeIdleConnections((long) this.idleTimeoutSeconds, TimeUnit.SECONDS);
                    synchronized (IdleConnectionMonitorThread.class) {
                        if (this.manager.getConnectionsInPool() == 0) {
                            thread = null;
                            return;
                        }
                    }
                } catch (InterruptedException e) {
                    thread = null;
                    return;
                }
            }
            while (true) {
            }
        }
    }

    private static class MySSLSocketFactory extends SSLSocketFactory {
        SSLContext sslContext = SSLContext.getInstance("TLS");

        public MySSLSocketFactory(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
            super(keyStore);
            C08941 r0 = new X509TrustManager() {
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            this.sslContext.init((KeyManager[]) null, new TrustManager[]{r0}, (SecureRandom) null);
        }

        public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
            return this.sslContext.getSocketFactory().createSocket(socket, str, i, z);
        }

        public Socket createSocket() throws IOException {
            return this.sslContext.getSocketFactory().createSocket();
        }
    }
}
