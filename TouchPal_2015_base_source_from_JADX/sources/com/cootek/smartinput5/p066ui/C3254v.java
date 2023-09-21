package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: com.cootek.smartinput5.ui.v */
/* compiled from: ClipboardSimpleAdapter */
class C3254v implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f14329a;

    /* renamed from: b */
    final /* synthetic */ C2939q f14330b;

    C3254v(C2939q qVar, View view) {
        this.f14330b = qVar;
        this.f14329a = view;
    }

    public void onAnimationEnd(Animation animation) {
        this.f14329a.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
