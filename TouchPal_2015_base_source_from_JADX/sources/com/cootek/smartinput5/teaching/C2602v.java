package com.cootek.smartinput5.teaching;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.AnimationListener;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.cootek.smartinput5.teaching.p065a.C2559a;

/* renamed from: com.cootek.smartinput5.teaching.v */
/* compiled from: TeachingTipPrediction */
class C2602v extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f11132a;

    /* renamed from: b */
    final /* synthetic */ C2811cf f11133b;

    /* renamed from: c */
    final /* synthetic */ TextView f11134c;

    /* renamed from: d */
    final /* synthetic */ ImageView f11135d;

    /* renamed from: e */
    final /* synthetic */ C2600t f11136e;

    C2602v(C2600t tVar, View view, C2811cf cfVar, TextView textView, ImageView imageView) {
        this.f11136e = tVar;
        this.f11132a = view;
        this.f11133b = cfVar;
        this.f11134c = textView;
        this.f11135d = imageView;
    }

    public void onAnimationStart(Animation animation) {
        this.f11132a.startAnimation(C2559a.m11422a(this.f11136e.f10967a, (Runnable) null));
    }

    public void onAnimationEnd(Animation animation) {
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_sp"), 7);
        Engine.getInstance().processEvent();
        this.f11133b.f12546S.mo8732a(this.f11133b.mo9182b("sk_sp"));
        this.f11136e.mo8395a(0, 0, 0, 0);
        this.f11134c.setVisibility(8);
        this.f11135d.setVisibility(8);
        this.f11136e.mo8398b();
    }
}
