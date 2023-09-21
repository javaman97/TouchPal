package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.bE */
/* compiled from: TouchPalOptionMainland */
class C1140bE implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3484a;

    C1140bE(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3484a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f3484a.startActivity(preference.getIntent());
        return true;
    }
}
