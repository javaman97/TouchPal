package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.os.Handler;
import android.os.Message;
import android.view.View;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.e */
/* compiled from: SearchBrowserWebView */
class C2150e extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2149d f9134a;

    C2150e(C2149d dVar) {
        this.f9134a = dVar;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        View view = (View) message.obj;
        if (message.what != 1) {
            return;
        }
        if (this.f9134a.f9133c == view.getScrollY()) {
            this.f9134a.f9131a.removeMessages(1);
            if (this.f9134a.f9132b.f9117a != null) {
                this.f9134a.f9132b.f9117a.mo7504b();
                return;
            }
            return;
        }
        this.f9134a.f9131a.sendMessageDelayed(this.f9134a.f9131a.obtainMessage(1, view), 10);
        int unused = this.f9134a.f9133c = view.getScrollY();
    }
}
