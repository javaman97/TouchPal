package com.cootek.smartinput5.func.nativeads;

import android.content.Context;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.paopaopanel.C1937f;
import com.facebook.ads.C3338b;
import com.facebook.ads.C3344h;
import com.facebook.ads.C3345i;

/* renamed from: com.cootek.smartinput5.func.nativeads.l */
/* compiled from: FacebookNativeAds */
class C1887l implements C3345i {

    /* renamed from: a */
    final /* synthetic */ Context f6275a;

    /* renamed from: b */
    final /* synthetic */ C1886k f6276b;

    C1887l(C1886k kVar, Context context) {
        this.f6276b = kVar;
        this.f6275a = context;
    }

    /* renamed from: a */
    public void mo7021a(C3338b bVar, C3344h hVar) {
    }

    /* renamed from: a */
    public void mo7020a(C3338b bVar) {
    }

    /* renamed from: b */
    public void mo7022b(C3338b bVar) {
        C1937f W = Engine.getInstance().getWidgetManager().mo9617W();
        if (W != null && !W.mo7134i()) {
            W.mo7132g();
        }
        this.f6276b.mo7001c(this.f6275a);
    }
}
