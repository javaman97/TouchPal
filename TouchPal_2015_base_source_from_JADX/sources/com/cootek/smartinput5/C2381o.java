package com.cootek.smartinput5;

import android.view.View;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.o */
/* compiled from: Guide */
class C2381o implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Guide f10457a;

    C2381o(Guide guide) {
        this.f10457a = guide;
    }

    public void onClick(View view) {
        Settings.getInstance().setBoolSetting(Settings.INITIALIZED_TOUCHPAL_CLOUD_IN_GUIDE, true);
        boolean unused = this.f10457a.f2744Q = true;
        this.f10457a.m5309x();
        this.f10457a.m5262a(2, true);
    }
}
