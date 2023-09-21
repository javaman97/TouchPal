package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.p066ui.C2629P;

/* renamed from: com.cootek.smartinput5.ui.S */
/* compiled from: ExplicitCloudPopup */
class C2633S implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2629P f11507a;

    /* renamed from: b */
    final /* synthetic */ C2629P.C2630a f11508b;

    C2633S(C2629P.C2630a aVar, C2629P p) {
        this.f11508b = aVar;
        this.f11507a = p;
    }

    public void onClick(View view) {
        C2629P.this.dismiss();
        C2629P.this.f11485e.performClick();
    }
}
