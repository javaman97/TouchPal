package com.cootek.smartinput5.p066ui.control;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.ui.control.N */
/* compiled from: RetryDownloadActivity */
class C2836N implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ RetryDownloadActivity f12789a;

    C2836N(RetryDownloadActivity retryDownloadActivity) {
        this.f12789a = retryDownloadActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f12789a.finish();
    }
}
