package com.cootek.smartinput5.func.contactscanner;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.contactscanner.a */
/* compiled from: ContactScannerActivity */
class C1699a implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ ContactScannerActivity f5547a;

    C1699a(ContactScannerActivity contactScannerActivity) {
        this.f5547a = contactScannerActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5547a.m7814b();
    }
}
