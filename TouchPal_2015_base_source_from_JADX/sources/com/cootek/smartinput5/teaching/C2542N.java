package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.cootek.smartinput5.engine.AnimationListener;

/* renamed from: com.cootek.smartinput5.teaching.N */
/* compiled from: TeachingTipSwitchLanguage */
class C2542N extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f10916a;

    /* renamed from: b */
    final /* synthetic */ TranslateAnimation f10917b;

    /* renamed from: c */
    final /* synthetic */ C2540L f10918c;

    C2542N(C2540L l, ImageView imageView, TranslateAnimation translateAnimation) {
        this.f10918c = l;
        this.f10916a = imageView;
        this.f10917b = translateAnimation;
    }

    public void onAnimationEnd(Animation animation) {
        this.f10916a.startAnimation(this.f10917b);
    }
}
