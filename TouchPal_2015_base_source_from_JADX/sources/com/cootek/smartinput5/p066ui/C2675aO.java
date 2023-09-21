package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.p066ui.TopPageView;

/* renamed from: com.cootek.smartinput5.ui.aO */
/* compiled from: HardSymbolCandidateBar */
class C2675aO implements TopPageView.C2640a {

    /* renamed from: a */
    final /* synthetic */ HardSymbolCandidateBar f12008a;

    C2675aO(HardSymbolCandidateBar hardSymbolCandidateBar) {
        this.f12008a = hardSymbolCandidateBar;
    }

    /* renamed from: a */
    public void mo8801a(int i) {
        Engine.getInstance().fireKeyOperation(HardSymbolTypeBar.m11849a("sk_symbol_" + Settings.getInstance().getIntSetting(Settings.HARD_SYMBOL_CURRENT_TAB) + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR).get(this.f12008a.f11435a + i).intValue(), 0);
        Engine.getInstance().processEvent();
    }

    /* renamed from: b */
    public void mo8803b(int i) {
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
