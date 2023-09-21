package com.cootek.smartinput5;

import android.preference.Preference;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.bt */
/* compiled from: TouchPalOptionMainland */
class C1167bt implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3519a;

    C1167bt(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3519a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f3519a.m5545a(this.f3519a.mo7241b((int) R.string.optpage_touchpal_weibo_address));
        return true;
    }
}
