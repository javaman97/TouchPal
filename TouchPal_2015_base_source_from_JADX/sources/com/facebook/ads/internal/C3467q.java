package com.facebook.ads.internal;

import com.facebook.ads.C3344h;
import com.facebook.ads.internal.adapters.C3351A;
import com.facebook.ads.internal.adapters.C3352B;
import com.facebook.ads.internal.adapters.C3353a;

/* renamed from: com.facebook.ads.internal.q */
class C3467q implements C3352B {

    /* renamed from: a */
    final /* synthetic */ Runnable f15047a;

    /* renamed from: b */
    final /* synthetic */ C3458i f15048b;

    C3467q(C3458i iVar, Runnable runnable) {
        this.f15048b = iVar;
        this.f15047a = runnable;
    }

    /* renamed from: a */
    public void mo10600a(C3351A a) {
        this.f15048b.m15121j();
        this.f15048b.f15020f.removeCallbacks(this.f15047a);
        C3353a unused = this.f15048b.f15026l = a;
        this.f15048b.f14795a.mo10670a();
    }

    /* renamed from: a */
    public void mo10601a(C3351A a, C3344h hVar) {
        this.f15048b.m15121j();
        this.f15048b.f15020f.removeCallbacks(this.f15047a);
        this.f15048b.m15107a((C3353a) a);
        this.f15048b.m15127m();
    }
}
