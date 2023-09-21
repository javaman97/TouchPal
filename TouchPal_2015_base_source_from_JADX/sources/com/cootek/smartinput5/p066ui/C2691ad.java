package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.p054d.C1712h;

/* renamed from: com.cootek.smartinput5.ui.ad */
/* compiled from: ExplicitWidget */
class C2691ad implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2649V f12038a;

    C2691ad(C2649V v) {
        this.f12038a = v;
    }

    public void onClick(View view) {
        Engine.getInstance().updateInputOp(C1712h.f5603y);
        this.f12038a.m12246h();
        Engine.getInstance().fireCloudCandidateOperation(0, this.f12038a.f11892U);
        Engine.getInstance().processEvent();
    }
}
