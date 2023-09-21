package com.cootek.smartinput5.presentations.p064a;

import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.presentations.C2503g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.presentations.a.h */
/* compiled from: GeneralSkinJudge */
public class C2496h implements C2503g.C2504a {

    /* renamed from: a */
    private static final String f10799a = "command";

    /* renamed from: b */
    private static final String f10800b = "package";

    /* renamed from: com.cootek.smartinput5.presentations.a.h$a */
    /* compiled from: GeneralSkinJudge */
    private enum C2497a {
        EXCLUDE,
        INCLUDE
    }

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
            return m11227a(jSONObject);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m11227a(JSONObject jSONObject) {
        C2497a b = m11228b(jSONObject.optString(f10799a));
        if (b != null) {
            return m11226a(b, jSONObject.optString(f10800b));
        }
        return false;
    }

    /* renamed from: a */
    private boolean m11226a(C2497a aVar, String str) {
        if (aVar == C2497a.EXCLUDE) {
            if (!m11229c(str)) {
                return true;
            }
            return false;
        } else if (aVar == C2497a.INCLUDE) {
            return m11229c(str);
        } else {
            return false;
        }
    }

    /* renamed from: b */
    private C2497a m11228b(String str) {
        try {
            return (C2497a) Enum.valueOf(C2497a.class, str);
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private boolean m11229c(String str) {
        boolean z = false;
        if (C1368X.m6324d()) {
            C1602bh n = C1368X.m6320c().mo5841n();
            n.mo6268d();
            if (n.mo6284l(str) != null) {
                z = true;
            }
            n.mo6277h();
        }
        return z;
    }
}
