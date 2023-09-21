package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.p052b.C1498a;

/* renamed from: com.cootek.smartinput5.ui.settings.bH */
/* compiled from: LanguageListActivityInte */
class C3051bH implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f13997a;

    /* renamed from: b */
    final /* synthetic */ Preference f13998b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivityInte f13999c;

    C3051bH(LanguageListActivityInte languageListActivityInte, C1498a aVar, Preference preference) {
        this.f13999c = languageListActivityInte;
        this.f13997a = aVar;
        this.f13998b = preference;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f13999c.m13878a(this.f13997a.mo6154d(), this.f13997a.mo6153c(), this.f13997a.mo6159i(), this.f13998b);
        return true;
    }
}
