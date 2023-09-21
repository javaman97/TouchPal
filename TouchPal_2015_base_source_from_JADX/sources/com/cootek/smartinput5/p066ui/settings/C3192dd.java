package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.learnmanager.SmsSettingActivity;
import com.cootek.smartinput5.p066ui.settings.CustomCheckBoxPreference;

/* renamed from: com.cootek.smartinput5.ui.settings.dd */
/* compiled from: TouchPalCloudActivity */
class C3192dd implements CustomCheckBoxPreference.C2953b {

    /* renamed from: a */
    final /* synthetic */ TouchPalCloudActivity f14248a;

    C3192dd(TouchPalCloudActivity touchPalCloudActivity) {
        this.f14248a = touchPalCloudActivity;
    }

    /* renamed from: a */
    public void mo9789a(CustomCheckBoxPreference customCheckBoxPreference) {
        Intent intent = new Intent();
        intent.setClass(this.f14248a.f13734a, SmsSettingActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        this.f14248a.f13734a.startActivity(intent);
    }
}
