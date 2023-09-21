package com.cootek.smartinput5.p066ui;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.ui.cp */
/* compiled from: SoftKeyboardView */
class C2883cp extends Handler {

    /* renamed from: a */
    final /* synthetic */ SoftKeyboardView f13098a;

    C2883cp(SoftKeyboardView softKeyboardView) {
        this.f13098a = softKeyboardView;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        this.f13098a.m11920a((C2806cb) message.obj, true);
    }
}
