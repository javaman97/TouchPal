package com.cootek.smartinput5.p066ui.settings;

import android.support.p001v4.p009e.p010a.C0230a;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: com.cootek.smartinput5.ui.settings.dA */
/* compiled from: TouchPalCloudActivity */
class C3163dA implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ TextView f14211a;

    /* renamed from: b */
    final /* synthetic */ EditText f14212b;

    /* renamed from: c */
    final /* synthetic */ TouchPalCloudActivity f14213c;

    C3163dA(TouchPalCloudActivity touchPalCloudActivity, TextView textView, EditText editText) {
        this.f14213c = touchPalCloudActivity;
        this.f14211a = textView;
        this.f14212b = editText;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (charSequence != null) {
            i4 = charSequence.length();
        } else {
            i4 = 0;
        }
        int i5 = 140 - i4;
        if (i5 < 10) {
            this.f14211a.setPadding(0, 0, this.f14212b.getPaddingRight(), this.f14212b.getPaddingBottom());
            this.f14211a.setVisibility(0);
            this.f14211a.setText(String.valueOf(i5));
            this.f14211a.setTextColor(C0230a.f588c);
            return;
        }
        this.f14211a.setVisibility(8);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }
}
