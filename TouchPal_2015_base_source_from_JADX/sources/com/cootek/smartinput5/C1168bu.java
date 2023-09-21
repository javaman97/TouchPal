package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.bu */
/* compiled from: TouchPalOptionMainland */
class C1168bu implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3520a;

    C1168bu(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3520a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f3520a.m5545a("http://www.cootek.cn");
        return true;
    }
}
