package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.C0819c;
import com.android.volley.C0827i;
import com.android.volley.C0833o;
import com.android.volley.C0880u;
import com.android.volley.C0881v;
import com.android.volley.C0883x;
import com.android.volley.C0884y;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.google.android.gms.games.GamesClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.impl.cookie.DateUtils;

/* renamed from: com.android.volley.toolbox.c */
/* compiled from: BasicNetwork */
public class C0847c implements C0827i {

    /* renamed from: a */
    protected static final boolean f2248a = C0884y.f2331b;

    /* renamed from: d */
    private static int f2249d = GamesClient.STATUS_ACHIEVEMENT_UNLOCK_FAILURE;

    /* renamed from: e */
    private static int f2250e = 4096;

    /* renamed from: b */
    protected final C0858j f2251b;

    /* renamed from: c */
    protected final C0848d f2252c;

    public C0847c(C0858j jVar) {
        this(jVar, new C0848d(f2250e));
    }

    public C0847c(C0858j jVar, C0848d dVar) {
        this.f2251b = jVar;
        this.f2252c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        m4750a("socket", r13, (com.android.volley.C0883x) new com.android.volley.C0882w());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        m4750a("connection", r13, (com.android.volley.C0883x) new com.android.volley.C0882w());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b0, code lost:
        throw new java.lang.RuntimeException("Bad URL " + r13.mo3070f(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b5, code lost:
        r0 = r2.getStatusLine().getStatusCode();
        com.android.volley.C0884y.m4880c("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r13.mo3070f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        if (0 != 0) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d5, code lost:
        r2 = new com.android.volley.C0830l(r0, (byte[]) null, r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dd, code lost:
        if (r0 == 401) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        m4750a("auth", r13, (com.android.volley.C0883x) new com.android.volley.C0817a(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f4, code lost:
        throw new com.android.volley.C0831m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
        throw new com.android.volley.C0881v(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0100, code lost:
        throw new com.android.volley.C0829k((com.android.volley.C0830l) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0101, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0102, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f A[ExcHandler: SocketTimeoutException (e java.net.SocketTimeoutException), Splitter:B:2:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086 A[ExcHandler: ConnectTimeoutException (e org.apache.http.conn.ConnectTimeoutException), Splitter:B:2:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093 A[ExcHandler: MalformedURLException (r0v7 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ef A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.android.volley.C0830l mo3048a(com.android.volley.C0833o<?> r13) throws com.android.volley.C0883x {
        /*
            r12 = this;
            long r10 = android.os.SystemClock.elapsedRealtime()
        L_0x0004:
            r2 = 0
            r5 = 0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x00b1 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x00b1 }
            com.android.volley.c$a r3 = r13.mo3072h()     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x00b1 }
            r12.m4751a(r0, r3)     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x00b1 }
            com.android.volley.toolbox.j r3 = r12.f2251b     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x00b1 }
            org.apache.http.HttpResponse r8 = r3.mo3124a(r13, r0)     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x00b1 }
            org.apache.http.StatusLine r6 = r8.getStatusLine()     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0101 }
            int r9 = r6.getStatusCode()     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0101 }
            org.apache.http.Header[] r0 = r8.getAllHeaders()     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0101 }
            java.util.Map r7 = m4748a((org.apache.http.Header[]) r0)     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0101 }
            r0 = 304(0x130, float:4.26E-43)
            if (r9 != r0) goto L_0x0048
            com.android.volley.l r0 = new com.android.volley.l     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            r2 = 304(0x130, float:4.26E-43)
            com.android.volley.c$a r1 = r13.mo3072h()     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            if (r1 != 0) goto L_0x0041
            r1 = 0
        L_0x003c:
            r3 = 1
            r0.<init>(r2, r1, r7, r3)     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
        L_0x0040:
            return r0
        L_0x0041:
            com.android.volley.c$a r1 = r13.mo3072h()     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            byte[] r1 = r1.f2151a     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            goto L_0x003c
        L_0x0048:
            org.apache.http.HttpEntity r0 = r8.getEntity()     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            if (r0 == 0) goto L_0x007b
            org.apache.http.HttpEntity r0 = r8.getEntity()     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            byte[] r5 = r12.m4752a((org.apache.http.HttpEntity) r0)     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
        L_0x0056:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            long r2 = r0 - r10
            r1 = r12
            r4 = r13
            r1.m4749a(r2, r4, r5, r6)     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r9 < r0) goto L_0x0069
            r0 = 299(0x12b, float:4.19E-43)
            if (r9 <= r0) goto L_0x007f
        L_0x0069:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
        L_0x006f:
            r0 = move-exception
            java.lang.String r0 = "socket"
            com.android.volley.w r1 = new com.android.volley.w
            r1.<init>()
            m4750a((java.lang.String) r0, (com.android.volley.C0833o<?>) r13, (com.android.volley.C0883x) r1)
            goto L_0x0004
        L_0x007b:
            r0 = 0
            byte[] r5 = new byte[r0]     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            goto L_0x0056
        L_0x007f:
            com.android.volley.l r0 = new com.android.volley.l     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            r1 = 0
            r0.<init>(r9, r5, r7, r1)     // Catch:{ SocketTimeoutException -> 0x006f, ConnectTimeoutException -> 0x0086, MalformedURLException -> 0x0093, IOException -> 0x0104 }
            goto L_0x0040
        L_0x0086:
            r0 = move-exception
            java.lang.String r0 = "connection"
            com.android.volley.w r1 = new com.android.volley.w
            r1.<init>()
            m4750a((java.lang.String) r0, (com.android.volley.C0833o<?>) r13, (com.android.volley.C0883x) r1)
            goto L_0x0004
        L_0x0093:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Bad URL "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r13.mo3070f()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            r3 = 0
            if (r2 == 0) goto L_0x00ef
            org.apache.http.StatusLine r0 = r2.getStatusLine()
            int r0 = r0.getStatusCode()
            java.lang.String r2 = "Unexpected response code %d for %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r4[r6] = r7
            r6 = 1
            java.lang.String r7 = r13.mo3070f()
            r4[r6] = r7
            com.android.volley.C0884y.m4880c(r2, r4)
            if (r5 == 0) goto L_0x00fb
            com.android.volley.l r2 = new com.android.volley.l
            r3 = 0
            r2.<init>(r0, r5, r1, r3)
            r1 = 401(0x191, float:5.62E-43)
            if (r0 == r1) goto L_0x00e3
            r1 = 403(0x193, float:5.65E-43)
            if (r0 != r1) goto L_0x00f5
        L_0x00e3:
            java.lang.String r0 = "auth"
            com.android.volley.a r1 = new com.android.volley.a
            r1.<init>((com.android.volley.C0830l) r2)
            m4750a((java.lang.String) r0, (com.android.volley.C0833o<?>) r13, (com.android.volley.C0883x) r1)
            goto L_0x0004
        L_0x00ef:
            com.android.volley.m r1 = new com.android.volley.m
            r1.<init>(r0)
            throw r1
        L_0x00f5:
            com.android.volley.v r0 = new com.android.volley.v
            r0.<init>(r2)
            throw r0
        L_0x00fb:
            com.android.volley.k r0 = new com.android.volley.k
            r0.<init>((com.android.volley.C0830l) r3)
            throw r0
        L_0x0101:
            r0 = move-exception
            r2 = r8
            goto L_0x00b2
        L_0x0104:
            r0 = move-exception
            r1 = r7
            r2 = r8
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C0847c.mo3048a(com.android.volley.o):com.android.volley.l");
    }

    /* renamed from: a */
    private void m4749a(long j, C0833o<?> oVar, byte[] bArr, StatusLine statusLine) {
        if (f2248a || j > ((long) f2249d)) {
            Object[] objArr = new Object[5];
            objArr[0] = oVar;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(oVar.mo3088w().mo3041b());
            C0884y.m4878b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* renamed from: a */
    private static void m4750a(String str, C0833o<?> oVar, C0883x xVar) throws C0883x {
        C0880u w = oVar.mo3088w();
        int v = oVar.mo3087v();
        try {
            w.mo3040a(xVar);
            oVar.mo3061a(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(v)}));
        } catch (C0883x e) {
            oVar.mo3061a(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(v)}));
            throw e;
        }
    }

    /* renamed from: a */
    private void m4751a(Map<String, String> map, C0819c.C0820a aVar) {
        if (aVar != null) {
            if (aVar.f2152b != null) {
                map.put(C2261Q.f9793an, aVar.f2152b);
            }
            if (aVar.f2153c > 0) {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(aVar.f2153c)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3114a(String str, String str2, long j) {
        C0884y.m4876a("HTTP ERROR(%s) %d ms to fetch %s", str, Long.valueOf(SystemClock.elapsedRealtime() - j), str2);
    }

    /* renamed from: a */
    private byte[] m4752a(HttpEntity httpEntity) throws IOException, C0881v {
        C0877x xVar = new C0877x(this.f2252c, (int) httpEntity.getContentLength());
        byte[] bArr = null;
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new C0881v();
            }
            bArr = this.f2252c.mo3116a(1024);
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                xVar.write(bArr, 0, read);
            }
            byte[] byteArray = xVar.toByteArray();
            try {
            } catch (IOException e) {
                C0884y.m4876a("Error occured when calling consumingContent", new Object[0]);
            }
            return byteArray;
        } finally {
            try {
                httpEntity.consumeContent();
            } catch (IOException e2) {
                C0884y.m4876a("Error occured when calling consumingContent", new Object[0]);
            }
            this.f2252c.mo3115a(bArr);
            xVar.close();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m4748a(Header[] headerArr) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < headerArr.length; i++) {
            hashMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return hashMap;
    }
}
