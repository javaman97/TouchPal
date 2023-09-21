package com.cootek.smartinput5.p045a;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.a.f */
/* compiled from: UserAction */
public class C1063f {

    /* renamed from: a */
    public static final String f3049a = "timestamp";

    /* renamed from: b */
    public static final String f3050b = "freeMem";

    /* renamed from: c */
    public static final String f3051c = "totalMem";

    /* renamed from: d */
    public static final String f3052d = "maxMem";

    /* renamed from: e */
    public static final String f3053e = "@";

    /* renamed from: f */
    public static final String f3054f = "name";

    /* renamed from: g */
    public static final String f3055g = "time";

    /* renamed from: h */
    public static final String f3056h = "memory";

    /* renamed from: i */
    private String f3057i;

    /* renamed from: j */
    private long f3058j = System.currentTimeMillis();

    /* renamed from: k */
    private JSONObject f3059k;

    public C1063f(String str, Context context) {
        this.f3057i = str;
        this.f3059k = C1059d.m5595a();
    }

    /* renamed from: a */
    public String mo4277a() {
        return this.f3057i;
    }

    /* renamed from: b */
    public JSONObject mo4278b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", mo4277a());
            jSONObject.put(f3055g, this.f3058j);
            jSONObject.put(f3056h, this.f3059k);
            return jSONObject;
        } catch (JSONException e) {
            return null;
        }
    }
}
