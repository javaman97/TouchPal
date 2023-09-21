package com.cootek.smartinput.upgrade;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput.upgrade.c */
/* compiled from: PackageUninstallerActivty */
class C0982c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PackageUninstallerActivty f2547a;

    C0982c(PackageUninstallerActivty packageUninstallerActivty) {
        this.f2547a = packageUninstallerActivty;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:" + this.f2547a.getPackageName()));
        intent.setFlags(Engine.EXCEPTION_ERROR);
        this.f2547a.startActivity(intent);
        this.f2547a.finish();
    }
}
