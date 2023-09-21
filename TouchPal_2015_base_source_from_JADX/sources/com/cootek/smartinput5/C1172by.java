package com.cootek.smartinput5;

import android.content.Context;
import android.preference.Preference;
import com.cootek.smartinput5.func.C1584bI;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.by */
/* compiled from: TouchPalOptionMainland */
class C1172by implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3525a;

    C1172by(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3525a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        C1584bI.m7130a(this.f3525a.f2925c, TouchPalOption.m5422a((Context) this.f3525a, this.f3525a.mo7241b((int) R.string.weibo_touchpal_link)), 0);
        return true;
    }
}
