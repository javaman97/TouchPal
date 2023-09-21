package com.facebook.ads.internal.adapters.p070a;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.C3505t;
import com.facebook.ads.internal.p069a.C3347a;
import com.facebook.ads.internal.p069a.C3348b;
import com.facebook.ads.internal.p077h.C3432c;
import com.facebook.ads.internal.view.C3474b;

/* renamed from: com.facebook.ads.internal.adapters.a.b */
class C3355b implements C3474b.C3476a {

    /* renamed from: a */
    final /* synthetic */ C3505t f14678a;

    /* renamed from: b */
    final /* synthetic */ C3354a f14679b;

    C3355b(C3354a aVar, C3505t tVar) {
        this.f14679b = aVar;
        this.f14678a = tVar;
    }

    /* renamed from: a */
    public void mo10608a() {
        this.f14679b.f14673e.mo10653c();
    }

    /* renamed from: a */
    public void mo10609a(int i) {
    }

    /* renamed from: a */
    public void mo10610a(String str) {
        Uri parse = Uri.parse(str);
        if (!"fbad".equals(parse.getScheme()) || !"close".equals(parse.getAuthority())) {
            this.f14679b.f14670b.mo10613a("com.facebook.ads.interstitial.clicked");
            C3347a a = C3348b.m14737a(this.f14678a, parse);
            if (a != null) {
                try {
                    C3432c.C3433a unused = this.f14679b.f14677i = a.mo10576a();
                    long unused2 = this.f14679b.f14676h = System.currentTimeMillis();
                    a.mo10578b();
                } catch (Exception e) {
                    Log.e(C3354a.f14669a, "Error executing action", e);
                }
            }
        } else {
            this.f14678a.finish();
        }
    }
}
