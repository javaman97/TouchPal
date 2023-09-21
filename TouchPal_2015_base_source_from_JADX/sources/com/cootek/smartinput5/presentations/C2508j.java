package com.cootek.smartinput5.presentations;

import android.content.DialogInterface;
import com.cootek.smartinput.utilities.C0994c;

/* renamed from: com.cootek.smartinput5.presentations.j */
/* compiled from: DownloadInStatusActivity */
class C2508j implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ DownloadInStatusActivity f10816a;

    C2508j(DownloadInStatusActivity downloadInStatusActivity) {
        this.f10816a = downloadInStatusActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f10816a.m11190a(C0994c.C0995a.CONFIRM_CANCEL);
        this.f10816a.finish();
    }
}
