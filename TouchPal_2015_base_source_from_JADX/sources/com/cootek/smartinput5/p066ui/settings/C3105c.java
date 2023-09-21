package com.cootek.smartinput5.p066ui.settings;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.ui.settings.c */
/* compiled from: AsyncFragment */
class C3105c extends Handler {

    /* renamed from: a */
    final /* synthetic */ C3041b f14113a;

    C3105c(C3041b bVar) {
        this.f14113a = bVar;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        switch (message.what) {
            case 0:
                this.f14113a.m14303f();
                return;
            case 1:
                this.f14113a.m14304g();
                return;
            default:
                return;
        }
    }
}
