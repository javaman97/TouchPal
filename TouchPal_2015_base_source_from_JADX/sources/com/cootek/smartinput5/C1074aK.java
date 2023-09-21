package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.aK */
/* compiled from: TouchPalOptionInte */
class C1074aK implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3072a;

    C1074aK(TouchPalOptionInte touchPalOptionInte) {
        this.f3072a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        new C2894d.C2895a(this.f3072a.f2890D).setMessage(this.f3072a.mo7241b((int) R.string.rebuild_userdata_message)).setPositiveButton(this.f3072a.mo7241b((int) R.string.ok), new C1076aM(this)).setNegativeButton(this.f3072a.mo7241b((int) R.string.cancel), new C1075aL(this)).show();
        return true;
    }
}
