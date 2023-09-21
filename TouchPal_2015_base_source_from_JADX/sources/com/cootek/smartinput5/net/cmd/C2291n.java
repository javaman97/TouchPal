package com.cootek.smartinput5.net.cmd;

import android.text.TextUtils;
import com.cootek.smartinput5.func.iab.C1730E;
import com.weibo.net.C4054q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.n */
/* compiled from: CmdCreateOrder */
public class C2291n extends C2259P {

    /* renamed from: g */
    private static final String f10039g = "status";

    /* renamed from: h */
    private static final String f10040h = "trans_id";

    /* renamed from: a */
    public String f10041a = null;

    /* renamed from: b */
    public String f10042b;

    /* renamed from: c */
    public int f10043c = -1;

    /* renamed from: d */
    public String f10044d;

    /* renamed from: e */
    public String f10045e;

    /* renamed from: f */
    public String f10046f;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16509e;
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.CREATE_PURCHASE_ORDER.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9739K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("goods_id", this.f10043c);
        jSONObject.put(C1730E.f5655i, this.f10044d);
        if (!TextUtils.isEmpty(this.f10045e)) {
            jSONObject.put(C1730E.f5656j, this.f10045e);
        }
        if (TextUtils.isEmpty(this.f10046f)) {
            return null;
        }
        jSONObject.put("plugin_version", this.f10046f);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            if (jSONObject.has("status")) {
                this.f10041a = jSONObject.getString("status");
            }
            if (jSONObject.has("trans_id")) {
                this.f10042b = jSONObject.getString("trans_id");
            }
        }
    }
}
