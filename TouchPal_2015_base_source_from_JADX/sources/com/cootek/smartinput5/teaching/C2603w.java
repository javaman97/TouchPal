package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: com.cootek.smartinput5.teaching.w */
/* compiled from: TeachingTipPrediction */
class C2603w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ImageView f11137a;

    /* renamed from: b */
    final /* synthetic */ Animation f11138b;

    /* renamed from: c */
    final /* synthetic */ C2600t f11139c;

    C2603w(C2600t tVar, ImageView imageView, Animation animation) {
        this.f11139c = tVar;
        this.f11137a = imageView;
        this.f11138b = animation;
    }

    public void run() {
        this.f11137a.startAnimation(this.f11138b);
        this.f11137a.setVisibility(0);
    }
}
