package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.ak */
/* compiled from: TouchPalOptionInte */
class C1114ak implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3135a;

    C1114ak(TouchPalOptionInte touchPalOptionInte) {
        this.f3135a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (!this.f3135a.f2909m) {
            this.f3135a.m5524y();
        }
        int unused = this.f3135a.f2897K = 1;
        return false;
    }
}
