package com.cootek.smartinput5.net.cmd;

import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2225al;
import com.weibo.net.C4054q;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.r */
/* compiled from: CmdHotWord */
public class C2295r extends C2259P {

    /* renamed from: c */
    private static final String f10061c = "dictionary_id";

    /* renamed from: d */
    private static final String f10062d = "last_timestamp";

    /* renamed from: e */
    private static final String f10063e = "timestamp";

    /* renamed from: f */
    private static final String f10064f = "data";

    /* renamed from: g */
    private static final String f10065g = "cell_info";

    /* renamed from: h */
    private static final String f10066h = "need_notification";

    /* renamed from: i */
    private static final String f10067i = "show_guide_point";

    /* renamed from: j */
    private static final String f10068j = "key";

    /* renamed from: k */
    private static final String f10069k = "word";

    /* renamed from: l */
    private static final String f10070l = "app_id";

    /* renamed from: m */
    private static final String f10071m = "version";

    /* renamed from: n */
    private static final String f10072n = "word_count";

    /* renamed from: o */
    private static final String f10073o = "word_samples";

    /* renamed from: a */
    public String f10074a;

    /* renamed from: b */
    public int f10075b;

    /* renamed from: p */
    private int f10076p;

    /* renamed from: q */
    private String f10077q;

    /* renamed from: r */
    private boolean f10078r = false;

    /* renamed from: s */
    private boolean f10079s = false;

    /* renamed from: t */
    private ArrayList<C2296a> f10080t = new ArrayList<>();

    /* renamed from: u */
    private C2297b f10081u = null;

    /* renamed from: com.cootek.smartinput5.net.cmd.r$a */
    /* compiled from: CmdHotWord */
    public static class C2296a {

        /* renamed from: a */
        public String f10082a;

        /* renamed from: b */
        public String f10083b;

        /* renamed from: c */
        public boolean f10084c;
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.r$b */
    /* compiled from: CmdHotWord */
    public static class C2297b {

        /* renamed from: a */
        public String f10085a;

        /* renamed from: b */
        public String f10086b;

        /* renamed from: c */
        public int f10087c;

        /* renamed from: d */
        public ArrayList<String> f10088d;

        /* renamed from: e */
        public boolean f10089e;
    }

    /* renamed from: j */
    public int mo7900j() {
        return this.f10076p;
    }

    /* renamed from: m */
    public String mo7901m() {
        return this.f10077q;
    }

    /* renamed from: n */
    public boolean mo7902n() {
        return this.f10078r;
    }

    /* renamed from: o */
    public boolean mo7903o() {
        return this.f10079s;
    }

    /* renamed from: p */
    public ArrayList<C2296a> mo7904p() {
        return this.f10080t;
    }

    /* renamed from: q */
    public C2297b mo7905q() {
        return this.f10081u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.HOT_WORDS.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject2 = null;
        if (jSONObject.has("timestamp") && jSONObject.has("dictionary_id")) {
            this.f10076p = jSONObject.getInt("timestamp");
            this.f10077q = jSONObject.getString("dictionary_id");
            if (jSONObject.has(f10066h)) {
                this.f10078r = jSONObject.getBoolean(f10066h);
            }
            this.f10079s = jSONObject.optBoolean(f10067i, false);
            if (jSONObject.has("data")) {
                jSONArray = jSONObject.getJSONArray("data");
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    C2296a aVar = new C2296a();
                    aVar.f10082a = jSONArray.getJSONObject(i).getString("key");
                    aVar.f10083b = jSONArray.getJSONObject(i).getString(f10069k);
                    aVar.f10084c = false;
                    this.f10080t.add(aVar);
                }
            }
            if (jSONObject.has(f10065g)) {
                jSONObject2 = jSONObject.getJSONObject(f10065g);
            }
            if (jSONObject2 != null && jSONObject2.length() > 0) {
                this.f10081u = new C2297b();
                this.f10081u.f10085a = jSONObject2.getString("app_id");
                this.f10081u.f10086b = jSONObject2.getString(f10071m);
                this.f10081u.f10087c = jSONObject2.getInt(f10072n);
                if (jSONObject2.has(f10073o)) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray(f10073o);
                    this.f10081u.f10088d = new ArrayList<>();
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        this.f10081u.f10088d.add(jSONArray2.getJSONObject(i2).getString(f10069k));
                    }
                }
                this.f10081u.f10089e = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        return C2225al.m10055a(C1368X.m6313b(), C2261Q.f9807m + "dictionary_id" + "=" + this.f10074a + C2261Q.f9808n + f10062d + "=" + this.f10075b, 255);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9741M;
    }
}
