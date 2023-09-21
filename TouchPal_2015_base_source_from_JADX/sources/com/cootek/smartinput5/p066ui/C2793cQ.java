package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.cQ */
/* compiled from: TypingSpeedBar */
class C2793cQ implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2792cP f12412a;

    C2793cQ(C2792cP cPVar) {
        this.f12412a = cPVar;
    }

    public void run() {
        if (Engine.isInitialized()) {
            if (Engine.getInstance().getIms().getWindow().getWindow().getDecorView().getWindowToken() == null) {
                this.f12412a.f12410h.postDelayed(this, 50);
            } else {
                this.f12412a.m12712g();
            }
        }
    }
}
