package com.cootek.smartinput5.func;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.bH */
/* compiled from: UserDictReportActivity */
class C1583bH implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ UserDictReportActivity f5005a;

    C1583bH(UserDictReportActivity userDictReportActivity) {
        this.f5005a = userDictReportActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5005a.m6272b();
        this.f5005a.finish();
    }
}
