package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.i */
/* compiled from: TranslationSearchFragment */
class C2154i extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2153h f9154a;

    C2154i(C2153h hVar) {
        this.f9154a = hVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f9154a.f9148g.setVisibility(0);
                return;
            case 2:
                this.f9154a.f9148g.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
