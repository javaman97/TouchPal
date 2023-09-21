package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.p052b.C1498a;

/* renamed from: com.cootek.smartinput5.ui.settings.bw */
/* compiled from: LanguageListActivityInte */
class C3101bw implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f14101a;

    /* renamed from: b */
    final /* synthetic */ Preference f14102b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivityInte f14103c;

    C3101bw(LanguageListActivityInte languageListActivityInte, C1498a aVar, Preference preference) {
        this.f14103c = languageListActivityInte;
        this.f14101a = aVar;
        this.f14102b = preference;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f14103c.m13878a(this.f14101a.mo6154d(), this.f14101a.mo6153c(), this.f14101a.mo6159i(), this.f14102b);
        return true;
    }
}
