package com.cootek.smartinput5.p066ui;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.ui.dk */
/* compiled from: VoiceProcessMask */
final class C2907dk extends Handler {
    C2907dk() {
    }

    public void handleMessage(Message message) {
        if (C2906dj.f13131d != null && C2906dj.f13131d.f13136g && message != null && message.what == 1) {
            C2906dj.f13131d.m13371j();
        }
        super.handleMessage(message);
    }
}
