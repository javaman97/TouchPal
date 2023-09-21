package com.cootek.smartinput5.presentations;

import android.content.DialogInterface;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.StartupToast;

/* renamed from: com.cootek.smartinput5.presentations.t */
/* compiled from: PresentationClient */
class C2519t implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ StartupToast f10859a;

    /* renamed from: b */
    final /* synthetic */ C2515q f10860b;

    C2519t(C2515q qVar, StartupToast startupToast) {
        this.f10860b = qVar;
        this.f10859a = startupToast;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        PresentationManager.closed(this.f10859a.getId());
    }
}
