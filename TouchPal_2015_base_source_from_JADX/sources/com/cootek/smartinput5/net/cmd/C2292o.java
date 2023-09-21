package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.o */
/* compiled from: CmdFindPwd */
public class C2292o extends C2259P {

    /* renamed from: a */
    public static final int f10047a = 4101;

    /* renamed from: b */
    public static final int f10048b = 4105;

    /* renamed from: c */
    private static final String f10049c = "CmdFindPwd";

    /* renamed from: d */
    private static final String f10050d = "account_name";

    /* renamed from: e */
    private String f10051e;

    public C2292o(String str) {
        this.f10051e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(f10050d, this.f10051e);
        return super.mo7764a(jSONObject);
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.FIND_PWD.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16509e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9739K;
    }
}
