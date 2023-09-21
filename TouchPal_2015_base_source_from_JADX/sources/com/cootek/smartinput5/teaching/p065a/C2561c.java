package com.cootek.smartinput5.teaching.p065a;

import android.view.animation.Animation;
import com.cootek.smartinput5.engine.AnimationListener;

/* renamed from: com.cootek.smartinput5.teaching.a.c */
/* compiled from: TeachingAnimationUtils */
final class C2561c extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f10988a;

    C2561c(Runnable runnable) {
        this.f10988a = runnable;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f10988a != null) {
            this.f10988a.run();
        }
    }
}
