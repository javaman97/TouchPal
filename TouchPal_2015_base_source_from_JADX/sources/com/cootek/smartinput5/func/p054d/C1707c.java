package com.cootek.smartinput5.func.p054d;

import com.cootek.smartinput5.engine.InputContext;
import com.cootek.smartinput5.engine.SibCandidateItem;
import com.cootek.smartinput5.engine.TouchInputCode;
import com.cootek.smartinput5.engine.TouchInputContext;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.d.c */
/* compiled from: ForwardPredictAction */
public class C1707c extends C1705a {

    /* renamed from: m */
    protected String f5567m;

    public C1707c(InputContext inputContext, InputContext inputContext2, String str, String str2, ArrayList<String> arrayList, int i, int i2, String str3, String str4, int i3, ArrayList<SibCandidateItem> arrayList2, boolean z) {
        super(inputContext, inputContext2, str, str2, arrayList, i, i2, str3, str4, i3, arrayList2, z);
        this.f5567m = mo6625d(inputContext);
        TouchInputContext c = mo6624c(inputContext);
        TouchInputContext c2 = mo6624c(inputContext2);
        if (c != null) {
            this.f5554a = c;
        }
        if (c2 != null) {
            this.f5555b = c2;
        }
    }

    public C1707c() {
    }

    /* renamed from: m */
    public int mo6622m() {
        return 5;
    }

    /* renamed from: n */
    public JSONObject mo6623n() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ctx", this.f5567m);
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
            jSONObject.put("fp", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: c */
    public TouchInputContext mo6624c(InputContext inputContext) {
        if (!(inputContext instanceof TouchInputContext)) {
            return null;
        }
        TouchInputContext touchInputContext = (TouchInputContext) inputContext;
        ArrayList arrayList = new ArrayList();
        int touchInputCodesSize = touchInputContext.getTouchInputCodesSize();
        for (int i = 0; i < touchInputCodesSize; i++) {
            TouchInputCode touchInputCodes = touchInputContext.getTouchInputCodes(i);
            if (!m7867a(touchInputCodes)) {
                arrayList.add(touchInputCodes);
            }
        }
        TouchInputContext touchInputContext2 = new TouchInputContext();
        touchInputContext2.setData(5, arrayList.size(), (TouchInputCode[]) arrayList.toArray(new TouchInputCode[arrayList.size()]));
        return touchInputContext2;
    }

    /* renamed from: d */
    public String mo6625d(InputContext inputContext) {
        StringBuilder sb = new StringBuilder();
        if (inputContext instanceof TouchInputContext) {
            TouchInputContext touchInputContext = (TouchInputContext) inputContext;
            int touchInputCodesSize = touchInputContext.getTouchInputCodesSize();
            for (int i = 0; i < touchInputCodesSize; i++) {
                TouchInputCode touchInputCodes = touchInputContext.getTouchInputCodes(i);
                if (m7867a(touchInputCodes)) {
                    sb.append(touchInputCodes.getPreciseString());
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private boolean m7867a(TouchInputCode touchInputCode) {
        return touchInputCode.getPreciseString().length() == 1 && touchInputCode.getFuzzyString().length() == 0 && touchInputCode.getRelativeX() == 0 && touchInputCode.getRelativeY() == 0 && touchInputCode.getTimeStamp() == 0;
    }
}
