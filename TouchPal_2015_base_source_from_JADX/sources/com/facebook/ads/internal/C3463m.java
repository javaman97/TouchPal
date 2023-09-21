package com.facebook.ads.internal;

import android.view.View;
import com.facebook.ads.C3344h;
import com.facebook.ads.internal.adapters.C3353a;
import com.facebook.ads.internal.adapters.C3362b;
import com.facebook.ads.internal.adapters.C3363c;

/* renamed from: com.facebook.ads.internal.m */
class C3463m implements C3363c {

    /* renamed from: a */
    final /* synthetic */ Runnable f15039a;

    /* renamed from: b */
    final /* synthetic */ C3458i f15040b;

    C3463m(C3458i iVar, Runnable runnable) {
        this.f15040b = iVar;
        this.f15039a = runnable;
    }

    /* renamed from: a */
    public void mo10616a(C3362b bVar) {
        this.f15040b.m15121j();
        this.f15040b.f14795a.mo10675c();
    }

    /* renamed from: a */
    public void mo10617a(C3362b bVar, View view) {
        this.f15040b.m15121j();
        this.f15040b.f15020f.removeCallbacks(this.f15039a);
        C3353a f = this.f15040b.f15026l;
        C3353a unused = this.f15040b.f15026l = bVar;
        View unused2 = this.f15040b.f15027m = view;
        if (!this.f15040b.f15025k) {
            this.f15040b.f14795a.mo10670a();
            return;
        }
        this.f15040b.f14795a.mo10671a(view);
        this.f15040b.m15107a(f);
        this.f15040b.m15129n();
    }

    /* renamed from: a */
    public void mo10618a(C3362b bVar, C3344h hVar) {
        this.f15040b.m15121j();
        this.f15040b.f15020f.removeCallbacks(this.f15039a);
        this.f15040b.m15107a((C3353a) bVar);
        this.f15040b.m15127m();
    }

    /* renamed from: b */
    public void mo10619b(C3362b bVar) {
        this.f15040b.m15121j();
        this.f15040b.f14795a.mo10674b();
    }

    /* renamed from: c */
    public void mo10620c(C3362b bVar) {
        this.f15040b.m15121j();
        this.f15040b.m15131o();
    }

    /* renamed from: d */
    public void mo10621d(C3362b bVar) {
        this.f15040b.m15121j();
        this.f15040b.m15129n();
    }
}
