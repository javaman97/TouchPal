package com.cootek.smartinput5.presentations;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.presentations.e */
/* compiled from: ActionConfirmActivity */
class C2501e implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ ActionConfirmActivity f10806a;

    C2501e(ActionConfirmActivity actionConfirmActivity) {
        this.f10806a = actionConfirmActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f10806a.finish();
    }
}
