package com.cootek.smartinput5.p050f;

import android.view.animation.AnimationSet;
import android.widget.ImageView;

/* renamed from: com.cootek.smartinput5.f.m */
/* compiled from: WizardPopupWindow */
class C1332m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ImageView f4062a;

    /* renamed from: b */
    final /* synthetic */ AnimationSet f4063b;

    /* renamed from: c */
    final /* synthetic */ C1319a f4064c;

    C1332m(C1319a aVar, ImageView imageView, AnimationSet animationSet) {
        this.f4064c = aVar;
        this.f4062a = imageView;
        this.f4063b = animationSet;
    }

    public void run() {
        this.f4064c.m6092a((Runnable) this);
        this.f4062a.startAnimation(this.f4063b);
        this.f4064c.m6093a((Runnable) this, 2500);
    }
}
