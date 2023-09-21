package com.cootek.smartinput5.p045a;

import java.util.Comparator;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.a.b */
/* compiled from: ActionFlowCollector */
class C1057b implements Comparator<JSONObject> {

    /* renamed from: a */
    final /* synthetic */ C1056a f3003a;

    C1057b(C1056a aVar) {
        this.f3003a = aVar;
    }

    /* renamed from: a */
    public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.optLong(C1063f.f3055g) < jSONObject2.optLong(C1063f.f3055g)) {
            return -1;
        }
        return 1;
    }
}
