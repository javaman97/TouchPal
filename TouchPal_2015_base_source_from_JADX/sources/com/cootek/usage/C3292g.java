package com.cootek.usage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import com.cootek.smartinput5.presentations.PresentationLaunchLocalPageActivity;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.usage.g */
class C3292g {

    /* renamed from: a */
    private static final int f14459a = 0;

    /* renamed from: b */
    private static final int f14460b = 1;

    /* renamed from: c */
    private static final int f14461c = 2;

    /* renamed from: d */
    private static final int f14462d = 3;

    /* renamed from: e */
    private static final int f14463e = 4;

    /* renamed from: f */
    private static final int f14464f = 5;

    /* renamed from: g */
    private static final String f14465g = "noah_info";

    /* renamed from: h */
    private AbsUsageAssist f14466h;

    C3292g() {
    }

    C3292g(AbsUsageAssist absUsageAssist) {
        this.f14466h = absUsageAssist;
    }

    /* renamed from: a */
    static int m14591a() {
        return 5;
    }

    /* renamed from: a */
    static String m14592a(int i) {
        switch (i) {
            case 0:
                return "noah_reserve_00";
            case 1:
                return "noah_reserve_01";
            case 2:
                return "noah_reserve_02";
            case 3:
                return "noah_reserve_03";
            case 4:
                return "noah_reserve_04";
            default:
                throw new IllegalArgumentException("error info value: " + i);
        }
    }

