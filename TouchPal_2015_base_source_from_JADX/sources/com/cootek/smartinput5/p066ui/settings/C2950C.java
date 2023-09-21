package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.ui.settings.C */
/* compiled from: BaiduAuthActivity */
class C2950C implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ Thread f13392a;

    /* renamed from: b */
    final /* synthetic */ C3249x f13393b;

    C2950C(C3249x xVar, Thread thread) {
        this.f13393b = xVar;
        this.f13392a = thread;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f13392a.interrupt();
    }
}
