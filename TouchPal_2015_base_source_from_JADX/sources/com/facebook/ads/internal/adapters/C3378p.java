package com.facebook.ads.internal.adapters;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.p069a.C3347a;
import com.facebook.ads.internal.p069a.C3348b;
import com.facebook.ads.internal.p077h.C3432c;
import com.facebook.ads.internal.p077h.C3434d;
import com.facebook.ads.internal.view.C3474b;

/* renamed from: com.facebook.ads.internal.adapters.p */
class C3378p implements C3474b.C3476a {

    /* renamed from: a */
    final /* synthetic */ C3385w f14724a;

    /* renamed from: b */
    final /* synthetic */ C3377o f14725b;

    C3378p(C3377o oVar, C3385w wVar) {
        this.f14725b = oVar;
        this.f14724a = wVar;
    }

    /* renamed from: a */
    public void mo10608a() {
        this.f14725b.f14716c.mo10653c();
    }

    /* renamed from: a */
    public void mo10609a(int i) {
        if (i == 0 && this.f14725b.f14722i > 0 && this.f14725b.f14723j != null) {
            C3434d.m15049a(C3432c.m15046a(this.f14725b.f14722i, this.f14725b.f14723j, this.f14724a.mo10650i()));
            long unused = this.f14725b.f14722i = 0;
            C3432c.C3433a unused2 = this.f14725b.f14723j = null;
        }
    }

    /* renamed from: a */
    public void mo10610a(String str) {
        if (this.f14725b.f14717d != null) {
            this.f14725b.f14717d.mo10619b(this.f14725b);
        }
        C3347a a = C3348b.m14737a(this.f14725b.f14721h, Uri.parse(str));
        if (a != null) {
            try {
                C3432c.C3433a unused = this.f14725b.f14723j = a.mo10576a();
                long unused2 = this.f14725b.f14722i = System.currentTimeMillis();
                a.mo10578b();
            } catch (Exception e) {
                Log.e(C3377o.f14714a, "Error executing action", e);
            }
        }
    }
}
