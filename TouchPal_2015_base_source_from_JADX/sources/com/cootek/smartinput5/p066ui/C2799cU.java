package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.CandidateItem;

/* renamed from: com.cootek.smartinput5.ui.cU */
/* compiled from: UserWordDialog */
class C2799cU implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CandidateItem f12433a;

    /* renamed from: b */
    final /* synthetic */ C2794cR f12434b;

    C2799cU(C2794cR cRVar, CandidateItem candidateItem) {
        this.f12434b = cRVar;
        this.f12433a = candidateItem;
    }

    public void onClick(View view) {
        this.f12434b.mo9534b_();
        this.f12433a.deleteUserWord();
    }
}
