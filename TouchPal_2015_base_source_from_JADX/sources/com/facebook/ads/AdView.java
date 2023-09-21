package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.C3395d;
import com.facebook.ads.internal.C3458i;
import com.facebook.ads.internal.adapters.C3370j;
import com.facebook.ads.internal.p077h.C3439h;

public class AdView extends RelativeLayout implements C3338b {

    /* renamed from: a */
    private static final C3395d f14564a = C3395d.ADS;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final DisplayMetrics f14565b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3496k f14566c;

    /* renamed from: d */
    private final String f14567d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3458i f14568e;

    /* renamed from: f */
    private volatile boolean f14569f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3345i f14570g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3502q f14571h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public View f14572i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public View f14573j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f14574k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C3370j f14575l;

    public AdView(Context context, String str, C3496k kVar) {
        super(context);
        if (kVar == null || kVar == C3496k.INTERSTITIAL) {
            throw new IllegalArgumentException("adSize");
        }
        this.f14565b = getContext().getResources().getDisplayMetrics();
        this.f14566c = kVar;
        this.f14567d = str;
        Context context2 = context;
        this.f14568e = new C3458i(context2, this.f14567d, C3439h.m15061a(kVar), kVar, f14564a, 1);
        this.f14568e.mo10680a(new C3497l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m14657d() {
        C3499n nVar = new C3499n(this);
        nVar.setDuration(300);
        nVar.setFillAfter(true);
        nVar.setAnimationListener(new C3500o(this));
        startAnimation(nVar);
    }

    /* renamed from: a */
    public void mo10516a() {
        if (!this.f14569f) {
            this.f14568e.mo10790c();
            this.f14569f = true;
        } else if (this.f14568e != null) {
            this.f14568e.mo10795h();
        }
    }

    /* renamed from: b */
    public void mo10517b() {
        if (this.f14575l != null) {
            this.f14575l.mo10640b();
        }
        if (this.f14568e != null) {
            this.f14568e.mo10792e();
            this.f14568e = null;
        }
        removeAllViews();
        this.f14572i = null;
    }

    /* renamed from: c */
    public void mo10518c() {
        if (this.f14568e != null) {
            this.f14568e.mo10796i();
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f14572i != null) {
            C3439h.m15068a(this.f14565b, this.f14572i, this.f14566c);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f14568e != null) {
            if (i == 0) {
                if (this.f14575l != null) {
                    this.f14575l.mo10639a();
                }
                this.f14568e.mo10794g();
            } else if (i == 8) {
                if (this.f14575l != null) {
                    this.f14575l.mo10640b();
                }
                this.f14568e.mo10793f();
            }
        }
    }

    public void setAdListener(C3345i iVar) {
        this.f14570g = iVar;
    }

    @Deprecated
    public void setImpressionListener(C3502q qVar) {
        this.f14571h = qVar;
    }
}
