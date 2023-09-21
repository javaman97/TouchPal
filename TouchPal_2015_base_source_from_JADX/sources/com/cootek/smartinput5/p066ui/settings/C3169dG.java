package com.cootek.smartinput5.p066ui.settings;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.settings.dG */
/* compiled from: TouchPalCloudActivity */
class C3169dG implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14224a;

    C3169dG(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14224a = touchPalCloudActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        boolean isChecked = ((CheckBoxPreference) preference).isChecked();
        Settings.getInstance().setBoolSetting(Settings.ARCTIC_CLOUD_INPUT_ENABLE, isChecked);
        if (!isChecked || !Settings.getInstance().getBoolSetting(Settings.SHOW_ARCTIC_PREDICT_ALERT_DIALOG)) {
            return true;
        }
        this.f14224a.m14111r();
        Settings.getInstance().setBoolSetting(Settings.SHOW_ARCTIC_PREDICT_ALERT_DIALOG, false);
        return true;
    }
}
