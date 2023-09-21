package com.cootek.smartinput5.p066ui.settings;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import com.cootek.smartinput5.func.C1617br;

/* renamed from: com.cootek.smartinput5.ui.settings.dH */
/* compiled from: TouchPalCloudActivity */
class C3170dH implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14225a;

    C3170dH(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14225a = touchPalCloudActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        ((CheckBoxPreference) preference).setChecked(false);
        C1617br.m7367a().mo6327a(this.f14225a.f13734a);
        return true;
    }
}
