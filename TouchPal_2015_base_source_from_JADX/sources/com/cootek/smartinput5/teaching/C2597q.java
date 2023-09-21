package com.cootek.smartinput5.teaching;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.cootek.smartinput5.teaching.q */
/* compiled from: TeachingTipHandwrite */
class C2597q implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C2596p f11127a;

    C2597q(C2596p pVar) {
        this.f11127a = pVar;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null && charSequence.toString().trim().equals(this.f11127a.mo8341g())) {
            this.f11127a.mo8403n();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }
}
