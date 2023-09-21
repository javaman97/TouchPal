package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.p052b.C1498a;

/* renamed from: com.cootek.smartinput5.ui.settings.bo */
/* compiled from: LanguageListActivity */
class C3093bo implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f14083a;

    /* renamed from: b */
    final /* synthetic */ Preference f14084b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivity f14085c;

    C3093bo(LanguageListActivity languageListActivity, C1498a aVar, Preference preference) {
        this.f14085c = languageListActivity;
        this.f14083a = aVar;
        this.f14084b = preference;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f14085c.m13855a(this.f14083a.mo6154d(), this.f14083a.mo6153c(), this.f14083a.mo6159i(), this.f14084b);
        return true;
    }
}
