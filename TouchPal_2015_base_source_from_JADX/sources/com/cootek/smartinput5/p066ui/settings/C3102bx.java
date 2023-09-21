package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.p052b.C1498a;

/* renamed from: com.cootek.smartinput5.ui.settings.bx */
/* compiled from: LanguageListActivityInte */
class C3102bx implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f14104a;

    /* renamed from: b */
    final /* synthetic */ Preference f14105b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivityInte f14106c;

    C3102bx(LanguageListActivityInte languageListActivityInte, C1498a aVar, Preference preference) {
        this.f14106c = languageListActivityInte;
        this.f14104a = aVar;
        this.f14105b = preference;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f14106c.m13878a(this.f14104a.mo6154d(), this.f14104a.mo6153c(), this.f14104a.mo6159i(), this.f14105b);
        return true;
    }
}
