package com.cootek.smartinput5.net;

import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.engine.ClokeManager;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.net.o */
/* compiled from: CloudInputProcessor */
class C2359o extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2355n f10389a;

    C2359o(C2355n nVar) {
        this.f10389a = nVar;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        ClokeManager clokeManager = null;
        if (Engine.isInitialized()) {
            clokeManager = Engine.getInstance().getClokeManager();
        }
        if (clokeManager != null) {
            switch (message.what) {
                case 1:
                    int i = message.arg1;
                    this.f10389a.m10770p();
                    this.f10389a.m10768n();
                    if (this.f10389a.m10754a(i)) {
                        clokeManager.onClokeSearchStart(true);
                        return;
                    }
                    return;
                case 2:
                    this.f10389a.mo7984a();
                    if ((clokeManager.getCloudSearchStrategy() & 2) != 0 && Engine.getInstance().getCloudInputType() == 1) {
                        clokeManager.updateCloke(1);
                        return;
                    }
                    return;
                case 3:
                    clokeManager.onClokeSearchStart(false);
                    return;
                case 4:
                    if ((Engine.getInstance().getClokeManager().getCloudSearchStrategy() & 2) != 0) {
                        Engine.getInstance().fireLocalCloudSearchOperation();
                        Engine.getInstance().processEvent();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
