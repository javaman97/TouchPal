package com.android.volley.toolbox;

import com.android.volley.C0830l;
import com.android.volley.C0832n;
import com.android.volley.C0840s;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.volley.toolbox.s */
/* compiled from: JsonObjectRequest */
public class C0872s extends C0873t<JSONObject> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0872s(int i, String str, JSONObject jSONObject, C0840s.C0842b<JSONObject> bVar, C0840s.C0841a aVar) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), bVar, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0872s(String str, JSONObject jSONObject, C0840s.C0842b<JSONObject> bVar, C0840s.C0841a aVar) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, bVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0840s<JSONObject> mo3059a(C0830l lVar) {
        try {
            return C0840s.m4729a(new JSONObject(new String(lVar.f2185b, C0857i.m4796a(lVar.f2186c))), C0857i.m4795a(lVar));
        } catch (UnsupportedEncodingException e) {
            return C0840s.m4728a(new C0832n((Throwable) e));
        } catch (JSONException e2) {
            return C0840s.m4728a(new C0832n((Throwable) e2));
        }
    }
}
