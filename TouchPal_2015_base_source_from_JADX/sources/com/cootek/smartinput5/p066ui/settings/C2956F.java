package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.C1960r;
import com.cootek.smartinput5.func.C2065u;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.settings.F */
/* compiled from: CellDictListActivity */
class C2956F implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1960r f13438a;

    /* renamed from: b */
    final /* synthetic */ C2065u f13439b;

    /* renamed from: c */
    final /* synthetic */ CellDictListActivity f13440c;

    C2956F(CellDictListActivity cellDictListActivity, C1960r rVar, C2065u uVar) {
        this.f13440c = cellDictListActivity;
        this.f13438a = rVar;
        this.f13439b = uVar;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f13438a.mo7195a(this.f13439b, ((CustomCheckBoxPreference) preference).isChecked());
        if (((CustomCheckBoxPreference) preference).isChecked()) {
            C1246d.m6010a(this.f13440c.f13394a).mo4594a(C1246d.f3720Q, true, C1246d.f3730a);
        }
        return true;
    }
}
