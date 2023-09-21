package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.bL */
/* compiled from: TouchPalOptionMainland */
class C1147bL implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3496a;

    C1147bL(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3496a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f3496a.startActivity(preference.getIntent());
        C1246d.m6010a(this.f3496a.f2925c).mo4594a(C1246d.f3719P, true, C1246d.f3730a);
        return true;
    }
}
