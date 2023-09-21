package com.cootek.smartinput5.presentations;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.presentations.k */
/* compiled from: DownloadInStatusActivity */
class C2509k implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ DownloadInStatusActivity f10817a;

    C2509k(DownloadInStatusActivity downloadInStatusActivity) {
        this.f10817a = downloadInStatusActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f10817a.finish();
    }
}
