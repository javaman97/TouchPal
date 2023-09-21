package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.aC */
/* compiled from: TouchPalOptionInte */
class C1066aC implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3063a;

    C1066aC(TouchPalOptionInte touchPalOptionInte) {
        this.f3063a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f3063a.startActivity(preference.getIntent());
        return true;
    }
}
