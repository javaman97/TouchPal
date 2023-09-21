package com.cootek.smartinput.p044a;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.cootek.smartinput.a.e */
/* compiled from: IflyResultsJsonParser */
public class C0966e {

    /* renamed from: a */
    public static boolean f2494a = false;

    /* renamed from: a */
    public static String m5014a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            JSONArray jSONArray = new JSONObject(new JSONTokener(str)).getJSONArray("ws");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONObject(i).getJSONArray("cw");
                stringBuffer.append(jSONArray2.getJSONObject(0).getString("w"));
                if (f2494a) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        stringBuffer.append(jSONArray2.getJSONObject(i2).getString("w"));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
