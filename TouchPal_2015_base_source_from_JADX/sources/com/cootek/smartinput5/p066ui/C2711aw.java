package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.presentation.sdk.PresentationManager;

/* renamed from: com.cootek.smartinput5.ui.aw */
/* compiled from: FunctionBar */
class C2711aw implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FunctionBar f12109a;

    C2711aw(FunctionBar functionBar) {
        this.f12109a = functionBar;
    }

    public void onClick(View view) {
        C0904g.m4916a().mo3411c();
        this.f12109a.f11265t.setVisibility(8);
        this.f12109a.f11264s.setVisibility(0);
        this.f12109a.f11257l.setVisibility(0);
        this.f12109a.m11665f(true);
        PresentationManager.cleaned(this.f12109a.f11254S);
    }
}
