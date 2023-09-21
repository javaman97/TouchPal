package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.p054d.C1712h;

/* renamed from: com.cootek.smartinput5.ui.bV */
/* compiled from: SoftCandidate */
class C2743bV implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2742bU f12241a;

    C2743bV(C2742bU bUVar) {
        this.f12241a = bUVar;
    }

    public void run() {
        Engine.getInstance().updateInputOp(C1712h.f5602x);
        Engine.getInstance().fireSelectCandidateOperation(this.f12241a.f12240a.candidateIndex);
        Engine.getInstance().postProcessEvent();
    }
}
