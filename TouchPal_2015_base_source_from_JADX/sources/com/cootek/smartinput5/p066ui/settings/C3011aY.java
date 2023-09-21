package com.cootek.smartinput5.p066ui.settings;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.cootek.smartinput5.ui.settings.aY */
/* compiled from: KeyboardCustomizeMask */
class C3011aY implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C3007aV f13893a;

    C3011aY(C3007aV aVVar) {
        this.f13893a = aVVar;
    }

    public void onAnimationStart(Animation animation) {
        boolean unused = this.f13893a.f13875T = true;
    }

    public void onAnimationEnd(Animation animation) {
        new Handler().post(new C3012aZ(this));
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
