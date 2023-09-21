package com.cootek.smartinput5.p066ui;

import android.os.Message;
import android.view.MotionEvent;

/* renamed from: com.cootek.smartinput5.ui.aH */
/* compiled from: HandWriteMaskView */
class C2668aH implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f11985a;

    /* renamed from: b */
    final /* synthetic */ MotionEvent f11986b;

    /* renamed from: c */
    final /* synthetic */ HandWriteMaskView f11987c;

    C2668aH(HandWriteMaskView handWriteMaskView, int i, MotionEvent motionEvent) {
        this.f11987c = handWriteMaskView;
        this.f11985a = i;
        this.f11986b = motionEvent;
    }

    public void run() {
        this.f11987c.f11368G.removeCallbacks(this.f11987c.f11377r);
        int k = this.f11985a - this.f11987c.f11373n;
        this.f11987c.m11789a(this.f11986b, this.f11986b.getY() + ((float) k));
        if (!this.f11987c.f11368G.hasMessages(0)) {
            Message obtainMessage = this.f11987c.f11368G.obtainMessage(0);
            obtainMessage.arg1 = k;
            this.f11987c.f11368G.sendMessage(obtainMessage);
        }
    }
}
