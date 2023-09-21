package com.cootek.smartinput5;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.cootek.smartinput5.h */
/* compiled from: Guide */
class C2160h implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Guide f9160a;

    C2160h(Guide guide) {
        this.f9160a = guide;
    }

    public void onClick(View view) {
        ((InputMethodManager) this.f9160a.getApplicationContext().getSystemService("input_method")).showInputMethodPicker();
        boolean unused = this.f9160a.f2746c = true;
        this.f9160a.m5267a(false);
    }
}
