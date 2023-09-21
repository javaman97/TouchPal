package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.settings.bu */
/* compiled from: LanguageListActivityInte */
class C3099bu implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ LanguageListActivityInte f14099a;

    C3099bu(LanguageListActivityInte languageListActivityInte) {
        this.f14099a = languageListActivityInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f14099a.f13535f.setCustomViewEnable(this.f14099a.f13535f.isChecked() && this.f14099a.f13535f.isEnabled());
        Settings.getInstance().setBoolSetting(12, ((CustomCheckBoxPreference) preference).isChecked());
        return true;
    }
}
