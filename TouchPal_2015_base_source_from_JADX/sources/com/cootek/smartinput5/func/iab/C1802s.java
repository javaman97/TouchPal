package com.cootek.smartinput5.func.iab;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.iab.s */
/* compiled from: IabErrorHandler */
class C1802s implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C1800q f5919a;

    C1802s(C1800q qVar) {
        this.f5919a = qVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f5919a.f5916d != null) {
            this.f5919a.f5916d.run();
        }
    }
}
