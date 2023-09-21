package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.widget.TextView;
import com.cootek.smartinput5.engine.AnimationListener;

/* renamed from: com.cootek.smartinput5.teaching.O */
/* compiled from: TeachingTipSwitchLanguage */
class C2543O extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ TextView f10919a;

    /* renamed from: b */
    final /* synthetic */ Animation f10920b;

    /* renamed from: c */
    final /* synthetic */ C2540L f10921c;

    C2543O(C2540L l, TextView textView, Animation animation) {
        this.f10921c = l;
        this.f10919a = textView;
        this.f10920b = animation;
    }

    public void onAnimationEnd(Animation animation) {
        this.f10919a.startAnimation(this.f10920b);
    }
}
