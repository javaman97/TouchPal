package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: com.cootek.smartinput5.teaching.T */
/* compiled from: TeachingTipSymbol */
class C2548T implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ImageView f10927a;

    /* renamed from: b */
    final /* synthetic */ Animation f10928b;

    /* renamed from: c */
    final /* synthetic */ C2544P f10929c;

    C2548T(C2544P p, ImageView imageView, Animation animation) {
        this.f10929c = p;
        this.f10927a = imageView;
        this.f10928b = animation;
    }

    public void run() {
        this.f10927a.startAnimation(this.f10928b);
    }
}
