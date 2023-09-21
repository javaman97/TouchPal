package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.component.C1670e;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.dh */
/* compiled from: TouchPalCloudActivity */
class C3196dh implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14252a;

    C3196dh(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14252a = touchPalCloudActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        new C2894d.C2895a(this.f14252a.f13734a).setMessage(this.f14252a.mo7241b((int) R.string.userdict_backup_message)).setPositiveButton(this.f14252a.mo7241b((int) R.string.button_backup_userdict), new C3198dj(this, new C1670e(this.f14252a.f13734a))).setNegativeButton(this.f14252a.mo7241b((int) R.string.cancel), new C3197di(this)).show();
        return true;
    }
}
