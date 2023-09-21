package com.facebook.ads.internal.p076g;

import com.appsflyer.MonitorMessages;
import com.facebook.ads.internal.p073d.C3396a;
import com.facebook.ads.internal.p074e.C3398a;
import com.facebook.ads.internal.p074e.C3400c;
import com.facebook.ads.internal.p076g.C3425h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.g.g */
public class C3424g {

    /* renamed from: a */
    private static C3424g f14935a = new C3424g();

    /* renamed from: a */
    public static synchronized C3424g m15032a() {
        C3424g gVar;
        synchronized (C3424g.class) {
            gVar = f14935a;
        }
        return gVar;
    }

    /* renamed from: a */
    private C3427i m15033a(JSONObject jSONObject, String str, String str2, String str3) {
        C3427i iVar = new C3427i(str, str2);
        iVar.f14943d = str3;
        jSONObject.optInt("code");
        JSONObject jSONObject2 = jSONObject.getJSONArray("placements").getJSONObject(0);
        JSONObject optJSONObject = jSONObject2.optJSONObject("meta");
        iVar.f14944e.mo10688a(optJSONObject == null ? "" : optJSONObject.getString("plid"));
        C3400c a = C3400c.m14952a(jSONObject2.getJSONObject("definition"));
        iVar.f14944e.mo10687a(a);
        C3416a a2 = a.mo10691a();
        if (jSONObject2.has("ads")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("ads");
            for (int i = 0; i < jSONArray.length(); i++) {
                C3398a aVar = new C3398a(a2);
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                aVar.mo10683a(jSONObject3.getString("adapter"));
                jSONObject3.optJSONObject("meta");
                aVar.mo10684a(jSONObject3.getJSONObject("data"));
                iVar.f14944e.mo10686a(aVar);
            }
        }
        return iVar;
    }

    /* renamed from: a */
    private C3428j m15034a(JSONObject jSONObject, String str, String str2) {
        C3428j jVar = new C3428j(str, str2);
        try {
            jVar.f14945d = jSONObject.getString(MonitorMessages.MESSAGE);
        } catch (JSONException e) {
            C3396a.m14941e("no message in the error response");
        }
        return jVar;
    }

    /* renamed from: a */
    public C3425h mo10759a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("meta");
        String string2 = optJSONObject == null ? "" : optJSONObject.getString("version");
        String string3 = optJSONObject == null ? "" : optJSONObject.getString("srv");
        String string4 = optJSONObject == null ? "" : optJSONObject.getString("geo");
        char c = 65535;
        switch (string.hashCode()) {
            case 96432:
                if (string.equals("ads")) {
                    c = 0;
                    break;
                }
                break;
            case 96784904:
                if (string.equals("error")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return m15033a(jSONObject, string2, string3, string4);
            case 1:
                return m15034a(jSONObject, string2, string3);
            default:
                C3396a.m14937a("response type unknown: " + string);
                return new C3425h(C3425h.C3426a.UNKNOWN);
        }
    }
}
