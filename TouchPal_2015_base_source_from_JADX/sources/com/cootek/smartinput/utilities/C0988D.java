package com.cootek.smartinput.utilities;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput.utilities.D */
/* compiled from: WorkerHandler */
class C0988D extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0986C f2567a;

    C0988D(C0986C c) {
        this.f2567a = c;
    }

    public void handleMessage(Message message) {
        C0985B b = (C0985B) message.obj;
        if (b != null) {
            switch (message.what) {
                case 0:
                    this.f2567a.f2564j.removeMessages(0, b);
                    this.f2567a.mo4039a(b);
                    break;
                case 1:
                    b.f2551a = false;
                    b.mo4036g();
                    break;
            }
            super.handleMessage(message);
        }
    }
}
