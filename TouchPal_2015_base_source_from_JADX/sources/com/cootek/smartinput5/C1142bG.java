package com.cootek.smartinput5;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.bG */
/* compiled from: TouchPalOptionMainland */
class C1142bG implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ ArrayList f3488a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionMainland f3489b;

    C1142bG(TouchPalOptionMainland touchPalOptionMainland, ArrayList arrayList) {
        this.f3489b = touchPalOptionMainland;
        this.f3488a = arrayList;
    }

    public boolean onPreferenceClick(Preference preference) {
        for (int i = 0; i < this.f3488a.size(); i++) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f3488a.get(i);
            if (!checkBoxPreference.isChecked()) {
                checkBoxPreference.setChecked(true);
                checkBoxPreference.getOnPreferenceClickListener().onPreferenceClick(checkBoxPreference);
            }
        }
        return false;
    }
}
