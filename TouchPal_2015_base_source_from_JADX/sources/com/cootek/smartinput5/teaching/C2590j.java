package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.widget.TextView;

/* renamed from: com.cootek.smartinput5.teaching.j */
/* compiled from: TeachingTipCurve */
class C2590j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TextView f11099a;

    /* renamed from: b */
    final /* synthetic */ Animation f11100b;

    /* renamed from: c */
    final /* synthetic */ C2584d f11101c;

    C2590j(C2584d dVar, TextView textView, Animation animation) {
        this.f11101c = dVar;
        this.f11099a = textView;
        this.f11100b = animation;
    }

    public void run() {
        this.f11099a.startAnimation(this.f11100b);
    }
}
