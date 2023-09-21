package com.cootek.smartinput5;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ao */
/* compiled from: TouchPalOptionInte */
class C1118ao implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBoxPreference f3142a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionInte f3143b;

    C1118ao(TouchPalOptionInte touchPalOptionInte, CheckBoxPreference checkBoxPreference) {
        this.f3143b = touchPalOptionInte;
        this.f3142a = checkBoxPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        Settings.getInstance().setBoolSetting(53, this.f3142a.isChecked());
        Settings.getInstance().setBoolSetting(Settings.OPEN_PAOPAO_PANEL_FIRST, false);
        this.f3143b.m5473N();
        return true;
    }
}
