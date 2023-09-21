package com.facebook.ads.internal;

import com.facebook.ads.C3344h;
import com.facebook.ads.internal.p073d.C3396a;
import com.facebook.ads.internal.p077h.C3456v;

/* renamed from: com.facebook.ads.internal.c */
public class C3393c {

    /* renamed from: a */
    private final C3346a f14793a;

    /* renamed from: b */
    private final String f14794b;

    public C3393c(C3346a aVar, String str) {
        str = C3456v.m15103a(str) ? aVar.mo10574b() : str;
        this.f14793a = aVar;
        this.f14794b = str;
        C3396a.m14938b("Error code [" + String.valueOf(aVar.mo10571a()) + "] " + str);
    }

    /* renamed from: a */
    public C3346a mo10678a() {
        return this.f14793a;
    }

    /* renamed from: b */
    public C3344h mo10679b() {
        return this.f14793a.mo10575c() ? new C3344h(this.f14793a.mo10571a(), this.f14794b) : new C3344h(C3346a.UNKNOWN_ERROR.mo10571a(), C3346a.UNKNOWN_ERROR.mo10574b());
    }
}
