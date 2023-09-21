package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.settings.CustomizableCheckBoxPreference;

/* renamed from: com.cootek.smartinput5.bw */
/* compiled from: TouchPalOptionMainland */
class C1170bw implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CustomizableCheckBoxPreference f3522a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionMainland f3523b;

    C1170bw(TouchPalOptionMainland touchPalOptionMainland, CustomizableCheckBoxPreference customizableCheckBoxPreference) {
        this.f3523b = touchPalOptionMainland;
        this.f3522a = customizableCheckBoxPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        Settings.getInstance().setIntSetting(Settings.LANDSCAPE_SCREEN_MODE, this.f3522a.isChecked() ? 0 : 1);
        return false;
    }
}
