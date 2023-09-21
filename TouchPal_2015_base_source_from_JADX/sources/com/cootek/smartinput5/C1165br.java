package com.cootek.smartinput5;

import android.content.Context;
import android.preference.Preference;
import com.cootek.smartinput5.func.C1584bI;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.br */
/* compiled from: TouchPalOptionMainland */
class C1165br implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3517a;

    C1165br(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3517a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        C1584bI.m7130a(this.f3517a.f2925c, TouchPalOption.m5422a((Context) this.f3517a, this.f3517a.mo7241b((int) R.string.uservoice_touchpal_link_mainland)), 0);
        return true;
    }
}
