package com.facebook.ads;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.e */
class C3341e implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ int f14627a;

    /* renamed from: b */
    final /* synthetic */ int f14628b;

    /* renamed from: c */
    final /* synthetic */ AdChoicesView f14629c;

    C3341e(AdChoicesView adChoicesView, int i, int i2) {
        this.f14629c = adChoicesView;
        this.f14627a = i;
        this.f14628b = i2;
    }

    public void onAnimationEnd(Animation animation) {
        new Handler().postDelayed(new C3342f(this), 3000);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
