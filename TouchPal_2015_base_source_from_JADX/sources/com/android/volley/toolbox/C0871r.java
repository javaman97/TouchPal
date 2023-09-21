package com.android.volley.toolbox;

import com.android.volley.C0830l;
import com.android.volley.C0832n;
import com.android.volley.C0840s;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.android.volley.toolbox.r */
/* compiled from: JsonArrayRequest */
public class C0871r extends C0873t<JSONArray> {
    public C0871r(String str, C0840s.C0842b<JSONArray> bVar, C0840s.C0841a aVar) {
        super(0, str, (String) null, bVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0840s<JSONArray> mo3059a(C0830l lVar) {
        try {
            return C0840s.m4729a(new JSONArray(new String(lVar.f2185b, C0857i.m4796a(lVar.f2186c))), C0857i.m4795a(lVar));
        } catch (UnsupportedEncodingException e) {
            return C0840s.m4728a(new C0832n((Throwable) e));
        } catch (JSONException e2) {
            return C0840s.m4728a(new C0832n((Throwable) e2));
        }
    }
}
