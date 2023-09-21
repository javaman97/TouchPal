package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.bv */
/* compiled from: LanguageListActivityInte */
class C3100bv implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ LanguageListActivityInte f14100a;

    C3100bv(LanguageListActivityInte languageListActivityInte) {
        this.f14100a = languageListActivityInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f14100a.f13537h.removePreference(preference);
        Iterator it = this.f14100a.f13538i.iterator();
        while (it.hasNext()) {
            this.f14100a.f13537h.addPreference((Preference) it.next());
        }
        this.f14100a.m13890n();
        return true;
    }
}
