package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.settings.bj */
/* compiled from: LanguageListActivity */
class C3088bj implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ LanguageListActivity f14070a;

    C3088bj(LanguageListActivity languageListActivity) {
        this.f14070a = languageListActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        Settings.getInstance().setLanguageEnabled(preference.getKey(), ((CustomCheckBoxPreference) preference).isChecked());
        this.f14070a.m13864m();
        C1246d.m6010a(this.f14070a.f13520b).mo4594a(C1246d.f3718O + preference.getKey(), ((CustomCheckBoxPreference) preference).isChecked(), C1246d.f3730a);
        return true;
    }
}
