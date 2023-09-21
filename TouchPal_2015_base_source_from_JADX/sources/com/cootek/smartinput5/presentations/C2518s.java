package com.cootek.smartinput5.presentations;

import android.content.DialogInterface;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.StartupToast;

/* renamed from: com.cootek.smartinput5.presentations.s */
/* compiled from: PresentationClient */
class C2518s implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ StartupToast f10857a;

    /* renamed from: b */
    final /* synthetic */ C2515q f10858b;

    C2518s(C2515q qVar, StartupToast startupToast) {
        this.f10858b = qVar;
        this.f10857a = startupToast;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        PresentationManager.clicked(this.f10857a.getId());
    }
}
