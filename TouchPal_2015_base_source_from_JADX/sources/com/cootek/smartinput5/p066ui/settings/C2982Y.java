package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.component.C1684q;

/* renamed from: com.cootek.smartinput5.ui.settings.Y */
/* compiled from: CloudBackupSyncSettingActivity */
class C2982Y implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CloudBackupSyncSettingActivity f13804a;

    C2982Y(CloudBackupSyncSettingActivity cloudBackupSyncSettingActivity) {
        this.f13804a = cloudBackupSyncSettingActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        C1684q.m7769a().mo6551a(this.f13804a.f13401a, (Integer) 1);
        C1684q.m7769a().mo6555c(this.f13804a.f13401a, 1, true);
        return true;
    }
}
