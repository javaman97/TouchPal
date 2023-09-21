package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.component.C1684q;

/* renamed from: com.cootek.smartinput5.ui.settings.Z */
/* compiled from: CloudBackupSyncSettingActivity */
class C2983Z implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CloudBackupSyncSettingActivity f13805a;

    C2983Z(CloudBackupSyncSettingActivity cloudBackupSyncSettingActivity) {
        this.f13805a = cloudBackupSyncSettingActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        C1684q.m7769a().mo6551a(this.f13805a.f13401a, (Integer) 1);
        C1684q.m7769a().mo6556d(this.f13805a.f13401a, 1, true);
        return true;
    }
}
