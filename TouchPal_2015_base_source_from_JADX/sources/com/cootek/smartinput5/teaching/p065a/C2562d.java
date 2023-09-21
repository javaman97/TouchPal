package com.cootek.smartinput5.teaching.p065a;

import android.view.View;
import android.view.animation.Animation;
import com.cootek.smartinput5.engine.AnimationListener;

/* renamed from: com.cootek.smartinput5.teaching.a.d */
/* compiled from: TeachingAnimationUtils */
final class C2562d extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f10989a;

    /* renamed from: b */
    final /* synthetic */ Animation f10990b;

    /* renamed from: c */
    final /* synthetic */ Runnable f10991c;

    C2562d(View view, Animation animation, Runnable runnable) {
        this.f10989a = view;
        this.f10990b = animation;
        this.f10991c = runnable;
    }

    public void onAnimationEnd(Animation animation) {
        this.f10989a.startAnimation(this.f10990b);
        if (this.f10991c != null) {
            this.f10991c.run();
        }
    }

    public void onAnimationStart(Animation animation) {
        super.onAnimationStart(animation);
    }
}
