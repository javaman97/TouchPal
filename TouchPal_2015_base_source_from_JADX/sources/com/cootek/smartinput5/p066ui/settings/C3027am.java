package com.cootek.smartinput5.p066ui.settings;

import android.widget.CompoundButton;

/* renamed from: com.cootek.smartinput5.ui.settings.am */
/* compiled from: CustomCheckBoxPreference */
class C3027am implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ CustomCheckBoxPreference f13940a;

    C3027am(CustomCheckBoxPreference customCheckBoxPreference) {
        this.f13940a = customCheckBoxPreference;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean unused = this.f13940a.mChecked = z;
    }
}
