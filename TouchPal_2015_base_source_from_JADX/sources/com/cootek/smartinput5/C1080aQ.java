package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.aQ */
/* compiled from: TouchPalOptionInte */
class C1080aQ implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3078a;

    C1080aQ(TouchPalOptionInte touchPalOptionInte) {
        this.f3078a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        C1584bI.m7145b(this.f3078a.f2890D, new C1081aR(this), false);
        return true;
    }
}
