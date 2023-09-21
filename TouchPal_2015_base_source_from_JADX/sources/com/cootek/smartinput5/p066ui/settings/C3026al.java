package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.al */
/* compiled from: CustomCheckBoxPreference */
class C3026al implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CustomCheckBoxPreference f13939a;

    C3026al(CustomCheckBoxPreference customCheckBoxPreference) {
        this.f13939a = customCheckBoxPreference;
    }

    public void onClick(View view) {
        Preference.OnPreferenceClickListener onPreferenceClickListener = this.f13939a.getOnPreferenceClickListener();
        if (onPreferenceClickListener != null) {
            onPreferenceClickListener.onPreferenceClick(this.f13939a);
        }
    }
}
