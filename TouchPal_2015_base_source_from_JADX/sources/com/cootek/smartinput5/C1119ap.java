package com.cootek.smartinput5;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ap */
/* compiled from: TouchPalOptionInte */
class C1119ap implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBoxPreference f3144a;

    /* renamed from: b */
    final /* synthetic */ String f3145b;

    /* renamed from: c */
    final /* synthetic */ TouchPalOptionInte f3146c;

    C1119ap(TouchPalOptionInte touchPalOptionInte, CheckBoxPreference checkBoxPreference, String str) {
        this.f3146c = touchPalOptionInte;
        this.f3144a = checkBoxPreference;
        this.f3145b = str;
    }

    public boolean onPreferenceClick(Preference preference) {
        Settings.getInstance().setAdvancedPredictionSetting(this.f3144a.isChecked());
        C1246d.m6010a(this.f3146c.f2890D).mo4594a(Settings.getInstance().getKeyByCategory(2, 4, this.f3145b), this.f3144a.isChecked(), C1246d.f3730a);
        return true;
    }
}
