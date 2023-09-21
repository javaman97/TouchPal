package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.widget.TextView;
import com.cootek.smartinput5.engine.AnimationListener;

/* renamed from: com.cootek.smartinput5.teaching.aa */
/* compiled from: TeachingTipsDelLeftSlide */
class C2567aa extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ TextView f11045a;

    /* renamed from: b */
    final /* synthetic */ Animation f11046b;

    /* renamed from: c */
    final /* synthetic */ C2553W f11047c;

    C2567aa(C2553W w, TextView textView, Animation animation) {
        this.f11047c = w;
        this.f11045a = textView;
        this.f11046b = animation;
    }

    public void onAnimationEnd(Animation animation) {
        this.f11045a.startAnimation(this.f11046b);
    }
}
