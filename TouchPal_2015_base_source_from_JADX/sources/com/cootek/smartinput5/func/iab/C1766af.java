package com.cootek.smartinput5.func.iab;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.iab.af */
/* compiled from: SkuDetails */
public class C1766af {

    /* renamed from: a */
    private String f5748a;

    /* renamed from: b */
    private String f5749b;

    /* renamed from: c */
    private String f5750c;

    /* renamed from: d */
    private String f5751d;

    /* renamed from: e */
    private String f5752e;

    /* renamed from: f */
    private String f5753f;

    public C1766af(String str) throws JSONException {
        this.f5753f = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f5748a = jSONObject.optString("productId");
        this.f5749b = jSONObject.optString("type");
        this.f5750c = jSONObject.optString("price");
        this.f5751d = jSONObject.optString("title");
        this.f5752e = jSONObject.optString("description");
    }

    /* renamed from: a */
    public String mo6755a() {
        return this.f5748a;
    }

    /* renamed from: b */
    public String mo6756b() {
        return this.f5749b;
    }

    /* renamed from: c */
    public String mo6757c() {
        return this.f5750c;
    }

    /* renamed from: d */
    public String mo6758d() {
        return this.f5751d;
    }

    /* renamed from: e */
    public String mo6759e() {
        return this.f5752e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("productId: " + this.f5748a);
        sb.append("\ntype: " + this.f5749b);
        sb.append("\nprice: " + this.f5750c);
        sb.append("\ntitle: " + this.f5751d);
        sb.append("\ndescription: " + this.f5752e);
        return sb.toString();
    }

    /* renamed from: f */
    public String mo6760f() {
        return this.f5753f;
    }
}
