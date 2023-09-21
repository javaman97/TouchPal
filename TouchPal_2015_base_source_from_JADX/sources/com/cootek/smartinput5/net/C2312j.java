package com.cootek.smartinput5.net;

import android.os.AsyncTask;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.net.j */
/* compiled from: AdvertiseUpdater */
class C2312j extends AsyncTask<Object, Integer, Boolean> {

    /* renamed from: a */
    final /* synthetic */ String f10177a;

    /* renamed from: b */
    final /* synthetic */ C2310h f10178b;

    C2312j(C2310h hVar, String str) {
        this.f10178b = hVar;
        this.f10177a = str;
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082 A[SYNTHETIC, Splitter:B:33:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087 A[Catch:{ Exception -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ac A[SYNTHETIC, Splitter:B:51:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1 A[Catch:{ Exception -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean doInBackground(java.lang.Object... r9) {
        /*
            r8 = this;
            r3 = 0
            r1 = 0
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x002a }
            java.lang.String r4 = r8.f10177a     // Catch:{ MalformedURLException -> 0x002a }
            r0.<init>(r4)     // Catch:{ MalformedURLException -> 0x002a }
            java.lang.String r4 = r0.getProtocol()
            java.lang.String r5 = "http"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0033
            java.lang.String r4 = r0.getProtocol()
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0033
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L_0x0029:
            return r0
        L_0x002a:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x0029
        L_0x0033:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 8
            if (r4 >= r5) goto L_0x0040
            java.lang.String r4 = "http.keepAlive"
            java.lang.String r5 = "false"
            java.lang.System.setProperty(r4, r5)
        L_0x0040:
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x00d0, all -> 0x00a7 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x00d0, all -> 0x00a7 }
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ IOException -> 0x00d4, all -> 0x00bc }
            int r4 = r0.getResponseCode()     // Catch:{ IOException -> 0x00d9, all -> 0x00c1 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r4 != r6) goto L_0x00e3
            com.cootek.smartinput5.net.h r4 = r8.f10178b     // Catch:{ IOException -> 0x00d9, all -> 0x00c1 }
            android.content.Context r4 = r4.f10174b     // Catch:{ IOException -> 0x00d9, all -> 0x00c1 }
            java.lang.String r6 = "advertise"
            java.io.File r6 = com.cootek.smartinput5.func.C1466av.m6849a((android.content.Context) r4, (java.lang.String) r6)     // Catch:{ IOException -> 0x00d9, all -> 0x00c1 }
            boolean r4 = r6.exists()     // Catch:{ IOException -> 0x00d9, all -> 0x00c1 }
            if (r4 != 0) goto L_0x0067
            r6.createNewFile()     // Catch:{ IOException -> 0x00d9, all -> 0x00c1 }
        L_0x0067:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00d9, all -> 0x00c1 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x00d9, all -> 0x00c1 }
        L_0x006c:
            int r3 = r5.read(r2)     // Catch:{ IOException -> 0x0077, all -> 0x00c5 }
            if (r3 <= 0) goto L_0x0095
            r6 = 0
            r4.write(r2, r6, r3)     // Catch:{ IOException -> 0x0077, all -> 0x00c5 }
            goto L_0x006c
        L_0x0077:
            r2 = move-exception
            r3 = r5
            r7 = r4
            r4 = r0
            r0 = r2
            r2 = r7
        L_0x007d:
            r0.printStackTrace()     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x0085
            r2.close()     // Catch:{ Exception -> 0x00ce }
        L_0x0085:
            if (r3 == 0) goto L_0x008a
            r3.close()     // Catch:{ Exception -> 0x00ce }
        L_0x008a:
            if (r4 == 0) goto L_0x00e1
            r4.disconnect()
            r0 = r1
        L_0x0090:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0029
        L_0x0095:
            r1 = 1
        L_0x0096:
            if (r4 == 0) goto L_0x009b
            r4.close()     // Catch:{ Exception -> 0x00df }
        L_0x009b:
            if (r5 == 0) goto L_0x00a0
            r5.close()     // Catch:{ Exception -> 0x00df }
        L_0x00a0:
            if (r0 == 0) goto L_0x00e1
            r0.disconnect()
            r0 = r1
            goto L_0x0090
        L_0x00a7:
            r0 = move-exception
            r5 = r3
            r4 = r3
        L_0x00aa:
            if (r3 == 0) goto L_0x00af
            r3.close()     // Catch:{ Exception -> 0x00ba }
        L_0x00af:
            if (r5 == 0) goto L_0x00b4
            r5.close()     // Catch:{ Exception -> 0x00ba }
        L_0x00b4:
            if (r4 == 0) goto L_0x00b9
            r4.disconnect()
        L_0x00b9:
            throw r0
        L_0x00ba:
            r1 = move-exception
            goto L_0x00b4
        L_0x00bc:
            r1 = move-exception
            r5 = r3
            r4 = r0
            r0 = r1
            goto L_0x00aa
        L_0x00c1:
            r1 = move-exception
            r4 = r0
            r0 = r1
            goto L_0x00aa
        L_0x00c5:
            r1 = move-exception
            r3 = r4
            r4 = r0
            r0 = r1
            goto L_0x00aa
        L_0x00ca:
            r0 = move-exception
            r5 = r3
            r3 = r2
            goto L_0x00aa
        L_0x00ce:
            r0 = move-exception
            goto L_0x008a
        L_0x00d0:
            r0 = move-exception
            r2 = r3
            r4 = r3
            goto L_0x007d
        L_0x00d4:
            r2 = move-exception
            r4 = r0
            r0 = r2
            r2 = r3
            goto L_0x007d
        L_0x00d9:
            r2 = move-exception
            r4 = r0
            r0 = r2
            r2 = r3
            r3 = r5
            goto L_0x007d
        L_0x00df:
            r2 = move-exception
            goto L_0x00a0
        L_0x00e1:
            r0 = r1
            goto L_0x0090
        L_0x00e3:
            r4 = r3
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.net.C2312j.doInBackground(java.lang.Object[]):java.lang.Boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            C1368X.m6320c().mo5853z().mo6627a();
        }
        super.onPostExecute(bool);
    }
}
