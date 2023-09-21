package com.cootek.smartinput5;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.az */
/* compiled from: TouchPalOptionInte */
class C1129az implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ ArrayList f3158a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionInte f3159b;

    C1129az(TouchPalOptionInte touchPalOptionInte, ArrayList arrayList) {
        this.f3159b = touchPalOptionInte;
        this.f3158a = arrayList;
    }

    public boolean onPreferenceClick(Preference preference) {
        for (int i = 0; i < this.f3158a.size(); i++) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f3158a.get(i);
            if (!checkBoxPreference.isChecked()) {
                checkBoxPreference.setChecked(true);
                checkBoxPreference.getOnPreferenceClickListener().onPreferenceClick(checkBoxPreference);
            }
        }
        return false;
    }
}
