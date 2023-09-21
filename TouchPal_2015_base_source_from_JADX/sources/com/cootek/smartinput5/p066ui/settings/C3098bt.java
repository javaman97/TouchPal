package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.p052b.C1498a;

/* renamed from: com.cootek.smartinput5.ui.settings.bt */
/* compiled from: LanguageListActivity */
class C3098bt implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f14096a;

    /* renamed from: b */
    final /* synthetic */ Preference f14097b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivity f14098c;

    C3098bt(LanguageListActivity languageListActivity, C1498a aVar, Preference preference) {
        this.f14098c = languageListActivity;
        this.f14096a = aVar;
        this.f14097b = preference;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f14098c.m13855a(this.f14096a.mo6154d(), this.f14096a.mo6153c(), this.f14096a.mo6159i(), this.f14097b);
        return true;
    }
}
