package com.cootek.smartinput5.plugin.twitter;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: com.cootek.smartinput5.plugin.twitter.f */
/* compiled from: FakeSSLSocketFactory */
public class C2405f extends SSLSocketFactory {

    /* renamed from: a */
    SSLContext f10538a = SSLContext.getInstance("TLS");

    public C2405f(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        super(keyStore);
        C2406g gVar = new C2406g(this);
        this.f10538a.init((KeyManager[]) null, new TrustManager[]{gVar}, (SecureRandom) null);
    }

    public Socket createSocket() throws IOException {
        return this.f10538a.getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        return this.f10538a.getSocketFactory().createSocket(socket, str, i, z);
    }
}
