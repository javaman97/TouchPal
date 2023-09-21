package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.C3509x;
import com.facebook.ads.internal.p069a.C3347a;
import com.facebook.ads.internal.p069a.C3348b;
import com.facebook.ads.internal.p077h.C3432c;
import com.facebook.ads.internal.p077h.C3434d;
import com.facebook.ads.internal.p077h.C3437f;
import com.facebook.ads.internal.p077h.C3438g;
import com.facebook.ads.internal.p077h.C3439h;
import com.facebook.ads.internal.p077h.C3451q;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.y */
public class C3387y implements C3367g {

    /* renamed from: a */
    private static final String f14757a = C3387y.class.getSimpleName();

    /* renamed from: A */
    private C3432c.C3433a f14758A = null;

    /* renamed from: b */
    private final Uri f14759b;

    /* renamed from: c */
    private final String f14760c;

    /* renamed from: d */
    private final String f14761d;

    /* renamed from: e */
    private final String f14762e;

    /* renamed from: f */
    private final String f14763f;

    /* renamed from: g */
    private final String f14764g;

    /* renamed from: h */
    private final C3509x.C3510a f14765h;

    /* renamed from: i */
    private final C3509x.C3510a f14766i;

    /* renamed from: j */
    private final C3509x.C3512c f14767j;

    /* renamed from: k */
    private final String f14768k;

    /* renamed from: l */
    private final String f14769l;

    /* renamed from: m */
    private final String f14770m;

    /* renamed from: n */
    private final C3437f f14771n;

    /* renamed from: o */
    private final String f14772o;

    /* renamed from: p */
    private final Collection<String> f14773p;

    /* renamed from: q */
    private final boolean f14774q;

    /* renamed from: r */
    private final C3509x.C3510a f14775r;

    /* renamed from: s */
    private final String f14776s;

    /* renamed from: t */
    private final String f14777t;

    /* renamed from: u */
    private final String f14778u;

    /* renamed from: v */
    private final String f14779v;

    /* renamed from: w */
    private boolean f14780w;

    /* renamed from: x */
    private boolean f14781x;

    /* renamed from: y */
    private boolean f14782y;

    /* renamed from: z */
    private long f14783z = 0;

