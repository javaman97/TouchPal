package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.aS */
/* compiled from: TouchPalOptionInte */
class C1082aS implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3080a;

    C1082aS(TouchPalOptionInte touchPalOptionInte) {
        this.f3080a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (!C1368X.m6324d()) {
            return true;
        }
        this.f3080a.startActivity(preference.getIntent());
        C1246d.m6010a(this.f3080a.f2890D).mo4591a("RATE_US/PREF_ITEM", "CLICK", C1246d.f3836c);
        return true;
    }
}
