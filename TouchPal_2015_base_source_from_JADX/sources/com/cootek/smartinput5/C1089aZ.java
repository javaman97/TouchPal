package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.aZ */
/* compiled from: TouchPalOptionInte */
class C1089aZ implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3087a;

    C1089aZ(TouchPalOptionInte touchPalOptionInte) {
        this.f3087a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (TouchPalOptionInte.m5512o(this.f3087a) < 10) {
            return true;
        }
        TouchPalOption.m5443g(this.f3087a.f2890D);
        int unused = this.f3087a.f2898L = 0;
        return true;
    }
}
