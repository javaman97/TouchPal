package com.cootek.smartinput5.p066ui;

import android.view.MotionEvent;

/* renamed from: com.cootek.smartinput5.ui.TouchEvent4 */
public class TouchEvent4 extends TouchEvent {
    /* access modifiers changed from: package-private */
    public boolean doEvent(MotionEvent motionEvent, SoftKeyboardView softKeyboardView) {
        if (motionEvent.getAction() == 0) {
            softKeyboardView.setCurrentPointerId(0);
        }
        softKeyboardView.mo8731a(motionEvent, 0, false);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean degenerateMultiTouch(MotionEvent motionEvent) {
        return false;
    }
}
