package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.TopPageView;

/* renamed from: com.cootek.smartinput5.ui.aj */
/* compiled from: FilterBarHW */
class C2698aj implements TopPageView.C2640a {

    /* renamed from: a */
    final /* synthetic */ FilterBarHW f12080a;

    C2698aj(FilterBarHW filterBarHW) {
        this.f12080a = filterBarHW;
    }

    /* renamed from: a */
    public void mo8801a(int i) {
        Engine.getInstance().fireSelectFilterOperation(i);
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
