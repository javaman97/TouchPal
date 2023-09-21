package com.cootek.smartinput5.p066ui.settings;

import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.ui.settings.cS */
/* compiled from: SkinDownloadActivity */
class C3124cS extends Handler {

    /* renamed from: a */
    final /* synthetic */ SkinDownloadActivity f14138a;

    C3124cS(SkinDownloadActivity skinDownloadActivity) {
        this.f14138a = skinDownloadActivity;
    }

    public void handleMessage(Message message) {
        if (C1368X.m6324d()) {
            switch (message.what) {
                case 3:
                    this.f14138a.f13721o.handleSettingsChanged(message.getData());
                    this.f14138a.m14060f();
                    return;
                case 8:
                    if (this.f14138a.f13712f != null) {
                        this.f14138a.f13712f.fileDownloaded();
                        return;
                    }
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }
}
