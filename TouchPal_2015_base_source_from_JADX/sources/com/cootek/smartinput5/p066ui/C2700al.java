package com.cootek.smartinput5.p066ui;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.cootek.smartinput5.ui.al */
/* compiled from: FunctionBar */
class C2700al implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ FunctionBar f12095a;

    C2700al(FunctionBar functionBar) {
        this.f12095a = functionBar;
    }

    public void onAnimationEnd(Animation animation) {
        new Handler().postDelayed(new C2701am(this), 4000);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
