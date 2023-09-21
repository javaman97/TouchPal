package com.cootek.smartinput5;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.an */
/* compiled from: TouchPalOptionInte */
class C1117an implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBoxPreference f3140a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionInte f3141b;

    C1117an(TouchPalOptionInte touchPalOptionInte, CheckBoxPreference checkBoxPreference) {
        this.f3141b = touchPalOptionInte;
        this.f3140a = checkBoxPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        Settings.getInstance().setBoolSetting(Settings.ONE_HANDED_LAYOUT, this.f3140a.isChecked());
        return true;
    }
}
