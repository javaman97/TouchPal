package com.cootek.smartinput5;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.bF */
/* compiled from: TouchPalOptionMainland */
class C1141bF implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBoxPreference f3485a;

    /* renamed from: b */
    final /* synthetic */ String f3486b;

    /* renamed from: c */
    final /* synthetic */ TouchPalOptionMainland f3487c;

    C1141bF(TouchPalOptionMainland touchPalOptionMainland, CheckBoxPreference checkBoxPreference, String str) {
        this.f3487c = touchPalOptionMainland;
        this.f3485a = checkBoxPreference;
        this.f3486b = str;
    }

    public boolean onPreferenceClick(Preference preference) {
        Settings.getInstance().setAdvancedPredictionSetting(this.f3485a.isChecked());
        C1246d.m6010a(this.f3487c.f2925c).mo4594a(Settings.getInstance().getKeyByCategory(2, 4, this.f3486b), this.f3485a.isChecked(), C1246d.f3730a);
        return true;
    }
}
