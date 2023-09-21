package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.TopPageView;

/* renamed from: com.cootek.smartinput5.ui.aM */
/* compiled from: HardCandidateBar */
class C2673aM implements TopPageView.C2640a {

    /* renamed from: a */
    final /* synthetic */ HardCandidateBar f11994a;

    C2673aM(HardCandidateBar hardCandidateBar) {
        this.f11994a = hardCandidateBar;
    }

    /* renamed from: a */
    public void mo8801a(int i) {
        Engine.getInstance().fireSelectCandidateOperation(this.f11994a.f11435a + i);
        Engine.getInstance().processEvent();
    }

    /* renamed from: b */
    public void mo8803b(int i) {
        this.f11994a.f11436b.mo9122a((CandidateItem) this.f11994a.f11689j.mo9003a(i));
    }

    /* renamed from: a */
    public void mo8800a() {
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_prev"), 0);
        Engine.getInstance().processEvent();
    }

    /* renamed from: b */
    public void mo8802b() {
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_next"), 0);
        Engine.getInstance().processEvent();
    }
}
