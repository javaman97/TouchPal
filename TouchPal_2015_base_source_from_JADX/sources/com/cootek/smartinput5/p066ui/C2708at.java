package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.presentation.sdk.PresentationManager;

/* renamed from: com.cootek.smartinput5.ui.at */
/* compiled from: FunctionBar */
class C2708at implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f12104a;

    /* renamed from: b */
    final /* synthetic */ FunctionBar f12105b;

    C2708at(FunctionBar functionBar, String str) {
        this.f12105b = functionBar;
        this.f12104a = str;
    }

    public void onClick(View view) {
        C0904g.m4916a().mo3411c();
        PresentationManager.clicked(this.f12104a);
    }
}
