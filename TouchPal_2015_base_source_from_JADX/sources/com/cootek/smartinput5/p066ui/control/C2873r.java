package com.cootek.smartinput5.p066ui.control;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.ui.control.r */
/* compiled from: DialogWidget */
class C2873r implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ C2869n f13076a;

    C2873r(C2869n nVar) {
        this.f13076a = nVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f13076a.mo8597e();
        dialogInterface.dismiss();
    }
}
