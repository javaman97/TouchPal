package com.cootek.smartinput5.p066ui.settings;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.ba */
/* compiled from: KeyboardCustomizeMask */
class C3070ba implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C3007aV f14019a;

    C3070ba(C3007aV aVVar) {
        this.f14019a = aVVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f14019a.f13875T) {
            return true;
        }
        int action = motionEvent.getAction();
        return this.f14019a.f13880Y.mo10191b((int) motionEvent.getX(), (int) motionEvent.getY(), action);
    }
}
