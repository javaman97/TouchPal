package com.cootek.smartinput5.teaching;

import android.view.animation.AnimationSet;
import android.widget.ImageView;

/* renamed from: com.cootek.smartinput5.teaching.V */
/* compiled from: TeachingTipSymbol */
class C2552V implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ImageView f10956a;

    /* renamed from: b */
    final /* synthetic */ AnimationSet f10957b;

    /* renamed from: c */
    final /* synthetic */ C2544P f10958c;

    C2552V(C2544P p, ImageView imageView, AnimationSet animationSet) {
        this.f10958c = p;
        this.f10956a = imageView;
        this.f10957b = animationSet;
    }

    public void run() {
        this.f10956a.startAnimation(this.f10957b);
    }
}
