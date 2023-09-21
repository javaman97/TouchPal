package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.settings.aR */
/* compiled from: InvitationDialog */
class C3003aR implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ InvitationDialog f13831a;

    C3003aR(InvitationDialog invitationDialog) {
        this.f13831a = invitationDialog;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        this.f13831a.finish();
    }
}
