package com.cootek.smartinput5;

import android.preference.Preference;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.bv */
/* compiled from: TouchPalOptionMainland */
class C1169bv implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3521a;

    C1169bv(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3521a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f3521a.m5545a(this.f3521a.mo7241b((int) R.string.handwriting_provider_website));
        return true;
    }
}
