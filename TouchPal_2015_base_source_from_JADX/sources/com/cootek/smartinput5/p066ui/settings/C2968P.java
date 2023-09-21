package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1584bI;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.P */
/* compiled from: CellDictListActivity */
class C2968P implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ String f13584a;

    /* renamed from: b */
    final /* synthetic */ CellDictListActivity f13585b;

    C2968P(CellDictListActivity cellDictListActivity, String str) {
        this.f13585b = cellDictListActivity;
        this.f13584a = str;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (C1358O.m6234a(C1358O.f4199j) == null) {
            Toast.makeText(this.f13585b.f13394a, this.f13585b.mo7241b((int) R.string.sdcard_not_ready_message), 1).show();
        } else {
            C1584bI.m7145b(this.f13585b.f13394a, new C2970Q(this), false);
        }
        return true;
    }
}
