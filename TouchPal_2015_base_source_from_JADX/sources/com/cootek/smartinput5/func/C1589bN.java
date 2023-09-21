package com.cootek.smartinput5.func;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.bN */
/* compiled from: Utils */
final class C1589bN implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f5024a;

    C1589bN(Runnable runnable) {
        this.f5024a = runnable;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f5024a != null) {
            this.f5024a.run();
        }
    }
}
