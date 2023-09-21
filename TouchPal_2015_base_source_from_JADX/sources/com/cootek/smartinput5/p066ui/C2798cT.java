package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.CandidateItem;

/* renamed from: com.cootek.smartinput5.ui.cT */
/* compiled from: UserWordDialog */
class C2798cT implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CandidateItem f12431a;

    /* renamed from: b */
    final /* synthetic */ C2794cR f12432b;

    C2798cT(C2794cR cRVar, CandidateItem candidateItem) {
        this.f12432b = cRVar;
        this.f12431a = candidateItem;
    }

    public void onClick(View view) {
        this.f12432b.mo9534b_();
        this.f12431a.resetUserWordPriority();
    }
}
