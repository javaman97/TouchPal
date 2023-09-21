package com.cootek.smartinput5.teaching;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: com.cootek.smartinput5.teaching.e */
/* compiled from: TeachingTipCurve */
class C2585e implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C2584d f11092a;

    C2585e(C2584d dVar) {
        this.f11092a = dVar;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.equals(C2584d.f11077n, charSequence.toString().trim())) {
            this.f11092a.mo8403n();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }
}
