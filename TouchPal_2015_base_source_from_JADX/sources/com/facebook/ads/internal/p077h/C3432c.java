package com.facebook.ads.internal.p077h;

import com.cootek.smartinput5.p045a.C1063f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.h.c */
public class C3432c {

    /* renamed from: a */
    private String f14956a;

    /* renamed from: b */
    private Map<String, Object> f14957b;

    /* renamed from: c */
    private int f14958c;

    /* renamed from: d */
    private String f14959d;

    /* renamed from: com.facebook.ads.internal.h.c$a */
    public enum C3433a {
        OPEN_STORE(0),
        OPEN_LINK(1),
        XOUT(2),
        OPEN_URL(3),
        SHOW_INTERSTITIAL(4);
        

        /* renamed from: f */
        int f14966f;

        private C3433a(int i) {
            this.f14966f = i;
        }
    }

    public C3432c(String str, Map<String, Object> map, int i, String str2) {
        this.f14956a = str;
        this.f14957b = map;
        this.f14958c = i;
        this.f14959d = str2;
    }

    /* renamed from: a */
    public static C3432c m15046a(long j, C3433a aVar, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("Time", String.valueOf(currentTimeMillis - j));
        hashMap.put("AdAction", String.valueOf(aVar.f14966f));
        return new C3432c("bounceback", hashMap, (int) (currentTimeMillis / 1000), str);
    }

    /* renamed from: a */
    public JSONObject mo10765a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f14956a);
            jSONObject.put("data", new JSONObject(this.f14957b));
            jSONObject.put(C1063f.f3055g, this.f14958c);
            jSONObject.put("request_id", this.f14959d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
