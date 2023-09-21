package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.bp */
/* compiled from: TouchPalOptionMainland */
class C1163bp implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3515a;

    C1163bp(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3515a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f3515a.m5545a(this.f3515a.mo7241b((int) R.string.optpage_help_address));
        C1246d.m6010a(this.f3515a.f2925c).mo4594a(C1246d.f3728Y, true, C1246d.f3730a);
        return true;
    }
}
