package com.cootek.smartinput5.func.paopaopanel;

import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.o */
/* compiled from: PaopaoUtils */
final class C1946o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f6589a;

    C1946o(boolean z) {
        this.f6589a = z;
    }

    public void run() {
        Settings.getInstance().setBoolSetting(Settings.CURVE_ENABLED_UI, this.f6589a);
    }
}
