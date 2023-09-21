package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.p076g.C3416a;

/* renamed from: com.facebook.ads.internal.adapters.n */
public enum C3376n {
    ANBANNER(C3377o.class, C3375m.AN, C3416a.BANNER),
    ANINTERSTITIAL(C3382t.class, C3375m.AN, C3416a.INTERSTITIAL),
    ANNATIVE(C3384v.class, C3375m.AN, C3416a.NATIVE);
    

    /* renamed from: d */
    public Class<?> f14710d;

    /* renamed from: e */
    public String f14711e;

    /* renamed from: f */
    public C3375m f14712f;

    /* renamed from: g */
    public C3416a f14713g;

    private C3376n(Class<?> cls, C3375m mVar, C3416a aVar) {
        this.f14710d = cls;
        this.f14712f = mVar;
        this.f14713g = aVar;
    }
}
