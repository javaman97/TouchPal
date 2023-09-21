package com.cootek.smartinput5;

import android.view.View;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.settings.OnlineShopActivity;

/* renamed from: com.cootek.smartinput5.v */
/* compiled from: GuideFinishedActivity */
class C3281v implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ GuideFinishedActivity f14405a;

    C3281v(GuideFinishedActivity guideFinishedActivity) {
        this.f14405a = guideFinishedActivity;
    }

    public void onClick(View view) {
        Settings.getInstance().writeBack();
        C1368X.m6320c().mo5825K().launchShop(1, OnlineShopActivity.f13558e);
    }
}
