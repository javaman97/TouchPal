package com.cootek.smartinput.upgrade;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput.upgrade.a */
/* compiled from: PackageUninstallerActivty */
class C0980a implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ PackageUninstallerActivty f2545a;

    C0980a(PackageUninstallerActivty packageUninstallerActivty) {
        this.f2545a = packageUninstallerActivty;
    }

    public void onCancel(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        this.f2545a.finish();
    }
}
