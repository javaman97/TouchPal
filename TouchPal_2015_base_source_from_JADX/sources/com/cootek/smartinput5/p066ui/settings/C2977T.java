package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.HandWriteManager;

/* renamed from: com.cootek.smartinput5.ui.settings.T */
/* compiled from: CellDictListActivity */
class C2977T implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ HandWriteManager f13728a;

    /* renamed from: b */
    final /* synthetic */ String f13729b;

    /* renamed from: c */
    final /* synthetic */ CellDictListActivity f13730c;

    C2977T(CellDictListActivity cellDictListActivity, HandWriteManager handWriteManager, String str) {
        this.f13730c = cellDictListActivity;
        this.f13728a = handWriteManager;
        this.f13729b = str;
    }

    public boolean onPreferenceClick(Preference preference) {
        C1584bI.m7145b(this.f13730c.f13394a, new C2978U(this), false);
        return true;
    }
}
