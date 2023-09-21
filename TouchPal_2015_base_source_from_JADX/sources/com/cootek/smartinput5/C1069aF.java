package com.cootek.smartinput5;

import android.content.Context;
import android.preference.Preference;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.aF */
/* compiled from: TouchPalOptionInte */
class C1069aF implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3066a;

    C1069aF(TouchPalOptionInte touchPalOptionInte) {
        this.f3066a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        C1246d.m6010a(this.f3066a.f2890D).mo4591a(C1246d.f3838cB, "CLICK", "/UI/SHARE/");
        if (!C1368X.m6324d()) {
            return false;
        }
        C1368X.m6320c().mo5827M().mo5989a((Context) this.f3066a);
        return false;
    }
}
