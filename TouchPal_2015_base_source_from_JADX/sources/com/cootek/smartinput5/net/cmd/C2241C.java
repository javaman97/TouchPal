package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.C */
/* compiled from: CmdQueryHotWordDicts */
public class C2241C extends C2259P {

    /* renamed from: b */
    private static final String f9483b = "locale";

    /* renamed from: c */
    private static final String f9484c = "dictionaries";

    /* renamed from: d */
    private static final String f9485d = "id";

    /* renamed from: a */
    public String f9486a;

    /* renamed from: e */
    private ArrayList<String> f9487e = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<String> mo7777j() {
        return this.f9487e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.QUERY_HOT_WORDS_DICTS.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        return C2261Q.f9807m + "locale" + "=" + this.f9486a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        if (jSONObject.has(f9484c) && (jSONArray = jSONObject.getJSONArray(f9484c)) != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                this.f9487e.add(jSONArray.getJSONObject(i).getString("id"));
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
