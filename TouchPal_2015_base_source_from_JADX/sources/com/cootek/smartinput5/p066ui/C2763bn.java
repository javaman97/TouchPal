package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* renamed from: com.cootek.smartinput5.ui.bn */
/* compiled from: NewGuidePiledViewManager */
class C2763bn implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f12330a;

    /* renamed from: b */
    final /* synthetic */ C2762bm f12331b;

    C2763bn(C2762bm bmVar, View view) {
        this.f12331b = bmVar;
        this.f12330a = view;
    }

    public void onAnimationEnd(Animation animation) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setDuration(1000);
        this.f12330a.startAnimation(alphaAnimation);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
