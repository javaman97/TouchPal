package com.cootek.smartinput5.teaching;

import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: com.cootek.smartinput5.teaching.G */
/* compiled from: TeachingTipStrokeFilter */
class C2535G implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ImageView f10887a;

    /* renamed from: b */
    final /* synthetic */ ImageView f10888b;

    /* renamed from: c */
    final /* synthetic */ ImageView f10889c;

    /* renamed from: d */
    final /* synthetic */ Animation f10890d;

    /* renamed from: e */
    final /* synthetic */ C2531C f10891e;

    C2535G(C2531C c, ImageView imageView, ImageView imageView2, ImageView imageView3, Animation animation) {
        this.f10891e = c;
        this.f10887a = imageView;
        this.f10888b = imageView2;
        this.f10889c = imageView3;
        this.f10890d = animation;
    }

    public void run() {
        new Handler().postDelayed(new C2536H(this), 500);
    }
}