    /* renamed from: a */
    static boolean m14593a(Context context) {
        if (ConnectivityManager.isNetworkTypeValid(1)) {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).isConnected();
        }
        return false;
    }

    /* renamed from: b */
    static String m14594b() {
        return f14465g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad A[SYNTHETIC, Splitter:B:24:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fd A[SYNTHETIC, Splitter:B:46:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010b A[SYNTHETIC, Splitter:B:54:0x010b] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.cootek.usage.C3294i m14595c() {
        /*
            r13 = this;
            r7 = 0
            r11 = 1
            r10 = 0
            com.cootek.usage.i r6 = new com.cootek.usage.i
            r6.<init>(r13)
            com.cootek.usage.AbsUsageAssist r0 = r13.f14466h
            android.content.Context r0 = r0.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.util.Hashtable r8 = new java.util.Hashtable
            r8.<init>()
            r1 = 2
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ SecurityException -> 0x00e2, RuntimeException -> 0x00f3, all -> 0x0107 }
            r1 = 0
            java.lang.String r3 = "_id"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x00e2, RuntimeException -> 0x00f3, all -> 0x0107 }
            r1 = 1
            java.lang.String r3 = "display_name"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x00e2, RuntimeException -> 0x00f3, all -> 0x0107 }
            android.net.Uri r1 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ SecurityException -> 0x00e2, RuntimeException -> 0x00f3, all -> 0x0107 }
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ SecurityException -> 0x00e2, RuntimeException -> 0x00f3, all -> 0x0107 }
            if (r1 == 0) goto L_0x005f
            boolean r2 = r1.moveToFirst()     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            if (r2 == 0) goto L_0x005f
        L_0x0035:
            com.cootek.usage.h r2 = new com.cootek.usage.h     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            r3 = 0
            r2.<init>(r13, r3)     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            r3 = 0
            long r4 = r1.getLong(r3)     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            r2.f14467a = r4     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            r2.f14468b = r3     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            r3.<init>()     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            r2.f14469c = r3     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            long r4 = r2.f14467a     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            r8.put(r3, r2)     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            boolean r2 = r1.moveToNext()     // Catch:{ SecurityException -> 0x01a1, RuntimeException -> 0x019e }
            if (r2 != 0) goto L_0x0035
        L_0x005f:
            if (r1 == 0) goto L_0x0064
            r1.close()     // Catch:{ RuntimeException -> 0x0114 }
        L_0x0064:
            r1 = 2
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            r1 = 0
            java.lang.String r3 = "contact_id"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            r1 = 1
            java.lang.String r3 = "data1"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            android.net.Uri r1 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            java.lang.String r3 = "mimetype=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            r5 = 0
            java.lang.String r9 = "vnd.android.cursor.item/phone_v2"
            r4[r5] = r9     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            r5 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            if (r7 == 0) goto L_0x00ab
            boolean r0 = r7.moveToFirst()     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            if (r0 == 0) goto L_0x00ab
        L_0x008a:
            r0 = 0
            long r0 = r7.getLong(r0)     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            r2 = 1
            java.lang.String r2 = r7.getString(r2)     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            java.lang.Object r0 = r8.get(r0)     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            com.cootek.usage.h r0 = (com.cootek.usage.C3293h) r0     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            if (r0 == 0) goto L_0x00a5
            java.util.HashSet r0 = r0.f14469c     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            r0.add(r2)     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
        L_0x00a5:
            boolean r0 = r7.moveToNext()     // Catch:{ SecurityException -> 0x011a, RuntimeException -> 0x012a }
            if (r0 != 0) goto L_0x008a
        L_0x00ab:
            if (r7 == 0) goto L_0x00b0
            r7.close()     // Catch:{ RuntimeException -> 0x0149 }
        L_0x00b0:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Collection r0 = r8.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x00bd:
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L_0x014f
            com.cootek.usage.UsageData r0 = new com.cootek.usage.UsageData
            r0.<init>()
            java.lang.String r2 = "noah_info"
            r0.type = r2
            java.lang.String r2 = m14592a((int) r10)
            r0.path = r2
            java.lang.String r1 = r1.toString()
            r0.value = r1
            r6.f14471a = r0
            java.lang.String r0 = m14592a((int) r10)
            r6.f14473c = r0
            r0 = r6
        L_0x00e1:
            return r0
        L_0x00e2:
            r0 = move-exception
            r0 = r7
        L_0x00e4:
            r1 = 0
            r6.f14474d = r1     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x00ec
            r0.close()     // Catch:{ RuntimeException -> 0x00ee }
        L_0x00ec:
            r0 = r6
            goto L_0x00e1
        L_0x00ee:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00ec
        L_0x00f3:
            r0 = move-exception
            r1 = r7
        L_0x00f5:
            r0.printStackTrace()     // Catch:{ all -> 0x0195 }
            r0 = 0
            r6.f14474d = r0     // Catch:{ all -> 0x0195 }
            if (r1 == 0) goto L_0x0100
            r1.close()     // Catch:{ RuntimeException -> 0x0102 }
        L_0x0100:
            r0 = r6
            goto L_0x00e1
        L_0x0102:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0100
        L_0x0107:
            r0 = move-exception
            r1 = r7
        L_0x0109:
            if (r1 == 0) goto L_0x010e
            r1.close()     // Catch:{ RuntimeException -> 0x010f }
        L_0x010e:
            throw r0
        L_0x010f:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x010e
        L_0x0114:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0064
        L_0x011a:
            r0 = move-exception
            r0 = 0
            r6.f14474d = r0     // Catch:{ all -> 0x013d }
            if (r7 == 0) goto L_0x0123
            r7.close()     // Catch:{ RuntimeException -> 0x0125 }
        L_0x0123:
            r0 = r6
            goto L_0x00e1
        L_0x0125:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0123
        L_0x012a:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x013d }
            r0 = 0
            r6.f14474d = r0     // Catch:{ all -> 0x013d }
            if (r7 == 0) goto L_0x0136
            r7.close()     // Catch:{ RuntimeException -> 0x0138 }
        L_0x0136:
            r0 = r6
            goto L_0x00e1
        L_0x0138:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0136
        L_0x013d:
            r0 = move-exception
            if (r7 == 0) goto L_0x0143
            r7.close()     // Catch:{ RuntimeException -> 0x0144 }
        L_0x0143:
            throw r0
        L_0x0144:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0143
        L_0x0149:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00b0
        L_0x014f:
            java.lang.Object r0 = r2.next()
            com.cootek.usage.h r0 = (com.cootek.usage.C3293h) r0
            java.util.HashSet r3 = r0.f14469c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00bd
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "name"
            java.lang.String r5 = r0.f14468b     // Catch:{ JSONException -> 0x0190 }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x0190 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0190 }
            r4.<init>()     // Catch:{ JSONException -> 0x0190 }
            java.util.HashSet r0 = r0.f14469c     // Catch:{ JSONException -> 0x0190 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ JSONException -> 0x0190 }
        L_0x0174:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x0190 }
            if (r0 != 0) goto L_0x0186
            java.lang.String r0 = "phone"
            r3.put(r0, r4)     // Catch:{ JSONException -> 0x0190 }
        L_0x017f:
            r1.put(r3)
            r6.f14474d = r11
            goto L_0x00bd
        L_0x0186:
            java.lang.Object r0 = r5.next()     // Catch:{ JSONException -> 0x0190 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0190 }
            r4.put(r0)     // Catch:{ JSONException -> 0x0190 }
            goto L_0x0174
        L_0x0190:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x017f
        L_0x0195:
            r0 = move-exception
            goto L_0x0109
        L_0x0198:
            r1 = move-exception
            r12 = r1
            r1 = r0
            r0 = r12
            goto L_0x0109
        L_0x019e:
            r0 = move-exception
            goto L_0x00f5
        L_0x01a1:
            r0 = move-exception
            r0 = r1
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3292g.m14595c():com.cootek.usage.i");
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0112 A[SYNTHETIC, Splitter:B:52:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0120 A[SYNTHETIC, Splitter:B:60:0x0120] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.cootek.usage.C3294i m14596d() {
        /*
            r15 = this;
            com.cootek.usage.i r6 = new com.cootek.usage.i
            r6.<init>(r15)
            com.cootek.usage.AbsUsageAssist r0 = r15.f14466h
            android.content.Context r0 = r0.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            r7 = 0
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            r1 = 6
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            r1 = 0
            java.lang.String r3 = "_id"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            r1 = 1
            java.lang.String r3 = "number"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            r1 = 2
            java.lang.String r3 = "date"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            r1 = 3
            java.lang.String r3 = "duration"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            r1 = 4
            java.lang.String r3 = "type"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            r1 = 5
            java.lang.String r3 = "name"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            java.lang.String r3 = "_id>?"
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            r1 = 0
            com.cootek.usage.l r5 = com.cootek.usage.C3297l.m14606a()     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            r9 = 1
            java.lang.String r9 = m14592a((int) r9)     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            long r10 = r5.mo10503c(r9)     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            r4[r1] = r5     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            android.net.Uri r1 = android.provider.CallLog.Calls.CONTENT_URI     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            java.lang.String r5 = "_id DESC LIMIT 300"
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ SecurityException -> 0x013c, RuntimeException -> 0x0108, all -> 0x011c }
            if (r1 == 0) goto L_0x00bd
            boolean r0 = r1.moveToFirst()     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
            if (r0 == 0) goto L_0x00bd
            r0 = 0
            long r2 = r1.getLong(r0)     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
            r6.f14472b = r2     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
        L_0x0066:
            r0 = 1
            java.lang.String r0 = r1.getString(r0)     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
            r2 = 2
            long r4 = r1.getLong(r2)     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
            r2 = 3
            long r2 = r1.getLong(r2)     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
            r7 = 4
            int r7 = r1.getInt(r7)     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
            r9 = 5
            java.lang.String r9 = r1.getString(r9)     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
            r10.<init>()     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
            java.lang.String r11 = "other_phone"
            r10.put(r11, r0)     // Catch:{ JSONException -> 0x00f2 }
            java.lang.String r0 = "date"
            r12 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r12
            r10.put(r0, r4)     // Catch:{ JSONException -> 0x00f2 }
            java.lang.String r4 = "type"
            r0 = 2
            if (r7 != r0) goto L_0x00ed
            java.lang.String r0 = "outgoing"
        L_0x0098:
            r10.put(r4, r0)     // Catch:{ JSONException -> 0x00f2 }
            r0 = 3
            if (r0 != r7) goto L_0x00a0
            r2 = 0
        L_0x00a0:
            java.lang.String r0 = "duration"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x00f2 }
            java.lang.String r2 = "contact"
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x00f2 }
            if (r0 == 0) goto L_0x00f0
            r0 = 0
        L_0x00ae:
            r10.put(r2, r0)     // Catch:{ JSONException -> 0x00f2 }
            r8.put(r10)     // Catch:{ JSONException -> 0x00f2 }
            r0 = 1
            r6.f14474d = r0     // Catch:{ JSONException -> 0x00f2 }
        L_0x00b7:
            boolean r0 = r1.moveToNext()     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
            if (r0 != 0) goto L_0x0066
        L_0x00bd:
            if (r1 == 0) goto L_0x00c2
            r1.close()     // Catch:{ RuntimeException -> 0x0129 }
        L_0x00c2:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "data"
            r1.put(r0, r8)     // Catch:{ JSONException -> 0x012e }
        L_0x00cc:
            com.cootek.usage.UsageData r0 = new com.cootek.usage.UsageData
            r0.<init>()
            java.lang.String r2 = "noah_info"
            r0.type = r2
            r2 = 1
            java.lang.String r2 = m14592a((int) r2)
            r0.path = r2
            java.lang.String r1 = r1.toString()
            r0.value = r1
            r6.f14471a = r0
            r0 = 1
            java.lang.String r0 = m14592a((int) r0)
            r6.f14473c = r0
            r0 = r6
        L_0x00ec:
            return r0
        L_0x00ed:
            java.lang.String r0 = "incoming"
            goto L_0x0098
        L_0x00f0:
            r0 = 1
            goto L_0x00ae
        L_0x00f2:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ SecurityException -> 0x00f7, RuntimeException -> 0x013a }
            goto L_0x00b7
        L_0x00f7:
            r0 = move-exception
            r0 = r1
        L_0x00f9:
            r1 = 0
            r6.f14474d = r1     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0101
            r0.close()     // Catch:{ RuntimeException -> 0x0103 }
        L_0x0101:
            r0 = r6
            goto L_0x00ec
        L_0x0103:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0101
        L_0x0108:
            r0 = move-exception
            r1 = r7
        L_0x010a:
            r0.printStackTrace()     // Catch:{ all -> 0x0133 }
            r0 = 0
            r6.f14474d = r0     // Catch:{ all -> 0x0133 }
            if (r1 == 0) goto L_0x0115
            r1.close()     // Catch:{ RuntimeException -> 0x0117 }
        L_0x0115:
            r0 = r6
            goto L_0x00ec
        L_0x0117:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0115
        L_0x011c:
            r0 = move-exception
            r1 = r7
        L_0x011e:
            if (r1 == 0) goto L_0x0123
            r1.close()     // Catch:{ RuntimeException -> 0x0124 }
        L_0x0123:
            throw r0
        L_0x0124:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0123
        L_0x0129:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00c2
        L_0x012e:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00cc
        L_0x0133:
            r0 = move-exception
            goto L_0x011e
        L_0x0135:
            r1 = move-exception
            r14 = r1
            r1 = r0
            r0 = r14
            goto L_0x011e
        L_0x013a:
            r0 = move-exception
            goto L_0x010a
        L_0x013c:
            r0 = move-exception
            r0 = r7
            goto L_0x00f9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3292g.m14596d():com.cootek.usage.i");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116 A[SYNTHETIC, Splitter:B:47:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124 A[SYNTHETIC, Splitter:B:55:0x0124] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.cootek.usage.C3294i m14597e() {
        /*
            r15 = this;
            com.cootek.usage.i r6 = new com.cootek.usage.i
            r6.<init>(r15)
            com.cootek.usage.AbsUsageAssist r0 = r15.f14466h
            android.content.Context r0 = r0.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            r7 = 0
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            r1 = 6
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            r1 = 0
            java.lang.String r3 = "_id"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            r1 = 1
            java.lang.String r3 = "address"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            r1 = 2
            java.lang.String r3 = "person"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            r1 = 3
            java.lang.String r3 = "date"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            r1 = 4
            java.lang.String r3 = "body"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            r1 = 5
            java.lang.String r3 = "service_center"
            r2[r1] = r3     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            java.lang.String r3 = "_id>?"
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            r1 = 0
            com.cootek.usage.l r5 = com.cootek.usage.C3297l.m14606a()     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            r9 = 2
            java.lang.String r9 = m14592a((int) r9)     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            long r10 = r5.mo10503c(r9)     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            r4[r1] = r5     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            java.lang.String r1 = "content://sms/inbox"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            java.lang.String r5 = "_id DESC LIMIT 100"
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ SecurityException -> 0x0140, RuntimeException -> 0x010c, all -> 0x0120 }
            if (r1 == 0) goto L_0x00c4
            boolean r0 = r1.moveToFirst()     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
            if (r0 == 0) goto L_0x00c4
            r0 = 0
            long r2 = r1.getLong(r0)     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
            r6.f14472b = r2     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
        L_0x006a:
            r0 = 1
            java.lang.String r0 = r1.getString(r0)     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
            r2 = 2
            long r2 = r1.getLong(r2)     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x00be
            r4 = 3
            long r4 = r1.getLong(r4)     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
            r7 = 4
            java.lang.String r7 = r1.getString(r7)     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
            r9 = 5
            java.lang.String r9 = r1.getString(r9)     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
            r10.<init>()     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
            java.lang.String r11 = "other_phone"
            r10.put(r11, r0)     // Catch:{ JSONException -> 0x00f6 }
            java.lang.String r0 = "date"
            r12 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r12
            r10.put(r0, r4)     // Catch:{ JSONException -> 0x00f6 }
            java.lang.String r0 = "type"
            java.lang.String r4 = "incoming"
            r10.put(r0, r4)     // Catch:{ JSONException -> 0x00f6 }
            java.lang.String r4 = "contact"
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f4
            r0 = 1
        L_0x00ab:
            r10.put(r4, r0)     // Catch:{ JSONException -> 0x00f6 }
            java.lang.String r0 = "content"
            r10.put(r0, r7)     // Catch:{ JSONException -> 0x00f6 }
            java.lang.String r0 = "service_center"
            r10.put(r0, r9)     // Catch:{ JSONException -> 0x00f6 }
            r8.put(r10)     // Catch:{ JSONException -> 0x00f6 }
            r0 = 1
            r6.f14474d = r0     // Catch:{ JSONException -> 0x00f6 }
        L_0x00be:
            boolean r0 = r1.moveToNext()     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
            if (r0 != 0) goto L_0x006a
        L_0x00c4:
            if (r1 == 0) goto L_0x00c9
            r1.close()     // Catch:{ RuntimeException -> 0x012d }
        L_0x00c9:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "data"
            r1.put(r0, r8)     // Catch:{ JSONException -> 0x0132 }
        L_0x00d3:
            com.cootek.usage.UsageData r0 = new com.cootek.usage.UsageData
            r0.<init>()
            java.lang.String r2 = "noah_info"
            r0.type = r2
            r2 = 2
            java.lang.String r2 = m14592a((int) r2)
            r0.path = r2
            java.lang.String r1 = r1.toString()
            r0.value = r1
            r6.f14471a = r0
            r0 = 2
            java.lang.String r0 = m14592a((int) r0)
            r6.f14473c = r0
            r0 = r6
        L_0x00f3:
            return r0
        L_0x00f4:
            r0 = 0
            goto L_0x00ab
        L_0x00f6:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ SecurityException -> 0x00fb, RuntimeException -> 0x013e }
            goto L_0x00be
        L_0x00fb:
            r0 = move-exception
            r0 = r1
        L_0x00fd:
            r1 = 0
            r6.f14474d = r1     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x0105
            r0.close()     // Catch:{ RuntimeException -> 0x0107 }
        L_0x0105:
            r0 = r6
            goto L_0x00f3
        L_0x0107:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0105
        L_0x010c:
            r0 = move-exception
            r1 = r7
        L_0x010e:
            r0.printStackTrace()     // Catch:{ all -> 0x0137 }
            r0 = 0
            r6.f14474d = r0     // Catch:{ all -> 0x0137 }
            if (r1 == 0) goto L_0x0119
            r1.close()     // Catch:{ RuntimeException -> 0x011b }
        L_0x0119:
            r0 = r6
            goto L_0x00f3
        L_0x011b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0119
        L_0x0120:
            r0 = move-exception
            r1 = r7
        L_0x0122:
            if (r1 == 0) goto L_0x0127
            r1.close()     // Catch:{ RuntimeException -> 0x0128 }
        L_0x0127:
            throw r0
        L_0x0128:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0127
        L_0x012d:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00c9
        L_0x0132:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00d3
        L_0x0137:
            r0 = move-exception
            goto L_0x0122
        L_0x0139:
            r1 = move-exception
            r14 = r1
            r1 = r0
            r0 = r14
            goto L_0x0122
        L_0x013e:
            r0 = move-exception
            goto L_0x010e
        L_0x0140:
            r0 = move-exception
            r0 = r7
            goto L_0x00fd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3292g.m14597e():com.cootek.usage.i");
    }

    /* renamed from: f */
    private C3294i m14598f() {
        int i = 0;
        C3294i iVar = new C3294i(this);
        PackageManager packageManager = this.f14466h.getContext().getPackageManager();
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
        JSONArray jSONArray = new JSONArray();
        while (true) {
            int i2 = i;
            if (i2 >= installedPackages.size()) {
                break;
            }
            PackageInfo packageInfo = installedPackages.get(i2);
            if ((packageInfo.applicationInfo.flags & 1) == 0 || (packageInfo.applicationInfo.flags & 128) != 0) {
                String charSequence = packageInfo.applicationInfo.loadLabel(packageManager).toString();
                String str = packageInfo.packageName;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", charSequence);
                    jSONObject.put(PresentationLaunchLocalPageActivity.f10781o, str);
                    jSONArray.put(jSONObject);
                    iVar.f14474d = true;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            i = i2 + 1;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", jSONArray);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        UsageData usageData = new UsageData();
        usageData.type = f14465g;
        usageData.path = m14592a(3);
        usageData.value = jSONObject2.toString();
        iVar.f14471a = usageData;
        iVar.f14473c = m14592a(3);
        return iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x013e A[SYNTHETIC, Splitter:B:62:0x013e] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0151 A[SYNTHETIC, Splitter:B:72:0x0151] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.cootek.usage.C3294i m14599g() {
        /*
            r19 = this;
            com.cootek.usage.i r8 = new com.cootek.usage.i
            r0 = r19
            r8.<init>(r0)
            r0 = r19
            com.cootek.usage.AbsUsageAssist r2 = r0.f14466h
            android.content.Context r2 = r2.getContext()
            android.content.ContentResolver r2 = r2.getContentResolver()
            r9 = 0
            org.json.JSONArray r10 = new org.json.JSONArray
            r10.<init>()
            java.lang.String r3 = "content://com.cootek.smartdialer.model.provider.CalllogProvider"
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            r4 = 7
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            r5 = 0
            java.lang.String r6 = "_id"
            r4[r5] = r6     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            r5 = 1
            java.lang.String r6 = "number"
            r4[r5] = r6     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            r5 = 2
            java.lang.String r6 = "date"
            r4[r5] = r6     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            r5 = 3
            java.lang.String r6 = "duration"
            r4[r5] = r6     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            r5 = 4
            java.lang.String r6 = "type"
            r4[r5] = r6     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            r5 = 5
            java.lang.String r6 = "contact_id"
            r4[r5] = r6     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            r5 = 6
            java.lang.String r6 = "category"
            r4[r5] = r6     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            java.lang.String r5 = "_id>?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            r7 = 0
            com.cootek.usage.l r11 = com.cootek.usage.C3297l.m14606a()     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            r12 = 1
            java.lang.String r12 = m14592a((int) r12)     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            long r12 = r11.mo10503c(r12)     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            java.lang.String r11 = java.lang.String.valueOf(r12)     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            r6[r7] = r11     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            java.lang.String r7 = "_id DESC LIMIT 300"
            android.database.Cursor r3 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ SecurityException -> 0x017d, RuntimeException -> 0x017a, all -> 0x0170 }
            if (r3 == 0) goto L_0x00d9
            boolean r2 = r3.moveToFirst()     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            if (r2 == 0) goto L_0x00d9
            r2 = 0
            long r4 = r3.getLong(r2)     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            r8.f14472b = r4     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
        L_0x0073:
            r2 = 1
            java.lang.String r2 = r3.getString(r2)     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            r4 = 2
            long r6 = r3.getLong(r4)     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            r4 = 3
            long r4 = r3.getLong(r4)     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            r9 = 4
            int r9 = r3.getInt(r9)     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            r11 = 5
            long r12 = r3.getLong(r11)     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            r11 = 6
            int r11 = r3.getInt(r11)     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            r14.<init>()     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            java.lang.String r15 = "other_phone"
            r14.put(r15, r2)     // Catch:{ JSONException -> 0x0119 }
            java.lang.String r2 = "date"
            r16 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r16
            r14.put(r2, r6)     // Catch:{ JSONException -> 0x0119 }
            r2 = 3
            if (r2 != r9) goto L_0x00a9
            r4 = 0
        L_0x00a9:
            java.lang.String r2 = "duration"
            r14.put(r2, r4)     // Catch:{ JSONException -> 0x0119 }
            java.lang.String r4 = "contact"
            r6 = 0
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0109
            r2 = 1
        L_0x00b7:
            r14.put(r4, r2)     // Catch:{ JSONException -> 0x0119 }
            java.lang.String r4 = "type"
            r2 = 2
            if (r9 != r2) goto L_0x010b
            java.lang.String r2 = "outgoing"
        L_0x00c1:
            r14.put(r4, r2)     // Catch:{ JSONException -> 0x0119 }
            if (r11 != 0) goto L_0x010e
            java.lang.String r2 = "call_type"
            java.lang.String r4 = "p2p"
            r14.put(r2, r4)     // Catch:{ JSONException -> 0x0119 }
        L_0x00cd:
            r10.put(r14)     // Catch:{ JSONException -> 0x0119 }
            r2 = 1
            r8.f14474d = r2     // Catch:{ JSONException -> 0x0119 }
        L_0x00d3:
            boolean r2 = r3.moveToNext()     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            if (r2 != 0) goto L_0x0073
        L_0x00d9:
            if (r3 == 0) goto L_0x00de
            r3.close()     // Catch:{ RuntimeException -> 0x0164 }
        L_0x00de:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r2 = "data"
            r3.put(r2, r10)     // Catch:{ JSONException -> 0x016a }
        L_0x00e8:
            com.cootek.usage.UsageData r2 = new com.cootek.usage.UsageData
            r2.<init>()
            java.lang.String r4 = "noah_info"
            r2.type = r4
            r4 = 4
            java.lang.String r4 = m14592a((int) r4)
            r2.path = r4
            java.lang.String r3 = r3.toString()
            r2.value = r3
            r8.f14471a = r2
            r2 = 4
            java.lang.String r2 = m14592a((int) r2)
            r8.f14473c = r2
            r2 = r8
        L_0x0108:
            return r2
        L_0x0109:
            r2 = 0
            goto L_0x00b7
        L_0x010b:
            java.lang.String r2 = "incoming"
            goto L_0x00c1
        L_0x010e:
            r2 = 1
            if (r11 != r2) goto L_0x012a
            java.lang.String r2 = "call_type"
            java.lang.String r4 = "c2c"
            r14.put(r2, r4)     // Catch:{ JSONException -> 0x0119 }
            goto L_0x00cd
        L_0x0119:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ SecurityException -> 0x011e, RuntimeException -> 0x0135 }
            goto L_0x00d3
        L_0x011e:
            r2 = move-exception
            r2 = r3
        L_0x0120:
            r3 = 0
            r8.f14474d = r3     // Catch:{ all -> 0x0173 }
            if (r2 == 0) goto L_0x0128
            r2.close()     // Catch:{ RuntimeException -> 0x0155 }
        L_0x0128:
            r2 = r8
            goto L_0x0108
        L_0x012a:
            r2 = 2
            if (r11 != r2) goto L_0x0143
            java.lang.String r2 = "call_type"
            java.lang.String r4 = "callback"
            r14.put(r2, r4)     // Catch:{ JSONException -> 0x0119 }
            goto L_0x00cd
        L_0x0135:
            r2 = move-exception
        L_0x0136:
            r2.printStackTrace()     // Catch:{ all -> 0x014e }
            r2 = 0
            r8.f14474d = r2     // Catch:{ all -> 0x014e }
            if (r3 == 0) goto L_0x0141
            r3.close()     // Catch:{ RuntimeException -> 0x015a }
        L_0x0141:
            r2 = r8
            goto L_0x0108
        L_0x0143:
            r2 = 3
            if (r11 != r2) goto L_0x00cd
            java.lang.String r2 = "call_type"
            java.lang.String r4 = "c2p"
            r14.put(r2, r4)     // Catch:{ JSONException -> 0x0119 }
            goto L_0x00cd
        L_0x014e:
            r2 = move-exception
        L_0x014f:
            if (r3 == 0) goto L_0x0154
            r3.close()     // Catch:{ RuntimeException -> 0x015f }
        L_0x0154:
            throw r2
        L_0x0155:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0128
        L_0x015a:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0141
        L_0x015f:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x0154
        L_0x0164:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x00de
        L_0x016a:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x00e8
        L_0x0170:
            r2 = move-exception
            r3 = r9
            goto L_0x014f
        L_0x0173:
            r3 = move-exception
            r18 = r3
            r3 = r2
            r2 = r18
            goto L_0x014f
        L_0x017a:
            r2 = move-exception
            r3 = r9
            goto L_0x0136
        L_0x017d:
            r2 = move-exception
            r2 = r9
            goto L_0x0120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3292g.m14599g():com.cootek.usage.i");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C3294i mo10497b(int i) {
        switch (i) {
            case 0:
                return m14595c();
            case 1:
                return m14596d();
            case 2:
                return m14597e();
            case 3:
                return m14598f();
            case 4:
                return m14599g();
            default:
                throw new IllegalArgumentException("error info value: " + i);
        }
    }
}
