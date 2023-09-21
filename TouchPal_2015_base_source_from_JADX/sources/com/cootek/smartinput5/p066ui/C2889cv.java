package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: com.cootek.smartinput5.ui.cv */
/* compiled from: SpaceFuncSetupDialog */
class C2889cv implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f13116a;

    /* renamed from: b */
    final /* synthetic */ C2887ct f13117b;

    C2889cv(C2887ct ctVar, View view) {
        this.f13117b = ctVar;
        this.f13116a = view;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f13117b.f13113b.setChecked(false);
            this.f13116a.setVisibility(0);
            return;
        }
        this.f13117b.f13113b.setChecked(true);
    }
}
