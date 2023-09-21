package com.cootek.smartinput5.teaching;

import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.teaching.l */
/* compiled from: TeachingTipCurve */
class C2592l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ImageView f11105a;

    /* renamed from: b */
    final /* synthetic */ TextView f11106b;

    /* renamed from: c */
    final /* synthetic */ Animation f11107c;

    /* renamed from: d */
    final /* synthetic */ C2584d f11108d;

    C2592l(C2584d dVar, ImageView imageView, TextView textView, Animation animation) {
        this.f11108d = dVar;
        this.f11105a = imageView;
        this.f11106b = textView;
        this.f11107c = animation;
    }

    public void run() {
        Engine instance = Engine.getInstance();
        instance.fireKeyOperation(instance.getKeyId("sk_sp"), 0);
        instance.processEvent();
        this.f11105a.setVisibility(4);
        this.f11108d.mo8395a(0, 0, 0, 0);
        this.f11106b.startAnimation(this.f11107c);
    }
}
