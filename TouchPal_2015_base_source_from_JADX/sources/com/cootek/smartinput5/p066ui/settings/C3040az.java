package com.cootek.smartinput5.p066ui.settings;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.ui.settings.az */
/* compiled from: GetMoreSkinFragment */
class C3040az extends Handler {

    /* renamed from: a */
    final /* synthetic */ C3039ay f13970a;

    C3040az(C3039ay ayVar) {
        this.f13970a = ayVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f13970a.mo10149a(this.f13970a.f13969n);
                break;
            case 2:
                if (this.f13970a.f13966k != null) {
                    this.f13970a.f13966k.stopLoading();
                    this.f13970a.m14293i();
                    this.f13970a.f13963h.sendEmptyMessage(1);
                    break;
                }
                break;
        }
        super.handleMessage(message);
    }
}
