package com.cootek.smartinput5.teaching;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: com.cootek.smartinput5.teaching.m */
/* compiled from: TeachingTipCurve */
class C2593m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Rect f11109a;

    /* renamed from: b */
    final /* synthetic */ ImageView f11110b;

    /* renamed from: c */
    final /* synthetic */ View f11111c;

    /* renamed from: d */
    final /* synthetic */ Animation f11112d;

    /* renamed from: e */
    final /* synthetic */ C2584d f11113e;

    C2593m(C2584d dVar, Rect rect, ImageView imageView, View view, Animation animation) {
        this.f11113e = dVar;
        this.f11109a = rect;
        this.f11110b = imageView;
        this.f11111c = view;
        this.f11112d = animation;
    }

    public void run() {
        this.f11113e.mo8395a(this.f11109a.left, this.f11109a.top, this.f11109a.right, this.f11109a.bottom);
        this.f11110b.setVisibility(0);
        this.f11111c.startAnimation(this.f11112d);
    }
}
