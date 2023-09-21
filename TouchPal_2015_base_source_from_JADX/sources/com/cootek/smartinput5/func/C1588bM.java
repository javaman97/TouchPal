package com.cootek.smartinput5.func;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.bM */
/* compiled from: Utils */
final class C1588bM implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f5023a;

    C1588bM(Runnable runnable) {
        this.f5023a = runnable;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f5023a != null) {
            this.f5023a.run();
        }
    }
}
