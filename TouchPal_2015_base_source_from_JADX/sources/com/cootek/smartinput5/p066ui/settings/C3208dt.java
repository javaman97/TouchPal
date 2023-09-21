package com.cootek.smartinput5.p066ui.settings;

import android.preference.CheckBoxPreference;
import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.ui.settings.dt */
/* compiled from: TouchPalCloudActivity */
class C3208dt implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C3207ds f14269a;

    C3208dt(C3207ds dsVar) {
        this.f14269a = dsVar;
    }

    public boolean onPreferenceClick(Preference preference) {
        boolean z;
        CheckBoxPreference checkBoxPreference = this.f14269a.f14267a;
        if (!this.f14269a.f14267a.isChecked()) {
            z = true;
        } else {
            z = false;
        }
        checkBoxPreference.setChecked(z);
        return false;
    }
}
