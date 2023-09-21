package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: com.cootek.smartinput5.ui.cu */
/* compiled from: SpaceFuncSetupDialog */
class C2888cu implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f13114a;

    /* renamed from: b */
    final /* synthetic */ C2887ct f13115b;

    C2888cu(C2887ct ctVar, View view) {
        this.f13115b = ctVar;
        this.f13114a = view;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f13115b.f13112a.setChecked(false);
            this.f13114a.setVisibility(8);
            return;
        }
        this.f13115b.f13112a.setChecked(true);
    }
}
