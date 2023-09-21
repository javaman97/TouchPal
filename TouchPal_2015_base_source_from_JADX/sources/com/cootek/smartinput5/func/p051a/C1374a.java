package com.cootek.smartinput5.func.p051a;

import android.content.ContentResolver;
import android.util.Log;
import com.cootek.smartinput.utilities.C1017y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.cootek.smartinput5.func.a.a */
/* compiled from: CootekHttpClient */
public class C1374a implements HttpClient {

    /* renamed from: a */
    public static long f4310a = 256;

    /* renamed from: b */
    private static final String f4311b = "CootekHttpClient";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final HttpRequestInterceptor f4312c = new C1377b();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final ThreadLocal<Boolean> f4313d = new ThreadLocal<>();

    /* renamed from: e */
    private final HttpClient f4314e;

    /* renamed from: f */
    private RuntimeException f4315f = new IllegalStateException("Please close http client, or resource leaked");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile C1375a f4316g;

    /* renamed from: a */
    public static C1374a m6385a(String str) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 16384);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        return new C1374a(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    private C1374a(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f4314e = new C1378c(this, clientConnectionManager, httpParams);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (this.f4315f != null) {
            C1017y.m5214a(f4311b, "Leak was found", (Throwable) this.f4315f);
            this.f4315f = null;
        }
    }

    /* renamed from: a */
    public static void m6389a(HttpRequest httpRequest) {
        httpRequest.addHeader("Accept-Encoding", "gzip");
    }

    /* renamed from: a */
    public static void m6390a(boolean z) {
        f4313d.set(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static InputStream m6386a(HttpEntity httpEntity) throws IOException {
        Header contentEncoding;
        String value;
        InputStream inputStream;
        InputStream content = httpEntity.getContent();
        if (content == null || (contentEncoding = httpEntity.getContentEncoding()) == null || (value = contentEncoding.getValue()) == null) {
            return content;
        }
        if (value.contains("gzip")) {
            inputStream = new GZIPInputStream(content);
        } else {
            inputStream = content;
        }
        return inputStream;
    }

    /* renamed from: a */
    public void mo5865a() {
        if (this.f4315f != null) {
            getConnectionManager().shutdown();
            this.f4315f = null;
        }
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest) throws IOException {
        return this.f4314e.execute(httpUriRequest);
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return this.f4314e.execute(httpUriRequest, httpContext);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return this.f4314e.execute(httpHost, httpRequest);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return this.f4314e.execute(httpHost, httpRequest, httpContext);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException {
        return this.f4314e.execute(httpUriRequest, responseHandler);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException, ClientProtocolException {
        return this.f4314e.execute(httpUriRequest, responseHandler, httpContext);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException {
        return this.f4314e.execute(httpHost, httpRequest, responseHandler);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException, ClientProtocolException {
        return this.f4314e.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public HttpParams getParams() {
        return this.f4314e.getParams();
    }

    public ClientConnectionManager getConnectionManager() {
        return this.f4314e.getConnectionManager();
    }

    /* renamed from: a */
    public static AbstractHttpEntity m6388a(byte[] bArr, ContentResolver contentResolver) throws IOException {
        if (((long) bArr.length) < m6383a(contentResolver)) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        return byteArrayEntity;
    }

    /* renamed from: a */
    public static long m6383a(ContentResolver contentResolver) {
        return f4310a;
    }

    /* renamed from: com.cootek.smartinput5.func.a.a$a */
    /* compiled from: CootekHttpClient */
    private static class C1375a {

        /* renamed from: a */
        private final int f4317a;

        /* renamed from: b */
        private final String f4318b;

        /* synthetic */ C1375a(String str, int i, C1377b bVar) {
            this(str, i);
        }

        private C1375a(String str, int i) {
            this.f4318b = str;
            this.f4317a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m6398a(String str) {
            Log.println(this.f4317a, this.f4318b, str);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m6399a() {
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public boolean m6401b() {
            return Log.isLoggable(this.f4318b, this.f4317a);
        }
    }

    /* renamed from: a */
    public void mo5866a(String str, int i) {
        if (str == null) {
            throw new NullPointerException("name");
        } else if (i < 2 || i > 7) {
            throw new IllegalArgumentException("Curl log level is out of range [2..7]");
        } else {
            this.f4316g = new C1375a(str, i, (C1377b) null);
        }
    }

    /* renamed from: b */
    public void mo5867b() {
        this.f4316g = null;
    }

    /* renamed from: com.cootek.smartinput5.func.a.a$b */
    /* compiled from: CootekHttpClient */
    private class C1376b implements HttpRequestInterceptor {
        private C1376b() {
        }

        /* synthetic */ C1376b(C1374a aVar, C1377b bVar) {
            this();
        }

        public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
            C1375a a = C1374a.this.f4316g;
            if (a != null && (httpRequest instanceof HttpUriRequest) && a.m6401b()) {
                a.m6398a(C1374a.m6391b((HttpUriRequest) httpRequest, a.m6399a()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m6391b(org.apache.http.client.methods.HttpUriRequest r8, boolean r9) throws java.io.IOException {
        /*
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "curl "
            r2.append(r0)
            org.apache.http.Header[] r1 = r8.getAllHeaders()
            int r3 = r1.length
            r0 = 0
        L_0x0010:
            if (r0 >= r3) goto L_0x0047
            r4 = r1[r0]
            if (r9 != 0) goto L_0x0031
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "Authorization"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x002e
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "Cookie"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0031
        L_0x002e:
            int r0 = r0 + 1
            goto L_0x0010
        L_0x0031:
            java.lang.String r5 = "--header \""
            r2.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            r2.append(r4)
            java.lang.String r4 = "\" "
            r2.append(r4)
            goto L_0x002e
        L_0x0047:
            java.net.URI r1 = r8.getURI()
            boolean r0 = r8 instanceof org.apache.http.impl.client.RequestWrapper
            if (r0 == 0) goto L_0x00af
            r0 = r8
            org.apache.http.impl.client.RequestWrapper r0 = (org.apache.http.impl.client.RequestWrapper) r0
            org.apache.http.HttpRequest r0 = r0.getOriginal()
            boolean r3 = r0 instanceof org.apache.http.client.methods.HttpUriRequest
            if (r3 == 0) goto L_0x00af
            org.apache.http.client.methods.HttpUriRequest r0 = (org.apache.http.client.methods.HttpUriRequest) r0
            java.net.URI r0 = r0.getURI()
        L_0x0060:
            java.lang.String r1 = "\""
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "\""
            r2.append(r0)
            boolean r0 = r8 instanceof org.apache.http.HttpEntityEnclosingRequest
            if (r0 == 0) goto L_0x00a4
            org.apache.http.HttpEntityEnclosingRequest r8 = (org.apache.http.HttpEntityEnclosingRequest) r8
            org.apache.http.HttpEntity r0 = r8.getEntity()
            if (r0 == 0) goto L_0x00a4
            boolean r1 = r0.isRepeatable()
            if (r1 == 0) goto L_0x00a4
            long r4 = r0.getContentLength()
            r6 = 1024(0x400, double:5.06E-321)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a9
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r0.writeTo(r1)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = " --data-ascii \""
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "\""
            r0.append(r1)
        L_0x00a4:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x00a9:
            java.lang.String r0 = " [TOO MUCH DATA TO INCLUDE]"
            r2.append(r0)
            goto L_0x00a4
        L_0x00af:
            r0 = r1
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.p051a.C1374a.m6391b(org.apache.http.client.methods.HttpUriRequest, boolean):java.lang.String");
    }
}
