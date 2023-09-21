package com.cootek.smartinput5.p066ui.control;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.control.i */
/* compiled from: CommaPopup */
class C2864i implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C2863h f13053a;

    C2864i(C2863h hVar) {
        this.f13053a = hVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return false;
        }
        this.f13053a.m13262k();
        return true;
    }
}
