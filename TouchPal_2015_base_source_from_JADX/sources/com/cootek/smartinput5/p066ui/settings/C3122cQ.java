package com.cootek.smartinput5.p066ui.settings;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.cQ */
/* compiled from: SkinDialogWidget */
class C3122cQ implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View.OnClickListener f14134a;

    /* renamed from: b */
    final /* synthetic */ C3121cP f14135b;

    C3122cQ(C3121cP cPVar, View.OnClickListener onClickListener) {
        this.f14135b = cPVar;
        this.f14134a = onClickListener;
    }

    public void onClick(View view) {
        if (this.f14134a != null) {
            this.f14134a.onClick(view);
        }
        this.f14135b.f14132b.dismiss();
    }
}
