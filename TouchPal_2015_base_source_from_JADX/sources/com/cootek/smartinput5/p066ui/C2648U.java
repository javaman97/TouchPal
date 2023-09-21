package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.p066ui.C2629P;

/* renamed from: com.cootek.smartinput5.ui.U */
/* compiled from: ExplicitCloudPopup */
class C2648U implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2629P f11864a;

    /* renamed from: b */
    final /* synthetic */ int f11865b;

    /* renamed from: c */
    final /* synthetic */ C2629P.C2630a f11866c;

    C2648U(C2629P.C2630a aVar, C2629P p, int i) {
        this.f11866c = aVar;
        this.f11864a = p;
        this.f11865b = i;
    }

    public void onClick(View view) {
        C2629P.this.dismiss();
        Engine.getInstance().updateInputOp(C1712h.f5575A);
        Engine.getInstance().fireCloudCandidateOperation(C2629P.this.f11487g - this.f11865b, Engine.getInstance().getWidgetManager().mo9597B().mo8877f());
        Engine.getInstance().processEvent();
    }
}
