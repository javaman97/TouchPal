package com.cootek.smartinput5.net.cmd;

import android.text.TextUtils;
import com.cootek.smartinput5.func.C1355M;
import com.cootek.smartinput5.net.login.C2339l;
import com.weibo.net.C4054q;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.H */
/* compiled from: CmdRegister */
public class C2248H extends C2259P {

    /* renamed from: a */
    public static final int f9606a = 4100;

    /* renamed from: b */
    private static final String f9607b = "CmdRegister";

    /* renamed from: c */
    private static final String f9608c = "account_name";

    /* renamed from: d */
    private static final String f9609d = "account_token";

    /* renamed from: e */
    private static final String f9610e = "subscribe";

    /* renamed from: f */
    private C2339l f9611f;

    /* renamed from: g */
    private String f9612g;

    /* renamed from: h */
    private String f9613h;

    /* renamed from: i */
    private boolean f9614i;

    public C2248H(String str, String str2) {
        this(str, str2, true);
    }

    public C2248H(String str, String str2, boolean z) {
        this.f9612g = str;
        this.f9613h = C1355M.m6226a(str2);
        this.f9614i = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        if (!TextUtils.isEmpty(this.f9613h)) {
            jSONObject.put(f9609d, this.f9613h);
        }
        jSONObject.put(f9608c, this.f9612g);
        jSONObject.put(f9610e, this.f9614i);
        return super.mo7764a(jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7765a(HttpResponse httpResponse) {
        super.mo7765a(httpResponse);
        if (this.f9746O == 200) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        if (this.f9746O == 200 && this.f9748Q == 0) {
            this.f9611f = new C2339l(jSONObject);
        }
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.REGISTER.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16509e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9740L;
    }

    /* renamed from: j */
    public C2339l mo7812j() {
        return this.f9611f;
    }
}
