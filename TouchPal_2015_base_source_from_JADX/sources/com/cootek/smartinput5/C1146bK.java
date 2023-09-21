package com.cootek.smartinput5;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.bK */
/* compiled from: TouchPalOptionMainland */
class C1146bK implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBoxPreference f3494a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionMainland f3495b;

    C1146bK(TouchPalOptionMainland touchPalOptionMainland, CheckBoxPreference checkBoxPreference) {
        this.f3495b = touchPalOptionMainland;
        this.f3494a = checkBoxPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        Settings.getInstance().setBoolSetting(Settings.ONE_HANDED_LAYOUT, this.f3494a.isChecked());
        return true;
    }
}
