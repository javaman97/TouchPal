package com.cootek.smartinput5.net.login;

import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.vip.PurchaseVipActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.login.l */
/* compiled from: TAccountInfo */
public class C2339l {

    /* renamed from: a */
    public static final String f10301a = "type";

    /* renamed from: b */
    public static final String f10302b = "name";

    /* renamed from: c */
    public static final String f10303c = "ime_account";

    /* renamed from: d */
    public static final String f10304d = "permission";

    /* renamed from: e */
    public static final String f10305e = "vip_since";

    /* renamed from: f */
    public static final String f10306f = "vip_expire";

    /* renamed from: g */
    public static final String f10307g = "vip_remains";

    /* renamed from: h */
    public static final String f10308h = "vip_trial";

    /* renamed from: i */
    public static final String f10309i = "vip_channel";

    /* renamed from: j */
    public static final String f10310j = "vip_auto_renewing";

    /* renamed from: k */
    public static String f10311k = "guest";

    /* renamed from: l */
    public static String f10312l = Settings.INPUT_TYPE_NORMAL;

    /* renamed from: m */
    public static String f10313m = PurchaseVipActivity.f8895a;

    /* renamed from: n */
    private String f10314n;

    /* renamed from: o */
    private String f10315o;

    /* renamed from: p */
    private String f10316p = f10311k;

    /* renamed from: q */
    private long f10317q;

    /* renamed from: r */
    private long f10318r;

    /* renamed from: s */
    private long f10319s;

    /* renamed from: t */
    private boolean f10320t;

    /* renamed from: u */
    private String f10321u;

    /* renamed from: v */
    private boolean f10322v;

    public C2339l(JSONObject jSONObject) {
        mo7960a(jSONObject);
    }

    public C2339l(String str) {
        mo7959a(str);
    }

    public C2339l() {
        mo7972l();
    }

    /* renamed from: a */
    public boolean mo7961a() {
        return !TextUtils.isEmpty(this.f10314n) && !TextUtils.isEmpty(this.f10315o);
    }

    /* renamed from: a */
    public void mo7960a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null) {
            this.f10314n = jSONObject.optString("type");
            this.f10315o = jSONObject.optString("name");
            if (jSONObject.has(f10303c) && (optJSONObject = jSONObject.optJSONObject(f10303c)) != null) {
                this.f10316p = optJSONObject.optString(f10304d);
                this.f10317q = (long) optJSONObject.optInt(f10305e);
                this.f10318r = (long) optJSONObject.optInt(f10306f);
                this.f10319s = optJSONObject.optLong(f10307g);
                this.f10320t = optJSONObject.optBoolean(f10308h);
                this.f10321u = optJSONObject.optString(f10309i);
                this.f10322v = optJSONObject.optBoolean(f10310j);
            }
        }
    }

    /* renamed from: a */
    public void mo7959a(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                this.f10314n = jSONObject.optString("type");
                this.f10315o = jSONObject.optString("name");
                this.f10316p = jSONObject.optString(f10304d);
                this.f10317q = jSONObject.optLong(f10305e);
                this.f10318r = jSONObject.optLong(f10306f);
                this.f10319s = jSONObject.optLong(f10307g);
                this.f10320t = jSONObject.optBoolean(f10308h);
                this.f10321u = jSONObject.optString(f10309i);
                this.f10322v = jSONObject.optBoolean(f10310j);
            }
        }
    }

    /* renamed from: b */
    public String mo7962b() {
        if (!mo7961a()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", this.f10314n);
            jSONObject.put("name", this.f10315o);
            jSONObject.put(f10304d, this.f10316p);
            jSONObject.put(f10305e, this.f10317q);
            jSONObject.put(f10306f, this.f10318r);
            jSONObject.put(f10307g, this.f10319s);
            jSONObject.put(f10308h, this.f10320t);
            jSONObject.put(f10309i, this.f10321u);
            jSONObject.put(f10310j, this.f10322v);
            return jSONObject.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: c */
    public String mo7963c() {
        return this.f10314n;
    }

    /* renamed from: d */
    public String mo7964d() {
        return this.f10315o;
    }

    /* renamed from: e */
    public String mo7965e() {
        return this.f10316p;
    }

    /* renamed from: f */
    public long mo7966f() {
        return this.f10317q;
    }

    /* renamed from: g */
    public long mo7967g() {
        return this.f10318r;
    }

    /* renamed from: h */
    public long mo7968h() {
        return this.f10319s;
    }

    /* renamed from: i */
    public boolean mo7969i() {
        return this.f10320t;
    }

    /* renamed from: j */
    public String mo7970j() {
        return this.f10321u;
    }

    /* renamed from: k */
    public boolean mo7971k() {
        return this.f10322v;
    }

    /* renamed from: l */
    public void mo7972l() {
        this.f10314n = null;
        this.f10315o = null;
        this.f10316p = f10311k;
        this.f10317q = 0;
        this.f10318r = 0;
        this.f10319s = 0;
        this.f10320t = false;
        this.f10321u = null;
        this.f10322v = false;
    }

    public String toString() {
        return mo7962b();
    }
}
