package com.cootek.smartinput5.p066ui;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;

/* renamed from: com.cootek.smartinput5.ui.aD */
/* compiled from: HandWriteMaskView */
class C2664aD extends Handler {

    /* renamed from: a */
    final /* synthetic */ HandWriteMaskView f11981a;

    C2664aD(HandWriteMaskView handWriteMaskView) {
        this.f11981a = handWriteMaskView;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                int i = message.arg1;
                MotionEvent motionEvent = (MotionEvent) this.f11981a.f11367E.poll();
                if (motionEvent != null) {
                    this.f11981a.f11368G.removeCallbacks(this.f11981a.f11377r);
                    this.f11981a.m11789a(motionEvent, motionEvent.getY() + ((float) i));
                    Message obtainMessage = this.f11981a.f11368G.obtainMessage(0);
                    obtainMessage.arg1 = i;
                    this.f11981a.f11368G.sendMessage(obtainMessage);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.f11981a.f11368G.post(this.f11981a.f11377r);
                    }
                    motionEvent.recycle();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
