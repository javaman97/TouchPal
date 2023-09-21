package com.cootek.smartinput5.p066ui;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.Q */
/* compiled from: ExplicitCloudPopup */
class C2631Q implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C2629P f11504a;

    C2631Q(C2629P p) {
        this.f11504a = p;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return false;
        }
        this.f11504a.f11486f.performClick();
        this.f11504a.dismiss();
        return true;
    }
}
