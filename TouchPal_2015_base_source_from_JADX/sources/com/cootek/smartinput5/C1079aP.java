package com.cootek.smartinput5;

import android.content.Intent;
import android.preference.Preference;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.settings.TouchPalUpdateActivity;

/* renamed from: com.cootek.smartinput5.aP */
/* compiled from: TouchPalOptionInte */
class C1079aP implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3077a;

    C1079aP(TouchPalOptionInte touchPalOptionInte) {
        this.f3077a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (C1368X.m6324d()) {
            this.f3077a.startActivity(new Intent(this.f3077a.f2890D, TouchPalUpdateActivity.class));
            C1246d.m6010a(this.f3077a.f2890D).mo4594a(C1246d.f3717N, true, C1246d.f3730a);
        }
        return true;
    }
}
