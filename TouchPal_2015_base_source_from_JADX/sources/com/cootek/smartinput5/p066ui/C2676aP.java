package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.TopPageView;

/* renamed from: com.cootek.smartinput5.ui.aP */
/* compiled from: HardSymbolTypeBar */
class C2676aP implements TopPageView.C2640a {

    /* renamed from: a */
    final /* synthetic */ HardSymbolTypeBar f12009a;

    C2676aP(HardSymbolTypeBar hardSymbolTypeBar) {
        this.f12009a = hardSymbolTypeBar;
    }

    /* renamed from: a */
    public void mo8801a(int i) {
        Settings.getInstance().setIntSetting(Settings.HARD_SYMBOL_CURRENT_TAB, this.f12009a.f11444a + i);
        Engine.getInstance().fireKeyOperation(((Integer) this.f12009a.f11446q.get(this.f12009a.f11444a + i)).intValue(), 0);
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
