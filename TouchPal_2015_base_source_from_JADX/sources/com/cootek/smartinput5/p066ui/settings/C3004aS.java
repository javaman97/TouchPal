package com.cootek.smartinput5.p066ui.settings;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.aS */
/* compiled from: JoinBetaActivity */
class C3004aS implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f13832a;

    /* renamed from: b */
    final /* synthetic */ String f13833b;

    /* renamed from: c */
    final /* synthetic */ JoinBetaActivity f13834c;

    C3004aS(JoinBetaActivity joinBetaActivity, String str, String str2) {
        this.f13834c = joinBetaActivity;
        this.f13832a = str;
        this.f13833b = str2;
    }

    public void onClick(View view) {
        this.f13834c.m13794a(this.f13832a);
        this.f13834c.m13798b(this.f13833b);
    }
}
