package com.cootek.smartinput5.func.p054d;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.d.b */
/* compiled from: DeleteAction */
public class C1706b implements C1708d {

    /* renamed from: a */
    protected String f5566a;

    public C1706b(String str) {
        this.f5566a = str;
    }

    /* renamed from: m */
    public int mo6622m() {
        return 3;
    }

    /* renamed from: n */
    public JSONObject mo6623n() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tx", this.f5566a);
            jSONObject.put("dl", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            return null;
        }
    }
}
