package com.cootek.smartinput5.teaching;

import android.graphics.Rect;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: com.cootek.smartinput5.teaching.A */
/* compiled from: TeachingTipSmiley */
class C2529A implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Rect f10871a;

    /* renamed from: b */
    final /* synthetic */ ImageView f10872b;

    /* renamed from: c */
    final /* synthetic */ Animation f10873c;

    /* renamed from: d */
    final /* synthetic */ C2604x f10874d;

    C2529A(C2604x xVar, Rect rect, ImageView imageView, Animation animation) {
        this.f10874d = xVar;
        this.f10871a = rect;
        this.f10872b = imageView;
        this.f10873c = animation;
    }

    public void run() {
        this.f10874d.mo8395a(this.f10871a.left, this.f10871a.top, this.f10871a.right, this.f10871a.bottom);
        this.f10872b.setVisibility(0);
        this.f10872b.startAnimation(this.f10873c);
    }
}
