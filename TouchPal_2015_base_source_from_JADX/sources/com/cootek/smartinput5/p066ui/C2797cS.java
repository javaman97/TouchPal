package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.CandidateItem;

/* renamed from: com.cootek.smartinput5.ui.cS */
/* compiled from: UserWordDialog */
class C2797cS implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CandidateItem f12429a;

    /* renamed from: b */
    final /* synthetic */ C2794cR f12430b;

    C2797cS(C2794cR cRVar, CandidateItem candidateItem) {
        this.f12430b = cRVar;
        this.f12429a = candidateItem;
    }

    public void onClick(View view) {
        this.f12430b.mo9534b_();
        this.f12429a.autoAdjustUserWordPriority();
    }
}
