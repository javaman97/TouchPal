package com.cootek.smartinput5.func.iab;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.iab.r */
/* compiled from: IabErrorHandler */
class C1801r implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1800q f5918a;

    C1801r(C1800q qVar) {
        this.f5918a = qVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C1779g.m8175b(C1779g.f5851c, "CLICK");
        if (this.f5918a.f5915c != null) {
            this.f5918a.f5915c.run();
        }
    }
}
