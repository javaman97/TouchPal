package com.cootek.smartinput5.func.iab.google;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.iab.google.a */
/* compiled from: ControlActivity */
class C1781a implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ ControlActivity f5873a;

    C1781a(ControlActivity controlActivity) {
        this.f5873a = controlActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5873a.finish();
    }
}
