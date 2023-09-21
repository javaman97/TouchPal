package com.cootek.smartinput5.p066ui.control;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.ui.control.e */
/* compiled from: CancelDownloadActivity */
class C2860e implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ CancelDownloadActivity f13042a;

    C2860e(CancelDownloadActivity cancelDownloadActivity) {
        this.f13042a = cancelDownloadActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f13042a.finish();
    }
}
