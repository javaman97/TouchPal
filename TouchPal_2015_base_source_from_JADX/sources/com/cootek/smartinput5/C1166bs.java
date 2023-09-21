package com.cootek.smartinput5;

import android.preference.Preference;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.bs */
/* compiled from: TouchPalOptionMainland */
class C1166bs implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3518a;

    C1166bs(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3518a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f3518a.m5545a(this.f3518a.mo7241b((int) R.string.optpage_touchpal_forum_address));
        return true;
    }
}
