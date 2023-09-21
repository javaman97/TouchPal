package com.cootek.smartinput5.teaching;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: com.cootek.smartinput5.teaching.F */
/* compiled from: TeachingTipStrokeFilter */
class C2534F implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f10884a;

    /* renamed from: b */
    final /* synthetic */ Animation f10885b;

    /* renamed from: c */
    final /* synthetic */ C2531C f10886c;

    C2534F(C2531C c, View view, Animation animation) {
        this.f10886c = c;
        this.f10884a = view;
        this.f10885b = animation;
    }

    public void run() {
        this.f10884a.startAnimation(this.f10885b);
    }
}
