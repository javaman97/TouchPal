package com.cootek.smartinput5.func.contactscanner;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.contactscanner.b */
/* compiled from: ContactScannerActivity */
class C1700b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ContactScannerActivity f5548a;

    C1700b(ContactScannerActivity contactScannerActivity) {
        this.f5548a = contactScannerActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5548a.finish();
    }
}
