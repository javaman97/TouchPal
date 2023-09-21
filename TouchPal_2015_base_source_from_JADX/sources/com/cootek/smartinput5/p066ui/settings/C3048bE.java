package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.p052b.C1498a;

/* renamed from: com.cootek.smartinput5.ui.settings.bE */
/* compiled from: LanguageListActivityInte */
class C3048bE implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f13988a;

    /* renamed from: b */
    final /* synthetic */ Preference f13989b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivityInte f13990c;

    C3048bE(LanguageListActivityInte languageListActivityInte, C1498a aVar, Preference preference) {
        this.f13990c = languageListActivityInte;
        this.f13988a = aVar;
        this.f13989b = preference;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f13990c.m13878a(this.f13988a.mo6154d(), this.f13988a.mo6153c(), this.f13988a.mo6159i(), this.f13989b);
        return true;
    }
}
