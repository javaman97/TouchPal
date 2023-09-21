package com.cootek.smartinput5.plugin.messagepal;

import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.plugin.messagepal.e */
/* compiled from: MessageReceiver */
class C2388e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f10472a;

    /* renamed from: b */
    final /* synthetic */ MessageReceiver f10473b;

    C2388e(MessageReceiver messageReceiver, String str) {
        this.f10473b = messageReceiver;
        this.f10472a = str;
    }

    public void run() {
        if (Engine.isInitialized()) {
            ((TouchPalIME) Engine.getInstance().getIms()).commitText(this.f10472a);
        }
    }
}
