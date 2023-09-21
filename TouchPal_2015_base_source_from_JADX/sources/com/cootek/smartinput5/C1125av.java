package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.av */
/* compiled from: TouchPalOptionInte */
class C1125av implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3154a;

    C1125av(TouchPalOptionInte touchPalOptionInte) {
        this.f3154a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (!this.f3154a.f2910n) {
            this.f3154a.m5525z();
        }
        int unused = this.f3154a.f2897K = 2;
        return false;
    }
}
