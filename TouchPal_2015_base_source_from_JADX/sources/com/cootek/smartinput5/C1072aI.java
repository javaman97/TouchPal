package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.aI */
/* compiled from: TouchPalOptionInte */
class C1072aI implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3070a;

    C1072aI(TouchPalOptionInte touchPalOptionInte) {
        this.f3070a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        C1584bI.m7145b(this.f3070a.f2890D, new C1073aJ(this), false);
        return true;
    }
}
