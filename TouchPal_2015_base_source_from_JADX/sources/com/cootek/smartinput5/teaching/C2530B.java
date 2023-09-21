package com.cootek.smartinput5.teaching;

import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.teaching.B */
/* compiled from: TeachingTipSmiley */
class C2530B implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2604x f10875a;

    C2530B(C2604x xVar) {
        this.f10875a = xVar;
    }

    public void run() {
        if (Engine.isInitialized()) {
            Engine.getInstance().getWidgetManager().mo9618X().mo7421a(true, false);
        }
    }
}
