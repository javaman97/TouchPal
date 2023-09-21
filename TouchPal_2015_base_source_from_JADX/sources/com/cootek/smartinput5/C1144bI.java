package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.func.onestopmanager.C1904a;

/* renamed from: com.cootek.smartinput5.bI */
/* compiled from: TouchPalOptionMainland */
class C1144bI implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3492a;

    C1144bI(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3492a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        new C1904a(this.f3492a, false).mo7053a();
        return true;
    }
}
