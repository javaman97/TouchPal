package com.cootek.smartinput5;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.component.C1684q;

/* renamed from: com.cootek.smartinput5.V */
/* compiled from: TouchPalIME */
class C1050V implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TouchPalIME f2930a;

    C1050V(TouchPalIME touchPalIME) {
        this.f2930a = touchPalIME;
    }

    public void run() {
        if (C1368X.m6324d()) {
            if (Engine.isInitialized()) {
                Engine.getInstance().getUsrDicChecker().mo6521b();
            }
            C1684q.m7769a().mo6553b(C1368X.m6313b(), 1).mo6517f();
            C1368X.m6320c().mo5829O();
        }
    }
}
