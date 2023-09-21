package com.cootek.smartinput5.p066ui;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.I */
/* compiled from: CustomAlertDialog */
class C2622I implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View.OnClickListener f11452a;

    /* renamed from: b */
    final /* synthetic */ C2618H f11453b;

    C2622I(C2618H h, View.OnClickListener onClickListener) {
        this.f11453b = h;
        this.f11452a = onClickListener;
    }

    public void onClick(View view) {
        this.f11453b.f11273a.mo9534b_();
        if (this.f11452a != null) {
            this.f11452a.onClick(view);
        }
    }
}
