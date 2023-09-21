package com.cootek.smartinput5.func.iab;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.iab.V */
/* compiled from: Purchase */
public class C1754V {

    /* renamed from: a */
    private String f5719a;

    /* renamed from: b */
    private String f5720b;

    /* renamed from: c */
    private String f5721c;

    /* renamed from: d */
    private long f5722d;

    /* renamed from: e */
    private int f5723e = 1;

    /* renamed from: f */
    private String f5724f;

    /* renamed from: g */
    private String f5725g;

    /* renamed from: h */
    private String f5726h;

    /* renamed from: i */
    private String f5727i;

    public C1754V(String str, String str2) throws JSONException {
        this.f5727i = str;
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            this.f5719a = jSONObject.optString("orderId");
            this.f5720b = jSONObject.optString("packageName");
            this.f5721c = jSONObject.optString("productId");
            this.f5722d = jSONObject.optLong("purchaseTime");
            this.f5723e = jSONObject.optInt("purchaseState");
            this.f5724f = jSONObject.optString("developerPayload");
            this.f5725g = jSONObject.optString("purchaseToken");
            this.f5726h = str2;
        }
    }

    /* renamed from: a */
    public String mo6724a() {
        return this.f5719a;
    }

    /* renamed from: b */
    public String mo6725b() {
        return this.f5720b;
    }

    /* renamed from: c */
    public String mo6726c() {
        return this.f5721c;
    }

    /* renamed from: d */
    public long mo6727d() {
        return this.f5722d;
    }

    /* renamed from: e */
    public int mo6728e() {
        return this.f5723e;
    }

    /* renamed from: f */
    public String mo6729f() {
        return this.f5724f;
    }

    /* renamed from: g */
    public String mo6730g() {
        return this.f5725g;
    }

    /* renamed from: h */
    public String mo6731h() {
        return this.f5726h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("productId: " + this.f5721c);
        sb.append(" orderId: " + this.f5719a);
        sb.append(" packageName: " + this.f5720b);
        sb.append(" purchaseTime: " + this.f5722d);
        sb.append(" purchaseState: " + this.f5723e);
        sb.append(" developerPayload: " + this.f5724f);
        sb.append(" purchaseToken: " + this.f5725g);
        sb.append(" signature: " + this.f5726h);
        return sb.toString();
    }

    /* renamed from: i */
    public String mo6732i() {
        return this.f5727i;
    }
}
