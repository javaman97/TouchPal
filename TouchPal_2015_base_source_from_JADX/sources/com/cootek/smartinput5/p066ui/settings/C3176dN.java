package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import android.preference.Preference;

/* renamed from: com.cootek.smartinput5.ui.settings.dN */
/* compiled from: TouchPalCloudActivity */
class C3176dN implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14231a;

    C3176dN(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14231a = touchPalCloudActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f14231a.f13734a.startActivity(new Intent(this.f14231a.f13734a, CellDictListActivity.class));
        return true;
    }
}
