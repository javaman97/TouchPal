package com.cootek.smartinput5.func.p051a;

import android.content.ContentValues;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URI;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.cootek.smartinput5.func.a.g */
/* compiled from: TouchPalHttpClient */
public class C1382g implements HttpClient {

    /* renamed from: a */
    private static final String f4335a = "SmartDialerHttpClient";

    /* renamed from: b */
    private final C1374a f4336b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ThreadLocal<Boolean> f4337c = new ThreadLocal<>();

    public C1382g(String str) {
        this.f4336b = C1374a.m6385a(str);
    }

    public C1382g(String str, boolean z) {
        SocketFactory bVar;
        String str2 = str + " (" + Build.DEVICE + " " + Build.ID + ")";
        this.f4336b = C1374a.m6385a(z ? str2 + "; gzip" : str2);
        SchemeRegistry schemeRegistry = getConnectionManager().getSchemeRegistry();
        for (String str3 : schemeRegistry.getSchemeNames()) {
            Scheme unregister = schemeRegistry.unregister(str3);
            SocketFactory socketFactory = unregister.getSocketFactory();
            if (socketFactory instanceof LayeredSocketFactory) {
                bVar = new C1384a((LayeredSocketFactory) socketFactory);
            } else {
                bVar = new C1385b(socketFactory);
            }
            schemeRegistry.register(new Scheme(str3, bVar, unregister.getDefaultPort()));
        }
    }

    /* renamed from: com.cootek.smartinput5.func.a.g$b */
    /* compiled from: TouchPalHttpClient */
    private class C1385b implements SocketFactory {

        /* renamed from: a */
        private SocketFactory f4340a;

        private C1385b(SocketFactory socketFactory) {
            this.f4340a = socketFactory;
        }

        public final Socket createSocket() throws IOException {
            return this.f4340a.createSocket();
        }

        public final boolean isSecure(Socket socket) {
            return this.f4340a.isSecure(socket);
        }

        public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) throws IOException {
            C1382g.this.f4337c.set(true);
            return this.f4340a.connectSocket(socket, str, i, inetAddress, i2, httpParams);
        }
    }

    /* renamed from: com.cootek.smartinput5.func.a.g$a */
    /* compiled from: TouchPalHttpClient */
    private class C1384a extends C1385b implements LayeredSocketFactory {

        /* renamed from: c */
        private LayeredSocketFactory f4339c;

        private C1384a(LayeredSocketFactory layeredSocketFactory) {
            super(layeredSocketFactory);
            this.f4339c = layeredSocketFactory;
        }

        public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
            return this.f4339c.createSocket(socket, str, i, z);
        }
    }

    /* renamed from: a */
    public void mo5889a() {
        this.f4336b.mo5865a();
    }

    /* renamed from: a */
    public HttpResponse mo5888a(HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.f4337c.set((Object) null);
            HttpResponse execute = this.f4336b.execute(httpUriRequest, httpContext);
            int statusCode = execute.getStatusLine().getStatusCode();
            try {
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                new ContentValues();
                if (statusCode >= 0) {
                    Integer.toString(statusCode);
                }
            } catch (Exception e) {
                Log.e(f4335a, "Error recording stats", e);
            }
            return execute;
        } catch (Throwable th) {
            try {
                long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                new ContentValues();
            } catch (Exception e2) {
                Log.e(f4335a, "Error recording stats", e2);
            }
            throw th;
        }
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        URI uri = httpUriRequest.getURI();
        RequestWrapper a = m6411a(httpUriRequest);
        a.setURI(uri);
        return mo5888a((HttpUriRequest) a, httpContext);
    }

    /* renamed from: a */
    private static RequestWrapper m6411a(HttpUriRequest httpUriRequest) throws IOException {
        EntityEnclosingRequestWrapper requestWrapper;
        try {
            if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                requestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpUriRequest);
            } else {
                requestWrapper = new RequestWrapper(httpUriRequest);
            }
            requestWrapper.resetHeaders();
            return requestWrapper;
        } catch (ProtocolException e) {
            throw new ClientProtocolException(e);
        }
    }

    /* renamed from: a */
    public static String m6409a(String str) {
        return str + "; gzip";
    }

    public HttpParams getParams() {
        return this.f4336b.getParams();
    }

    public ClientConnectionManager getConnectionManager() {
        return this.f4336b.getConnectionManager();
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest) throws IOException {
        return execute(httpUriRequest, (HttpContext) null);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return this.f4336b.execute(httpHost, httpRequest);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return this.f4336b.execute(httpHost, httpRequest, httpContext);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException {
        return this.f4336b.execute(httpUriRequest, responseHandler);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException, ClientProtocolException {
        return this.f4336b.execute(httpUriRequest, responseHandler, httpContext);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException {
        return this.f4336b.execute(httpHost, httpRequest, responseHandler);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException, ClientProtocolException {
        return this.f4336b.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    /* renamed from: a */
    public void mo5890a(String str, int i) {
        this.f4336b.mo5866a(str, i);
    }

    /* renamed from: b */
    public void mo5891b() {
        this.f4336b.mo5867b();
    }
}
