package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.settings.aX */
/* compiled from: KeyboardCustomizeMask */
class C3010aX implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f13890a;

    /* renamed from: b */
    final /* synthetic */ int f13891b;

    /* renamed from: c */
    final /* synthetic */ C3007aV f13892c;

    C3010aX(C3007aV aVVar, int i, int i2) {
        this.f13892c = aVVar;
        this.f13890a = i;
        this.f13891b = i2;
    }

    public void run() {
        this.f13892c.f13878W.removeCallbacks(this);
        if (Engine.getInstance().getIms().getWindow().getWindow().getDecorView().getWindowToken() == null) {
            this.f13892c.f13878W.postDelayed(this, 50);
        } else {
            this.f13892c.m14218d(this.f13890a, this.f13891b);
        }
    }
}
