package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.presentation.sdk.PresentationManager;

/* renamed from: com.cootek.smartinput5.ui.au */
/* compiled from: FunctionBar */
class C2709au implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f12106a;

    /* renamed from: b */
    final /* synthetic */ FunctionBar f12107b;

    C2709au(FunctionBar functionBar, String str) {
        this.f12107b = functionBar;
        this.f12106a = str;
    }

    public void onClick(View view) {
        C0904g.m4916a().mo3411c();
        this.f12107b.f11265t.setVisibility(8);
        this.f12107b.f11264s.setVisibility(0);
        this.f12107b.f11257l.setVisibility(0);
        this.f12107b.m11665f(true);
        PresentationManager.cleaned(this.f12106a);
    }
}
