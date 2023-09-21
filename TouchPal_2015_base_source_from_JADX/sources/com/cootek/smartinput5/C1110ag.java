package com.cootek.smartinput5;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ag */
/* compiled from: TouchPalOption */
final class C1110ag implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ String f3128a;

    /* renamed from: b */
    final /* synthetic */ int f3129b;

    /* renamed from: c */
    final /* synthetic */ int f3130c;

    C1110ag(String str, int i, int i2) {
        this.f3128a = str;
        this.f3129b = i;
        this.f3130c = i2;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (this.f3128a != null) {
            if (this.f3129b == 36 && Settings.getInstance().getBoolSetting(Settings.SHOW_AUTO_SPACE_TIP)) {
                Settings.getInstance().setBoolSetting(Settings.SHOW_AUTO_SPACE_TIP, false);
            }
            Settings.getInstance().setBoolSetting(this.f3129b, ((CheckBoxPreference) preference).isChecked(), this.f3130c, this.f3128a, (Config) null, true);
            Context b = C1368X.m6313b();
            if (b != null) {
                C1246d.m6010a(b).mo4594a(Settings.getInstance().getKeyByCategory(this.f3129b, this.f3130c, this.f3128a), ((CheckBoxPreference) preference).isChecked(), C1246d.f3730a);
            }
        }
        return false;
    }
}
