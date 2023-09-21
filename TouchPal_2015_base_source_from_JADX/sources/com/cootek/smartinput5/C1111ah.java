package com.cootek.smartinput5;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p045a.C1056a;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ah */
/* compiled from: TouchPalOption */
final class C1111ah implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ int f3131a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f3132b;

    /* renamed from: c */
    final /* synthetic */ TouchPalOption.C1048d f3133c;

    C1111ah(int i, ArrayList arrayList, TouchPalOption.C1048d dVar) {
        this.f3131a = i;
        this.f3132b = arrayList;
        this.f3133c = dVar;
    }

    public boolean onPreferenceClick(Preference preference) {
        int i = 1;
        if (this.f3131a == 9) {
            Settings instance = Settings.getInstance();
            if (((CheckBoxPreference) preference).isChecked()) {
                i = 4;
            }
            instance.setIntSetting(9, i);
        } else if (this.f3131a == 33) {
            Settings instance2 = Settings.getInstance();
            if (((CheckBoxPreference) preference).isChecked()) {
                i = 3;
            }
            instance2.setIntSetting(33, i);
        } else if (this.f3131a == 53) {
            Settings.getInstance().setWaveEnableSetting(((CheckBoxPreference) preference).isChecked());
        } else {
            switch (this.f3131a) {
                case Settings.SMS_AUTO_LEARN /*176*/:
                    C1056a.m5588a().mo4264a("SETTING_SMS_ONLY_IMPORT_OUTGOING", C1368X.m6313b());
                    break;
                case Settings.SMS_ONLY_IMPORT_OUTGOING /*178*/:
                    C1056a.m5588a().mo4264a("SETTING_SMS_ONLY_IMPORT_OUTGOING", C1368X.m6313b());
                    break;
            }
            Settings.getInstance().setBoolSetting(this.f3131a, ((CheckBoxPreference) preference).isChecked());
        }
        switch (this.f3131a) {
        }
        if (this.f3132b == null || this.f3133c == null) {
            return false;
        }
        this.f3133c.mo4237a(this.f3132b);
        return false;
    }
}
