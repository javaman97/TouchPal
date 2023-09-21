package com.cootek.smartinput5.presentations.p064a;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.presentations.C2503g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.presentations.a.g */
/* compiled from: GeneralSettingJudge */
public class C2495g implements C2503g.C2504a {

    /* renamed from: a */
    private static final String f10798a = "key";

    /* renamed from: a */
    public boolean mo8293a(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject != null) {
            return m11224a(jSONObject);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m11224a(JSONObject jSONObject) {
        if (!Settings.isInitialized()) {
            return false;
        }
        return Settings.getInstance().getBoolSetting(Settings.getInstance().getIdByKey(jSONObject.optString("key")));
    }
}
