package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.cM */
/* compiled from: TopScrollView */
class C2789cM implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TopScrollView f12396a;

    C2789cM(TopScrollView topScrollView) {
        this.f12396a = topScrollView;
    }

    public void onClick(View view) {
        Settings.getInstance().setBoolSetting(Settings.FORBID_SIMPLE_CANDIDATE_STYLE, true);
        if (this.f12396a.f11815q != null) {
            this.f12396a.f11815q.mo8649b();
        }
        Engine.getInstance().getIms().requestHideSelf(0);
        this.f12396a.f11771aM.postDelayed(new C2790cN(this), 100);
    }
}
