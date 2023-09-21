package com.cootek.smartinput5.p066ui.guideintro;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.guideintro.d */
/* compiled from: InputStyleSelector */
class C2925d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ InputStyleSelector f13273a;

    C2925d(InputStyleSelector inputStyleSelector) {
        this.f13273a = inputStyleSelector;
    }

    public void onClick(View view) {
        if (!this.f13273a.f13246p && this.f13273a.f13250t != null) {
            this.f13273a.f13250t.onClick(view);
        } else if (this.f13273a.f13234d != null) {
            this.f13273a.f13234d.performClick();
        }
    }
}
