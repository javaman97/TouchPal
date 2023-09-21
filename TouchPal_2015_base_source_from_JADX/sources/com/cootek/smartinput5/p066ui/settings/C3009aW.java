package com.cootek.smartinput5.p066ui.settings;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.aW */
/* compiled from: KeyboardCustomizeMask */
class C3009aW implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C3007aV f13889a;

    C3009aW(C3007aV aVVar) {
        this.f13889a = aVVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f13889a.f13875T || this.f13889a.f13870O == null) {
            return true;
        }
        int action = motionEvent.getAction();
        return this.f13889a.f13880Y.mo10189a((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), action);
    }
}
