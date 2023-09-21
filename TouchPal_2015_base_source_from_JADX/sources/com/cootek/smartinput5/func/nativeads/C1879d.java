package com.cootek.smartinput5.func.nativeads;

import android.text.TextUtils;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.cmd.C2259P;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.cootek.smartinput5.func.nativeads.d */
/* compiled from: DefaultAdsLoader */
public class C1879d extends C1894r {

    /* renamed from: c */
    private static final String f6260c = "_default_ads.json";

    public C1879d(C1902y yVar) {
        super(yVar);
        if (this.f6340b == null) {
            this.f6340b = new CopyOnWriteArrayList();
        }
        try {
            m8640g();
        } catch (IOException e) {
        }
    }

    /* renamed from: a */
    public void mo7002a() {
        Settings.getInstance().setLongSetting(Settings.ADVERTISE_UPDATE_TIME, System.currentTimeMillis(), 33, this.f6259a.f6436b + C1902y.f6428a, (Config) null, false);
        mo7032a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7014a(C2259P p) {
        super.mo7014a(p);
        try {
            m8641h();
        } catch (IOException e) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7015d() {
    }

    /* renamed from: c */
    public void mo7007c() {
    }

    /* renamed from: a */
    public void mo7004a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Iterator it = this.f6340b.iterator();
            while (it.hasNext()) {
                C1875a aVar = (C1875a) it.next();
                if (str.equalsIgnoreCase(aVar.f6258f)) {
                    aVar.mo6998b();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7016e() {
        return "ads_icon__default_" + this.f6259a.f6436b;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8640g() throws java.io.IOException {
        /*
            r7 = this;
            r1 = 0
            com.cootek.smartinput5.func.nativeads.y r0 = r7.f6259a
            if (r0 == 0) goto L_0x0009
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.f6340b
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            return
        L_0x000a:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = ".temp"
            java.io.File r2 = com.cootek.smartinput5.func.C1358O.m6234a((java.lang.String) r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.cootek.smartinput5.func.nativeads.y r4 = r7.f6259a
            java.lang.String r4 = r4.f6436b
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "_default_ads.json"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r2, r3)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x0009
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00e1, UnsupportedEncodingException -> 0x0091, IOException -> 0x00a0, JSONException -> 0x00af, all -> 0x00be }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00e1, UnsupportedEncodingException -> 0x0091, IOException -> 0x00a0, JSONException -> 0x00af, all -> 0x00be }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00e5, UnsupportedEncodingException -> 0x00dc, IOException -> 0x00d7, JSONException -> 0x00d2, all -> 0x00cb }
            java.lang.String r3 = "UTF-8"
            r0.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x00e5, UnsupportedEncodingException -> 0x00dc, IOException -> 0x00d7, JSONException -> 0x00d2, all -> 0x00cb }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            r3.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
        L_0x0048:
            java.lang.String r4 = r3.readLine()     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            if (r4 == 0) goto L_0x0064
            r1.append(r4)     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            java.lang.String r4 = "\n"
            r1.append(r4)     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            goto L_0x0048
        L_0x0057:
            r1 = move-exception
            r1 = r2
        L_0x0059:
            if (r0 == 0) goto L_0x005e
            r0.close()
        L_0x005e:
            if (r1 == 0) goto L_0x0009
            r1.close()
            goto L_0x0009
        L_0x0064:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            r3.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            r1 = 0
        L_0x006e:
            int r4 = r3.length()     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            if (r1 >= r4) goto L_0x0085
            org.json.JSONObject r4 = r3.getJSONObject(r1)     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            com.cootek.smartinput5.func.nativeads.m r5 = new com.cootek.smartinput5.func.nativeads.m     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            java.util.concurrent.CopyOnWriteArrayList r4 = r7.f6340b     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            r4.add(r5)     // Catch:{ FileNotFoundException -> 0x0057, UnsupportedEncodingException -> 0x00df, IOException -> 0x00da, JSONException -> 0x00d5, all -> 0x00cd }
            int r1 = r1 + 1
            goto L_0x006e
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r0.close()
        L_0x008a:
            if (r2 == 0) goto L_0x0009
            r2.close()
            goto L_0x0009
        L_0x0091:
            r0 = move-exception
            r0 = r1
            r2 = r1
        L_0x0094:
            if (r0 == 0) goto L_0x0099
            r0.close()
        L_0x0099:
            if (r2 == 0) goto L_0x0009
            r2.close()
            goto L_0x0009
        L_0x00a0:
            r0 = move-exception
            r0 = r1
            r2 = r1
        L_0x00a3:
            if (r0 == 0) goto L_0x00a8
            r0.close()
        L_0x00a8:
            if (r2 == 0) goto L_0x0009
            r2.close()
            goto L_0x0009
        L_0x00af:
            r0 = move-exception
            r0 = r1
            r2 = r1
        L_0x00b2:
            if (r0 == 0) goto L_0x00b7
            r0.close()
        L_0x00b7:
            if (r2 == 0) goto L_0x0009
            r2.close()
            goto L_0x0009
        L_0x00be:
            r0 = move-exception
            r2 = r1
        L_0x00c0:
            if (r1 == 0) goto L_0x00c5
            r1.close()
        L_0x00c5:
            if (r2 == 0) goto L_0x00ca
            r2.close()
        L_0x00ca:
            throw r0
        L_0x00cb:
            r0 = move-exception
            goto L_0x00c0
        L_0x00cd:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x00c0
        L_0x00d2:
            r0 = move-exception
            r0 = r1
            goto L_0x00b2
        L_0x00d5:
            r1 = move-exception
            goto L_0x00b2
        L_0x00d7:
            r0 = move-exception
            r0 = r1
            goto L_0x00a3
        L_0x00da:
            r1 = move-exception
            goto L_0x00a3
        L_0x00dc:
            r0 = move-exception
            r0 = r1
            goto L_0x0094
        L_0x00df:
            r1 = move-exception
            goto L_0x0094
        L_0x00e1:
            r0 = move-exception
            r0 = r1
            goto L_0x0059
        L_0x00e5:
            r0 = move-exception
            r0 = r1
            r1 = r2
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.nativeads.C1879d.m8640g():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8641h() throws java.io.IOException {
        /*
            r6 = this;
            com.cootek.smartinput5.func.nativeads.y r0 = r6.f6259a
            if (r0 == 0) goto L_0x0008
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.f6340b
            if (r0 != 0) goto L_0x0009
        L_0x0008:
            return
        L_0x0009:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.f6340b
            java.util.Iterator r1 = r0.iterator()
        L_0x0014:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r1.next()
            com.cootek.smartinput5.func.nativeads.a r0 = (com.cootek.smartinput5.func.nativeads.C1875a) r0
            org.json.JSONObject r0 = r0.mo6996a()
            r2.put(r0)
            goto L_0x0014
        L_0x0028:
            java.io.File r3 = new java.io.File
            java.lang.String r0 = ".temp"
            java.io.File r0 = com.cootek.smartinput5.func.C1358O.m6234a((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.cootek.smartinput5.func.nativeads.y r4 = r6.f6259a
            java.lang.String r4 = r4.f6436b
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r4 = "_default_ads.json"
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r3.<init>(r0, r1)
            r1 = 0
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ IOException -> 0x005d, all -> 0x0065 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x005d, all -> 0x0065 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x0071, all -> 0x006c }
            r0.write(r1)     // Catch:{ IOException -> 0x0071, all -> 0x006c }
            if (r0 == 0) goto L_0x0008
            r0.close()
            goto L_0x0008
        L_0x005d:
            r0 = move-exception
            r0 = r1
        L_0x005f:
            if (r0 == 0) goto L_0x0008
            r0.close()
            goto L_0x0008
        L_0x0065:
            r0 = move-exception
        L_0x0066:
            if (r1 == 0) goto L_0x006b
            r1.close()
        L_0x006b:
            throw r0
        L_0x006c:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0066
        L_0x0071:
            r1 = move-exception
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.nativeads.C1879d.m8641h():void");
    }
}
