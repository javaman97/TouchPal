package com.cootek.smartinput5.teaching;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.cootek.smartinput5.teaching.D */
/* compiled from: TeachingTipStrokeFilter */
class C2532D implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C2531C f10882a;

    C2532D(C2531C c) {
        this.f10882a = c;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null && charSequence.toString().trim().equals(this.f10882a.mo8341g())) {
            this.f10882a.mo8403n();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }
}
