package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.ui.settings.dp */
/* compiled from: TouchPalCloudActivity */
class C3204dp implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CustomizableCheckBoxPreference f14262a;

    /* renamed from: b */
    final /* synthetic */ TouchPalCloudActivity f14263b;

    C3204dp(TouchPalCloudActivity touchPalCloudActivity, CustomizableCheckBoxPreference customizableCheckBoxPreference) {
        this.f14263b = touchPalCloudActivity;
        this.f14262a = customizableCheckBoxPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (!Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
            this.f14262a.setChecked(!this.f14262a.isChecked());
            if (!C1368X.m6320c().mo5846s().mo6314c()) {
                this.f14263b.m14103n();
            }
        } else {
            Settings.getInstance().setBoolSetting(Settings.SUPER_DICT_ENABLED_UI, this.f14262a.isChecked());
        }
        return true;
    }
}
