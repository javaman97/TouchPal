package com.cootek.smartinput5.p066ui;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.cX */
/* compiled from: UserWordDialog */
class C2802cX implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2794cR f12438a;

    C2802cX(C2794cR cRVar) {
        this.f12438a = cRVar;
    }

    public void onClick(View view) {
        if (view.getTag() != null && this.f12438a.m12732k()) {
            this.f12438a.mo9534b_();
            this.f12438a.m12724a((Long) view.getTag());
        }
    }
}
