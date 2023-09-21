package com.cootek.smartinput5.p066ui.settings;

import android.support.p001v4.view.C0333F;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.cL */
/* compiled from: SkinCustomizeActivity */
class C3117cL implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SkinCustomizeActivity f14126a;

    C3117cL(SkinCustomizeActivity skinCustomizeActivity) {
        this.f14126a = skinCustomizeActivity;
    }

    public void onClick(View view) {
        int h = this.f14126a.f13682L;
        if (this.f14126a.f13682L == 0) {
            h = C0333F.f835s;
        }
        new C3013aa(this.f14126a, h, this.f14126a).show();
    }
}
