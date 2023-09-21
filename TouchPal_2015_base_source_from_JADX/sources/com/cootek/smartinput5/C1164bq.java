package com.cootek.smartinput5;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.preference.Preference;
import android.widget.Toast;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.func.C1358O;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.bq */
/* compiled from: TouchPalOptionMainland */
class C1164bq implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3516a;

    C1164bq(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3516a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        try {
            Intent intent = preference.getIntent();
            if (C1358O.m6239b() != null) {
                new TouchPalOption.C1047c(this.f3516a, intent).execute(new String[0]);
                return true;
            }
            this.f3516a.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.f3516a, this.f3516a.mo7241b((int) R.string.mailclient_not_found), 0).show();
            return true;
        }
    }
}
