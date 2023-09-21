package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.aT */
/* compiled from: TouchPalOptionInte */
class C1083aT implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3081a;

    C1083aT(TouchPalOptionInte touchPalOptionInte) {
        this.f3081a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        C1584bI.m7145b(this.f3081a.f2890D, new C1084aU(this), false);
        return true;
    }
}
