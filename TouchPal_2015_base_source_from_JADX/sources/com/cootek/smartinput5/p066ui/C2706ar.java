package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.ui.ar */
/* compiled from: FunctionBar */
class C2706ar implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FunctionBar f12102a;

    C2706ar(FunctionBar functionBar) {
        this.f12102a = functionBar;
    }

    public void onClick(View view) {
        C0904g.m4916a().mo3411c();
        if (Settings.getInstance().getBoolSetting(Settings.ADVANCED_VIBRATION)) {
            C1368X.m6320c().mo5852y().mo6379a(false);
        }
        this.f12102a.m11645A();
    }
}
