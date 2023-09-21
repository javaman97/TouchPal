package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.aW */
/* compiled from: TouchPalOptionInte */
class C1086aW implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3084a;

    C1086aW(TouchPalOptionInte touchPalOptionInte) {
        this.f3084a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f3084a.startActivity(preference.getIntent());
        return true;
    }
}
