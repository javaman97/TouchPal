package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.p052b.C1498a;

/* renamed from: com.cootek.smartinput5.ui.settings.bp */
/* compiled from: LanguageListActivity */
class C3094bp implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f14086a;

    /* renamed from: b */
    final /* synthetic */ Preference f14087b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivity f14088c;

    C3094bp(LanguageListActivity languageListActivity, C1498a aVar, Preference preference) {
        this.f14088c = languageListActivity;
        this.f14086a = aVar;
        this.f14087b = preference;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f14088c.m13855a(this.f14086a.mo6154d(), this.f14086a.mo6153c(), this.f14086a.mo6159i(), this.f14087b);
        return true;
    }
}
