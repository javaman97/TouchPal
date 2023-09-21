package com.cootek.smartinput5.func.paopaopanel;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.g */
/* compiled from: PaoPaoDrawer */
class C1938g implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C1937f f6582a;

    C1938g(C1937f fVar) {
        this.f6582a = fVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return false;
        }
        this.f6582a.mo7136k();
        return true;
    }
}
