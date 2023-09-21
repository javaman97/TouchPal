package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;

/* renamed from: com.cootek.smartinput5.ui.settings.aL */
/* compiled from: InvitationDialog */
class C2997aL implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LinearLayout f13824a;

    /* renamed from: b */
    final /* synthetic */ InvitationDialog f13825b;

    C2997aL(InvitationDialog invitationDialog, LinearLayout linearLayout) {
        this.f13825b = invitationDialog;
        this.f13824a = linearLayout;
    }

    public void onClick(View view) {
        view.setVisibility(8);
        this.f13824a.setVisibility(0);
        this.f13825b.f13464i.requestFocus();
        ((InputMethodManager) this.f13825b.getSystemService("input_method")).toggleSoftInput(0, 2);
    }
}
