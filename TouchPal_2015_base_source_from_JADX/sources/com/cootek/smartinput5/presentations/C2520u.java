package com.cootek.smartinput5.presentations;

import android.content.DialogInterface;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.StartupToast;

/* renamed from: com.cootek.smartinput5.presentations.u */
/* compiled from: PresentationClient */
class C2520u implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ StartupToast f10861a;

    /* renamed from: b */
    final /* synthetic */ C2515q f10862b;

    C2520u(C2515q qVar, StartupToast startupToast) {
        this.f10862b = qVar;
        this.f10861a = startupToast;
    }

    public void onCancel(DialogInterface dialogInterface) {
        PresentationManager.closed(this.f10861a.getId());
    }
}
