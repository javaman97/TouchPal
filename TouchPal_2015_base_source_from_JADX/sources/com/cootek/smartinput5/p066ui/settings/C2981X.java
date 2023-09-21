package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.X */
/* compiled from: CloudBackupSyncSettingActivity */
class C2981X implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CustomizableCheckBoxPreference f13801a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f13802b;

    /* renamed from: c */
    final /* synthetic */ CloudBackupSyncSettingActivity f13803c;

    C2981X(CloudBackupSyncSettingActivity cloudBackupSyncSettingActivity, CustomizableCheckBoxPreference customizableCheckBoxPreference, ArrayList arrayList) {
        this.f13803c = cloudBackupSyncSettingActivity;
        this.f13801a = customizableCheckBoxPreference;
        this.f13802b = arrayList;
    }

    public boolean onPreferenceClick(Preference preference) {
        boolean isChecked = this.f13801a.isChecked();
        Settings.getInstance().setBoolSetting(260, isChecked);
        Iterator it = this.f13802b.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).setEnabled(isChecked);
        }
        return true;
    }
}
