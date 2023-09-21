package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.bi */
/* compiled from: TouchPalOptionInte */
class C1156bi implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3507a;

    C1156bi(TouchPalOptionInte touchPalOptionInte) {
        this.f3507a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (!this.f3507a.f2913q) {
            this.f3507a.m5470K();
        }
        int unused = this.f3507a.f2897K = 7;
        return false;
    }
}
