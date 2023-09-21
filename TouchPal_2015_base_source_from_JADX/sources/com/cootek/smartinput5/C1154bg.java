package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.bg */
/* compiled from: TouchPalOptionInte */
class C1154bg implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3505a;

    C1154bg(TouchPalOptionInte touchPalOptionInte) {
        this.f3505a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (!this.f3505a.f2912p) {
            this.f3505a.m5469J();
        }
        int unused = this.f3505a.f2897K = 5;
        return false;
    }
}
