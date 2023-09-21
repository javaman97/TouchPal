package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.aN */
/* compiled from: TouchPalOptionInte */
class C1077aN implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3075a;

    C1077aN(TouchPalOptionInte touchPalOptionInte) {
        this.f3075a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (!this.f3075a.f2911o) {
            this.f3075a.m5460A();
        }
        int unused = this.f3075a.f2897K = 3;
        return false;
    }
}
