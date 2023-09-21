package com.cootek.smartinput5.teaching;

import android.view.View;
import android.view.animation.Animation;
import com.cootek.smartinput5.engine.AnimationListener;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.teaching.p065a.C2559a;

/* renamed from: com.cootek.smartinput5.teaching.S */
/* compiled from: TeachingTipSymbol */
class C2547S extends AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f10925a;

    /* renamed from: b */
    final /* synthetic */ C2544P f10926b;

    C2547S(C2544P p, View view) {
        this.f10926b = p;
        this.f10925a = view;
    }

    public void onAnimationStart(Animation animation) {
        this.f10925a.startAnimation(C2559a.m11422a(this.f10926b.f10967a, (Runnable) null));
    }

    public void onAnimationEnd(Animation animation) {
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_3_6"), 5);
        Engine.getInstance().processEvent();
        this.f10926b.mo8395a(0, 0, 0, 0);
        this.f10926b.mo8398b();
    }
}
