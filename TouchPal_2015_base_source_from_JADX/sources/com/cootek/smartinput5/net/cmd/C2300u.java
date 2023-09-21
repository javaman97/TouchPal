package com.cootek.smartinput5.net.cmd;

import android.text.TextUtils;
import com.cootek.smartinput5.func.C1355M;
import com.cootek.smartinput5.net.login.C2339l;
import com.weibo.net.C4054q;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.u */
/* compiled from: CmdLogin */
public class C2300u extends C2259P {

    /* renamed from: a */
    public static final String f10103a = "com.cootek.oauth2.google";

    /* renamed from: b */
    public static final String f10104b = "com.cootek.oauth2.facebook";

    /* renamed from: c */
    public static final String f10105c = "com.cootek.oauth.twitter";

    /* renamed from: d */
    public static final String f10106d = "com.cootek.oauth2.sina";

    /* renamed from: e */
    public static final String f10107e = "com.cootek.oauth2.qq";

    /* renamed from: f */
    public static final String f10108f = "com.cootek.smartinputv5.mail";

    /* renamed from: g */
    public static final int f10109g = 5001;

    /* renamed from: h */
    public static final int f10110h = 5002;

    /* renamed from: i */
    private static final String f10111i = "CmdLogin";

    /* renamed from: j */
    private static final String f10112j = "account_token";

    /* renamed from: k */
    private static final String f10113k = "account_name";

    /* renamed from: l */
    private static final String f10114l = "account_type";

    /* renamed from: m */
    private static final String f10115m = "subscribe";

    /* renamed from: n */
    private static final int f10116n = 5000;

    /* renamed from: o */
    private String f10117o;

    /* renamed from: p */
    private String f10118p;

    /* renamed from: q */
    private String f10119q;

    /* renamed from: r */
    private C2339l f10120r;

    /* renamed from: s */
    private boolean f10121s;

    /* renamed from: t */
    private boolean f10122t;

    public C2300u(String str, String str2, boolean z) {
        this((String) null, str, str2, z);
    }

    public C2300u(String str, String str2) {
        this((String) null, str, str2);
    }

    public C2300u(String str, String str2, String str3, boolean z) {
        this.f10119q = str;
        this.f10118p = str3;
        if (f10108f.equals(this.f10118p)) {
            this.f10117o = C1355M.m6226a(str2);
        } else {
            this.f10117o = str2;
        }
        this.f10121s = z;
        this.f10122t = false;
    }

    public C2300u(String str, String str2, String str3) {
        this.f10119q = str;
        this.f10118p = str3;
        if (f10108f.equals(this.f10118p)) {
            this.f10117o = C1355M.m6226a(str2);
        } else {
            this.f10117o = str2;
        }
        this.f10122t = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        if (!TextUtils.isEmpty(this.f10117o)) {
            jSONObject.put(f10112j, this.f10117o);
        }
        jSONObject.put(f10114l, this.f10118p);
        if (!this.f10122t) {
            jSONObject.put(f10115m, this.f10121s);
        }
        if (!TextUtils.isEmpty(this.f10119q)) {
            jSONObject.put(f10113k, this.f10119q);
        }
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
            this.f10120r = new C2339l(jSONObject);
        }
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.LOGIN.mo7825a(f9738J);
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

    /* renamed from: j */
    public C2339l mo7906j() {
        return this.f10120r;
    }
}
