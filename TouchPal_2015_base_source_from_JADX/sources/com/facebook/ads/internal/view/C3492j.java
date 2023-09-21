package com.facebook.ads.internal.view;

import android.view.animation.Animation;
import com.facebook.ads.internal.view.C3490i;

/* renamed from: com.facebook.ads.internal.view.j */
class C3492j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Animation f15118a;

    /* renamed from: b */
    final /* synthetic */ C3490i.C3491a f15119b;

    C3492j(C3490i.C3491a aVar, Animation animation) {
        this.f15119b = aVar;
        this.f15118a = animation;
    }

    public void run() {
        this.f15119b.m15210a(this.f15118a);
    }
}
