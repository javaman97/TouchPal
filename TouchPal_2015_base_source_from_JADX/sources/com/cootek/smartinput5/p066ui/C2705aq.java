package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.yahoosearch.C2137q;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.aq */
/* compiled from: FunctionBar */
class C2705aq implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FunctionBar f12101a;

    C2705aq(FunctionBar functionBar) {
        this.f12101a = functionBar;
    }

    public void onClick(View view) {
        if (Settings.getInstance().getBoolSetting(Settings.ADVANCED_VIBRATION)) {
            C1368X.m6320c().mo5852y().mo6379a(false);
        }
        this.f12101a.mo8542g();
        C2137q.m9700a(C1368X.m6313b()).mo7538a("");
        C1246d.m6010a(C1368X.m6313b()).mo4591a(C1246d.f3928dv, C1246d.f3932dz, C1246d.f3923dq);
    }
}
