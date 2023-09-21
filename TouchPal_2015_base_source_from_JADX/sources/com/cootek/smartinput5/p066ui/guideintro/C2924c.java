package com.cootek.smartinput5.p066ui.guideintro;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.guideintro.c */
/* compiled from: InputStyleSelector */
class C2924c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ InputStyleSelector f13272a;

    C2924c(InputStyleSelector inputStyleSelector) {
        this.f13272a = inputStyleSelector;
    }

    public void onClick(View view) {
        if (!C2922a.f13254a.equals(this.f13272a.f13243m) || this.f13272a.f13250t == null) {
            this.f13272a.mo9689a();
        } else {
            this.f13272a.f13250t.onClick(view);
        }
        if (this.f13272a.f13249s != null) {
            this.f13272a.f13249s.onClick(view);
        }
    }
}
