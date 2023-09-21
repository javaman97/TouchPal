package com.cootek.smartinput5.teaching;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.FunctionBar;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;

/* renamed from: com.cootek.smartinput5.teaching.b */
/* compiled from: TeachingTipBase */
class C2582b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2557a f11074a;

    C2582b(C2557a aVar) {
        this.f11074a = aVar;
    }

    public void run() {
        if (!this.f11074a.f10980n) {
            SoftKeyboardView unused = this.f11074a.f10972f = Engine.getInstance().getWidgetManager().mo9648g();
            FunctionBar unused2 = this.f11074a.f10973g = Engine.getInstance().getWidgetManager().mo9650h();
            if (this.f11074a.f10972f == null || this.f11074a.f10973g == null) {
                C1368X.m6320c().mo5851x().mo8421a(false);
                return;
            }
            this.f11074a.m11383z();
            this.f11074a.m11369A();
            this.f11074a.mo8342h();
        }
    }
}
