package com.cootek.smartinput5.func.nativeads;

import com.cootek.smartinput5.func.C1440ap;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.cootek.smartinput5.func.nativeads.w */
/* compiled from: NativeAdsResult */
public class C1900w implements C1440ap {

    /* renamed from: a */
    private JSONArray f6421a;

    /* renamed from: b */
    private ArrayList<C1888m> f6422b = new ArrayList<>();

    public C1900w(JSONArray jSONArray) {
        this.f6421a = jSONArray;
        for (int i = 0; i < this.f6421a.length(); i++) {
            try {
                this.f6422b.add(new C1888m(this.f6421a.getJSONObject(i)));
            } catch (JSONException e) {
            }
        }
    }

    /* renamed from: b */
    public JSONArray mo7043b() {
        return this.f6421a;
    }

    /* renamed from: a */
    public String mo6082a() {
        if (this.f6421a != null) {
            return this.f6421a.toString();
        }
        return null;
    }

    /* renamed from: c */
    public ArrayList<C1888m> mo7044c() {
        return this.f6422b;
    }
}
