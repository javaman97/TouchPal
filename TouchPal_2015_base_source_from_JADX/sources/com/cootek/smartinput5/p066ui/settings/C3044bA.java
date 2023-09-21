package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.settings.bA */
/* compiled from: LanguageListActivityInte */
class C3044bA implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ LanguageListActivityInte f13980a;

    C3044bA(LanguageListActivityInte languageListActivityInte) {
        this.f13980a = languageListActivityInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        Settings.getInstance().setLanguageEnabled(preference.getKey(), ((CustomCheckBoxPreference) preference).isChecked());
        this.f13980a.m13892p();
        C1246d.m6010a(this.f13980a.f13531b).mo4594a(C1246d.f3718O + preference.getKey(), ((CustomCheckBoxPreference) preference).isChecked(), C1246d.f3730a);
        return true;
    }
}
