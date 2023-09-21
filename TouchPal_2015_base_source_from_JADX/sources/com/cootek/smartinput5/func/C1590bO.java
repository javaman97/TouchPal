package com.cootek.smartinput5.func;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.bO */
/* compiled from: Utils */
final class C1590bO implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f5025a;

    C1590bO(Runnable runnable) {
        this.f5025a = runnable;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f5025a != null) {
            this.f5025a.run();
        }
    }
}
