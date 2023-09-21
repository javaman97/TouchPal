package com.cootek.smartinput5.net.cmd;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.w */
/* compiled from: CmdLookupDomain */
public class C2302w extends C2259P {

    /* renamed from: d */
    private static final String f10124d = "mnc_network";

    /* renamed from: e */
    private static final String f10125e = "locale";

    /* renamed from: f */
    private static final String f10126f = "cdn_domain";

    /* renamed from: a */
    public String f10127a;

    /* renamed from: b */
    public String f10128b;

    /* renamed from: c */
    public String f10129c;

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.LOOKUP_DOMAIN.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9740L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("mnc_network", this.f10127a);
        jSONObject.put("locale", this.f10128b);
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        super.mo7766b(jSONObject);
        if (this.f9748Q == 0 && jSONObject != null) {
            this.f10129c = jSONObject.optString(f10126f);
        }
    }
}
