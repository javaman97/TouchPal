package com.cootek.smartinput5.net.cmd;

import android.text.TextUtils;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.iab.C1754V;
import com.cootek.smartinput5.presentations.PresentationLaunchLocalPageActivity;
import com.weibo.net.C4054q;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.J */
/* compiled from: CmdUpdatePurchaseStatus */
public class C2250J extends C2259P {

    /* renamed from: a */
    public static final String f9625a = "status";

    /* renamed from: b */
    public static final String f9626b = "goods_id";

    /* renamed from: c */
    public static final String f9627c = "error_code";

    /* renamed from: d */
    public static final String f9628d = "status_list";

    /* renamed from: e */
    public static final String f9629e = "trans_id";

    /* renamed from: f */
    private ArrayList<C2251a> f9630f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C2252b> f9631g = new ArrayList<>();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16509e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.PURCHASE_UPDATE.mo7825a(f9738J);
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
        Iterator<C2251a> it = this.f9630f.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo7817a());
        }
        jSONObject.put("trans_list", jSONArray);
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        int i;
        String str;
        int i2;
        String str2;
        super.mo7766b(jSONObject);
        if (this.f9746O == 200 && this.f9748Q == 0 && jSONObject != null && jSONObject.has(f9628d)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f9628d);
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i3);
                if (jSONObject2 != null) {
                    if (jSONObject2.has(f9627c)) {
                        i = jSONObject2.getInt(f9627c);
                    } else {
                        i = -1;
                    }
                    if (jSONObject2.has("status")) {
                        str = jSONObject2.getString("status");
                    } else {
                        str = null;
                    }
                    if (jSONObject2.has("goods_id")) {
                        i2 = jSONObject2.getInt("goods_id");
                    } else {
                        i2 = -1;
                    }
                    if (jSONObject2.has("trans_id")) {
                        str2 = jSONObject2.getString("trans_id");
                    } else {
                        str2 = null;
                    }
                    this.f9631g.add(new C2252b(i, str, i2, str2));
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* renamed from: a */
    public void mo7814a(C2251a aVar) {
        if (aVar != null) {
            this.f9630f.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo7815a(ArrayList<C2251a> arrayList) {
        if (arrayList != null) {
            this.f9630f.addAll(arrayList);
        }
    }

    /* renamed from: j */
    public ArrayList<C2252b> mo7816j() {
        return this.f9631g;
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.J$a */
    /* compiled from: CmdUpdatePurchaseStatus */
    public static class C2251a {

        /* renamed from: a */
        private String f9632a;

        /* renamed from: b */
        private String f9633b;

        /* renamed from: c */
        private String f9634c;

        /* renamed from: d */
        private String f9635d;

        /* renamed from: e */
        private C1754V f9636e;

        public C2251a(String str, String str2, String str3) {
            this.f9632a = str;
            this.f9633b = str2;
            this.f9634c = str3;
        }

        /* renamed from: a */
        public void mo7819a(String str) {
            this.f9635d = str;
        }

        /* renamed from: a */
        public void mo7818a(C1754V v) {
            Object a;
            this.f9636e = v;
            if (this.f9636e != null && (a = C1730E.m7951a(v, (String) C1730E.f5659m)) != null) {
                this.f9632a = (String) a;
            }
        }

        /* renamed from: a */
        public JSONObject mo7817a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trans_id", this.f9632a);
            jSONObject.put("status", this.f9633b);
            jSONObject.put(C1730E.f5655i, this.f9634c);
            if (!TextUtils.isEmpty(this.f9635d)) {
                jSONObject.put(C1730E.f5656j, this.f9635d);
            }
            if (this.f9636e != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("channel_trans_id", this.f9636e.mo6724a());
                jSONObject2.put("purchase_token", this.f9636e.mo6730g());
                jSONObject2.put(PresentationLaunchLocalPageActivity.f10781o, this.f9636e.mo6725b());
                jSONObject2.put(C1730E.f5651e, this.f9636e.mo6726c());
                long d = this.f9636e.mo6727d();
                if ("Google".equals(this.f9634c)) {
                    d /= 1000;
                }
                jSONObject2.put("purchase_time", d);
                jSONObject2.put("signature", this.f9636e.mo6731h());
                jSONObject2.put("purchase_state", this.f9636e.mo6728e());
                jSONObject2.put("developer_payload", this.f9636e.mo6729f());
                jSONObject.put("channel_info", jSONObject2);
            }
            return jSONObject;
        }
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.J$b */
    /* compiled from: CmdUpdatePurchaseStatus */
    public static class C2252b {

        /* renamed from: a */
        private int f9637a;

        /* renamed from: b */
        private String f9638b;

        /* renamed from: c */
        private int f9639c;

        /* renamed from: d */
        private String f9640d;

        public C2252b(int i, String str, int i2, String str2) {
            this.f9637a = i;
            this.f9638b = str;
            this.f9639c = i2;
            this.f9640d = str2;
        }

        /* renamed from: a */
        public int mo7820a() {
            return this.f9637a;
        }

        /* renamed from: b */
        public String mo7821b() {
            return this.f9638b;
        }

        /* renamed from: c */
        public int mo7822c() {
            return this.f9639c;
        }

        /* renamed from: d */
        public String mo7823d() {
            return this.f9640d;
        }
    }
}
