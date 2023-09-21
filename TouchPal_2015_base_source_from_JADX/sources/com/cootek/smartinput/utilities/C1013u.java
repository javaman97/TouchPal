package com.cootek.smartinput.utilities;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput.utilities.u */
/* compiled from: TJavascriptHandler */
class C1013u extends Handler {

    /* renamed from: a */
    final /* synthetic */ TJavascriptHandler f2653a;

    C1013u(TJavascriptHandler tJavascriptHandler) {
        this.f2653a = tJavascriptHandler;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Bundle data = message.getData();
                if (data != null) {
                    this.f2653a.doCallbackWebview(data.getString("callbackMethod"), data.getString("callbackParams"));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
