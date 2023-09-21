package com.cootek.smartinput5.p066ui.control;

import android.content.DialogInterface;
import com.cootek.smartinput5.net.C2197U;
import com.cootek.smartinput5.net.C2361q;

/* renamed from: com.cootek.smartinput5.ui.control.P */
/* compiled from: RetryDownloadActivity */
class C2838P implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ RetryDownloadActivity f12791a;

    C2838P(RetryDownloadActivity retryDownloadActivity) {
        this.f12791a = retryDownloadActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C2197U c;
        if (!(C2361q.m10797b() == null || (c = C2361q.m10797b().mo8007c()) == null)) {
            c.mo7667g();
        }
        this.f12791a.finish();
    }
}
