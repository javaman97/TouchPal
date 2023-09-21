package com.cootek.smartinput5.p066ui;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;

/* renamed from: com.cootek.smartinput5.ui.cL */
/* compiled from: TopScrollView */
class C2788cL extends Handler {

    /* renamed from: a */
    final /* synthetic */ TopScrollView f12395a;

    C2788cL(TopScrollView topScrollView) {
        this.f12395a = topScrollView;
    }

    public void handleMessage(Message message) {
        Long l;
        switch (message.what) {
            case 1:
                this.f12395a.f11772aN.onLongPress((MotionEvent) null);
                return;
            case 2:
                synchronized (this.f12395a.f11808bi) {
                    removeMessages(2);
                    Long valueOf = Long.valueOf(System.currentTimeMillis());
                    Long l2 = (Long) message.obj;
                    if (l2 == null) {
                        l = valueOf;
                    } else {
                        l = l2;
                    }
                    if ((valueOf.longValue() - l.longValue() > 300) || !this.f12395a.f11808bi.mo4031b()) {
                        this.f12395a.mo8824j();
                    } else {
                        this.f12395a.f11808bi.mo4032c();
                        sendMessageDelayed(obtainMessage(2, l), 10);
                    }
                }
                return;
            default:
                return;
        }
    }
}
