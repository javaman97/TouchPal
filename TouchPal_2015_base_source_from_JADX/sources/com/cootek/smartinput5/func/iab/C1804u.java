package com.cootek.smartinput5.func.iab;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.iab.u */
/* compiled from: IabErrorHandler */
class C1804u implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C1803t f5924a;

    C1804u(C1803t tVar) {
        this.f5924a = tVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f5924a.f5922c != null) {
            this.f5924a.f5922c.run();
        }
    }
}
