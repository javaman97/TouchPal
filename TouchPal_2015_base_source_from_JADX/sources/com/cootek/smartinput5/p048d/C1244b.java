package com.cootek.smartinput5.p048d;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.d.b */
/* compiled from: NetworkDataCollect */
class C1244b extends Handler {

    /* renamed from: a */
    final /* synthetic */ C1242a f3703a;

    C1244b(C1242a aVar) {
        this.f3703a = aVar;
    }

    public void handleMessage(Message message) {
        String str;
        super.handleMessage(message);
        int i = message.what;
        if (message.obj == null || !(message.obj instanceof String)) {
            str = "";
        } else {
            str = (String) message.obj;
        }
        if (i == 200 || i == -2 || i == -1) {
            this.f3703a.m6003a(str, i == 200);
        }
        if (this.f3703a.f3693d.isEmpty()) {
            this.f3703a.m6007e();
        }
    }
}
