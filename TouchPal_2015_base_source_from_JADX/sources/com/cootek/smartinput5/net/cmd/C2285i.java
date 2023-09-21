package com.cootek.smartinput5.net.cmd;

import android.content.Context;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.cootek.smartinput5.func.nativeads.C1900w;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.i */
/* compiled from: CmdBatchGetNativeAds */
public class C2285i extends C2259P {

    /* renamed from: a */
    private static final String f9994a = "ad_requests";

    /* renamed from: b */
    private static final String f9995b = "ads";

    /* renamed from: c */
    private ArrayList<C1899v> f9996c = new ArrayList<>();

    /* renamed from: d */
    private C1900w f9997d;

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* renamed from: j */
    public C1900w mo7866j() {
        return this.f9997d;
    }

    /* renamed from: a */
    public void mo7865a(Context context, String str, int i, int i2) {
        this.f9996c.add(C1899v.m8728a(context, str, i, i2, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.BATCH_GET_NATIVE_ADS.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9739K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<C1899v> it = this.f9996c.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo7041a());
        }
        jSONObject.put(f9994a, jSONArray);
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        JSONArray optJSONArray;
        super.mo7766b(jSONObject);
        if (jSONObject != null && jSONObject.has(f9995b) && (optJSONArray = jSONObject.optJSONArray(f9995b)) != null && optJSONArray.length() > 0) {
            this.f9997d = new C1900w(optJSONArray);
        }
    }
}
