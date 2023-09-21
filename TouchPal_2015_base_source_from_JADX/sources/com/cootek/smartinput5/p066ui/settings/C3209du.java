package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.du */
/* compiled from: TouchPalCloudActivity */
class C3209du implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14270a;

    C3209du(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14270a = touchPalCloudActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        new C2894d.C2895a(this.f14270a.f13734a).setMessage(this.f14270a.mo7241b((int) R.string.uninstall_super_dict_dialog_msg)).setPositiveButton(this.f14270a.mo7241b((int) R.string.ok), new C3211dw(this)).setNegativeButton(this.f14270a.mo7241b((int) R.string.cancel), new C3210dv(this)).show();
        return true;
    }
}
