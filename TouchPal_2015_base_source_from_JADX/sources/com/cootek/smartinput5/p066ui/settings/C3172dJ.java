package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.preference.Preference;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.dJ */
/* compiled from: TouchPalCloudActivity */
class C3172dJ implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14227a;

    C3172dJ(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14227a = touchPalCloudActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (!C1584bI.m7141a(this.f14227a.f13734a, (Runnable) null, false)) {
            C2894d.C2895a aVar = new C2894d.C2895a(this.f14227a.f13734a);
            aVar.setMessage(this.f14227a.mo7241b((int) R.string.logout_confirm_msg));
            aVar.setPositiveButton(this.f14227a.mo7241b((int) R.string.ok), new C3173dK(this));
            aVar.setNegativeButton(this.f14227a.mo7241b((int) R.string.cancel), (DialogInterface.OnClickListener) null);
            aVar.show();
        }
        return true;
    }
}
