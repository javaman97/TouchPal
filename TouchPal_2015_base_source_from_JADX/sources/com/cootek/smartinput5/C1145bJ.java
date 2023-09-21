package com.cootek.smartinput5;

import android.content.Intent;
import android.preference.Preference;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.settings.TouchPalUpdateActivity;

/* renamed from: com.cootek.smartinput5.bJ */
/* compiled from: TouchPalOptionMainland */
class C1145bJ implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3493a;

    C1145bJ(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3493a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (C1368X.m6324d()) {
            this.f3493a.startActivity(new Intent(this.f3493a, TouchPalUpdateActivity.class));
            C1246d.m6010a(this.f3493a.f2925c).mo4594a(C1246d.f3717N, true, C1246d.f3730a);
        }
        return true;
    }
}
