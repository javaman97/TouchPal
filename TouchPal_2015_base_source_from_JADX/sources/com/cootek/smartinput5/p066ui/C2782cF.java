package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.cF */
/* compiled from: SymTypesScroll */
class C2782cF extends C2811cf {

    /* renamed from: a */
    final /* synthetic */ SymTypesScroll f12380a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2782cF(SymTypesScroll symTypesScroll, String str) {
        super(str);
        this.f12380a = symTypesScroll;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7435b() {
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        this.f12532E = widgetManager.mo9651i().mo9718d() + this.f12532E;
    }
}
