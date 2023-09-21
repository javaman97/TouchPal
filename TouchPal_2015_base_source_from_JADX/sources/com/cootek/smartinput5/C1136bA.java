package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.bA */
/* compiled from: TouchPalOptionMainland */
class C1136bA implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3479a;

    C1136bA(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3479a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (TouchPalOptionMainland.m5550c(this.f3479a) < 10) {
            return true;
        }
        TouchPalOption.m5443g(this.f3479a.f2925c);
        int unused = this.f3479a.f2926d = 0;
        return true;
    }
}
