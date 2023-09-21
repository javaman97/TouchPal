package com.facebook.ads.internal.p076g;

/* renamed from: com.facebook.ads.internal.g.h */
public class C3425h {

    /* renamed from: a */
    protected C3426a f14936a;

    /* renamed from: b */
    protected String f14937b;

    /* renamed from: c */
    protected String f14938c;

    /* renamed from: com.facebook.ads.internal.g.h$a */
    public enum C3426a {
        UNKNOWN,
        f14940b,
        ADS
    }

    public C3425h(C3426a aVar) {
        if (aVar == null) {
            this.f14936a = C3426a.UNKNOWN;
        }
    }

    public C3425h(C3426a aVar, String str, String str2) {
        this.f14936a = aVar;
        this.f14937b = str;
        this.f14938c = str2;
    }

    /* renamed from: a */
    public C3426a mo10760a() {
        return this.f14936a;
    }
}
