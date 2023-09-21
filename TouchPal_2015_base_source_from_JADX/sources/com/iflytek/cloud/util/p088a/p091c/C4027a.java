package com.iflytek.cloud.util.p088a.p091c;

import android.content.Context;
import android.net.Uri;
import android.provider.CallLog;

/* renamed from: com.iflytek.cloud.util.a.c.a */
public abstract class C4027a {

    /* renamed from: a */
    protected static final String[] f16452a = {"number", "name", "date"};

    /* renamed from: c */
    protected static String[] f16453c;

    /* renamed from: b */
    protected Context f16454b = null;

    public C4027a(Context context) {
        this.f16454b = context;
    }

    /* renamed from: a */
    public abstract Uri mo14771a();

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap<java.lang.String, java.lang.String> mo14775a(int r9) {
        /*
            r8 = this;
            r6 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "date DESC limit "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r5 = r0.toString()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r3 = "0==0) GROUP BY (number"
            android.content.Context r0 = r8.f16454b     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            android.net.Uri r1 = android.provider.CallLog.Calls.CONTENT_URI     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String[] r2 = f16452a     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r4 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            if (r1 != 0) goto L_0x0039
            java.lang.String r0 = "iFly_ContactManager"
            java.lang.String r2 = "queryCallLog ----------------cursor is null"
            com.iflytek.cloud.p078a.p082d.p083a.C3990a.m17031a(r0, r2)     // Catch:{ Exception -> 0x0047 }
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.close()
        L_0x0038:
            return r7
        L_0x0039:
            int r0 = r1.getCount()     // Catch:{ Exception -> 0x0047 }
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "iFly_ContactManager"
            java.lang.String r2 = "queryCallLog ----------------cursor getCount == 0"
            com.iflytek.cloud.p078a.p082d.p083a.C3990a.m17031a(r0, r2)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0033
        L_0x0047:
            r0 = move-exception
        L_0x0048:
            r0.printStackTrace()     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x0038
            r1.close()
            goto L_0x0038
        L_0x0051:
            boolean r0 = r1.moveToNext()     // Catch:{ Exception -> 0x0047 }
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = "number"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r2 = r1.getString(r0)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r0 = "name"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r3 = "date"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0047 }
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = com.iflytek.cloud.util.p088a.C4029e.m17154a(r2)     // Catch:{ Exception -> 0x0047 }
        L_0x007b:
            r7.put(r3, r0)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0051
        L_0x007f:
            r0 = move-exception
        L_0x0080:
            if (r1 == 0) goto L_0x0085
            r1.close()
        L_0x0085:
            throw r0
        L_0x0086:
            java.lang.String r0 = "iFly_ContactManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0047 }
            r2.<init>()     // Catch:{ Exception -> 0x0047 }
            java.lang.String r3 = "queryCallLog ----------------cursor getCount =="
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Exception -> 0x0047 }
            int r3 = r1.getCount()     // Catch:{ Exception -> 0x0047 }
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0047 }
            com.iflytek.cloud.p078a.p082d.p083a.C3990a.m17031a(r0, r2)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0033
        L_0x00a3:
            r0 = move-exception
            r1 = r6
            goto L_0x0080
        L_0x00a6:
            r0 = move-exception
            r1 = r6
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.util.p088a.p091c.C4027a.mo14775a(int):java.util.HashMap");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14776a(Context context) {
        f16453c = new String[100];
        f16453c[0] = "其他";
        f16453c[1] = "住宅";
        f16453c[2] = "手机";
        f16453c[3] = "工作";
        f16453c[4] = "工作传真";
        f16453c[5] = "住宅传真";
        f16453c[6] = "寻呼机";
        f16453c[7] = "其他";
        f16453c[9] = "SIM卡";
        for (int i = 10; i < f16453c.length; i++) {
            f16453c[i] = "自定义电话";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String[] mo14772b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo14773c();

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap<java.lang.String, java.lang.String> mo14777d() {
        /*
            r8 = this;
            r6 = 0
            java.lang.String[] r2 = r8.mo14772b()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            android.content.Context r0 = r8.f16454b     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            android.net.Uri r1 = r8.mo14771a()     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            r3 = 0
            r4 = 0
            java.lang.String r5 = r8.mo14773c()     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            if (r1 != 0) goto L_0x002d
            java.lang.String r0 = "iFly_ContactManager"
            java.lang.String r2 = "queryContacts------cursor is null"
            com.iflytek.cloud.p078a.p082d.p083a.C3990a.m17031a(r0, r2)     // Catch:{ Exception -> 0x003b }
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            return r7
        L_0x002d:
            int r0 = r1.getCount()     // Catch:{ Exception -> 0x003b }
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "iFly_ContactManager"
            java.lang.String r2 = "queryContacts------cursor getCount == 0"
            com.iflytek.cloud.p078a.p082d.p083a.C3990a.m17031a(r0, r2)     // Catch:{ Exception -> 0x003b }
            goto L_0x0027
        L_0x003b:
            r0 = move-exception
        L_0x003c:
            r0.printStackTrace()     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x002c
            r1.close()
            goto L_0x002c
        L_0x0045:
            boolean r0 = r1.moveToNext()     // Catch:{ Exception -> 0x003b }
            if (r0 == 0) goto L_0x006e
            r0 = 0
            r0 = r2[r0]     // Catch:{ Exception -> 0x003b }
            int r0 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x003b }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x003b }
            r3 = 1
            r3 = r2[r3]     // Catch:{ Exception -> 0x003b }
            int r3 = r1.getColumnIndex(r3)     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x003b }
            if (r0 == 0) goto L_0x0045
            r7.put(r3, r0)     // Catch:{ Exception -> 0x003b }
            goto L_0x0045
        L_0x0067:
            r0 = move-exception
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            r1.close()
        L_0x006d:
            throw r0
        L_0x006e:
            java.lang.String r0 = "iFly_ContactManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003b }
            r2.<init>()     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = "queryContacts_20------count = "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Exception -> 0x003b }
            int r3 = r1.getCount()     // Catch:{ Exception -> 0x003b }
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Exception -> 0x003b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x003b }
            com.iflytek.cloud.p078a.p082d.p083a.C3990a.m17031a(r0, r2)     // Catch:{ Exception -> 0x003b }
            goto L_0x0027
        L_0x008b:
            r0 = move-exception
            r1 = r6
            goto L_0x0068
        L_0x008e:
            r0 = move-exception
            r1 = r6
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.util.p088a.p091c.C4027a.mo14777d():java.util.HashMap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.iflytek.cloud.util.p088a.p089a.C4019a> mo14778e() {
        /*
            r10 = this;
            r6 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            android.content.Context r0 = r10.f16454b     // Catch:{ Exception -> 0x00a3, all -> 0x009d }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x00a3, all -> 0x009d }
            java.lang.String r1 = "content://icc/adn"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00a3, all -> 0x009d }
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x00a3, all -> 0x009d }
            if (r7 == 0) goto L_0x008e
            int r0 = r7.getCount()     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            if (r0 <= 0) goto L_0x008e
        L_0x0022:
            boolean r0 = r7.moveToNext()     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "name"
            int r0 = r7.getColumnIndex(r0)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            java.lang.String r2 = r7.getString(r0)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            java.lang.String r0 = "_id"
            int r0 = r7.getColumnIndex(r0)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            java.lang.String r1 = r7.getString(r0)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            java.lang.String r0 = "number"
            int r0 = r7.getColumnIndex(r0)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            java.lang.String r0 = com.iflytek.cloud.util.p088a.C4029e.m17154a(r0)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            java.lang.String r4 = com.iflytek.cloud.p078a.p082d.C3994d.m17042a(r0)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            if (r2 == 0) goto L_0x0022
            com.iflytek.cloud.util.a.a.a r0 = new com.iflytek.cloud.util.a.a.a     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            r3 = 0
            r5 = 0
            java.lang.String[] r6 = f16453c     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            r9 = 9
            r6 = r6[r9]     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            r8.add(r0)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            goto L_0x0022
        L_0x0061:
            r0 = move-exception
            r1 = r7
        L_0x0063:
            r0.printStackTrace()     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x006b
            r1.close()
        L_0x006b:
            return r8
        L_0x006c:
            java.lang.String r0 = "iFly_ContactManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            r1.<init>()     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            java.lang.String r2 = "querySIM-------count = "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            int r2 = r7.getCount()     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            com.iflytek.cloud.p078a.p082d.p083a.C3990a.m17031a(r0, r1)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
        L_0x0088:
            if (r7 == 0) goto L_0x006b
            r7.close()
            goto L_0x006b
        L_0x008e:
            java.lang.String r0 = "iFly_ContactManager"
            java.lang.String r1 = "querySIM-------cursor getCount = 0 or cursor is null"
            com.iflytek.cloud.p078a.p082d.p083a.C3990a.m17031a(r0, r1)     // Catch:{ Exception -> 0x0061, all -> 0x0096 }
            goto L_0x0088
        L_0x0096:
            r0 = move-exception
        L_0x0097:
            if (r7 == 0) goto L_0x009c
            r7.close()
        L_0x009c:
            throw r0
        L_0x009d:
            r0 = move-exception
            r7 = r6
            goto L_0x0097
        L_0x00a0:
            r0 = move-exception
            r7 = r1
            goto L_0x0097
        L_0x00a3:
            r0 = move-exception
            r1 = r6
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.util.p088a.p091c.C4027a.mo14778e():java.util.List");
    }

    /* renamed from: f */
    public Uri mo14779f() {
        return CallLog.Calls.CONTENT_URI;
    }
}
