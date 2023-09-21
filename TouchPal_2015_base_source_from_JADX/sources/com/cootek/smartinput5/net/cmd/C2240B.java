package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.B */
/* compiled from: CmdQueryGoogleToken */
public class C2240B extends C2259P {

    /* renamed from: a */
    public static final String f9477a = "86843878091-a5sh71ndls2jbvngmkj6e5pm7n4hiv9h.apps.googleusercontent.com";

    /* renamed from: b */
    public static final String f9478b = "SXxPMVULq40WSTFVYz5tSmra";

    /* renamed from: c */
    public static final String f9479c = "http://localhost";

    /* renamed from: d */
    private static final String f9480d = "CmdQueryGoogleToken";

    /* renamed from: e */
    private String f9481e;

    /* renamed from: f */
    private String f9482f = null;

    public C2240B(String str) {
        mo7775a(str);
    }

    /* renamed from: a */
    public void mo7775a(String str) {
        this.f9481e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo7774a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        return String.format("code=%s&client_id=%s&client_secret=%s&redirect_uri=%s&grant_type=authorization_code", new Object[]{this.f9481e, f9477a, f9478b, f9479c});
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
        super.mo7766b(jSONObject);
        if (jSONObject != null) {
            this.f9482f = jSONObject.optString("access_token");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return "/o/oauth2/token";
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return "https://accounts.google.com";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16509e;
    }

    /* renamed from: j */
    public String mo7776j() {
        return this.f9482f;
    }
}
