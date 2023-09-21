package com.cootek.smartinput5.func.yahoosearch;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.a */
/* compiled from: BrowserActivity */
class C2121a extends Handler {

    /* renamed from: a */
    final /* synthetic */ BrowserActivity f9065a;

    C2121a(BrowserActivity browserActivity) {
        this.f9065a = browserActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f9065a.f9037r.setVisibility(0);
                this.f9065a.f9038s.mo7559a(0, 0);
                int unused = this.f9065a.f9044z = 0;
                return;
            case 1:
                this.f9065a.f9037r.setVisibility(4);
                return;
            case 2:
                this.f9065a.m9683f();
                return;
            default:
                return;
        }
    }
}
