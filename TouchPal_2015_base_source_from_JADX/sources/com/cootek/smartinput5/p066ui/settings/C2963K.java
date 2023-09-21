package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C2065u;

/* renamed from: com.cootek.smartinput5.ui.settings.K */
/* compiled from: CellDictListActivity */
class C2963K implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C2065u f13478a;

    /* renamed from: b */
    final /* synthetic */ CellDictListActivity f13479b;

    C2963K(CellDictListActivity cellDictListActivity, C2065u uVar) {
        this.f13479b = cellDictListActivity;
        this.f13478a = uVar;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (TextUtils.isEmpty(this.f13478a.f8870v)) {
            return true;
        }
        this.f13479b.m13718a(this.f13478a.mo7438e(), this.f13478a.f8871w, this.f13478a.f8873y);
        return true;
    }
}
