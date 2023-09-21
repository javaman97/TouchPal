package com.cootek.smartinput5.p066ui.settings;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.ui.settings.db */
/* compiled from: TouchPalCloudActivity */
class C3190db extends Handler {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14246a;

    C3190db(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14246a = touchPalCloudActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                if (this.f14246a.f13746m != null) {
                    this.f14246a.f13746m.dismiss();
                    return;
                }
                return;
            case 1:
                if (this.f14246a.f13746m != null) {
                    if (message.obj != null) {
                        this.f14246a.f13746m.setMessage((String) message.obj);
                    } else {
                        this.f14246a.f13746m.setMessage((CharSequence) null);
                    }
                    this.f14246a.f13746m.show();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
