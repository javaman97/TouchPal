package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.settings.aP */
/* compiled from: InvitationDialog */
class C3001aP implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ InvitationDialog f13829a;

    C3001aP(InvitationDialog invitationDialog) {
        this.f13829a = invitationDialog;
    }

    public void onClick(View view) {
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.f13829a.f13462g.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showInputMethodPicker();
        }
        this.f13829a.finish();
    }
}
