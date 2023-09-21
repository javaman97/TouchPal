package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.p052b.C1549b;

/* renamed from: com.cootek.smartinput5.ui.settings.dn */
/* compiled from: TouchPalCloudActivity */
class C3202dn implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14260a;

    C3202dn(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14260a = touchPalCloudActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        Intent intent = new Intent();
        intent.setClass(this.f14260a.f13734a, UsrWordManageActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.putExtra(UsrWordManageActivity.f13778a, C1549b.f4791a);
        this.f14260a.f13734a.startActivity(intent);
        return true;
    }
}
