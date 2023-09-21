package com.cootek.smartinput5;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.N */
/* compiled from: GuideMoveBackgroundView */
class C1035N extends Handler {

    /* renamed from: a */
    final /* synthetic */ GuideMoveBackgroundView f2851a;

    C1035N(GuideMoveBackgroundView guideMoveBackgroundView) {
        this.f2851a = guideMoveBackgroundView;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f2851a.m5387d();
                return;
            default:
                return;
        }
    }
}
