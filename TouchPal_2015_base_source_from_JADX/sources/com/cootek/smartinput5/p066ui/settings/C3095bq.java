package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.p052b.C1498a;

/* renamed from: com.cootek.smartinput5.ui.settings.bq */
/* compiled from: LanguageListActivity */
class C3095bq implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f14089a;

    /* renamed from: b */
    final /* synthetic */ Preference f14090b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivity f14091c;

    C3095bq(LanguageListActivity languageListActivity, C1498a aVar, Preference preference) {
        this.f14091c = languageListActivity;
        this.f14089a = aVar;
        this.f14090b = preference;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f14091c.m13855a(this.f14089a.mo6154d(), this.f14089a.mo6153c(), this.f14089a.mo6159i(), this.f14090b);
        return true;
    }
}
