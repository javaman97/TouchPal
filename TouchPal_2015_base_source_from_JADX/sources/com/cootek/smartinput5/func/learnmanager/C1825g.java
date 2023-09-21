package com.cootek.smartinput5.func.learnmanager;

import android.content.Context;
import android.os.Bundle;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.learnmanager.C1813a;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.learnmanager.g */
/* compiled from: SMSLearnProvider */
public class C1825g extends C1819b {

    /* renamed from: m */
    protected boolean f6091m = false;

    /* renamed from: n */
    private final int f6092n = SearchStatusData.RESPONSE_STATUS_SERVER_ERROR;

    /* renamed from: o */
    private final String f6093o = "content://sms/inbox";

    /* renamed from: p */
    private final String f6094p = "content://sms/sent";

    /* renamed from: q */
    private final String f6095q = "body";

    /* renamed from: r */
    private final String f6096r = "date";

    /* renamed from: s */
    private final String f6097s = "date>?";

    /* renamed from: t */
    private final String f6098t = "date ASC";

    /* renamed from: u */
    private List<String> f6099u = new ArrayList();

    /* renamed from: v */
    private int f6100v = 0;

    /* renamed from: w */
    private int f6101w;

    public C1825g(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String[] mo6849a(Context context) {
        this.f6099u.clear();
        this.f6101w = 0;
        m8416a("content://sms/sent", (int) Settings.SMS_LEARNING_LAST_DATE_SEND);
        if (!Settings.getInstance().getBoolSetting(Settings.SMS_ONLY_IMPORT_OUTGOING)) {
            m8416a("content://sms/inbox", (int) Settings.SMS_LEARNING_LAST_DATE_INBOX);
        }
        return (String[]) this.f6099u.toArray(new String[this.f6099u.size()]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f A[Catch:{ Exception -> 0x00a6, all -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x006e A[EDGE_INSN: B:47:0x006e->B:17:0x006e ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8416a(java.lang.String r11, int r12) {
        /*
            r10 = this;
            r4 = 1
            r9 = 0
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            java.lang.String r0 = r0.getStringSetting(r12)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r6 = r0.longValue()
            android.net.Uri r1 = android.net.Uri.parse(r11)
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = "body"
            r2[r9] = r0
            java.lang.String r0 = "date"
            r2[r4] = r0
            java.lang.String r3 = "date>?"
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r4[r9] = r0
            r8 = 0
            android.content.Context r0 = r10.f6068k     // Catch:{ Exception -> 0x0076 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r5 = "date ASC"
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0076 }
            r5 = r0
        L_0x0039:
            if (r5 == 0) goto L_0x006e
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x00a6 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = com.cootek.smartinput5.func.C1368X.m6324d()     // Catch:{ Exception -> 0x00a6 }
            if (r0 == 0) goto L_0x006e
            r0 = r6
        L_0x0048:
            java.lang.String r2 = "date"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Exception -> 0x00a6 }
            long r2 = r5.getLong(r2)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = "body"
            int r4 = r5.getColumnIndex(r4)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = r5.getString(r4)     // Catch:{ Exception -> 0x00a6 }
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00a1
            int r6 = r10.f6100v     // Catch:{ Exception -> 0x00a6 }
            int r7 = r4.length()     // Catch:{ Exception -> 0x00a6 }
            if (r6 != r7) goto L_0x007c
        L_0x0068:
            boolean r2 = r5.moveToNext()     // Catch:{ Exception -> 0x00a6 }
            if (r2 != 0) goto L_0x0048
        L_0x006e:
            if (r5 == 0) goto L_0x0075
            r5.close()     // Catch:{ Exception -> 0x00be }
        L_0x0073:
            r10.f6091m = r9
        L_0x0075:
            return
        L_0x0076:
            r0 = move-exception
            r0.printStackTrace()
            r5 = r8
            goto L_0x0039
        L_0x007c:
            int r0 = r10.f6100v     // Catch:{ Exception -> 0x00a6 }
            int r1 = r4.length()     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r0 = r4.substring(r0, r1)     // Catch:{ Exception -> 0x00a6 }
        L_0x0086:
            com.cootek.smartinput5.engine.Settings r1 = com.cootek.smartinput5.engine.Settings.getInstance()     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00a6 }
            r6 = 0
            r1.setStringSetting(r12, r4, r6)     // Catch:{ Exception -> 0x00a6 }
            int r1 = com.cootek.smartinput5.func.learnmanager.C1819b.f6058a     // Catch:{ Exception -> 0x00a6 }
            int r0 = r10.m8417b(r0, r1)     // Catch:{ Exception -> 0x00a6 }
            int r1 = r10.f6100v     // Catch:{ Exception -> 0x00a6 }
            int r1 = r1 + r0
            r10.f6100v = r1     // Catch:{ Exception -> 0x00a6 }
            if (r0 == 0) goto L_0x006e
            r0 = r2
            goto L_0x0068
        L_0x00a1:
            r0 = 0
            r10.f6100v = r0     // Catch:{ Exception -> 0x00a6 }
            r0 = r4
            goto L_0x0086
        L_0x00a6:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00b5 }
            r0 = 1
            r10.f6067j = r0     // Catch:{ all -> 0x00b5 }
            if (r5 == 0) goto L_0x0075
            r5.close()     // Catch:{ Exception -> 0x00c0 }
        L_0x00b2:
            r10.f6091m = r9
            goto L_0x0075
        L_0x00b5:
            r0 = move-exception
            if (r5 == 0) goto L_0x00bd
            r5.close()     // Catch:{ Exception -> 0x00c2 }
        L_0x00bb:
            r10.f6091m = r9
        L_0x00bd:
            throw r0
        L_0x00be:
            r0 = move-exception
            goto L_0x0073
        L_0x00c0:
            r0 = move-exception
            goto L_0x00b2
        L_0x00c2:
            r1 = move-exception
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.learnmanager.C1825g.m8416a(java.lang.String, int):void");
    }

    /* renamed from: b */
    private int m8417b(String str, int i) {
        if (this.f6101w >= 500) {
            return 0;
        }
        int i2 = 500 - this.f6101w;
        if (str.length() > i2) {
            str = str.substring(0, i2);
        }
        this.f6099u.add(str);
        this.f6101w += str.length();
        return str.length();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo6851c() {
        return C1974m.m9063a(this.f6068k, (int) R.string.optpage_learn_SMS_title);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo6852d() {
        return C1974m.m9063a(this.f6068k, (int) R.string.sms_learn_success);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo6854f() {
        return C1974m.m9063a(this.f6068k, (int) R.string.sms_learn_failed);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6846a(Context context, C1813a.C1816c cVar) {
        this.f6067j = false;
        this.f6091m = true;
        cVar.mo6845a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo6856h() {
        return C1974m.m9063a(this.f6068k, (int) R.string.sms_import_none);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo6858j() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo6859k() {
        return Settings.SMS_LEARN_RESULT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo6853e() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo6855g() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo6857i() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo6860l() {
        return f6058a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Runnable mo6861m() {
        return new C1826h(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo6862n() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6848a() {
        return this.f6091m;
    }

    /* renamed from: a */
    public void mo6847a(Bundle bundle) {
    }
}
