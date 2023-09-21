package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2794cR;

/* renamed from: com.cootek.smartinput5.ui.cW */
/* compiled from: UserWordDialog */
class C2801cW implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2794cR f12437a;

    C2801cW(C2794cR cRVar) {
        this.f12437a = cRVar;
    }

    public void onClick(View view) {
        if (view.getTag() != null) {
            this.f12437a.mo9534b_();
            C2794cR.C2795a aVar = (C2794cR.C2795a) view.getTag();
            Engine.getInstance().fireCommitOperation(aVar.f12423a + "<" + aVar.f12424b + ">");
            Engine.getInstance().processEvent();
        }
    }
}
