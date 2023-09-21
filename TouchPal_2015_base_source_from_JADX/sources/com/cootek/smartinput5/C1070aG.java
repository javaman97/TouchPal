package com.cootek.smartinput5;

import android.content.ActivityNotFoundException;
import android.preference.Preference;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1584bI;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.aG */
/* compiled from: TouchPalOptionInte */
class C1070aG implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3067a;

    C1070aG(TouchPalOptionInte touchPalOptionInte) {
        this.f3067a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        try {
            C1584bI.m7145b(this.f3067a.f2890D, new C1071aH(this, preference), false);
            return true;
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.f3067a.f2890D, this.f3067a.mo7241b((int) R.string.mailclient_not_found), 0).show();
            return true;
        }
    }
}
