package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.aB */
/* compiled from: TouchPalOptionInte */
class C1065aB implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3062a;

    C1065aB(TouchPalOptionInte touchPalOptionInte) {
        this.f3062a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f3062a.startActivity(preference.getIntent());
        return true;
    }
}
