package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.component.C1689v;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.settings.df */
/* compiled from: TouchPalCloudActivity */
class C3194df implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14250a;

    C3194df(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14250a = touchPalCloudActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        new C1689v(this.f14250a).mo6562a();
        C1246d.m6010a(this.f14250a.f13734a).mo4594a(C1246d.f3721R, true, C1246d.f3730a);
        C1056a.m5588a().mo4264a(C1056a.f2941B, this.f14250a.f13734a);
        return true;
    }
}
