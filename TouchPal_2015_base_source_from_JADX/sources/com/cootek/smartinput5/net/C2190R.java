package com.cootek.smartinput5.net;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.net.R */
/* compiled from: NetworkManager */
class C2190R extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2188Q f9257a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2190R(C2188Q q, Looper looper) {
        super(looper);
        this.f9257a = q;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                String str = (String) message.obj;
                Settings.getInstance().setStringSetting(88, str);
                Settings.getInstance().writeBack();
                String unused = this.f9257a.f9256j = "";
                PresentationManager.setAuthToken(str);
                return;
            default:
                return;
        }
    }
}
