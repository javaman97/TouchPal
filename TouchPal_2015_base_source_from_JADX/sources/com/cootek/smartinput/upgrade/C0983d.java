package com.cootek.smartinput.upgrade;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput.upgrade.d */
/* compiled from: PackageUninstallerActivty */
class C0983d implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ PackageUninstallerActivty f2548a;

    C0983d(PackageUninstallerActivty packageUninstallerActivty) {
        this.f2548a = packageUninstallerActivty;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f2548a.finish();
    }
}
