package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.p052b.C1498a;

/* renamed from: com.cootek.smartinput5.ui.settings.bG */
/* compiled from: LanguageListActivityInte */
class C3050bG implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f13994a;

    /* renamed from: b */
    final /* synthetic */ Preference f13995b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivityInte f13996c;

    C3050bG(LanguageListActivityInte languageListActivityInte, C1498a aVar, Preference preference) {
        this.f13996c = languageListActivityInte;
        this.f13994a = aVar;
        this.f13995b = preference;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f13996c.m13878a(this.f13994a.mo6154d(), this.f13994a.mo6153c(), this.f13994a.mo6159i(), this.f13995b);
        return true;
    }
}
