package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.widget.CheckBox;

/* renamed from: com.cootek.smartinput5.ui.bM */
/* compiled from: SelectLanguage */
class C2734bM implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBox f12225a;

    /* renamed from: b */
    final /* synthetic */ C2730bI f12226b;

    C2734bM(C2730bI bIVar, CheckBox checkBox) {
        this.f12226b = bIVar;
        this.f12225a = checkBox;
    }

    public void onClick(View view) {
        this.f12225a.setChecked(true);
        this.f12226b.mo8912a();
    }
}
