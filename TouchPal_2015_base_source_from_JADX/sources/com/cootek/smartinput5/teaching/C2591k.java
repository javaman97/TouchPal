package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.widget.TextView;
import com.cootek.smartinput5.teaching.p065a.C2559a;

/* renamed from: com.cootek.smartinput5.teaching.k */
/* compiled from: TeachingTipCurve */
class C2591k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TextView f11102a;

    /* renamed from: b */
    final /* synthetic */ Animation f11103b;

    /* renamed from: c */
    final /* synthetic */ C2584d f11104c;

    C2591k(C2584d dVar, TextView textView, Animation animation) {
        this.f11104c = dVar;
        this.f11102a = textView;
        this.f11103b = animation;
    }

    public void run() {
        C2559a.m11433b();
        this.f11102a.startAnimation(this.f11103b);
    }
}
