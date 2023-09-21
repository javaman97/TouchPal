package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.settings.ca */
/* compiled from: RateUsActivity */
class C3132ca implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ RateUsActivity f14152a;

    C3132ca(RateUsActivity rateUsActivity) {
        this.f14152a = rateUsActivity;
    }

    public void onClick(View view) {
        if (this.f14152a.f13613b) {
            this.f14152a.f13613b = false;
            this.f14152a.mo9955a();
            C1246d.m6010a(this.f14152a.f13614c).mo4591a("RATE_US/LATER_BUTTON", "CLICK", C1246d.f3836c);
        }
    }
}
