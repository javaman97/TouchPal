package com.android.volley.toolbox;

import com.android.volley.C0830l;
import com.android.volley.C0833o;
import com.android.volley.C0840s;
import java.io.UnsupportedEncodingException;

/* renamed from: com.android.volley.toolbox.z */
/* compiled from: StringRequest */
public class C0879z extends C0833o<String> {

    /* renamed from: a */
    private final C0840s.C0842b<String> f2328a;

    public C0879z(int i, String str, C0840s.C0842b<String> bVar, C0840s.C0841a aVar) {
        super(i, str, aVar);
        this.f2328a = bVar;
    }

    public C0879z(String str, C0840s.C0842b<String> bVar, C0840s.C0841a aVar) {
        this(0, str, bVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo3064b(String str) {
        this.f2328a.mo3103a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0840s<String> mo3059a(C0830l lVar) {
        String str;
        try {
            str = new String(lVar.f2185b, C0857i.m4796a(lVar.f2186c));
        } catch (UnsupportedEncodingException e) {
            str = new String(lVar.f2185b);
        }
        return C0840s.m4729a(str, C0857i.m4795a(lVar));
    }
}
