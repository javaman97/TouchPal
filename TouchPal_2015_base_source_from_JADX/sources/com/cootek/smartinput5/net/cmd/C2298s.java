package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.s */
/* compiled from: CmdIpLocation */
public class C2298s extends C2259P {

    /* renamed from: h */
    private static final String f10090h = "city";

    /* renamed from: i */
    private static final String f10091i = "region";

    /* renamed from: j */
    private static final String f10092j = "country_code";

    /* renamed from: k */
    private static final String f10093k = "?latitude=%s&longitude=%s";

    /* renamed from: l */
    private static final String f10094l = "?ip=%s";

    /* renamed from: a */
    public String f10095a;

    /* renamed from: b */
    public boolean f10096b = false;

    /* renamed from: c */
    public double f10097c;

    /* renamed from: d */
    public double f10098d;

    /* renamed from: e */
    public String f10099e;

    /* renamed from: f */
    public String f10100f;

    /* renamed from: g */
    public String f10101g;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        String str = "";
        if (this.f10096b) {
            str = String.format(f10093k, new Object[]{String.valueOf(this.f10097c), String.valueOf(this.f10098d)});
        }
        return C2258O.LOCATION.mo7825a(f9738J) + str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        super.mo7766b(jSONObject);
        if (jSONObject.has(f10092j)) {
            this.f10099e = jSONObject.getString(f10092j);
        }
        if (jSONObject.has(f10091i)) {
            this.f10100f = jSONObject.getString(f10091i);
        }
        if (jSONObject.has("city")) {
            this.f10101g = jSONObject.getString("city");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9739K;
    }
}
