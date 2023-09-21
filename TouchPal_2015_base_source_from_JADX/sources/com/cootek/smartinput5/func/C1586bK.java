package com.cootek.smartinput5.func;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.bK */
/* compiled from: Utils */
final class C1586bK implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f5021a;

    C1586bK(Runnable runnable) {
        this.f5021a = runnable;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f5021a != null) {
            this.f5021a.run();
        }
    }
}
