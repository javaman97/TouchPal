package com.cootek.smartinput5.teaching;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.cootek.smartinput5.teaching.Q */
/* compiled from: TeachingTipSymbol */
class C2545Q implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C2544P f10923a;

    C2545Q(C2544P p) {
        this.f10923a = p;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null && charSequence.toString().trim().equals(this.f10923a.mo8341g())) {
            this.f10923a.mo8403n();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }
}
