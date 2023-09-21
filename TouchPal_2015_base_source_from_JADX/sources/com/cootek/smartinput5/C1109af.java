package com.cootek.smartinput5;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.af */
/* compiled from: TouchPalIME */
class C1109af extends Handler {

    /* renamed from: a */
    final /* synthetic */ TouchPalIME f3127a;

    C1109af(TouchPalIME touchPalIME) {
        this.f3127a = touchPalIME;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f3127a.doUnderlineWord();
                return;
            case 1:
                if (this.f3127a.mFakeKeyboard != null) {
                    this.f3127a.mFakeKeyboard.mo4262b();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
