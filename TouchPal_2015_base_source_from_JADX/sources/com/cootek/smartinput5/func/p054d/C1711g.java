package com.cootek.smartinput5.func.p054d;

import com.cootek.smartinput5.engine.InputContext;
import com.cootek.smartinput5.engine.SibCandidateItem;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.d.g */
/* compiled from: ReselectAction */
public class C1711g extends C1705a {
    public C1711g(InputContext inputContext, InputContext inputContext2, String str, String str2, ArrayList<String> arrayList, int i, int i2, String str3, String str4, int i3, ArrayList<SibCandidateItem> arrayList2, boolean z) {
        super(inputContext, inputContext2, str, str2, arrayList, i, i2, str3, str4, i3, arrayList2, z);
    }

    public C1711g() {
    }

    /* renamed from: m */
    public int mo6622m() {
        return 2;
    }

    /* renamed from: n */
    public JSONObject mo6623n() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("efip", this.f5554a.toJSONObject());
            jSONObject2.put("lwip", this.f5555b.toJSONObject());
            jSONObject2.put("op", this.f5556c);
            jSONObject2.put("ev", this.f5557d);
            if (!this.f5558e.isEmpty()) {
                jSONObject2.put("hs", new JSONArray(this.f5558e));
            }
            jSONObject2.put("tag", this.f5559f);
            jSONObject2.put("corr", this.f5560g);
            jSONObject2.put("lang", this.f5561h);
            jSONObject2.put("df", this.f5562i);
            jSONObject2.put("wrtm", this.f5563j);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f5564k.size(); i++) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("text", ((SibCandidateItem) this.f5564k.get(i)).getText());
                jSONObject3.put("tag", ((SibCandidateItem) this.f5564k.get(i)).getTag());
                jSONArray.put(jSONObject3);
            }
            if (jSONArray.length() > 0) {
                jSONObject2.put("sib", jSONArray);
            }
            jSONObject2.put("act", this.f5565l);
            jSONObject.put("rs", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            return null;
        }
    }
}
