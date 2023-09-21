package com.cootek.smartinput5.p050f;

import android.view.animation.AnimationSet;
import android.widget.ImageView;

/* renamed from: com.cootek.smartinput5.f.l */
/* compiled from: WizardPopupWindow */
class C1331l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ImageView f4059a;

    /* renamed from: b */
    final /* synthetic */ AnimationSet f4060b;

    /* renamed from: c */
    final /* synthetic */ C1319a f4061c;

    C1331l(C1319a aVar, ImageView imageView, AnimationSet animationSet) {
        this.f4061c = aVar;
        this.f4059a = imageView;
        this.f4060b = animationSet;
    }

    public void run() {
        this.f4061c.m6092a((Runnable) this);
        this.f4059a.startAnimation(this.f4060b);
        this.f4061c.m6093a((Runnable) this, 2500);
    }
}
