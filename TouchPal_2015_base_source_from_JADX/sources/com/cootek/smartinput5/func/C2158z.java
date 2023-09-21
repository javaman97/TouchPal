package com.cootek.smartinput5.func;

import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.func.z */
/* compiled from: CompatiableManager */
class C2158z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2119x f9158a;

    C2158z(C2119x xVar) {
        this.f9158a = xVar;
    }

    public void run() {
        if (!Engine.isInitialized() || !Engine.getInstance().getIms().isInputViewShown()) {
            this.f9158a.mo7498c();
        } else {
            this.f9158a.f9024G.postDelayed(this, 200);
        }
    }
}
