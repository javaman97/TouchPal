package com.cootek.smartinput5.func;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.func.bi */
/* compiled from: SkinManager */
class C1606bi extends Handler {

    /* renamed from: a */
    final /* synthetic */ C1602bh f5169a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1606bi(C1602bh bhVar, Looper looper) {
        super(looper);
        this.f5169a = bhVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f5169a.m7258t((String) message.obj);
                return;
            default:
                return;
        }
    }
}
