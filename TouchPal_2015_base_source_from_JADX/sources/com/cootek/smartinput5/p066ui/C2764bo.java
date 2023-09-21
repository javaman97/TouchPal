package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: com.cootek.smartinput5.ui.bo */
/* compiled from: NewGuidePiledViewManager */
class C2764bo implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f12332a;

    /* renamed from: b */
    final /* synthetic */ C2762bm f12333b;

    C2764bo(C2762bm bmVar, View view) {
        this.f12333b = bmVar;
        this.f12332a = view;
    }

    public void onAnimationEnd(Animation animation) {
        this.f12332a.setVisibility(0);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
