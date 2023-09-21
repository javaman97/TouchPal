package com.cootek.smartinput5.net.cmd;

import com.cootek.smartinput5.func.nativeads.C1899v;
import com.weibo.net.C4054q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.M */
/* compiled from: CmdUploadSpeedInfo */
public class C2256M extends C2259P {

    /* renamed from: a */
    public String f9670a;

    /* renamed from: b */
    public String f9671b;

    /* renamed from: c */
    public String f9672c;

    /* renamed from: d */
    public String f9673d;

    /* renamed from: e */
    public String f9674e;

    /* renamed from: f */
    public String f9675f;

    /* renamed from: g */
    public int f9676g;

    /* renamed from: h */
    public int f9677h;

    /* renamed from: i */
    public String f9678i;

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.UPLOAD_SPEED_INFO.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        return C2261Q.f9807m + "score" + "=" + this.f9670a + C2261Q.f9808n + "name" + "=" + this.f9671b + C2261Q.f9808n + "date" + "=" + this.f9672c + C2261Q.f9808n + "signature" + "=" + this.f9673d + C2261Q.f9808n + "email" + "=" + this.f9674e + C2261Q.f9808n + C1899v.f6389m + "=" + this.f9675f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("rank") && jSONObject.has("total")) {
            this.f9676g = jSONObject.getInt("rank");
            this.f9677h = jSONObject.getInt("total");
        }
        if (jSONObject.has("score")) {
            this.f9678i = jSONObject.getString("score");
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
