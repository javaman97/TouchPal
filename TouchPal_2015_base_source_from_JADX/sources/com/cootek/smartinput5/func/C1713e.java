package com.cootek.smartinput5.func;

import android.content.Context;
import com.cootek.smartinput5.engine.Okinawa;
import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: com.cootek.smartinput5.func.e */
/* compiled from: AdvertiseManager */
public class C1713e {

    /* renamed from: a */
    public static final String f5605a = "advertise";

    /* renamed from: b */
    private final String f5606b = "version";

    /* renamed from: c */
    private final String f5607c = "contents";

    /* renamed from: d */
    private final String f5608d = "word";

    /* renamed from: e */
    private final String f5609e = "text";

    /* renamed from: f */
    private final String f5610f = "url";

    /* renamed from: g */
    private Context f5611g;

    /* renamed from: h */
    private Hashtable<String, C1715a> f5612h;

    /* renamed from: i */
    private String f5613i;

    /* renamed from: com.cootek.smartinput5.func.e$a */
    /* compiled from: AdvertiseManager */
    public static class C1715a {

        /* renamed from: a */
        private String f5614a;

        /* renamed from: b */
        private String f5615b;

        private C1715a(String str, String str2) {
            this.f5614a = str;
            this.f5615b = str2;
        }

        /* renamed from: a */
        public String mo6629a() {
            return this.f5614a;
        }

        /* renamed from: b */
        public String mo6630b() {
            return this.f5615b;
        }
    }

    public C1713e(Context context) {
        this.f5611g = context;
        this.f5612h = new Hashtable<>();
        m7900e();
    }

    /* renamed from: a */
    public C1715a mo6626a(String str) {
        return this.f5612h.get(str);
    }

    /* renamed from: a */
    public void mo6627a() {
        m7899d();
        m7900e();
        m7898c();
    }

    /* renamed from: c */
    private void m7898c() {
        if (this.f5612h.size() > 0) {
            Enumeration<String> keys = this.f5612h.keys();
            Okinawa h = C1368X.m6320c().mo5835h();
            h.fireTransactionOperation(1);
            while (keys.hasMoreElements()) {
                h.fireAddAdOperation(keys.nextElement());
            }
            h.fireTransactionOperation(2);
            h.processEvent();
        }
    }

