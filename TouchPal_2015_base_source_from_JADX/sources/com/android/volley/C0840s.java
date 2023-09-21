package com.android.volley;

import com.android.volley.C0819c;

/* renamed from: com.android.volley.s */
/* compiled from: Response */
public class C0840s<T> {

    /* renamed from: a */
    public final T f2234a;

    /* renamed from: b */
    public final C0819c.C0820a f2235b;

    /* renamed from: c */
    public final C0883x f2236c;

    /* renamed from: d */
    public boolean f2237d;

    /* renamed from: com.android.volley.s$a */
    /* compiled from: Response */
    public interface C0841a {
        /* renamed from: a */
        void mo3102a(C0883x xVar);
    }

    /* renamed from: com.android.volley.s$b */
    /* compiled from: Response */
    public interface C0842b<T> {
        /* renamed from: a */
        void mo3103a(T t);
    }

    /* renamed from: a */
    public static <T> C0840s<T> m4729a(T t, C0819c.C0820a aVar) {
        return new C0840s<>(t, aVar);
    }

    /* renamed from: a */
    public static <T> C0840s<T> m4728a(C0883x xVar) {
        return new C0840s<>(xVar);
    }

    /* renamed from: a */
    public boolean mo3101a() {
        return this.f2236c == null;
    }

    private C0840s(T t, C0819c.C0820a aVar) {
        this.f2237d = false;
        this.f2234a = t;
        this.f2235b = aVar;
        this.f2236c = null;
    }

    private C0840s(C0883x xVar) {
        this.f2237d = false;
        this.f2234a = null;
        this.f2235b = null;
        this.f2236c = xVar;
    }
}
