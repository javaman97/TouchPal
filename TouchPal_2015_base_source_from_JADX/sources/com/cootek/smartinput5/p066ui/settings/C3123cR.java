package com.cootek.smartinput5.p066ui.settings;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.cR */
/* compiled from: SkinDialogWidget */
class C3123cR implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View.OnClickListener f14136a;

    /* renamed from: b */
    final /* synthetic */ C3121cP f14137b;

    C3123cR(C3121cP cPVar, View.OnClickListener onClickListener) {
        this.f14137b = cPVar;
        this.f14136a = onClickListener;
    }

    public void onClick(View view) {
        if (this.f14136a != null) {
            this.f14136a.onClick(view);
        }
        this.f14137b.f14132b.dismiss();
    }
}
