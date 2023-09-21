package com.cootek.smartinput5.p066ui.control;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.ui.control.I */
/* compiled from: MoveContrailView */
class C2831I extends Handler {

    /* renamed from: a */
    final /* synthetic */ MoveContrailView f12698a;

    C2831I(MoveContrailView moveContrailView) {
        this.f12698a = moveContrailView;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                boolean unused = this.f12698a.f12755A = true;
                this.f12698a.mo8601a();
                return;
            default:
                return;
        }
    }
}
