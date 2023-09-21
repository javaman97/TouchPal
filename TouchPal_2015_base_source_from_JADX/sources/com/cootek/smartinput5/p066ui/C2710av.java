package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.presentation.sdk.PresentationManager;

/* renamed from: com.cootek.smartinput5.ui.av */
/* compiled from: FunctionBar */
class C2710av implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FunctionBar f12108a;

    C2710av(FunctionBar functionBar) {
        this.f12108a = functionBar;
    }

    public void onClick(View view) {
        C0904g.m4916a().mo3411c();
        PresentationManager.clicked(this.f12108a.f11254S);
    }
}
