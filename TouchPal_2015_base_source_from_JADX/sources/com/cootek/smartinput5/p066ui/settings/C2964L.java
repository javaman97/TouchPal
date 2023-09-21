package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import com.cootek.smartinput5.func.C2065u;

/* renamed from: com.cootek.smartinput5.ui.settings.L */
/* compiled from: CellDictListActivity */
class C2964L implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C2065u f13508a;

    /* renamed from: b */
    final /* synthetic */ CellDictListActivity f13509b;

    C2964L(CellDictListActivity cellDictListActivity, C2065u uVar) {
        this.f13509b = cellDictListActivity;
        this.f13508a = uVar;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.f13509b.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + this.f13508a.mo6810a())));
        return true;
    }
}
