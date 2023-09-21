package com.cootek.smartinput5.func;

import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.func.C1608bk;

/* renamed from: com.cootek.smartinput5.func.bn */
/* compiled from: SuperDictManager */
class C1613bn extends Handler {

    /* renamed from: a */
    final /* synthetic */ C1608bk f5195a;

    C1613bn(C1608bk bkVar) {
        this.f5195a = bkVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f5195a.mo6313c((C1608bk.C1610b) new C1614bo(this));
                break;
        }
        super.handleMessage(message);
    }
}
