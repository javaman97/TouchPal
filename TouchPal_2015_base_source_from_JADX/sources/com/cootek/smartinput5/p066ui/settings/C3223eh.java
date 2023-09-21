package com.cootek.smartinput5.p066ui.settings;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;

/* renamed from: com.cootek.smartinput5.ui.settings.eh */
/* compiled from: UsrWordManageActivity */
class C3223eh implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ UsrWordManageActivity f14288a;

    C3223eh(UsrWordManageActivity usrWordManageActivity) {
        this.f14288a = usrWordManageActivity;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Button button;
        if (this.f14288a.f13794q != null && (button = this.f14288a.f13794q.getButton(this.f14288a.m14153b(-1))) != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                button.setEnabled(true);
            } else {
                button.setEnabled(false);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }
}
