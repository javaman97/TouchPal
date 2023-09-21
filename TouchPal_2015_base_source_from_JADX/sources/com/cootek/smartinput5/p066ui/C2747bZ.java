package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.p066ui.C2806cb;

/* renamed from: com.cootek.smartinput5.ui.bZ */
/* compiled from: SoftFilter */
class C2747bZ implements C2806cb.C2807a {

    /* renamed from: a */
    final /* synthetic */ SoftFilter f12256a;

    C2747bZ(SoftFilter softFilter) {
        this.f12256a = softFilter;
    }

    /* renamed from: a */
    public void mo8670a(int i) {
        Engine.getInstance().updateInputOp(C1712h.f5597s);
        Engine.getInstance().fireSelectFilterOperation(this.f12256a.mFilterIndex);
        Engine.getInstance().processEvent();
    }
}
