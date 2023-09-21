package com.cootek.smartinput5.func;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;

/* renamed from: com.cootek.smartinput5.func.aT */
/* compiled from: OemSkinDownloadReceiver */
class C1409aT implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PackageInfo f4467a;

    /* renamed from: b */
    final /* synthetic */ C1408aS f4468b;

    C1409aT(C1408aS aSVar, PackageInfo packageInfo) {
        this.f4468b = aSVar;
        this.f4467a = packageInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4468b.m6618a(this.f4467a);
    }
}
