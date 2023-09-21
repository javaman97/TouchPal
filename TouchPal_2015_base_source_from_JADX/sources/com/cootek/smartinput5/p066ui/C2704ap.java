package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p045a.C1056a;

/* renamed from: com.cootek.smartinput5.ui.ap */
/* compiled from: FunctionBar */
class C2704ap implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FunctionBar f12100a;

    C2704ap(FunctionBar functionBar) {
        this.f12100a = functionBar;
    }

    public void onClick(View view) {
        if (!Engine.getInstance().isInputPaused()) {
            C0904g.m4916a().mo3411c();
            C1056a.m5588a().mo4264a(C1056a.f2957R, this.f12100a.getContext());
            if (Settings.getInstance().getBoolSetting(Settings.ADVANCED_VIBRATION)) {
                C1368X.m6320c().mo5852y().mo6379a(false);
            }
            this.f12100a.mo8542g();
            Settings.getInstance().setBoolSetting(Settings.EMOJI_SHAKE_SHOWN, true);
            this.f12100a.f11259n.clearAnimation();
            Engine.getInstance().getWidgetManager().mo9618X().mo7428c(true);
            Engine.getInstance().getWidgetManager().mo9618X().mo7426b(true);
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_smiley_open"), 0);
            Engine.getInstance().processEvent();
        }
    }
}
