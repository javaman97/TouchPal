package com.cootek.smartinput5.func.p054d;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.d.f */
/* compiled from: ReplaceAction */
public class C1710f implements C1708d {

    /* renamed from: a */
    protected String f5574a;

    public C1710f(String str) {
        this.f5574a = str;
    }

    /* renamed from: m */
    public int mo6622m() {
        return 6;
    }

    /* renamed from: n */
    public JSONObject mo6623n() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tx", this.f5574a);
            jSONObject.put("rp", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            return null;
        }
    }
}
