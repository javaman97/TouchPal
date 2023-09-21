package com.cootek.smartinput5.p066ui.control;

import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.control.y */
/* compiled from: GetImageActivity */
class C2881y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ GetImageActivity f13097a;

    C2881y(GetImageActivity getImageActivity) {
        this.f13097a = getImageActivity;
    }

    public void run() {
        if (Engine.isInitialized()) {
            ((TouchPalIME) Engine.getInstance().getIms()).showSoftInputWindow();
        }
    }
}
