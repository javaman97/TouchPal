package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.j */
/* compiled from: CmdCancelSubscription */
public class C2286j extends C2259P {

    /* renamed from: a */
    private static final String f9998a = "info";

    /* renamed from: b */
    private int f9999b;

    /* renamed from: c */
    private C2287a f10000c;

    /* renamed from: a */
    public void mo7867a(int i) {
        this.f9999b = i;
    }

    /* renamed from: j */
    public C2287a mo7868j() {
        return this.f10000c;
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
        return C2258O.CANCEL_PURCHASE.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9739K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        return "?goods_id=" + this.f9999b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject;
        super.mo7766b(jSONObject);
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject(f9998a)) != null) {
            this.f10000c = new C2287a(optJSONObject);
        }
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.j$a */
    /* compiled from: CmdCancelSubscription */
    public static class C2287a {

        /* renamed from: a */
        private static final String f10001a = "goods_id";

        /* renamed from: b */
        private static final String f10002b = "status";

        /* renamed from: c */
        private static final String f10003c = "auto_renewing";

        /* renamed from: d */
        private static final String f10004d = "trans_time";

        /* renamed from: e */
        private static final String f10005e = "expires";

        /* renamed from: f */
        private static final String f10006f = "trans_id";

        /* renamed from: g */
        private int f10007g;

        /* renamed from: h */
        private String f10008h;

        /* renamed from: i */
        private boolean f10009i;

        /* renamed from: j */
        private String f10010j;

        /* renamed from: k */
        private long f10011k;

        /* renamed from: l */
        private long f10012l;

        public C2287a(JSONObject jSONObject) {
            this.f10007g = jSONObject.optInt("goods_id");
            this.f10008h = jSONObject.optString("status");
            this.f10009i = jSONObject.optBoolean(f10003c);
            this.f10010j = jSONObject.optString("trans_id");
            this.f10011k = jSONObject.optLong(f10005e);
            this.f10012l = jSONObject.optLong(f10004d);
        }

        /* renamed from: a */
        public int mo7869a() {
            return this.f10007g;
        }

        /* renamed from: b */
        public String mo7870b() {
            return this.f10008h;
        }

        /* renamed from: c */
        public boolean mo7871c() {
            return this.f10009i;
        }

        /* renamed from: d */
        public String mo7872d() {
            return this.f10010j;
        }

        /* renamed from: e */
        public long mo7873e() {
            return this.f10011k;
        }

        /* renamed from: f */
        public long mo7874f() {
            return this.f10012l;
        }
    }
}
