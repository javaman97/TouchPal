package com.facebook.ads;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.o */
class C3500o implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ AdView f15141a;

    C3500o(AdView adView) {
        this.f15141a = adView;
    }

    public void onAnimationEnd(Animation animation) {
        this.f15141a.removeView(this.f15141a.f14573j);
        View unused = this.f15141a.f14573j = null;
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
