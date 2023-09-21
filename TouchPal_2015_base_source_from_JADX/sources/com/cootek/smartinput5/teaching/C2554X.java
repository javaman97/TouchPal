package com.cootek.smartinput5.teaching;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: com.cootek.smartinput5.teaching.X */
/* compiled from: TeachingTipsDelLeftSlide */
class C2554X implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C2553W f10959a;

    C2554X(C2553W w) {
        this.f10959a = w;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence) && i == 0) {
            this.f10959a.mo8403n();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }
}
