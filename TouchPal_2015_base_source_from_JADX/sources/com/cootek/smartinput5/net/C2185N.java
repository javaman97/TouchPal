package com.cootek.smartinput5.net;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.net.N */
/* compiled from: MultiPackDownloader */
class C2185N extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2183M f9244a;

    C2185N(C2183M m) {
        this.f9244a = m;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        int intValue = ((Integer) message.obj).intValue();
        if (i == 200) {
            this.f9244a.mo7655b(intValue);
        } else if (i >= 0 && i <= 100) {
            this.f9244a.mo7647a(intValue, i, message.arg1, message.arg2);
        } else if (i == -2) {
            this.f9244a.mo7659c(intValue);
        }
    }
}
