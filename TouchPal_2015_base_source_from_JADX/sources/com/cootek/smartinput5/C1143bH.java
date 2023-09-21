package com.cootek.smartinput5;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.bH */
/* compiled from: TouchPalOptionMainland */
class C1143bH implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ ArrayList f3490a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionMainland f3491b;

    C1143bH(TouchPalOptionMainland touchPalOptionMainland, ArrayList arrayList) {
        this.f3491b = touchPalOptionMainland;
        this.f3490a = arrayList;
    }

    public boolean onPreferenceClick(Preference preference) {
        for (int i = 0; i < this.f3490a.size(); i++) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f3490a.get(i);
            if (checkBoxPreference.isChecked()) {
                checkBoxPreference.setChecked(false);
                checkBoxPreference.getOnPreferenceClickListener().onPreferenceClick(checkBoxPreference);
            }
        }
        return false;
    }
}
