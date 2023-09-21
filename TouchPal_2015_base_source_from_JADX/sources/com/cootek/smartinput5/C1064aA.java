package com.cootek.smartinput5;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.aA */
/* compiled from: TouchPalOptionInte */
class C1064aA implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ ArrayList f3060a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionInte f3061b;

    C1064aA(TouchPalOptionInte touchPalOptionInte, ArrayList arrayList) {
        this.f3061b = touchPalOptionInte;
        this.f3060a = arrayList;
    }

    public boolean onPreferenceClick(Preference preference) {
        for (int i = 0; i < this.f3060a.size(); i++) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f3060a.get(i);
            if (checkBoxPreference.isChecked()) {
                checkBoxPreference.setChecked(false);
                checkBoxPreference.getOnPreferenceClickListener().onPreferenceClick(checkBoxPreference);
            }
        }
        return false;
    }
}
