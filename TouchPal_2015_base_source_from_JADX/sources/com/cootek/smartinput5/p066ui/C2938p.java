package com.cootek.smartinput5.p066ui;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.ui.p */
/* compiled from: ClearKey */
class C2938p extends Handler {

    /* renamed from: a */
    final /* synthetic */ ClearKey f13345a;

    C2938p(ClearKey clearKey) {
        this.f13345a = clearKey;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f13345a.updateMainTitle();
                return;
            default:
                return;
        }
    }
}
