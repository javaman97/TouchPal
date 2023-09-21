package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.teaching.z */
/* compiled from: TeachingTipSmiley */
class C2606z implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f11142a;

    /* renamed from: b */
    final /* synthetic */ TextView f11143b;

    /* renamed from: c */
    final /* synthetic */ C2604x f11144c;

    C2606z(C2604x xVar, ImageView imageView, TextView textView) {
        this.f11144c = xVar;
        this.f11142a = imageView;
        this.f11143b = textView;
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        if (Engine.isInitialized()) {
            Engine.getInstance().getWidgetManager().mo9618X().mo7424b();
        }
        this.f11144c.mo8395a(0, 0, 0, 0);
        this.f11142a.setVisibility(4);
        this.f11143b.setVisibility(4);
        this.f11144c.mo8398b();
    }
}
