package com.cootek.smartinput5.p066ui.settings;

import android.view.inputmethod.InputMethodManager;

/* renamed from: com.cootek.smartinput5.ui.settings.aK */
/* compiled from: InvitationDialog */
class C2996aK implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InvitationDialog f13823a;

    C2996aK(InvitationDialog invitationDialog) {
        this.f13823a = invitationDialog;
    }

    public void run() {
        if (!this.f13823a.isFinishing() && this.f13823a.f13464i != null) {
            this.f13823a.f13464i.requestFocus();
            ((InputMethodManager) this.f13823a.getSystemService("input_method")).toggleSoftInput(0, 2);
        }
    }
}
