package com.facebook.ads.internal.adapters;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.internal.p077h.C3437f;
import com.facebook.ads.internal.p077h.C3438g;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.w */
public class C3385w implements C3367g {

    /* renamed from: a */
    private final String f14745a;

    /* renamed from: b */
    private final String f14746b;

    /* renamed from: c */
    private final String f14747c;

    /* renamed from: d */
    private final C3437f f14748d;

    /* renamed from: e */
    private final String f14749e;

    /* renamed from: f */
    private final Collection<String> f14750f;

    /* renamed from: g */
    private final Map<String, String> f14751g;

    /* renamed from: h */
    private final String f14752h;

    /* renamed from: i */
    private final String f14753i;

    private C3385w(String str, String str2, String str3, C3437f fVar, String str4, Collection<String> collection, Map<String, String> map, String str5, String str6) {
        this.f14745a = str;
        this.f14746b = str2;
        this.f14747c = str3;
        this.f14748d = fVar;
        this.f14749e = str4;
        this.f14750f = collection;
        this.f14751g = map;
        this.f14752h = str5;
        this.f14753i = str6;
    }

    /* renamed from: a */
    public static C3385w m14882a(Bundle bundle) {
        return new C3385w(bundle.getString("markup"), (String) null, bundle.getString("native_impression_report_url"), C3437f.NONE, "", (Collection<String>) null, (Map<String, String>) null, bundle.getString("request_id"), bundle.getString("adapter_class"));
    }

    /* renamed from: a */
    public static C3385w m14883a(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("markup");
        String optString2 = jSONObject.optString("activation_command");
        String optString3 = jSONObject.optString("native_impression_report_url");
        String optString4 = jSONObject.optString("request_id");
        C3437f a = C3437f.m15057a(jSONObject.optString("invalidation_behavior"));
        String optString5 = jSONObject.optString("invalidation_report_url");
        try {
            jSONArray = new JSONArray(jSONObject.optString("detection_strings"));
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        Collection<String> a2 = C3438g.m15058a(jSONArray);
        JSONObject optJSONObject = jSONObject.optJSONObject("metadata");
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
        }
        return new C3385w(optString, optString2, optString3, a, optString5, a2, hashMap, optString4, str);
    }

    /* renamed from: b */
    public static C3385w m14884b(Intent intent) {
        return new C3385w(intent.getStringExtra("markup"), intent.getStringExtra("activation_command"), intent.getStringExtra("native_impression_report_url"), C3437f.NONE, "", (Collection<String>) null, (Map<String, String>) null, intent.getStringExtra("request_id"), intent.getStringExtra("adapter_class"));
    }

    /* renamed from: a */
    public C3437f mo10633a() {
        return this.f14748d;
    }

    /* renamed from: a */
    public void mo10644a(Intent intent) {
        intent.putExtra("markup", this.f14745a);
        intent.putExtra("activation_command", this.f14746b);
        intent.putExtra("native_impression_report_url", this.f14747c);
        intent.putExtra("request_id", this.f14752h);
        intent.putExtra("adapter_class", this.f14753i);
    }

    /* renamed from: b */
    public String mo10634b() {
        return this.f14749e;
    }

    /* renamed from: c */
    public Collection<String> mo10635c() {
        return this.f14750f;
    }

    /* renamed from: d */
    public String mo10645d() {
        return this.f14745a;
    }

    /* renamed from: e */
    public String mo10646e() {
        return this.f14746b;
    }

    /* renamed from: f */
    public String mo10647f() {
        return this.f14747c;
    }

    /* renamed from: g */
    public String mo10648g() {
        return "facebookAd.sendImpression();";
    }

    /* renamed from: h */
    public Map<String, String> mo10649h() {
        return this.f14751g;
    }

    /* renamed from: i */
    public String mo10650i() {
        return this.f14752h;
    }

    /* renamed from: j */
    public Bundle mo10651j() {
        Bundle bundle = new Bundle();
        bundle.putString("markup", this.f14745a);
        bundle.putString("native_impression_report_url", this.f14747c);
        bundle.putString("request_id", this.f14752h);
        bundle.putString("adapter_class", this.f14753i);
        return bundle;
    }
}
