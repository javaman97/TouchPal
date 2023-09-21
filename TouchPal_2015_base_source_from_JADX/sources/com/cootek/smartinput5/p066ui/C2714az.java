package com.cootek.smartinput5.p066ui;

import android.view.MotionEvent;

/* renamed from: com.cootek.smartinput5.ui.az */
/* compiled from: HandWriteHalfView */
class C2714az implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f12112a;

    /* renamed from: b */
    final /* synthetic */ MotionEvent f12113b;

    /* renamed from: c */
    final /* synthetic */ MotionEvent f12114c;

    /* renamed from: d */
    final /* synthetic */ HandWriteHalfView f12115d;

    C2714az(HandWriteHalfView handWriteHalfView, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f12115d = handWriteHalfView;
        this.f12112a = i;
        this.f12113b = motionEvent;
        this.f12114c = motionEvent2;
    }

    public void run() {
        int unused = this.f12115d.f11319v = this.f12112a;
        this.f12115d.onTouchEvent(this.f12113b);
        this.f12113b.recycle();
        this.f12115d.f11302A.post(new C2661aA(this));
    }
}
