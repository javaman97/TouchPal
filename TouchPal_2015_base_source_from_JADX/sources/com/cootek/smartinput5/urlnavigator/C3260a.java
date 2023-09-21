package com.cootek.smartinput5.urlnavigator;

import android.util.Log;
import java.net.HttpURLConnection;

/* renamed from: com.cootek.smartinput5.urlnavigator.a */
/* compiled from: FaviconPullTask */
public class C3260a {

    /* renamed from: a */
    private static final int f14344a = 8192;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3265f f14345b;

    /* renamed from: c */
    private int f14346c;

    /* renamed from: d */
    private HttpURLConnection f14347d;

    /* renamed from: e */
    private boolean f14348e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f14349f;

    public C3260a(C3265f fVar) {
        this.f14345b = fVar;
    }

    /* renamed from: a */
    public void mo10432a() {
        if (this.f14347d != null) {
            this.f14347d.disconnect();
        }
    }

    /* renamed from: b */
    public void mo10433b() {
        if (!this.f14348e) {
            this.f14346c = 0;
            m14485d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m14485d() {
        this.f14348e = true;
        int c = this.f14345b.mo10452c(this.f14346c);
        if (c != -1) {
            C3262c a = this.f14345b.mo10445a(c);
            Log.d("urlnavigator", "####" + a.f14355d + " -- " + a.f14354c);
            new C3261b(this, a).execute(new Object[0]);
            this.f14346c = c + 1;
            return;
        }
        this.f14348e = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.io.File} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ec, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00fc, code lost:
        r2 = null;
        r4 = r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095 A[SYNTHETIC, Splitter:B:38:0x0095] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a A[Catch:{ Exception -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d8 A[SYNTHETIC, Splitter:B:64:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dd A[Catch:{ Exception -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ec A[ExcHandler: all (th java.lang.Throwable), Splitter:B:23:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m14482a(com.cootek.smartinput5.urlnavigator.C3262c r9) {
        /*
            r8 = this;
            r3 = 0
            r1 = 0
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r0]
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0029 }
            java.lang.String r2 = r9.f14354c     // Catch:{ MalformedURLException -> 0x0029 }
            r0.<init>(r2)     // Catch:{ MalformedURLException -> 0x0029 }
            if (r0 == 0) goto L_0x0027
            java.lang.String r2 = "http"
            java.lang.String r4 = r0.getProtocol()
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 != 0) goto L_0x002f
            java.lang.String r2 = "https"
            java.lang.String r4 = r0.getProtocol()
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 != 0) goto L_0x002f
        L_0x0027:
            r0 = r1
        L_0x0028:
            return r0
        L_0x0029:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r1
            goto L_0x0028
        L_0x002f:
            java.lang.String r2 = r0.getHost()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x003b
            r0 = r1
            goto L_0x0028
        L_0x003b:
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00b6 }
            java.lang.String r4 = r0.getProtocol()     // Catch:{ MalformedURLException -> 0x00b6 }
            java.lang.String r5 = r0.getHost()     // Catch:{ MalformedURLException -> 0x00b6 }
            int r0 = r0.getPort()     // Catch:{ MalformedURLException -> 0x00b6 }
            java.lang.String r7 = "/favicon.ico"
            r2.<init>(r4, r5, r0, r7)     // Catch:{ MalformedURLException -> 0x00b6 }
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 8
            if (r0 >= r4) goto L_0x005b
            java.lang.String r0 = "http.keepAlive"
            java.lang.String r4 = "false"
            java.lang.System.setProperty(r0, r4)
        L_0x005b:
            java.net.URLConnection r0 = r2.openConnection()     // Catch:{ IOException -> 0x00f7, all -> 0x00d4 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x00f7, all -> 0x00d4 }
            r8.f14347d = r0     // Catch:{ IOException -> 0x00f7, all -> 0x00d4 }
            java.net.HttpURLConnection r0 = r8.f14347d     // Catch:{ IOException -> 0x00f7, all -> 0x00d4 }
            if (r0 == 0) goto L_0x010a
            java.net.HttpURLConnection r0 = r8.f14347d     // Catch:{ IOException -> 0x00f7, all -> 0x00d4 }
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ IOException -> 0x00f7, all -> 0x00d4 }
            java.net.HttpURLConnection r0 = r8.f14347d     // Catch:{ IOException -> 0x00fb, all -> 0x00ec }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x00fb, all -> 0x00ec }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x0108
            com.cootek.smartinput5.urlnavigator.f r0 = r8.f14345b     // Catch:{ IOException -> 0x00fb, all -> 0x00ec }
            java.io.File r4 = r9.mo10441b((com.cootek.smartinput5.urlnavigator.C3265f) r0)     // Catch:{ IOException -> 0x00fb, all -> 0x00ec }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ff, all -> 0x00ec }
            r2.<init>(r4)     // Catch:{ IOException -> 0x00ff, all -> 0x00ec }
        L_0x0082:
            int r0 = r5.read(r6)     // Catch:{ IOException -> 0x008d, all -> 0x00ee }
            if (r0 <= 0) goto L_0x00bd
            r3 = 0
            r2.write(r6, r3, r0)     // Catch:{ IOException -> 0x008d, all -> 0x00ee }
            goto L_0x0082
        L_0x008d:
            r0 = move-exception
            r3 = r4
            r4 = r5
        L_0x0090:
            r0.printStackTrace()     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x0098
            r2.close()     // Catch:{ Exception -> 0x00f5 }
        L_0x0098:
            if (r4 == 0) goto L_0x009d
            r4.close()     // Catch:{ Exception -> 0x00f5 }
        L_0x009d:
            java.net.HttpURLConnection r0 = r8.f14347d
            if (r0 == 0) goto L_0x0106
            java.net.HttpURLConnection r0 = r8.f14347d
            r0.disconnect()
            r0 = r1
        L_0x00a7:
            if (r0 != 0) goto L_0x0028
            if (r3 == 0) goto L_0x0028
            boolean r1 = r3.exists()
            if (r1 == 0) goto L_0x0028
            r3.delete()
            goto L_0x0028
        L_0x00b6:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r1
            goto L_0x0028
        L_0x00bd:
            r1 = 1
            r3 = r4
        L_0x00bf:
            if (r2 == 0) goto L_0x00c4
            r2.close()     // Catch:{ Exception -> 0x0104 }
        L_0x00c4:
            if (r5 == 0) goto L_0x00c9
            r5.close()     // Catch:{ Exception -> 0x0104 }
        L_0x00c9:
            java.net.HttpURLConnection r0 = r8.f14347d
            if (r0 == 0) goto L_0x0106
            java.net.HttpURLConnection r0 = r8.f14347d
            r0.disconnect()
            r0 = r1
            goto L_0x00a7
        L_0x00d4:
            r0 = move-exception
            r5 = r3
        L_0x00d6:
            if (r3 == 0) goto L_0x00db
            r3.close()     // Catch:{ Exception -> 0x00ea }
        L_0x00db:
            if (r5 == 0) goto L_0x00e0
            r5.close()     // Catch:{ Exception -> 0x00ea }
        L_0x00e0:
            java.net.HttpURLConnection r1 = r8.f14347d
            if (r1 == 0) goto L_0x00e9
            java.net.HttpURLConnection r1 = r8.f14347d
            r1.disconnect()
        L_0x00e9:
            throw r0
        L_0x00ea:
            r1 = move-exception
            goto L_0x00e0
        L_0x00ec:
            r0 = move-exception
            goto L_0x00d6
        L_0x00ee:
            r0 = move-exception
            r3 = r2
            goto L_0x00d6
        L_0x00f1:
            r0 = move-exception
            r3 = r2
            r5 = r4
            goto L_0x00d6
        L_0x00f5:
            r0 = move-exception
            goto L_0x009d
        L_0x00f7:
            r0 = move-exception
            r2 = r3
            r4 = r3
            goto L_0x0090
        L_0x00fb:
            r0 = move-exception
            r2 = r3
            r4 = r5
            goto L_0x0090
        L_0x00ff:
            r0 = move-exception
            r2 = r3
            r3 = r4
            r4 = r5
            goto L_0x0090
        L_0x0104:
            r0 = move-exception
            goto L_0x00c9
        L_0x0106:
            r0 = r1
            goto L_0x00a7
        L_0x0108:
            r2 = r3
            goto L_0x00bf
        L_0x010a:
            r2 = r3
            r5 = r3
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.urlnavigator.C3260a.m14482a(com.cootek.smartinput5.urlnavigator.c):boolean");
    }

    /* renamed from: c */
    public void mo10434c() {
        mo10432a();
        this.f14349f = true;
    }
}
