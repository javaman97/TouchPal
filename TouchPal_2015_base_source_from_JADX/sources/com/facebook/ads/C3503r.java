package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.C3395d;
import com.facebook.ads.internal.C3458i;
import com.facebook.ads.internal.p077h.C3439h;

/* renamed from: com.facebook.ads.r */
public class C3503r implements C3338b {

    /* renamed from: a */
    private static final C3395d f15148a = C3395d.ADS;

    /* renamed from: b */
    private final Context f15149b;

    /* renamed from: c */
    private final String f15150c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3458i f15151d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f15152e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f15153f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3508w f15154g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3502q f15155h;

    public C3503r(Context context, String str) {
        this.f15149b = context;
        this.f15150c = str;
    }

    /* renamed from: a */
    public void mo10516a() {
        this.f15152e = false;
        if (this.f15153f) {
            throw new IllegalStateException("InterstitialAd cannot be loaded while being displayed. Make sure your adapter calls adapterListener.onInterstitialDismissed().");
        }
        if (this.f15151d != null) {
            this.f15151d.mo10792e();
            this.f15151d = null;
        }
        C3496k kVar = C3496k.INTERSTITIAL;
        this.f15151d = new C3458i(this.f15149b, this.f15150c, C3439h.m15061a(C3496k.INTERSTITIAL), kVar, f15148a, 1);
        this.f15151d.mo10680a(new C3504s(this));
        this.f15151d.mo10790c();
    }

    @Deprecated
    /* renamed from: a */
    public void mo10846a(C3502q qVar) {
        this.f15155h = qVar;
    }

    /* renamed from: a */
    public void mo10847a(C3508w wVar) {
        this.f15154g = wVar;
    }

    /* renamed from: b */
    public void mo10517b() {
        if (this.f15151d != null) {
            this.f15151d.mo10792e();
            this.f15151d = null;
        }
    }

    /* renamed from: c */
    public boolean mo10848c() {
        return this.f15152e;
    }

    /* renamed from: d */
    public boolean mo10849d() {
        if (this.f15152e) {
            this.f15151d.mo10791d();
            this.f15153f = true;
            this.f15152e = false;
            return true;
        } else if (this.f15154g == null) {
            return false;
        } else {
            this.f15154g.mo7021a(this, C3344h.f14641j);
            return false;
        }
    }
}
