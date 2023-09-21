package com.cootek.smartinput5.plugin.messagepal;

import android.os.AsyncTask;
import com.cootek.smartinput5.plugin.messagepal.C2389f;

/* renamed from: com.cootek.smartinput5.plugin.messagepal.h */
/* compiled from: MessageUpdater */
class C2392h extends AsyncTask<Object, Integer, Boolean> {

    /* renamed from: a */
    final /* synthetic */ String f10483a;

    /* renamed from: b */
    final /* synthetic */ String f10484b;

    /* renamed from: c */
    final /* synthetic */ String f10485c;

    /* renamed from: d */
    final /* synthetic */ C2389f f10486d;

    C2392h(C2389f fVar, String str, String str2, String str3) {
        this.f10486d = fVar;
        this.f10483a = str;
        this.f10484b = str2;
        this.f10485c = str3;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[SYNTHETIC, Splitter:B:30:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074 A[Catch:{ Exception -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae A[SYNTHETIC, Splitter:B:51:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3 A[Catch:{ Exception -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean doInBackground(java.lang.Object... r9) {
        /*
            r8 = this;
            r4 = 0
            r2 = 0
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r0]
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x002a }
            java.lang.String r3 = r8.f10483a     // Catch:{ MalformedURLException -> 0x002a }
            r0.<init>(r3)     // Catch:{ MalformedURLException -> 0x002a }
            java.lang.String r3 = r0.getProtocol()
            java.lang.String r5 = "http"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0033
            java.lang.String r3 = r0.getProtocol()
            java.lang.String r5 = "https"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0033
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x0029:
            return r0
        L_0x002a:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L_0x0029
        L_0x0033:
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 8
            if (r3 >= r5) goto L_0x0040
            java.lang.String r3 = "http.keepAlive"
            java.lang.String r5 = "false"
            java.lang.System.setProperty(r3, r5)
        L_0x0040:
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x00d4, all -> 0x00a9 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x00d4, all -> 0x00a9 }
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ IOException -> 0x00da, all -> 0x00be }
            int r3 = r0.getResponseCode()     // Catch:{ IOException -> 0x00df, all -> 0x00c4 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r3 != r6) goto L_0x00e9
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00df, all -> 0x00c4 }
            java.lang.String r6 = r8.f10484b     // Catch:{ IOException -> 0x00df, all -> 0x00c4 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x00df, all -> 0x00c4 }
        L_0x0059:
            int r4 = r5.read(r1)     // Catch:{ IOException -> 0x0064, all -> 0x00c9 }
            if (r4 <= 0) goto L_0x0081
            r6 = 0
            r3.write(r1, r6, r4)     // Catch:{ IOException -> 0x0064, all -> 0x00c9 }
            goto L_0x0059
        L_0x0064:
            r1 = move-exception
            r4 = r5
            r7 = r3
            r3 = r0
            r0 = r2
            r2 = r7
        L_0x006a:
            r1.printStackTrace()     // Catch:{ all -> 0x00cd }
            if (r2 == 0) goto L_0x0072
            r2.close()     // Catch:{ Exception -> 0x00d2 }
        L_0x0072:
            if (r4 == 0) goto L_0x0077
            r4.close()     // Catch:{ Exception -> 0x00d2 }
        L_0x0077:
            if (r3 == 0) goto L_0x007c
            r3.disconnect()
        L_0x007c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0029
        L_0x0081:
            r2 = 1
            com.cootek.smartinput5.plugin.messagepal.f r1 = r8.f10486d     // Catch:{ IOException -> 0x0064, all -> 0x00c9 }
            android.content.SharedPreferences r1 = r1.f10479f     // Catch:{ IOException -> 0x0064, all -> 0x00c9 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ IOException -> 0x0064, all -> 0x00c9 }
            java.lang.String r4 = "LOCAL_FILE_VERSION"
            java.lang.String r6 = r8.f10485c     // Catch:{ IOException -> 0x0064, all -> 0x00c9 }
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r6)     // Catch:{ IOException -> 0x0064, all -> 0x00c9 }
            r1.commit()     // Catch:{ IOException -> 0x0064, all -> 0x00c9 }
            r1 = r2
        L_0x0098:
            if (r3 == 0) goto L_0x009d
            r3.close()     // Catch:{ Exception -> 0x00e5 }
        L_0x009d:
            if (r5 == 0) goto L_0x00a2
            r5.close()     // Catch:{ Exception -> 0x00e5 }
        L_0x00a2:
            if (r0 == 0) goto L_0x00e7
            r0.disconnect()
            r0 = r1
            goto L_0x007c
        L_0x00a9:
            r0 = move-exception
            r3 = r4
            r5 = r4
        L_0x00ac:
            if (r3 == 0) goto L_0x00b1
            r3.close()     // Catch:{ Exception -> 0x00bc }
        L_0x00b1:
            if (r5 == 0) goto L_0x00b6
            r5.close()     // Catch:{ Exception -> 0x00bc }
        L_0x00b6:
            if (r4 == 0) goto L_0x00bb
            r4.disconnect()
        L_0x00bb:
            throw r0
        L_0x00bc:
            r1 = move-exception
            goto L_0x00b6
        L_0x00be:
            r1 = move-exception
            r3 = r4
            r5 = r4
            r4 = r0
            r0 = r1
            goto L_0x00ac
        L_0x00c4:
            r1 = move-exception
            r3 = r4
            r4 = r0
            r0 = r1
            goto L_0x00ac
        L_0x00c9:
            r1 = move-exception
            r4 = r0
            r0 = r1
            goto L_0x00ac
        L_0x00cd:
            r0 = move-exception
            r5 = r4
            r4 = r3
            r3 = r2
            goto L_0x00ac
        L_0x00d2:
            r1 = move-exception
            goto L_0x0077
        L_0x00d4:
            r0 = move-exception
            r1 = r0
            r3 = r4
            r0 = r2
            r2 = r4
            goto L_0x006a
        L_0x00da:
            r1 = move-exception
            r3 = r0
            r0 = r2
            r2 = r4
            goto L_0x006a
        L_0x00df:
            r1 = move-exception
            r3 = r0
            r0 = r2
            r2 = r4
            r4 = r5
            goto L_0x006a
        L_0x00e5:
            r2 = move-exception
            goto L_0x00a2
        L_0x00e7:
            r0 = r1
            goto L_0x007c
        L_0x00e9:
            r1 = r2
            r3 = r4
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.plugin.messagepal.C2392h.doInBackground(java.lang.Object[]):java.lang.Boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            for (C2389f.C2390a a : this.f10486d.f10480g) {
                a.mo8079a();
            }
        }
        super.onPostExecute(bool);
    }
}
