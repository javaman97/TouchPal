package com.cootek.smartinput.upgrade;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput.upgrade.b */
/* compiled from: PackageUninstallerActivty */
class C0981b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PackageUninstallerActivty f2546a;

    C0981b(PackageUninstallerActivty packageUninstallerActivty) {
        this.f2546a = packageUninstallerActivty;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f2546a.finish();
    }
}
