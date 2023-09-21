package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.AnimationListener;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.teaching.p065a.C2559a;

/* renamed from: com.cootek.smartinput5.teaching.K */
/* compiled from: TeachingTipStrokeFilter */
class C2539K extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f10906a;

    /* renamed from: b */
    final /* synthetic */ TextView f10907b;

    /* renamed from: c */
    final /* synthetic */ ImageView f10908c;

    /* renamed from: d */
    final /* synthetic */ ImageView f10909d;

    /* renamed from: e */
    final /* synthetic */ C2531C f10910e;

    C2539K(C2531C c, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3) {
        this.f10910e = c;
        this.f10906a = imageView;
        this.f10907b = textView;
        this.f10908c = imageView2;
        this.f10909d = imageView3;
    }

    public void onAnimationStart(Animation animation) {
        this.f10906a.setVisibility(0);
    }

    public void onAnimationEnd(Animation animation) {
        this.f10907b.setVisibility(4);
        Engine.getInstance().fireHandwriteOperation(C2559a.m11441h());
        Engine.getInstance().processEvent();
        this.f10908c.setVisibility(4);
        this.f10906a.clearAnimation();
        this.f10906a.setVisibility(8);
        this.f10909d.setVisibility(4);
        this.f10910e.mo8398b();
    }
}
