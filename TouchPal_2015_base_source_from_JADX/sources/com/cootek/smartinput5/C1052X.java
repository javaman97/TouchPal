package com.cootek.smartinput5;

import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.X */
/* compiled from: TouchPalIME */
class C1052X implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TouchPalIME f2932a;

    C1052X(TouchPalIME touchPalIME) {
        this.f2932a = touchPalIME;
    }

    public void run() {
        if (!this.f2932a.mUSStack.empty()) {
            TouchPalIME.C1044c cVar = (TouchPalIME.C1044c) this.f2932a.mUSStack.pop();
            if (Engine.isInitialized()) {
                Engine.getInstance().onUpdateSelection(cVar.f2860a, cVar.f2861b, cVar.f2862c, cVar.f2863d, cVar.f2864e, cVar.f2865f, this.f2932a.forceManual ? 2 : 1);
            }
            if (!C1368X.m6320c().mo5821G().mo7181b()) {
                this.f2932a.mUSStack.clear();
            }
        }
    }
}
