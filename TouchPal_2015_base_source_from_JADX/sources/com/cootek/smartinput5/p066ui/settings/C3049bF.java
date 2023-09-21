package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.p052b.C1498a;

/* renamed from: com.cootek.smartinput5.ui.settings.bF */
/* compiled from: LanguageListActivityInte */
class C3049bF implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f13991a;

    /* renamed from: b */
    final /* synthetic */ Preference f13992b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivityInte f13993c;

    C3049bF(LanguageListActivityInte languageListActivityInte, C1498a aVar, Preference preference) {
        this.f13993c = languageListActivityInte;
        this.f13991a = aVar;
        this.f13992b = preference;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f13993c.m13878a(this.f13991a.mo6154d(), this.f13991a.mo6153c(), this.f13991a.mo6159i(), this.f13992b);
        return true;
    }
}
