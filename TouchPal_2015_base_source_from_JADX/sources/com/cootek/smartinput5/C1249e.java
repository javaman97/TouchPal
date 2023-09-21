package com.cootek.smartinput5;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.e */
/* compiled from: GateActivity */
class C1249e implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ GateActivity f3964a;

    C1249e(GateActivity gateActivity) {
        this.f3964a = gateActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f3964a.finish();
    }
}
