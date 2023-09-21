package com.facebook.ads;

import android.view.View;
import com.facebook.ads.internal.C3389b;
import com.facebook.ads.internal.C3393c;
import com.facebook.ads.internal.adapters.C3370j;
import com.facebook.ads.internal.p077h.C3439h;
import com.facebook.ads.internal.view.C3474b;

/* renamed from: com.facebook.ads.l */
class C3497l extends C3389b {

    /* renamed from: a */
    final /* synthetic */ AdView f15136a;

    C3497l(AdView adView) {
        this.f15136a = adView;
    }

    /* renamed from: a */
    public void mo10670a() {
        if (this.f15136a.f14568e != null) {
            this.f15136a.f14568e.mo10791d();
        }
    }

    /* renamed from: a */
    public void mo10671a(View view) {
        if (view == null) {
            throw new IllegalStateException("Cannot present null view");
        }
        if (this.f15136a.f14575l != null) {
            this.f15136a.f14575l.mo10640b();
        }
        if (!this.f15136a.f14574k || this.f15136a.f14566c != C3496k.RECTANGLE_HEIGHT_250) {
            boolean unused = this.f15136a.f14574k = true;
            View unused2 = this.f15136a.f14572i = view;
            this.f15136a.removeAllViews();
            this.f15136a.addView(this.f15136a.f14572i);
            if (this.f15136a.f14572i instanceof C3474b) {
                C3439h.m15068a(this.f15136a.f14565b, this.f15136a.f14572i, this.f15136a.f14566c);
            }
        } else {
            View unused3 = this.f15136a.f14573j = view;
            this.f15136a.f14573j.setVisibility(4);
            this.f15136a.addView(this.f15136a.f14573j);
            this.f15136a.m14657d();
        }
        if (this.f15136a.f14570g != null) {
            this.f15136a.f14570g.mo7020a(this.f15136a);
        }
        C3370j unused4 = this.f15136a.f14575l = new C3370j(this.f15136a.getContext(), view, this.f15136a.f14568e.mo10789b().mo10695e(), new C3498m(this));
        this.f15136a.f14575l.mo10639a();
    }

    /* renamed from: a */
    public void mo10673a(C3393c cVar) {
        if (this.f15136a.f14570g != null) {
            this.f15136a.f14570g.mo7021a(this.f15136a, cVar.mo10679b());
        }
    }

    /* renamed from: b */
    public void mo10674b() {
        if (this.f15136a.f14570g != null) {
            this.f15136a.f14570g.mo7022b(this.f15136a);
        }
    }

    /* renamed from: c */
    public void mo10675c() {
        if (this.f15136a.f14571h != null) {
            this.f15136a.f14571h.mo10559e(this.f15136a);
        }
        if ((this.f15136a.f14570g instanceof C3502q) && this.f15136a.f14570g != this.f15136a.f14571h) {
            ((C3502q) this.f15136a.f14570g).mo10559e(this.f15136a);
        }
    }
}
