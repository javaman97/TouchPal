package com.cootek.smartinput5.func.mainentrance;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.mainentrance.n */
/* compiled from: SkinProvider */
class C1862n extends Handler {

    /* renamed from: a */
    final /* synthetic */ C1859m f6232a;

    C1862n(C1859m mVar) {
        this.f6232a = mVar;
    }

    public void handleMessage(Message message) {
        if (C1368X.m6324d()) {
            switch (message.what) {
                case 3:
                    Bundle data = message.getData();
                    this.f6232a.f6218g.handleSettingsChanged(message.getData());
                    int i = data.getInt(IPCManager.SETTING_KEY, -1);
                    if (i == 80) {
                        String string = data.getString(IPCManager.SETTING_VALUE);
                        if (!C1602bh.f5115d.equals(string)) {
                            this.f6232a.m8572d(string);
                            return;
                        }
                        return;
                    } else if (i == 371) {
                        this.f6232a.f6223l.put(data.getString(IPCManager.SETTING_CATEGORY_VALUE), Long.valueOf(data.getLong(IPCManager.SETTING_VALUE)));
                        return;
                    } else {
                        return;
                    }
                case 8:
                    this.f6232a.mo6956f();
                    return;
                case 18:
                    ArrayList unused = this.f6232a.f6222k = message.getData().getStringArrayList(IPCManager.UPGRADING_SKIN_LIST);
                    this.f6232a.mo6956f();
                    return;
                default:
                    return;
            }
        }
    }
}
