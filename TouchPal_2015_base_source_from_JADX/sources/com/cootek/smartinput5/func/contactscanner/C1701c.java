package com.cootek.smartinput5.func.contactscanner;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.contactscanner.c */
/* compiled from: ContactScannerActivity */
class C1701c implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ ContactScannerActivity f5549a;

    C1701c(ContactScannerActivity contactScannerActivity) {
        this.f5549a = contactScannerActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5549a.finish();
    }
}
