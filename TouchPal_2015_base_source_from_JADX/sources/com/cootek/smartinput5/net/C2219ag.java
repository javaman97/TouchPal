package com.cootek.smartinput5.net;

import android.os.Message;

/* renamed from: com.cootek.smartinput5.net.ag */
/* compiled from: TWebView */
class C2219ag extends Thread {

    /* renamed from: a */
    final /* synthetic */ String f9381a;

    /* renamed from: b */
    final /* synthetic */ TWebView f9382b;

    C2219ag(TWebView tWebView, String str) {
        this.f9382b = tWebView;
        this.f9381a = str;
    }

    public void run() {
        String a = C2232as.m10118a().mo7758a(this.f9381a);
        if (this.f9382b.f9274m != null) {
            Message obtainMessage = this.f9382b.f9274m.obtainMessage(2);
            obtainMessage.obj = a;
            this.f9382b.f9274m.sendMessage(obtainMessage);
        }
    }
}
