package com.cootek.smartinput5.p066ui.control;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.ui.control.x */
/* compiled from: GetImageActivity */
class C2880x implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ GetImageActivity f13096a;

    C2880x(GetImageActivity getImageActivity) {
        this.f13096a = getImageActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        this.f13096a.finish();
    }
}
