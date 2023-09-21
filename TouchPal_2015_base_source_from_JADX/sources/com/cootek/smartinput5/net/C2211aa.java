package com.cootek.smartinput5.net;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: com.cootek.smartinput5.net.aa */
/* compiled from: ProgressDialogDownloader */
class C2211aa implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ C2207Y f9335a;

    C2211aa(C2207Y y) {
        this.f9335a = y;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        this.f9335a.mo7663e();
        return false;
    }
}
