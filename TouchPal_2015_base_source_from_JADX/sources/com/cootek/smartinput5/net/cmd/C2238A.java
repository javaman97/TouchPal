package com.cootek.smartinput5.net.cmd;

import android.text.TextUtils;
import com.weibo.net.C4054q;
import java.util.ArrayList;
import org.apache.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.A */
/* compiled from: CmdQueryGoodsInfo */
public class C2238A extends C2259P {

    /* renamed from: a */
    public static final String f9454a = "trade_name";

    /* renamed from: c */
    private static final String f9455c = "CmdCheckGoods";

    /* renamed from: d */
    private static final String f9456d = "info";

    /* renamed from: e */
    private static final String f9457e = "total";

    /* renamed from: f */
    private static final String f9458f = "goods_id";

    /* renamed from: g */
    private static final String f9459g = "product_id";

    /* renamed from: h */
    private static final String f9460h = "status";

    /* renamed from: i */
    private static final String f9461i = "auto_renewing";

    /* renamed from: j */
    private static final String f9462j = "expires";

    /* renamed from: k */
    private static final String f9463k = "expired";

    /* renamed from: b */
    public String f9464b;

    /* renamed from: l */
    private ArrayList<C2239a> f9465l;

    /* renamed from: j */
    public ArrayList<C2239a> mo7771j() {
        return this.f9465l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        return super.mo7764a(jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7765a(HttpResponse httpResponse) {
        super.mo7765a(httpResponse);
        if (this.f9746O == 200) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getInt(f9457e) > 0) {
            JSONArray jSONArray = jSONObject.getJSONArray(f9456d);
            if (this.f9465l == null) {
                this.f9465l = new ArrayList<>();
            } else {
                this.f9465l.clear();
            }
            if (jSONArray != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < jSONArray.length()) {
                        this.f9465l.add(C2239a.m10159a((JSONObject) jSONArray.get(i2)));
                        i = i2 + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        if (TextUtils.isEmpty(this.f9464b)) {
            return super.mo7772k_();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C2261Q.f9807m).append(f9454a).append("=").append(this.f9464b);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.QUERY_GOODS_INFO.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9739K;
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.A$a */
    /* compiled from: CmdQueryGoodsInfo */
    public static class C2239a {

        /* renamed from: a */
        public static final String f9466a = "not_purchased";

        /* renamed from: b */
        public static final String f9467b = "start_purchase";

        /* renamed from: c */
        public static final String f9468c = "purchase_success";

        /* renamed from: d */
        public static final String f9469d = "start_refund";

        /* renamed from: e */
        public static final String f9470e = "refund_success";

        /* renamed from: f */
        public int f9471f;

        /* renamed from: g */
        public int f9472g;

        /* renamed from: h */
        public String f9473h;

        /* renamed from: i */
        public boolean f9474i;

        /* renamed from: j */
        public long f9475j;

        /* renamed from: k */
        public boolean f9476k;

        public String toString() {
            return String.format("<Goods id: %d, status: %s, autoRenew: %b, expireDate: %d>", new Object[]{Integer.valueOf(this.f9471f), this.f9473h, Boolean.valueOf(this.f9474i), Long.valueOf(this.f9475j)});
        }

        /* renamed from: a */
        public static C2239a m10159a(JSONObject jSONObject) throws JSONException {
            if (jSONObject == null) {
                return null;
            }
            C2239a aVar = new C2239a();
            aVar.f9471f = jSONObject.getInt("goods_id");
            aVar.f9472g = jSONObject.getInt(C2238A.f9459g);
            aVar.f9473h = jSONObject.getString("status");
            if (jSONObject.has(C2238A.f9461i)) {
                aVar.f9474i = jSONObject.getBoolean(C2238A.f9461i);
            }
            if (jSONObject.has(C2238A.f9462j)) {
                aVar.f9475j = jSONObject.getLong(C2238A.f9462j);
            }
            if (!jSONObject.has(C2238A.f9463k)) {
                return aVar;
            }
            aVar.f9476k = jSONObject.getBoolean(C2238A.f9463k);
            return aVar;
        }
    }
}
