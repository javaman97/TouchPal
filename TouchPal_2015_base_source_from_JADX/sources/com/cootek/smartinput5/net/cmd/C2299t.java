package com.cootek.smartinput5.net.cmd;

import com.cootek.smartinput5.net.cmd.C2254L;
import com.weibo.net.C4054q;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.t */
/* compiled from: CmdLogUploader */
public class C2299t extends C2259P {

    /* renamed from: a */
    private static List<C2254L.C2255a> f10102a = new ArrayList();

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.UPLOAD_LOG.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9740L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16509e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        JSONArray m = m10534m();
        if (m == null) {
            this.f9749R = true;
        } else {
            jSONObject.put("data", m);
        }
        return null;
    }

    /* renamed from: m */
    private JSONArray m10534m() {
        return C2254L.m10284a((List<C2254L.C2255a>) new ArrayList(f10102a));
    }

    /* renamed from: a */
    public static void m10532a(C2254L.C2255a aVar) {
        if (f10102a.size() >= 100) {
            f10102a.remove(0);
        }
        f10102a.add(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7813c(JSONObject jSONObject) {
        super.mo7813c(jSONObject);
        if (this.f9748Q == 0) {
            f10102a.clear();
        }
    }

    /* renamed from: j */
    public static int m10533j() {
        if (f10102a != null) {
            return f10102a.size();
        }
        return 0;
    }

    /* renamed from: l */
    public String mo7780l() {
        return "CmdLU";
    }
}
