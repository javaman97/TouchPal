package com.cootek.smartinput5.func.skin;

import android.view.View;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.func.skin.j */
/* compiled from: SponsorThemeActivity */
class C1996j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SponsorThemeActivity f6840a;

    C1996j(SponsorThemeActivity sponsorThemeActivity) {
        this.f6840a = sponsorThemeActivity;
    }

    public void onClick(View view) {
        Settings.getInstance().setStringSetting(80, this.f6840a.f6819h);
        this.f6840a.m9162j();
        this.f6840a.f6827p.sendEmptyMessage(260);
        this.f6840a.f6827p.removeMessages(Settings.USER_DIC_BASE_VERSION);
        this.f6840a.f6827p.sendEmptyMessageDelayed(Settings.USER_DIC_BASE_VERSION, 1500);
    }
}
