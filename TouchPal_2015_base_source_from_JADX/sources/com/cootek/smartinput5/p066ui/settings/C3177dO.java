package com.cootek.smartinput5.p066ui.settings;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.ui.settings.dO */
/* compiled from: TouchPalFAQActivity */
class C3177dO extends Handler {

    /* renamed from: a */
    final /* synthetic */ TouchPalFAQActivity f14232a;

    C3177dO(TouchPalFAQActivity touchPalFAQActivity) {
        this.f14232a = touchPalFAQActivity;
    }

    public void handleMessage(Message message) {
        if (this.f14232a.f13754a != null && !this.f14232a.isFinishing()) {
            switch (message.what) {
                case 0:
                    this.f14232a.f13754a.show();
                    break;
                case 1:
                    this.f14232a.f13754a.hide();
                    break;
                case 2:
                    if (this.f14232a.f13756c != null && this.f14232a.f13756c.getProgress() < 100) {
                        this.f14232a.f13756c.stopLoading();
                        this.f14232a.m14120b();
                        this.f14232a.f13755b.sendEmptyMessage(1);
                        break;
                    }
            }
        }
        super.handleMessage(message);
    }
}
