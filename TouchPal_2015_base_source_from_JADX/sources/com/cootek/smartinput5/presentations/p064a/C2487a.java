package com.cootek.smartinput5.presentations.p064a;

import android.text.TextUtils;
import com.cootek.smartinput5.presentations.C2511m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.presentations.a.a */
/* compiled from: ConditionProcessor */
public class C2487a {

    /* renamed from: a */
    public static final String f10793a = "type";

    /* renamed from: b */
    public static final String f10794b = "condition";

    /* renamed from: a */
    public C2489a mo8295a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return m11213b(str, str2);
        }
        return null;
    }

    /* renamed from: b */
    private C2489a m11213b(String str, String str2) {
        JSONObject jSONObject;
        C2511m mVar;
        C2489a aVar = new C2489a();
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject != null) {
            String optString = jSONObject.optString("type");
            JSONObject optJSONObject = jSONObject.optJSONObject(f10794b);
            if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                try {
                    mVar = (C2511m) Enum.valueOf(C2511m.class, optString);
                } catch (IllegalArgumentException e3) {
                    e3.printStackTrace();
                    mVar = null;
                } catch (NullPointerException e4) {
                    e4.printStackTrace();
                    mVar = null;
                }
                if (!(mVar == null || mVar.mo8308a() == null)) {
                    boolean unused = aVar.f10796b = true;
                    boolean unused2 = aVar.f10797c = mVar.mo8308a().mo8293a(optJSONObject.toString());
                }
            }
        }
        return aVar;
    }

    /* renamed from: com.cootek.smartinput5.presentations.a.a$a */
    /* compiled from: ConditionProcessor */
    public class C2489a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f10796b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f10797c;

        private C2489a() {
            this.f10796b = false;
            this.f10797c = false;
        }

        /* renamed from: a */
        public boolean mo8296a() {
            return this.f10796b;
        }

        /* renamed from: b */
        public boolean mo8297b() {
            return this.f10797c;
        }
    }
}
