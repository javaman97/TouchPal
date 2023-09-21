package com.cootek.smartinput.upgrade;

import android.app.AlertDialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

public class PackageUninstallerActivty extends C1976b {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        AlertDialog create = new C2894d.C2895a(this).setPositiveButton(C1974m.m9063a(getApplicationContext(), (int) R.string.uninstall_yes), new C0982c(this)).setNegativeButton(C1974m.m9063a(getApplicationContext(), (int) R.string.uninstall_no), new C0981b(this)).setOnCancelListener(new C0980a(this)).setTitle(C1974m.m9063a(getApplicationContext(), (int) R.string.uninstall_compitiable_apk_title)).setMessage(C1974m.m9063a(getApplicationContext(), (int) R.string.uninstall_compitiable_apk_msg)).create();
        create.setOnDismissListener(new C0983d(this));
        create.show();
    }
}
