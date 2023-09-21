package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.p */
/* compiled from: CmdGetLatestBubbleNews */
public class C2293p extends C2259P {

    /* renamed from: b */
    private static final String f10052b = "id";

    /* renamed from: a */
    public int f10053a;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.BUBBLE_LATEST.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("id")) {
            this.f10053a = jSONObject.getInt("id");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9741M;
    }
}
