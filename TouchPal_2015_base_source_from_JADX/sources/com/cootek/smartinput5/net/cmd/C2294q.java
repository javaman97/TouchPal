package com.cootek.smartinput5.net.cmd;

import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.cootek.smartinput5.func.nativeads.C1900w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.q */
/* compiled from: CmdGetNativeAds */
public class C2294q extends C2259P {

    /* renamed from: d */
    private static final String f10054d = "ads";

    /* renamed from: a */
    public String f10055a;

    /* renamed from: b */
    public int f10056b = 0;

    /* renamed from: c */
    public String f10057c = C1899v.f6398v;

    /* renamed from: e */
    private String f10058e;

    /* renamed from: f */
    private C1899v f10059f;

    /* renamed from: g */
    private C1900w f10060g;

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* renamed from: j */
    public C1900w mo7898j() {
        return this.f10060g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.GET_NATIVE_ADS.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9739K;
    }

    /* renamed from: a */
    public void mo7897a(String str) {
        this.f10058e = str;
    }

    /* renamed from: m */
    public String mo7899m() {
        if (this.f10059f == null) {
            return null;
        }
        return this.f10059f.f6412N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        this.f10059f = C1899v.m8729a(C1368X.m6313b(), this.f10055a, this.f10056b, this.f10055a);
        this.f10059f.f6416R = this.f10057c;
        this.f10059f.mo7042a(this.f10058e);
        return this.f10059f.mo7041a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        JSONArray optJSONArray;
        super.mo7766b(jSONObject);
        if (jSONObject != null && jSONObject.has(f10054d) && (optJSONArray = jSONObject.optJSONArray(f10054d)) != null && optJSONArray.length() > 0) {
            this.f10060g = new C1900w(optJSONArray);
        }
    }
}
