package com.cootek.smartinput5.net.cmd;

import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.C2309g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.I */
/* compiled from: CmdStatisticActive */
public class C2249I extends C2259P {

    /* renamed from: a */
    public String f9615a;

    /* renamed from: b */
    public String f9616b;

    /* renamed from: c */
    public String f9617c;

    /* renamed from: d */
    public String f9618d;

    /* renamed from: e */
    public String f9619e;

    /* renamed from: f */
    public String f9620f;

    /* renamed from: g */
    public String f9621g;

    /* renamed from: h */
    public String f9622h;

    /* renamed from: i */
    public String f9623i;

    /* renamed from: j */
    public String f9624j;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.STATISTIC_ACTIVE.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("app_name", this.f9615a);
        jSONObject.put(C2225al.f9399j, this.f9616b);
        jSONObject.put(C2225al.f9398i, this.f9617c);
        if (!TextUtils.isEmpty(this.f9619e)) {
            jSONObject.put(Settings.UUID, this.f9619e);
        }
        if (!TextUtils.isEmpty(this.f9620f)) {
            jSONObject.put(Settings.ANDROID_ID, this.f9620f);
        }
        if (!TextUtils.isEmpty(this.f9621g)) {
            jSONObject.put("mac_address", this.f9621g);
        }
        if (!TextUtils.isEmpty(this.f9618d)) {
            jSONObject.put(Settings.IMEI, this.f9618d);
        }
        if (!TextUtils.isEmpty(this.f9623i)) {
            jSONObject.put("referrer", this.f9623i);
        }
        if (!TextUtils.isEmpty(this.f9622h)) {
            jSONObject.put("release", this.f9622h);
        }
        if (TextUtils.isEmpty(this.f9624j)) {
            return null;
        }
        jSONObject.put(Settings.IDENTIFIER, this.f9624j);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9740L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7813c(JSONObject jSONObject) {
        boolean z = true;
        super.mo7813c(jSONObject);
        if (this.f9746O != 200) {
            C2309g.m10582a().mo7912e();
            if (C2309g.m10582a().mo7911d() < 3) {
                z = false;
            }
        }
        if (z) {
            C2309g.m10582a().mo7913f();
            Settings.getInstance().setIntSetting(Settings.LAST_ACTIVE_STAT_TIME, C2225al.m10050a(), false);
            Settings.getInstance().writeBack();
        }
    }
}
