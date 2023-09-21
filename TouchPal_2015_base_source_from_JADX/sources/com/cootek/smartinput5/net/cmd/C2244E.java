package com.cootek.smartinput5.net.cmd;

import com.cootek.smartinput5.func.nativeads.C1899v;
import com.weibo.net.C4054q;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.E */
/* compiled from: CmdQuerySpeedInfo */
public class C2244E extends C2259P {

    /* renamed from: a */
    public static final String f9529a = "description";

    /* renamed from: b */
    public static final String f9530b = "text";

    /* renamed from: c */
    public static final String f9531c = "top";

    /* renamed from: d */
    public ArrayList<String> f9532d = new ArrayList<>();

    /* renamed from: e */
    public String f9533e;

    /* renamed from: f */
    public String f9534f;

    /* renamed from: g */
    public ArrayList<String> f9535g;

    /* renamed from: h */
    public ArrayList<String> f9536h;

    /* renamed from: i */
    public ArrayList<String> f9537i;

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.QUERY_SPEED_INFO.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        StringBuilder sb = new StringBuilder();
        if (this.f9532d.size() <= 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f9532d.size()) {
                sb2.append(this.f9532d.get(i2));
                if (i2 != this.f9532d.size() - 1) {
                    sb2.append(",");
                }
                i = i2 + 1;
            } else {
                sb.append(C2261Q.f9807m);
                sb.append("type");
                sb.append("=");
                sb.append(sb2);
                return sb.toString();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("description")) {
            this.f9533e = jSONObject.getString("description");
        }
        if (jSONObject.has("text")) {
            this.f9534f = jSONObject.getString("text");
        }
        if (jSONObject.has("top")) {
            if (this.f9535g == null) {
                this.f9535g = new ArrayList<>();
            }
            if (this.f9536h == null) {
                this.f9536h = new ArrayList<>();
            }
            if (this.f9537i == null) {
                this.f9537i = new ArrayList<>();
            }
            JSONArray jSONArray = jSONObject.getJSONArray("top");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                this.f9535g.add(jSONObject2.getString("name"));
                this.f9536h.add(jSONObject2.getString(C1899v.f6389m));
                this.f9537i.add(jSONObject2.getString("score"));
            }
        }
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
