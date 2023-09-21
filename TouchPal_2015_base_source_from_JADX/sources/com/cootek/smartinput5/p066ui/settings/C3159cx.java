package com.cootek.smartinput5.p066ui.settings;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.engine.IPCManager;

/* renamed from: com.cootek.smartinput5.ui.settings.cx */
/* compiled from: SkinActivity */
class C3159cx extends Handler {

    /* renamed from: a */
    final /* synthetic */ SkinActivity f14207a;

    C3159cx(SkinActivity skinActivity) {
        this.f14207a = skinActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 16:
                Bundle data = message.getData();
                this.f14207a.m13970a(data.getString(IPCManager.SKIN_PACKAGE_NAME), data.getString(IPCManager.SKIN_PACKAGE_URL), data.getString(IPCManager.SKIN_DISPLAY_NAME));
                break;
            case 17:
                this.f14207a.m13989n();
                break;
        }
        super.handleMessage(message);
    }
}
