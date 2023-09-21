package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.ar */
/* compiled from: TouchPalOptionInte */
class C1121ar implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3148a;

    C1121ar(TouchPalOptionInte touchPalOptionInte) {
        this.f3148a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (this.f3148a.f2914r) {
            return false;
        }
        this.f3148a.m5467H();
        return false;
    }
}
