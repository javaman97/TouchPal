package com.cootek.smartinput5.net.cmd;

import com.cootek.smartinput5.func.nativeads.C1899v;
import com.cootek.smartinput5.net.C2225al;
import com.weibo.net.C4054q;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.F */
/* compiled from: CmdQueryStoreInfo */
public class C2245F extends C2259P {

    /* renamed from: A */
    private static final String f9538A = "support_country_code";

    /* renamed from: B */
    private static final String f9539B = "subscription";

    /* renamed from: C */
    private static final String f9540C = "valid_duration";

    /* renamed from: D */
    private static final String f9541D = "vip_service";

    /* renamed from: E */
    private static final String f9542E = "vip_present";

    /* renamed from: F */
    private static final String f9543F = "vip_exclusive";

    /* renamed from: G */
    private static final String f9544G = "google_product_id";

    /* renamed from: H */
    private static final String f9545H = "original_price";

    /* renamed from: i */
    private static final String f9546i = "goods";

    /* renamed from: j */
    private static final String f9547j = "total";

    /* renamed from: k */
    private static final String f9548k = "goods_id";

    /* renamed from: l */
    private static final String f9549l = "product_id";

    /* renamed from: m */
    private static final String f9550m = "owner";

    /* renamed from: n */
    private static final String f9551n = "trade_name";

    /* renamed from: o */
    private static final String f9552o = "id_in_app";

    /* renamed from: p */
    private static final String f9553p = "apksize";

    /* renamed from: q */
    private static final String f9554q = "apkname";

    /* renamed from: r */
    private static final String f9555r = "title_id";

    /* renamed from: s */
    private static final String f9556s = "description";

    /* renamed from: t */
    private static final String f9557t = "price";

    /* renamed from: u */
    private static final String f9558u = "on_sale";

    /* renamed from: v */
    private static final String f9559v = "new";

    /* renamed from: w */
    private static final String f9560w = "dependent_language";

    /* renamed from: x */
    private static final String f9561x = "support_app_name";

    /* renamed from: y */
    private static final String f9562y = "support_app_version";

    /* renamed from: z */
    private static final String f9563z = "support_channel_code";

    /* renamed from: I */
    private ArrayList<C2246a> f9564I = new ArrayList<>();

    /* renamed from: T */
    private int f9565T;

    /* renamed from: a */
    public Integer[] f9566a = null;

    /* renamed from: b */
    public String f9567b = null;

    /* renamed from: c */
    public Integer f9568c = null;

    /* renamed from: d */
    public Integer f9569d = null;

    /* renamed from: e */
    public String f9570e = null;

    /* renamed from: f */
    public String f9571f = null;

    /* renamed from: g */
    public String f9572g = null;

    /* renamed from: h */
    public Boolean f9573h = Boolean.FALSE;

    /* renamed from: j */
    public int mo7786j() {
        return this.f9565T;
    }

