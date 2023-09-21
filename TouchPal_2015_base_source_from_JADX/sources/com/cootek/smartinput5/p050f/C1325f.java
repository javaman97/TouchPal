package com.cootek.smartinput5.p050f;

import android.view.View;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.f.f */
/* compiled from: WizardPopupWindow */
class C1325f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1319a f4050a;

    C1325f(C1319a aVar) {
        this.f4050a = aVar;
    }

    public void onClick(View view) {
        Settings.getInstance().setBoolSetting(Settings.V4_USRDICT_IMPORTED, true);
        this.f4050a.m6081B();
        this.f4050a.mo5545c();
    }
}
