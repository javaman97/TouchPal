package com.cootek.smartinput5;

import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.ba */
/* compiled from: TouchPalOptionInte */
class C1148ba implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3497a;

    C1148ba(TouchPalOptionInte touchPalOptionInte) {
        this.f3497a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f3497a.startActivity(preference.getIntent());
        int unused = this.f3497a.f2897K = 4;
        return true;
    }
}