    /* renamed from: m */
    public ArrayList<C2246a> mo7787m() {
        return this.f9564I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.QUERY_STORE_INFO.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9739K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        StringBuilder sb = new StringBuilder();
        m10207a(sb, "goods_id", (Object[]) this.f9566a);
        m10206a(sb, "trade_name", (Object) this.f9567b);
        m10206a(sb, "start", (Object) this.f9568c);
        m10206a(sb, C1899v.f6362a, (Object) this.f9569d);
        m10206a(sb, "country_code", (Object) this.f9570e);
        m10206a(sb, C2225al.f9400k, (Object) this.f9571f);
        m10206a(sb, "support_purchase", (Object) this.f9572g);
        m10206a(sb, "restricted", (Object) this.f9573h);
        if (sb.length() > 0) {
            sb.replace(0, 1, C2261Q.f9807m);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m10207a(StringBuilder sb, String str, Object[] objArr) {
        if (sb != null && objArr != null) {
            for (Object a : objArr) {
                m10206a(sb, str, a);
            }
        }
    }

    /* renamed from: a */
    private void m10206a(StringBuilder sb, String str, Object obj) {
        if (sb != null && obj != null) {
            sb.append(C2261Q.f9808n);
            sb.append(str);
            sb.append("=");
            sb.append(obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        super.mo7766b(jSONObject);
        if (this.f9746O == 200 && this.f9748Q == 0 && jSONObject != null) {
            this.f9565T = jSONObject.optInt(f9547j);
            JSONArray optJSONArray = jSONObject.optJSONArray(f9546i);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        this.f9564I.add(new C2246a(jSONObject2));
                    }
                }
            }
        }
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.F$a */
    /* compiled from: CmdQueryStoreInfo */
    public static class C2246a implements Serializable {

        /* renamed from: a */
        private int f9574a;

        /* renamed from: b */
        private int f9575b;

        /* renamed from: c */
        private int f9576c;

        /* renamed from: d */
        private String f9577d;

        /* renamed from: e */
        private String f9578e;

        /* renamed from: f */
        private String f9579f;

        /* renamed from: g */
        private String f9580g;

        /* renamed from: h */
        private String f9581h;

        /* renamed from: i */
        private String f9582i;

        /* renamed from: j */
        private String f9583j;

        /* renamed from: k */
        private String f9584k;

        /* renamed from: l */
        private boolean f9585l;

        /* renamed from: m */
        private boolean f9586m;

        /* renamed from: n */
        private String f9587n;

        /* renamed from: o */
        private String f9588o;

        /* renamed from: p */
        private String f9589p;

        /* renamed from: q */
        private String f9590q;

        /* renamed from: r */
        private String f9591r;

        /* renamed from: s */
        private boolean f9592s;

        /* renamed from: t */
        private int f9593t;

        /* renamed from: u */
        private boolean f9594u;

        /* renamed from: v */
        private boolean f9595v;

        /* renamed from: w */
        private boolean f9596w;

        /* renamed from: x */
        private String f9597x;

        public C2246a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f9574a = jSONObject.optInt("goods_id");
                this.f9575b = jSONObject.optInt(C2245F.f9549l);
                this.f9576c = jSONObject.optInt(C2245F.f9550m);
                this.f9577d = jSONObject.optString("trade_name");
                this.f9578e = jSONObject.optString(C2245F.f9552o);
                this.f9579f = jSONObject.optString(C2245F.f9553p);
                this.f9580g = jSONObject.optString(C2245F.f9554q);
                this.f9581h = jSONObject.optString(C2245F.f9555r);
                this.f9582i = jSONObject.optString("description");
                this.f9583j = jSONObject.optString(C2245F.f9557t);
                this.f9585l = jSONObject.optBoolean(C2245F.f9558u);
                this.f9586m = jSONObject.optBoolean("new");
                this.f9587n = jSONObject.optString(C2245F.f9560w);
                this.f9588o = jSONObject.optString(C2245F.f9561x);
                this.f9589p = jSONObject.optString(C2245F.f9562y);
                this.f9590q = jSONObject.optString(C2245F.f9563z);
                this.f9591r = jSONObject.optString(C2245F.f9538A);
                this.f9592s = jSONObject.optBoolean(C2245F.f9539B);
                this.f9593t = jSONObject.optInt(C2245F.f9540C);
                this.f9594u = jSONObject.optBoolean(C2245F.f9541D);
                this.f9595v = jSONObject.optBoolean(C2245F.f9542E);
                this.f9596w = jSONObject.optBoolean(C2245F.f9543F);
                this.f9597x = jSONObject.optString(C2245F.f9544G);
                this.f9584k = jSONObject.optString("original_price");
            }
        }

        /* renamed from: a */
        public int mo7788a() {
            return this.f9574a;
        }

        /* renamed from: b */
        public int mo7789b() {
            return this.f9575b;
        }

        /* renamed from: c */
        public int mo7790c() {
            return this.f9576c;
        }

        /* renamed from: d */
        public String mo7791d() {
            return this.f9577d;
        }

        /* renamed from: e */
        public String mo7792e() {
            return this.f9578e;
        }

        /* renamed from: f */
        public String mo7793f() {
            return this.f9579f;
        }

        /* renamed from: g */
        public String mo7794g() {
            return this.f9580g;
        }

        /* renamed from: h */
        public String mo7795h() {
            return this.f9581h;
        }

        /* renamed from: i */
        public String mo7796i() {
            return this.f9582i;
        }

        /* renamed from: j */
        public String mo7797j() {
            return this.f9583j;
        }

        /* renamed from: k */
        public boolean mo7798k() {
            return this.f9585l;
        }

        /* renamed from: l */
        public boolean mo7799l() {
            return this.f9586m;
        }

        /* renamed from: m */
        public String mo7800m() {
            return this.f9587n;
        }

        /* renamed from: n */
        public String mo7801n() {
            return this.f9588o;
        }

        /* renamed from: o */
        public String mo7802o() {
            return this.f9589p;
        }

        /* renamed from: p */
        public String mo7803p() {
            return this.f9590q;
        }

        /* renamed from: q */
        public String mo7804q() {
            return this.f9591r;
        }

        /* renamed from: r */
        public boolean mo7805r() {
            return this.f9592s;
        }

        /* renamed from: s */
        public int mo7806s() {
            return this.f9593t;
        }

        /* renamed from: t */
        public boolean mo7807t() {
            return this.f9594u;
        }

        /* renamed from: u */
        public boolean mo7808u() {
            return this.f9595v;
        }

        /* renamed from: v */
        public boolean mo7809v() {
            return this.f9596w;
        }

        /* renamed from: w */
        public String mo7810w() {
            return this.f9597x;
        }

        /* renamed from: x */
        public String mo7811x() {
            return this.f9584k;
        }
    }
}
