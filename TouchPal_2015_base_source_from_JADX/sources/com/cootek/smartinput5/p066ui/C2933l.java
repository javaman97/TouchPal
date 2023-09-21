package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.TopPageView;

/* renamed from: com.cootek.smartinput5.ui.l */
/* compiled from: CandidateBarHW */
class C2933l implements TopPageView.C2640a {

    /* renamed from: a */
    final /* synthetic */ CandidateBarHW f13292a;

    C2933l(CandidateBarHW candidateBarHW) {
        this.f13292a = candidateBarHW;
    }

    /* renamed from: a */
    public void mo8801a(int i) {
        Engine.getInstance().fireSelectCandidateOperation(this.f13292a.f11176c + i);
        Engine.getInstance().processEvent();
    }

    /* renamed from: b */
    public void mo8803b(int i) {
    }

    /* renamed from: a */
    public void mo8800a() {
    }

    /* renamed from: b */
    public void mo8802b() {
    }
}
