package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.bj */
/* compiled from: TouchPalOptionInte */
class C1157bj implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3508a;

    C1157bj(TouchPalOptionInte touchPalOptionInte) {
        this.f3508a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        C1584bI.m7145b(this.f3508a.f2890D, new C1158bk(this), false);
        return true;
    }
}
