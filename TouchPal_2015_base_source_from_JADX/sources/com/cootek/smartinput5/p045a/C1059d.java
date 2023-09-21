package com.cootek.smartinput5.p045a;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.a.d */
/* compiled from: MemoryDumper */
public class C1059d {
    /* renamed from: a */
    public static JSONObject m5595a() {
        Runtime runtime = Runtime.getRuntime();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C1063f.f3050b, runtime.freeMemory());
            jSONObject.put(C1063f.f3051c, runtime.totalMemory());
            jSONObject.put(C1063f.f3052d, runtime.maxMemory());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
