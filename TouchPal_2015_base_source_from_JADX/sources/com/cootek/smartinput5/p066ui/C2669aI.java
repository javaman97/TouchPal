package com.cootek.smartinput5.p066ui;

import android.view.MotionEvent;

/* renamed from: com.cootek.smartinput5.ui.aI */
/* compiled from: HandWriteMaskView */
class C2669aI implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f11988a;

    /* renamed from: b */
    final /* synthetic */ MotionEvent f11989b;

    /* renamed from: c */
    final /* synthetic */ HandWriteMaskView f11990c;

    C2669aI(HandWriteMaskView handWriteMaskView, int i, MotionEvent motionEvent) {
        this.f11990c = handWriteMaskView;
        this.f11988a = i;
        this.f11989b = motionEvent;
    }

    public void run() {
        int unused = this.f11990c.f11379t = this.f11988a;
        this.f11990c.onTouchEvent(this.f11989b);
        this.f11989b.recycle();
    }
}
