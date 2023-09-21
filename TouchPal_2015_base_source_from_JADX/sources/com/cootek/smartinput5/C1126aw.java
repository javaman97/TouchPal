package com.cootek.smartinput5;

import android.preference.Preference;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.aw */
/* compiled from: TouchPalOptionInte */
class C1126aw implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3155a;

    C1126aw(TouchPalOptionInte touchPalOptionInte) {
        this.f3155a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        new C2894d.C2895a(this.f3155a.f2890D).setMessage(this.f3155a.mo7241b((int) R.string.uninstall_super_dict_dialog_msg)).setPositiveButton(this.f3155a.mo7241b((int) R.string.ok), new C1128ay(this)).setNegativeButton(this.f3155a.mo7241b((int) R.string.cancel), new C1127ax(this)).show();
        return true;
    }
}
