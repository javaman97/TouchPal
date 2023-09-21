package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.TopPageView;

/* renamed from: com.cootek.smartinput5.ui.bp */
/* compiled from: NumberCandidateBar */
class C2765bp implements TopPageView.C2640a {

    /* renamed from: a */
    final /* synthetic */ NumberCandidateBar f12334a;

    C2765bp(NumberCandidateBar numberCandidateBar) {
        this.f12334a = numberCandidateBar;
    }

    /* renamed from: a */
    public void mo8801a(int i) {
        Engine.getInstance().fireSelectCandidateOperation(i);
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
