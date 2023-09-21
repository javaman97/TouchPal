package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.cootek.smartinput5.engine.AnimationListener;

/* renamed from: com.cootek.smartinput5.teaching.Z */
/* compiled from: TeachingTipsDelLeftSlide */
class C2556Z extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f10964a;

    /* renamed from: b */
    final /* synthetic */ TranslateAnimation f10965b;

    /* renamed from: c */
    final /* synthetic */ C2553W f10966c;

    C2556Z(C2553W w, ImageView imageView, TranslateAnimation translateAnimation) {
        this.f10966c = w;
        this.f10964a = imageView;
        this.f10965b = translateAnimation;
    }

    public void onAnimationEnd(Animation animation) {
        this.f10964a.startAnimation(this.f10965b);
    }
}
