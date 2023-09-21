package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.p052b.C1498a;

/* renamed from: com.cootek.smartinput5.ui.settings.bs */
/* compiled from: LanguageListActivity */
class C3097bs implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f14093a;

    /* renamed from: b */
    final /* synthetic */ Preference f14094b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivity f14095c;

    C3097bs(LanguageListActivity languageListActivity, C1498a aVar, Preference preference) {
        this.f14095c = languageListActivity;
        this.f14093a = aVar;
        this.f14094b = preference;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f14095c.m13855a(this.f14093a.mo6154d(), this.f14093a.mo6153c(), this.f14093a.mo6159i(), this.f14094b);
        return true;
    }
}
