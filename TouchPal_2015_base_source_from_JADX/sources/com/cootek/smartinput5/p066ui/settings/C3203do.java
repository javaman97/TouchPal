package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.settings.do */
/* compiled from: TouchPalCloudActivity */
class C3203do implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14261a;

    C3203do(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14261a = touchPalCloudActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        Intent intent = new Intent();
        intent.setClass(this.f14261a.f13734a, BaiduAuthActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        this.f14261a.f13734a.startActivity(intent);
        return true;
    }
}
