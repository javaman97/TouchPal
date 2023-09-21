package com.cootek.smartinput5.func.iab;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.iab.X */
/* compiled from: PurchaseChannelChooseActivity */
class C1756X implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ PurchaseChannelChooseActivity f5729a;

    C1756X(PurchaseChannelChooseActivity purchaseChannelChooseActivity) {
        this.f5729a = purchaseChannelChooseActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5729a.stopLoading();
        C1779g.m8168a(this.f5729a.getCancelLabel());
        this.f5729a.finish();
    }
}
