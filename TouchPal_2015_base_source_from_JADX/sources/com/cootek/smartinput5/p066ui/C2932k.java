package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.k */
/* compiled from: CandidateBar */
class C2932k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f13290a;

    /* renamed from: b */
    final /* synthetic */ CandidateBar f13291b;

    C2932k(CandidateBar candidateBar, String str) {
        this.f13291b = candidateBar;
        this.f13290a = str;
    }

    public void onClick(View view) {
        Settings.getInstance().setBoolSetting(52, false, 13, this.f13290a, (Config) null, true);
    }
}
