package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.settings.CustomizableCheckBoxPreference;

/* renamed from: com.cootek.smartinput5.am */
/* compiled from: TouchPalOptionInte */
class C1116am implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CustomizableCheckBoxPreference f3138a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionInte f3139b;

    C1116am(TouchPalOptionInte touchPalOptionInte, CustomizableCheckBoxPreference customizableCheckBoxPreference) {
        this.f3139b = touchPalOptionInte;
        this.f3138a = customizableCheckBoxPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        Settings.getInstance().setIntSetting(Settings.LANDSCAPE_SCREEN_MODE, this.f3138a.isChecked() ? 0 : 1);
        return false;
    }
}
