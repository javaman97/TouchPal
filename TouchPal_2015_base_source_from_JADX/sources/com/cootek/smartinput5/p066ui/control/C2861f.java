package com.cootek.smartinput5.p066ui.control;

import android.content.DialogInterface;
import com.cootek.smartinput5.net.C2197U;
import com.cootek.smartinput5.net.C2361q;

/* renamed from: com.cootek.smartinput5.ui.control.f */
/* compiled from: CancelDownloadActivity */
class C2861f implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f13043a;

    /* renamed from: b */
    final /* synthetic */ CancelDownloadActivity f13044b;

    C2861f(CancelDownloadActivity cancelDownloadActivity, int i) {
        this.f13044b = cancelDownloadActivity;
        this.f13043a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C2197U c;
        if (this.f13043a == 2 && (c = C2361q.m10797b().mo8007c()) != null) {
            c.mo7663e();
        }
        this.f13044b.finish();
    }
}
