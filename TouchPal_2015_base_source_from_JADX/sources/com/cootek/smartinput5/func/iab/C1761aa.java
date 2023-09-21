package com.cootek.smartinput5.func.iab;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.iab.aa */
/* compiled from: PurchaseChannelChooseActivity */
class C1761aa implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ C1758Z f5734a;

    C1761aa(C1758Z z) {
        this.f5734a = z;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5734a.f5731a.stopLoading();
    }
}
