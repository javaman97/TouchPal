package com.cootek.smartinput5.p066ui;

import android.util.DisplayMetrics;
import android.view.MotionEvent;

/* renamed from: com.cootek.smartinput5.ui.TouchEvent */
abstract class TouchEvent {
    /* access modifiers changed from: package-private */
    public abstract boolean degenerateMultiTouch(MotionEvent motionEvent);

    /* access modifiers changed from: package-private */
    public abstract boolean doEvent(MotionEvent motionEvent, SoftKeyboardView softKeyboardView);

    TouchEvent() {
    }

    /* access modifiers changed from: package-private */
    public void setDisplayMetrics(DisplayMetrics displayMetrics) {
    }
}
