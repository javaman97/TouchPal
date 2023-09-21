package com.cootek.smartinput5.func.p054d;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.d.h */
/* compiled from: UserInputRecorder */
public class C1712h {

    /* renamed from: A */
    public static final String f5575A = "O";

    /* renamed from: B */
    private static final String f5576B = "UserInputRecorder";

    /* renamed from: C */
    private static final String f5577C = "_layout.png";

    /* renamed from: D */
    private static Map<String, String> f5578D = new HashMap();

    /* renamed from: a */
    public static final int f5579a = 1;

    /* renamed from: b */
    public static final int f5580b = 2;

    /* renamed from: c */
    public static final int f5581c = 3;

    /* renamed from: d */
    public static final int f5582d = 4;

    /* renamed from: e */
    public static final int f5583e = 5;

    /* renamed from: f */
    public static final int f5584f = 5;

    /* renamed from: g */
    public static final String f5585g = "&|;";

    /* renamed from: h */
    public static final String f5586h = "&b;";

    /* renamed from: i */
    public static final String f5587i = "&d;";

    /* renamed from: j */
    public static final String f5588j = "&a;";

    /* renamed from: k */
    public static final String f5589k = "&x;";

    /* renamed from: l */
    public static final String f5590l = ":";

    /* renamed from: m */
    public static final String f5591m = "A";

    /* renamed from: n */
    public static final String f5592n = "B";

    /* renamed from: o */
    public static final String f5593o = "C";

    /* renamed from: p */
    public static final String f5594p = "D";

    /* renamed from: q */
    public static final String f5595q = "E";

    /* renamed from: r */
    public static final String f5596r = "F";

    /* renamed from: s */
    public static final String f5597s = "G";

    /* renamed from: t */
    public static final String f5598t = "H";

    /* renamed from: u */
    public static final String f5599u = "I";

    /* renamed from: v */
    public static final String f5600v = "J";

    /* renamed from: w */
    public static final String f5601w = "K";

    /* renamed from: x */
    public static final String f5602x = "L";

    /* renamed from: y */
    public static final String f5603y = "M";

    /* renamed from: z */
    public static final String f5604z = "N";

    /* renamed from: a */
    public static void m7886a(Context context, int i, String str, String str2, String str3, int i2) {
        m7887a(context, i, str, str2, str3, (String) null, 0, 0, (String) null, 0, (String) null, (ArrayList<C1708d>) new ArrayList(), (String) null, i2);
    }

