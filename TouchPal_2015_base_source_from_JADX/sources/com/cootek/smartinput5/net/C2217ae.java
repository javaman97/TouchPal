package com.cootek.smartinput5.net;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.net.ae */
/* compiled from: TWebView */
class C2217ae extends Handler {

    /* renamed from: a */
    final /* synthetic */ TWebView f9379a;

    C2217ae(TWebView tWebView) {
        this.f9379a = tWebView;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                if (this.f9379a.f9269h != null) {
                    this.f9379a.f9269h.show();
                    return;
                }
                return;
            case 1:
                if (this.f9379a.f9269h != null) {
                    this.f9379a.f9269h.hide();
                    return;
                }
                return;
            case 2:
                this.f9379a.m9888b((String) message.obj);
                return;
            default:
                return;
        }
    }
}
