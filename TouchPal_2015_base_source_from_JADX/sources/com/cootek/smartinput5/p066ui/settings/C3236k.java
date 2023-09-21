package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.ui.settings.k */
/* compiled from: BaiduAuthActivity */
class C3236k implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ Thread f14304a;

    /* renamed from: b */
    final /* synthetic */ C3232g f14305b;

    C3236k(C3232g gVar, Thread thread) {
        this.f14305b = gVar;
        this.f14304a = thread;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f14304a.interrupt();
    }
}