    /* renamed from: a */
    public static void m7887a(Context context, int i, String str, String str2, String str3, String str4, int i2, int i3, String str5, int i4, String str6, ArrayList<C1708d> arrayList, String str7, int i5) {
        String b = m7894b(str3);
        String a = m7880a(i2);
        String b2 = m7893b(i3);
        boolean z = i != 3 || !arrayList.isEmpty();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && z) {
            m7888a(context, i, str, str2, b, str4, a, b2, str5, i4, str6, arrayList, str7, i5);
        }
    }

    /* renamed from: a */
    private static void m7888a(Context context, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, ArrayList<C1708d> arrayList, String str9, int i3) {
        switch (i) {
            case 1:
                m7890a(context, str, str2);
                break;
            case 2:
                m7889a(context, str2);
                break;
            case 3:
                m7892a(context, str3, str2, str4, str5, str6, str, str7, i2, str8, arrayList, str9);
                break;
            case 4:
                m7896b(context, str, str8);
                break;
            case 5:
                m7891a(context, str, str2, i3);
                break;
        }
        Engine.recordDailyUsage(context, Settings.LAST_RECORD_USER_PATTERN_TIME, C1246d.f3865cc);
    }

    /* renamed from: a */
    private static void m7890a(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        JSONObject a = m7882a(str, str2);
        if (a.length() > 0) {
            hashMap.put("wese", a);
        }
        if (!hashMap.isEmpty()) {
            C1246d.m6010a(context).mo4595a((Map<String, Object>) hashMap);
        }
    }

    /* renamed from: a */
    private static void m7889a(Context context, String str) {
        HashMap hashMap = new HashMap();
        JSONObject a = m7881a(str);
        if (a.length() > 0) {
            hashMap.put("pymi", a);
        }
        if (!hashMap.isEmpty()) {
            C1246d.m6010a(context).mo4595a((Map<String, Object>) hashMap);
        }
    }

    /* renamed from: a */
    private static void m7892a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, ArrayList<C1708d> arrayList, String str9) {
        HashMap hashMap = new HashMap();
        JSONObject a = m7884a(str, str2, str3, str4, str5, str6, str7, i, str8, arrayList, str9);
        JSONObject b = m7895b(str6, str8);
        if (a.length() > 0) {
            hashMap.put(SearchActivity.SUGGEST_APPS, a);
        }
        if (b.length() > 0) {
            hashMap.put("loif", b);
        }
        if (!hashMap.isEmpty()) {
            C1246d.m6010a(context).mo4595a((Map<String, Object>) hashMap);
        }
    }

    /* renamed from: b */
    private static void m7896b(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        JSONObject b = m7895b(str, str2);
        if (b.length() > 0) {
            hashMap.put("loif", b);
        }
        if (!hashMap.isEmpty()) {
            C1246d.m6010a(context).mo4595a((Map<String, Object>) hashMap);
        }
    }

    /* renamed from: a */
    private static void m7891a(Context context, String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        JSONObject a = m7883a(str, str2, i);
        if (a.length() > 0) {
            hashMap.put("dels", a);
        }
        if (!hashMap.isEmpty()) {
            C1246d.m6010a(context).mo4595a((Map<String, Object>) hashMap);
        }
    }

    /* renamed from: a */
    private static JSONObject m7882a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lang", str);
            jSONObject.put("input", str2);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m7881a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("text", str);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m7884a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, ArrayList<C1708d> arrayList, String str9) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str2)) {
            return jSONObject;
        }
        try {
            jSONObject.put(PresentConfigXmlTag.FEATURE_ATTR_SENSITIVE_APPS, str);
            jSONObject.put("input", str2);
            jSONObject.put("inputOp", str3);
            jSONObject.put("inputType", str4);
            jSONObject.put("actionType", str5);
            jSONObject.put("lang", str6);
            jSONObject.put("mixLang", str7);
            jSONObject.put("options", i);
            jSONObject.put("layout", str8);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<C1708d> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().mo6623n());
            }
            if (arrayList.size() > 0) {
                jSONObject2.put("action", jSONArray);
            }
            jSONObject.put("inputSeq", jSONObject2);
            jSONObject.put(C1358O.f4192c, str9);
            jSONObject.put("ts", System.currentTimeMillis());
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static JSONObject m7895b(String str, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str2)) {
            return jSONObject;
        }
        if (!f5578D.containsKey(str2)) {
            str3 = m7897c(str, str2);
            f5578D.put(str2, str3);
        } else {
            str3 = f5578D.get(str2);
        }
        try {
            jSONObject.put("layout", str2);
            jSONObject.put("info", str3);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m7883a(String str, String str2, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lang", str);
            jSONObject.put("text", str2);
            jSONObject.put("tag", i);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    /* renamed from: c */
    private static String m7897c(String str, String str2) {
        String str3 = "";
        InputStream inputStream = null;
        try {
            InputStream a = C1460o.m6799b().mo6098a(C1368X.m6313b(), C1811k.m8322a().mo6824c(C1368X.m6320c().mo5842o().mo5967s(str)), str2 + f5577C);
            if (a != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a));
                StringBuilder sb = new StringBuilder();
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    sb.append(readLine).append(C0911j.f2473c);
                }
                str3 = sb.toString();
            }
            if (a != null) {
                try {
                    a.close();
                } catch (Exception e) {
                }
            }
        } catch (Exception e2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e3) {
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e4) {
                }
            }
            throw th;
        }
        return str3;
    }

    /* renamed from: a */
    private static void m7885a() {
        C1017y.m5226d(C1017y.f2665B, f5576B, "Dump layout info:");
        for (Map.Entry next : f5578D.entrySet()) {
            C1017y.m5226d(C1017y.f2665B, f5576B, "layout: " + ((String) next.getKey()) + ", info: " + ((String) next.getValue()));
        }
    }

    /* renamed from: b */
    private static String m7894b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int length = charArray.length - 1; length >= 0; length--) {
            char c = (char) (charArray[length] + 1);
            charArray[length] = c;
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m7880a(int i) {
        switch (i) {
            case 0:
                return "text";
            case 1:
                return "number";
            case 2:
                return "phone";
            case 4:
                return "uri";
            case 8:
                return "email";
            case 16:
                return "date";
            case 64:
                return "math";
            default:
                return "default";
        }
    }

    /* renamed from: b */
    private static String m7893b(int i) {
        switch (i) {
            case 0:
                return "unspecified";
            case 2:
                return EnterKey.f11210GO;
            case 3:
                return EnterKey.SEARCH;
            case 4:
                return EnterKey.SEND;
            case 5:
                return EnterKey.NEXT;
            case 6:
                return EnterKey.DONE;
            default:
                return "none";
        }
    }
}
