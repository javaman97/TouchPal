package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import android.preference.Preference;
import com.cootek.smartinput5.func.C1617br;

/* renamed from: com.cootek.smartinput5.ui.settings.dF */
/* compiled from: TouchPalCloudActivity */
class C3168dF implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14223a;

    C3168dF(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14223a = touchPalCloudActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (C1617br.m7367a().mo6335b()) {
            this.f14223a.f13734a.startActivity(new Intent(this.f14223a.f13734a, CloudBackupSyncSettingActivity.class));
            return true;
        }
        C1617br.m7367a().mo6327a(this.f14223a.f13734a);
        return true;
    }
}
