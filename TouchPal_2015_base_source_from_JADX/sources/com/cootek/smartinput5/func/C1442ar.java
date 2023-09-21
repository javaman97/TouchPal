package com.cootek.smartinput5.func;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.func.ar */
/* compiled from: IMEJsHandler */
class C1442ar extends Handler {

    /* renamed from: a */
    final /* synthetic */ IMEJsHandler f4635a;

    C1442ar(IMEJsHandler iMEJsHandler) {
        this.f4635a = iMEJsHandler;
    }

    public void handleMessage(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 3:
                this.f4635a.handleSettingsChanged(data);
                return;
            case 4:
                this.f4635a.handleDoExtralAction(data);
                return;
            case 15:
                this.f4635a.handleBatchDownloadFinished(data);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
