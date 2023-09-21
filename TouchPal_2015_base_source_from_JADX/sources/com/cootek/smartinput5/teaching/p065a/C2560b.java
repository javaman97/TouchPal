package com.cootek.smartinput5.teaching.p065a;

import android.view.animation.Animation;
import com.cootek.smartinput5.engine.AnimationListener;

/* renamed from: com.cootek.smartinput5.teaching.a.b */
/* compiled from: TeachingAnimationUtils */
final class C2560b extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f10987a;

    C2560b(Runnable runnable) {
        this.f10987a = runnable;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f10987a != null) {
            this.f10987a.run();
        }
    }
}
