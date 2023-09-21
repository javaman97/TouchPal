package com.cootek.smartinput5.func.skin;

import com.cootek.smartinput5.func.nativeads.C1875a;
import com.cootek.smartinput5.func.nativeads.C1886k;
import com.facebook.ads.C3338b;
import com.facebook.ads.C3344h;
import com.facebook.ads.C3345i;
import com.facebook.ads.C3509x;

/* renamed from: com.cootek.smartinput5.func.skin.m */
/* compiled from: SponsorThemeManager */
class C1999m implements C3345i {

    /* renamed from: a */
    final /* synthetic */ long f6851a;

    /* renamed from: b */
    final /* synthetic */ C3509x f6852b;

    /* renamed from: c */
    final /* synthetic */ boolean f6853c;

    /* renamed from: d */
    final /* synthetic */ String f6854d;

    /* renamed from: e */
    final /* synthetic */ C1997k f6855e;

    C1999m(C1997k kVar, long j, C3509x xVar, boolean z, String str) {
        this.f6855e = kVar;
        this.f6851a = j;
        this.f6852b = xVar;
        this.f6853c = z;
        this.f6854d = str;
    }

    /* renamed from: a */
    public void mo7021a(C3338b bVar, C3344h hVar) {
    }

    /* renamed from: a */
    public void mo7020a(C3338b bVar) {
        if (!this.f6855e.f6845e.containsKey(Long.valueOf(this.f6851a))) {
            this.f6855e.f6845e.put(Long.valueOf(this.f6851a), new C1886k(this.f6852b));
            if (this.f6853c) {
                this.f6855e.m9170a(this.f6854d, this.f6851a, (C1875a) new C1886k(this.f6852b));
            }
        }
    }

    /* renamed from: b */
    public void mo7022b(C3338b bVar) {
    }
}
