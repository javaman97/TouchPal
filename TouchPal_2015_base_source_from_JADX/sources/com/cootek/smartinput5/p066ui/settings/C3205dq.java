package com.cootek.smartinput5.p066ui.settings;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1960r;
import com.cootek.smartinput5.func.C2065u;

/* renamed from: com.cootek.smartinput5.ui.settings.dq */
/* compiled from: TouchPalCloudActivity */
class C3205dq implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ String f14264a;

    /* renamed from: b */
    final /* synthetic */ TouchPalCloudActivity f14265b;

    C3205dq(TouchPalCloudActivity touchPalCloudActivity, String str) {
        this.f14265b = touchPalCloudActivity;
        this.f14264a = str;
    }

    public boolean onPreferenceClick(Preference preference) {
        boolean isChecked = ((CheckBoxPreference) preference).isChecked();
        Settings.getInstance().setBoolSetting(Settings.UPDATE_LIVE_WORDS, isChecked);
        if (!isChecked) {
            preference.setSummary(this.f14264a);
            Settings.getInstance().setLongSetting(Settings.HOTWORD_LAST_UPDATE_TIME, 0);
        }
        C1960r r = C1368X.m6320c().mo5845r();
        for (C2065u uVar : r.mo7203g()) {
            if (uVar.f8867B) {
                r.mo7195a(uVar, isChecked);
            }
        }
        return true;
    }
}
