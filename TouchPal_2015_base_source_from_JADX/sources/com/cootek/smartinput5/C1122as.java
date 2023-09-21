package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.settings.CustomizableCheckBoxPreference;

/* renamed from: com.cootek.smartinput5.as */
/* compiled from: TouchPalOptionInte */
class C1122as implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CustomizableCheckBoxPreference f3149a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionInte f3150b;

    C1122as(TouchPalOptionInte touchPalOptionInte, CustomizableCheckBoxPreference customizableCheckBoxPreference) {
        this.f3150b = touchPalOptionInte;
        this.f3149a = customizableCheckBoxPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (!Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
            this.f3149a.setChecked(false);
            if (C1368X.m6320c().mo5846s().mo6314c()) {
                return true;
            }
            this.f3150b.m5465F();
            return true;
        }
        Settings.getInstance().setBoolSetting(Settings.SUPER_DICT_ENABLED_UI, this.f3149a.isChecked());
        return true;
    }
}
