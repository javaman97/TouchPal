package com.cootek.smartinput5.p066ui;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.ui.bP */
/* compiled from: SlideSentenceMoveContrailView */
class C2737bP extends Handler {

    /* renamed from: a */
    final /* synthetic */ SlideSentenceMoveContrailView f12232a;

    C2737bP(SlideSentenceMoveContrailView slideSentenceMoveContrailView) {
        this.f12232a = slideSentenceMoveContrailView;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f12232a.m11905b();
                return;
            default:
                return;
        }
    }
}
