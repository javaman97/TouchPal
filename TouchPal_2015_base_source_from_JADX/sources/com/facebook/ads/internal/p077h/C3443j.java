package com.facebook.ads.internal.p077h;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.h.j */
public class C3443j {

    /* renamed from: a */
    private final String f14982a;

    /* renamed from: b */
    private final String f14983b;

    /* renamed from: c */
    private final String f14984c;

    /* renamed from: d */
    private final List<String> f14985d;

    /* renamed from: e */
    private final String f14986e;

    /* renamed from: f */
    private final String f14987f;

    private C3443j(String str, String str2, String str3, List<String> list, String str4, String str5) {
        this.f14982a = str;
        this.f14983b = str2;
        this.f14984c = str3;
        this.f14985d = list;
        this.f14986e = str4;
        this.f14987f = str5;
    }

    /* renamed from: a */
    public static C3443j m15078a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("package");
        String optString2 = jSONObject.optString("appsite");
        String optString3 = jSONObject.optString("appsite_url");
        JSONArray optJSONArray = jSONObject.optJSONArray("key_hashes");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
        }
        return new C3443j(optString, optString2, optString3, arrayList, jSONObject.optString("market_uri"), jSONObject.optString("fallback_url"));
    }

    /* renamed from: a */
    public String mo10766a() {
        return this.f14982a;
    }

    /* renamed from: b */
    public String mo10767b() {
        return this.f14983b;
    }

    /* renamed from: c */
    public String mo10768c() {
        return this.f14984c;
    }
}
