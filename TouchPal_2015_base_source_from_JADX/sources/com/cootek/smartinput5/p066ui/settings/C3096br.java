package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.br */
/* compiled from: LanguageListActivity */
class C3096br implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ LanguageListActivity f14092a;

    C3096br(LanguageListActivity languageListActivity) {
        this.f14092a = languageListActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f14092a.f13526h.removePreference(preference);
        Iterator it = this.f14092a.f13527i.iterator();
        while (it.hasNext()) {
            this.f14092a.f13526h.addPreference((Preference) it.next());
        }
        return true;
    }
}
