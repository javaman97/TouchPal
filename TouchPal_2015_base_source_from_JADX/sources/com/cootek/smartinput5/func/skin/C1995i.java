package com.cootek.smartinput5.func.skin;

import android.content.Intent;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.settings.SkinActivity;

/* renamed from: com.cootek.smartinput5.func.skin.i */
/* compiled from: SponsorThemeActivity */
class C1995i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SponsorThemeActivity f6839a;

    C1995i(SponsorThemeActivity sponsorThemeActivity) {
        this.f6839a = sponsorThemeActivity;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setClass(this.f6839a, SkinActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.putStringArrayListExtra(SkinActivity.f13621a, C1368X.m6320c().mo5841n().mo6297s());
        this.f6839a.startActivity(intent);
        this.f6839a.finish();
    }
}
