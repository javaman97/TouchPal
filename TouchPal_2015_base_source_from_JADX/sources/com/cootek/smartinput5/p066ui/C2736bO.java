package com.cootek.smartinput5.p066ui;

import android.text.TextUtils;
import android.widget.CompoundButton;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.bO */
/* compiled from: SelectLanguage */
class C2736bO implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ CharSequence f12230a;

    /* renamed from: b */
    final /* synthetic */ C2730bI f12231b;

    C2736bO(C2730bI bIVar, CharSequence charSequence) {
        this.f12231b = bIVar;
        this.f12230a = charSequence;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z && !TextUtils.equals(this.f12231b.f12218c, this.f12230a)) {
            if (this.f12231b.f12217b != null) {
                this.f12231b.f12217b.setChecked(false);
            }
            Engine.switchToLanguage(this.f12230a.toString());
        }
        this.f12231b.mo8912a();
    }
}
