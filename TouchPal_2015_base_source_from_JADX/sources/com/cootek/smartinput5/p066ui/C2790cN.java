package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.cN */
/* compiled from: TopScrollView */
class C2790cN implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2789cM f12397a;

    C2790cN(C2789cM cMVar) {
        this.f12397a = cMVar;
    }

    public void run() {
        ((TouchPalIME) Engine.getInstance().getIms()).showSoftInputWindow();
    }
}
