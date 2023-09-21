package com.cootek.smartinput5.func;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.bJ */
/* compiled from: Utils */
final class C1585bJ implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f5020a;

    C1585bJ(Runnable runnable) {
        this.f5020a = runnable;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f5020a != null) {
            this.f5020a.run();
        }
    }
}
