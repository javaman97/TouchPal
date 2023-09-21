package com.cootek.smartinput5;

import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ad */
/* compiled from: TouchPalIME */
class C1107ad implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TouchPalIME f3125a;

    C1107ad(TouchPalIME touchPalIME) {
        this.f3125a = touchPalIME;
    }

    public void run() {
        if (Engine.isInitialized()) {
            Engine.getInstance().onUpdateSelection(1);
        }
    }
}
