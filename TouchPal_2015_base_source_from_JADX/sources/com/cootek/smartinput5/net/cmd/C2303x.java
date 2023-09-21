package com.cootek.smartinput5.net.cmd;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.login.C2339l;
import com.weibo.net.C4054q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.x */
/* compiled from: CmdQueryAuthInfo */
public class C2303x extends C2259P {

    /* renamed from: a */
    private static final String f10130a = "uae";

    /* renamed from: b */
    private C2339l f10131b;

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
        return C2258O.AUTH_INFO.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9739K;
    }

    /* renamed from: j */
    public C2339l mo7907j() {
        return this.f10131b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        StringBuilder sb = new StringBuilder();
        boolean boolSetting = Settings.getInstance().getBoolSetting(Settings.USERDATA_COLLECT_ENABLE);
        sb.append(C2261Q.f9807m);
        sb.append(f10130a);
        sb.append("=");
        sb.append(boolSetting);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        super.mo7766b(jSONObject);
        if (this.f9746O == 200 && this.f9748Q == 0) {
            this.f10131b = new C2339l(jSONObject);
        }
    }
}
