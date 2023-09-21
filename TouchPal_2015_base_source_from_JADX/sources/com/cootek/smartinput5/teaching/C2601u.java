package com.cootek.smartinput5.teaching;

import android.text.Editable;
import android.text.TextWatcher;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.teaching.u */
/* compiled from: TeachingTipPrediction */
class C2601u implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C2600t f11131a;

    C2601u(C2600t tVar) {
        this.f11131a = tVar;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null && !Settings.getInstance().getBoolSetting(1) && "sxsw".equalsIgnoreCase(charSequence.toString().trim())) {
            this.f11131a.mo8403n();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }
}
