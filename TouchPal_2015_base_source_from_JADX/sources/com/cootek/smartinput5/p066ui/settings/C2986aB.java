package com.cootek.smartinput5.p066ui.settings;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.aB */
/* compiled from: GetMoreSkinFragment */
class C2986aB implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C3039ay f13810a;

    C2986aB(C3039ay ayVar) {
        this.f13810a = ayVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
            case 1:
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            default:
                return false;
        }
    }
}
