package com.cootek.smartinput5.p066ui;

import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.cg */
/* compiled from: SoftKeyboard */
class C2813cg extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2811cf f12591a;

    C2813cg(C2811cf cfVar) {
        this.f12591a = cfVar;
    }

    public void handleMessage(Message message) {
        if (Engine.isInitialized()) {
            super.handleMessage(message);
            C2806cb cbVar = (C2806cb) message.obj;
            if (message.what == 16) {
                cbVar.curveInTime(message);
            } else {
                cbVar.longPress(message);
            }
        }
    }
}
