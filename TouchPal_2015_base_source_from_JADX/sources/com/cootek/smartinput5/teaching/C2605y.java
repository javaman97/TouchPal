package com.cootek.smartinput5.teaching;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.cootek.smartinput5.teaching.y */
/* compiled from: TeachingTipSmiley */
class C2605y implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C2604x f11141a;

    C2605y(C2604x xVar) {
        this.f11141a = xVar;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null && charSequence.toString().trim().equals(this.f11141a.mo8341g())) {
            this.f11141a.mo8403n();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }
}
