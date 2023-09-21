package com.cootek.smartinput5.p066ui;

import android.view.MotionEvent;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.bC */
/* compiled from: PopupRevert */
class C2723bC implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C2722bB f12158a;

    C2723bC(C2722bB bBVar) {
        this.f12158a = bBVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (Engine.isInitialized()) {
            Engine instance = Engine.getInstance();
            if (motionEvent.getAction() == 0) {
                instance.feedback();
            } else if (motionEvent.getAction() == 1) {
                instance.fireKeyOperation(instance.getKeyId("sk_cancel"), 0);
                instance.processEvent();
            }
        }
        return true;
    }
}
