package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.z */
/* compiled from: CmdQueryConfig */
public class C2305z extends C2259P {

    /* renamed from: c */
    private static final String f10164c = "key";

    /* renamed from: a */
    public String f10165a;

    /* renamed from: b */
    public JSONObject f10166b;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.QUERY_CONFIG.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9739K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        return C2261Q.f9807m + "key" + "=" + this.f10165a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        this.f10166b = jSONObject;
    }

    /* renamed from: j */
    public boolean mo7908j() {
        return this.f9746O == 204;
    }
}
