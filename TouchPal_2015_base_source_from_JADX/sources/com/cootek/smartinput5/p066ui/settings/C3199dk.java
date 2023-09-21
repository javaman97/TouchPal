package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.component.C1670e;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.dk */
/* compiled from: TouchPalCloudActivity */
class C3199dk implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14256a;

    C3199dk(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14256a = touchPalCloudActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        new C2894d.C2895a(this.f14256a.f13734a).setMessage(this.f14256a.mo7241b((int) R.string.userdict_restore_message)).setPositiveButton(this.f14256a.mo7241b((int) R.string.button_restore_userdict), new C3201dm(this, new C1670e(this.f14256a.f13734a))).setNegativeButton(this.f14256a.mo7241b((int) R.string.cancel), new C3200dl(this)).show();
        return true;
    }
}
