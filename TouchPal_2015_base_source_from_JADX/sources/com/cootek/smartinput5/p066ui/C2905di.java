package com.cootek.smartinput5.p066ui;

import android.app.Dialog;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.di */
/* compiled from: VoiceDialogUtils */
final class C2905di implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Dialog f13129a;

    C2905di(Dialog dialog) {
        this.f13129a = dialog;
    }

    public void run() {
        Engine.getInstance().getDialogManager().showDialog(this.f13129a);
    }
}
