package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.j */
/* compiled from: CandidateBar */
class C2931j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f13288a;

    /* renamed from: b */
    final /* synthetic */ CandidateBar f13289b;

    C2931j(CandidateBar candidateBar, String str) {
        this.f13289b = candidateBar;
        this.f13288a = str;
    }

    public void onClick(View view) {
        Settings.getInstance().setBoolSetting(52, true, 13, this.f13288a, (Config) null, true);
    }
}
