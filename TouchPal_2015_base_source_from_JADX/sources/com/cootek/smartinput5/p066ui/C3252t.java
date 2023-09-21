package com.cootek.smartinput5.p066ui;

import android.view.animation.Animation;

/* renamed from: com.cootek.smartinput5.ui.t */
/* compiled from: ClipboardSimpleAdapter */
class C3252t implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ int f14324a;

    /* renamed from: b */
    final /* synthetic */ C2939q f14325b;

    C3252t(C2939q qVar, int i) {
        this.f14325b = qVar;
        this.f14324a = i;
    }

    public void onAnimationEnd(Animation animation) {
        this.f14325b.f13362q.mo8507a(this.f14324a);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
