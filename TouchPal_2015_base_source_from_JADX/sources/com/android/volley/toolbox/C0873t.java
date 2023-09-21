package com.android.volley.toolbox;

import com.android.volley.C0830l;
import com.android.volley.C0833o;
import com.android.volley.C0840s;
import com.android.volley.C0884y;
import java.io.UnsupportedEncodingException;

/* renamed from: com.android.volley.toolbox.t */
/* compiled from: JsonRequest */
public abstract class C0873t<T> extends C0833o<T> {

    /* renamed from: a */
    private static final String f2314a = "utf-8";

    /* renamed from: b */
    private static final String f2315b = String.format("application/json; charset=%s", new Object[]{f2314a});

    /* renamed from: c */
    private final C0840s.C0842b<T> f2316c;

    /* renamed from: d */
    private final String f2317d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0840s<T> mo3059a(C0830l lVar);

    public C0873t(String str, String str2, C0840s.C0842b<T> bVar, C0840s.C0841a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    public C0873t(int i, String str, String str2, C0840s.C0842b<T> bVar, C0840s.C0841a aVar) {
        super(i, str, aVar);
        this.f2316c = bVar;
        this.f2317d = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3064b(T t) {
        this.f2316c.mo3103a(t);
    }

    /* renamed from: n */
    public String mo3078n() {
        return mo3082r();
    }

    /* renamed from: o */
    public byte[] mo3079o() {
        return mo3083s();
    }

    /* renamed from: r */
    public String mo3082r() {
        return f2315b;
    }

    /* renamed from: s */
    public byte[] mo3083s() {
        try {
            if (this.f2317d == null) {
                return null;
            }
            return this.f2317d.getBytes(f2314a);
        } catch (UnsupportedEncodingException e) {
            C0884y.m4881d("Unsupported Encoding while trying to get the bytes of %s using %s", this.f2317d, f2314a);
            return null;
        }
    }
}