    private C3387y(Uri uri, String str, String str2, String str3, String str4, String str5, C3509x.C3510a aVar, C3509x.C3510a aVar2, C3509x.C3512c cVar, String str6, String str7, String str8, C3437f fVar, String str9, Collection<String> collection, boolean z, C3509x.C3510a aVar3, String str10, String str11, String str12) {
        this.f14759b = uri;
        this.f14760c = str;
        this.f14761d = str2;
        this.f14762e = str3;
        this.f14763f = str4;
        this.f14764g = str5;
        this.f14765h = aVar;
        this.f14766i = aVar2;
        this.f14767j = cVar;
        this.f14768k = str6;
        this.f14769l = str7;
        this.f14770m = str8;
        this.f14771n = fVar;
        this.f14772o = str9;
        this.f14773p = collection;
        this.f14774q = z;
        this.f14775r = aVar3;
        this.f14776s = str10;
        this.f14777t = str11;
        this.f14778u = str12;
        this.f14779v = UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static C3387y m14901a(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return null;
        }
        Uri parse = Uri.parse(jSONObject.optString("fbad_command"));
        String optString = jSONObject.optString("title");
        String optString2 = jSONObject.optString("subtitle");
        String optString3 = jSONObject.optString("body");
        String optString4 = jSONObject.optString("call_to_action");
        String optString5 = jSONObject.optString("social_context");
        C3509x.C3510a a = C3509x.C3510a.m15298a(jSONObject.optJSONObject("icon"));
        C3509x.C3510a a2 = C3509x.C3510a.m15298a(jSONObject.optJSONObject("image"));
        C3509x.C3512c a3 = C3509x.C3512c.m15303a(jSONObject.optJSONObject("star_rating"));
        String optString6 = jSONObject.optString("impression_report_url");
        String optString7 = jSONObject.optString("click_report_url");
        String optString8 = jSONObject.optString("used_report_url");
        boolean optBoolean = jSONObject.optBoolean("manual_imp");
        C3509x.C3510a aVar = null;
        JSONObject optJSONObject = jSONObject.optJSONObject("ad_choices_icon");
        if (optJSONObject != null) {
            aVar = C3509x.C3510a.m15298a(optJSONObject);
        }
        String optString9 = jSONObject.optString("ad_choices_link_url");
        String optString10 = jSONObject.optString("request_id");
        C3437f a4 = C3437f.m15057a(jSONObject.optString("invalidation_behavior"));
        String optString11 = jSONObject.optString("invalidation_report_url");
        try {
            jSONArray = new JSONArray(jSONObject.optString("detection_strings"));
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        C3387y yVar = new C3387y(parse, optString, optString2, optString3, optString4, optString5, a, a2, a3, optString6, optString7, optString8, a4, optString11, C3438g.m15058a(jSONArray), optBoolean, aVar, optString9, optString10, str);
        if (!yVar.m14904q()) {
            return null;
        }
        return yVar;
    }

    /* renamed from: b */
    private Map<String, String> m14902b(Map<String, Object> map) {
        if (map.containsKey("mil")) {
            boolean booleanValue = ((Boolean) map.get("mil")).booleanValue();
            map.remove("mil");
            if (!booleanValue) {
                return null;
            }
        }
        return Collections.singletonMap("mil", String.valueOf(true));
    }

    /* renamed from: p */
    private void m14903p() {
        if (!this.f14782y) {
            new C3451q().execute(new String[]{this.f14770m});
            this.f14782y = true;
        }
    }

    /* renamed from: q */
    private boolean m14904q() {
        return (this.f14760c == null || this.f14760c.length() <= 0 || this.f14763f == null || this.f14763f.length() <= 0 || this.f14765h == null || this.f14766i == null) ? false : true;
    }

    /* renamed from: a */
    public C3437f mo10633a() {
        return this.f14771n;
    }

    /* renamed from: a */
    public void mo10655a(int i) {
        if (i == 0 && this.f14783z > 0 && this.f14758A != null) {
            C3434d.m15049a(C3432c.m15046a(this.f14783z, this.f14758A, this.f14777t));
            this.f14783z = 0;
            this.f14758A = null;
        }
    }

    /* renamed from: a */
    public void mo10656a(Context context, Map<String, Object> map) {
        if (!this.f14781x) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(m14902b(map));
                hashMap.put("touch", C3439h.m15064a(map));
            }
            new C3451q(hashMap).execute(new String[]{this.f14769l});
            this.f14781x = true;
            C3439h.m15067a(context, "Click logged");
        }
        C3347a a = C3348b.m14737a(context, this.f14759b);
        if (a != null) {
            try {
                this.f14783z = System.currentTimeMillis();
                this.f14758A = a.mo10576a();
                a.mo10578b();
            } catch (Exception e) {
                Log.e(f14757a, "Error executing action", e);
            }
        }
    }

    /* renamed from: a */
    public void mo10657a(Map<String, Object> map) {
        if (!this.f14780w) {
            new C3451q(m14902b(map)).execute(new String[]{this.f14768k});
            this.f14780w = true;
        }
    }

    /* renamed from: b */
    public String mo10634b() {
        return this.f14772o;
    }

    /* renamed from: c */
    public Collection<String> mo10635c() {
        return this.f14773p;
    }

    /* renamed from: d */
    public C3509x.C3510a mo10658d() {
        return this.f14765h;
    }

    /* renamed from: e */
    public C3509x.C3510a mo10659e() {
        return this.f14766i;
    }

    /* renamed from: f */
    public String mo10660f() {
        m14903p();
        return this.f14760c;
    }

    /* renamed from: g */
    public String mo10661g() {
        m14903p();
        return this.f14761d;
    }

    /* renamed from: h */
    public String mo10662h() {
        m14903p();
        return this.f14762e;
    }

    /* renamed from: i */
    public String mo10663i() {
        m14903p();
        return this.f14763f;
    }

    /* renamed from: j */
    public String mo10664j() {
        m14903p();
        return this.f14764g;
    }

    /* renamed from: k */
    public C3509x.C3512c mo10665k() {
        m14903p();
        return this.f14767j;
    }

    /* renamed from: l */
    public boolean mo10666l() {
        return this.f14774q;
    }

    /* renamed from: m */
    public String mo10667m() {
        return this.f14779v;
    }

    /* renamed from: n */
    public C3509x.C3510a mo10668n() {
        return this.f14775r;
    }

    /* renamed from: o */
    public String mo10669o() {
        return this.f14776s;
    }
}