    /* renamed from: d */
    private void m7899d() {
        if (this.f5612h.size() > 0) {
            Enumeration<String> keys = this.f5612h.keys();
            Okinawa h = C1368X.m6320c().mo5835h();
            h.fireTransactionOperation(1);
            while (keys.hasMoreElements()) {
                h.fireDeleteAdOperation(keys.nextElement());
            }
            h.fireTransactionOperation(2);
            h.processEvent();
            this.f5612h.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x012a A[SYNTHETIC, Splitter:B:104:0x012a] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x012f A[SYNTHETIC, Splitter:B:107:0x012f] */
    /* JADX WARNING: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[SYNTHETIC, Splitter:B:18:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060 A[SYNTHETIC, Splitter:B:32:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0 A[SYNTHETIC, Splitter:B:47:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b5 A[SYNTHETIC, Splitter:B:50:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cb A[SYNTHETIC, Splitter:B:59:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d0 A[SYNTHETIC, Splitter:B:62:0x00d0] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f2 A[SYNTHETIC, Splitter:B:78:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f7 A[SYNTHETIC, Splitter:B:81:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x010f A[SYNTHETIC, Splitter:B:92:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0114 A[SYNTHETIC, Splitter:B:95:0x0114] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:89:0x010a=Splitter:B:89:0x010a, B:75:0x00ed=Splitter:B:75:0x00ed} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7900e() {
        /*
            r8 = this;
            r0 = 0
            android.content.Context r1 = r8.f5611g
            java.lang.String r2 = "advertise"
            java.io.File r4 = com.cootek.smartinput5.func.C1466av.m6849a((android.content.Context) r1, (java.lang.String) r2)
            if (r4 != 0) goto L_0x000c
        L_0x000b:
            return
        L_0x000c:
            boolean r1 = r4.exists()
            if (r1 != 0) goto L_0x0033
            com.cootek.smartinput5.func.asset.o r1 = com.cootek.smartinput5.func.asset.C1460o.m6799b()     // Catch:{ IOException -> 0x00a8, all -> 0x00c5 }
            android.content.Context r2 = r8.f5611g     // Catch:{ IOException -> 0x00a8, all -> 0x00c5 }
            java.lang.String r3 = "advertise"
            java.io.InputStream r3 = r1.mo6099a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ IOException -> 0x00a8, all -> 0x00c5 }
            r4.createNewFile()     // Catch:{ IOException -> 0x015b, all -> 0x0153 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x015b, all -> 0x0153 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x015b, all -> 0x0153 }
            com.cootek.smartinput.utilities.C0997e.m5178a((java.io.InputStream) r3, (java.io.OutputStream) r2)     // Catch:{ IOException -> 0x015f }
            if (r3 == 0) goto L_0x002e
            r3.close()     // Catch:{ IOException -> 0x009e }
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x00a3 }
        L_0x0033:
            boolean r1 = r4.exists()
            if (r1 == 0) goto L_0x000b
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ea, IOException -> 0x0107, all -> 0x0124 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00ea, IOException -> 0x0107, all -> 0x0124 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x014e, IOException -> 0x0149, all -> 0x0143 }
            int r1 = r3.available()     // Catch:{ FileNotFoundException -> 0x014e, IOException -> 0x0149, all -> 0x0143 }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x014e, IOException -> 0x0149, all -> 0x0143 }
            com.cootek.smartinput.utilities.C0997e.m5178a((java.io.InputStream) r3, (java.io.OutputStream) r2)     // Catch:{ FileNotFoundException -> 0x0151, IOException -> 0x014c }
            java.lang.String r1 = "utf-8"
            java.lang.String r0 = r2.toString(r1)     // Catch:{ FileNotFoundException -> 0x0151, IOException -> 0x014c }
            if (r3 == 0) goto L_0x0055
            r3.close()     // Catch:{ IOException -> 0x00de }
        L_0x0055:
            if (r2 == 0) goto L_0x005a
            r2.close()     // Catch:{ IOException -> 0x00e4 }
        L_0x005a:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x000b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013d }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x013d }
            java.lang.String r0 = "version"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ JSONException -> 0x013d }
            r8.f5613i = r0     // Catch:{ JSONException -> 0x013d }
            java.lang.String r0 = "contents"
            org.json.JSONArray r1 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x013d }
            r0 = 0
        L_0x0074:
            int r2 = r1.length()     // Catch:{ JSONException -> 0x013d }
            if (r0 >= r2) goto L_0x000b
            org.json.JSONObject r2 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x013d }
            java.lang.String r3 = "word"
            java.lang.String r3 = r2.getString(r3)     // Catch:{ JSONException -> 0x013d }
            java.lang.String r4 = "text"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ JSONException -> 0x013d }
            java.lang.String r5 = "url"
            java.lang.String r2 = r2.getString(r5)     // Catch:{ JSONException -> 0x013d }
            java.util.Hashtable<java.lang.String, com.cootek.smartinput5.func.e$a> r5 = r8.f5612h     // Catch:{ JSONException -> 0x013d }
            com.cootek.smartinput5.func.e$a r6 = new com.cootek.smartinput5.func.e$a     // Catch:{ JSONException -> 0x013d }
            r7 = 0
            r6.<init>(r4, r2)     // Catch:{ JSONException -> 0x013d }
            r5.put(r3, r6)     // Catch:{ JSONException -> 0x013d }
            int r0 = r0 + 1
            goto L_0x0074
        L_0x009e:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x002e
        L_0x00a3:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0033
        L_0x00a8:
            r1 = move-exception
            r2 = r0
            r3 = r0
        L_0x00ab:
            r1.printStackTrace()     // Catch:{ all -> 0x0158 }
            if (r3 == 0) goto L_0x00b3
            r3.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00b3:
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x0033
        L_0x00ba:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0033
        L_0x00c0:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00b3
        L_0x00c5:
            r1 = move-exception
            r2 = r0
            r3 = r0
            r0 = r1
        L_0x00c9:
            if (r3 == 0) goto L_0x00ce
            r3.close()     // Catch:{ IOException -> 0x00d4 }
        L_0x00ce:
            if (r2 == 0) goto L_0x00d3
            r2.close()     // Catch:{ IOException -> 0x00d9 }
        L_0x00d3:
            throw r0
        L_0x00d4:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00ce
        L_0x00d9:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00d3
        L_0x00de:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0055
        L_0x00e4:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x005a
        L_0x00ea:
            r1 = move-exception
            r2 = r0
            r3 = r0
        L_0x00ed:
            r1.printStackTrace()     // Catch:{ all -> 0x0147 }
            if (r3 == 0) goto L_0x00f5
            r3.close()     // Catch:{ IOException -> 0x0102 }
        L_0x00f5:
            if (r2 == 0) goto L_0x005a
            r2.close()     // Catch:{ IOException -> 0x00fc }
            goto L_0x005a
        L_0x00fc:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x005a
        L_0x0102:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00f5
        L_0x0107:
            r1 = move-exception
            r2 = r0
            r3 = r0
        L_0x010a:
            r1.printStackTrace()     // Catch:{ all -> 0x0147 }
            if (r3 == 0) goto L_0x0112
            r3.close()     // Catch:{ IOException -> 0x011f }
        L_0x0112:
            if (r2 == 0) goto L_0x005a
            r2.close()     // Catch:{ IOException -> 0x0119 }
            goto L_0x005a
        L_0x0119:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x005a
        L_0x011f:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0112
        L_0x0124:
            r1 = move-exception
            r2 = r0
            r3 = r0
            r0 = r1
        L_0x0128:
            if (r3 == 0) goto L_0x012d
            r3.close()     // Catch:{ IOException -> 0x0133 }
        L_0x012d:
            if (r2 == 0) goto L_0x0132
            r2.close()     // Catch:{ IOException -> 0x0138 }
        L_0x0132:
            throw r0
        L_0x0133:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x012d
        L_0x0138:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0132
        L_0x013d:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x000b
        L_0x0143:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x0128
        L_0x0147:
            r0 = move-exception
            goto L_0x0128
        L_0x0149:
            r1 = move-exception
            r2 = r0
            goto L_0x010a
        L_0x014c:
            r1 = move-exception
            goto L_0x010a
        L_0x014e:
            r1 = move-exception
            r2 = r0
            goto L_0x00ed
        L_0x0151:
            r1 = move-exception
            goto L_0x00ed
        L_0x0153:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x00c9
        L_0x0158:
            r0 = move-exception
            goto L_0x00c9
        L_0x015b:
            r1 = move-exception
            r2 = r0
            goto L_0x00ab
        L_0x015f:
            r1 = move-exception
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1713e.m7900e():void");
    }

    /* renamed from: b */
    public String mo6628b() {
        return this.f5613i;
    }
}
