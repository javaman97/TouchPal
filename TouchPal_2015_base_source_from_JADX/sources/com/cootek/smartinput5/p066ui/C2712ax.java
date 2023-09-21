package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.control.C2835M;

/* renamed from: com.cootek.smartinput5.ui.ax */
/* compiled from: HandWriteHalfView */
class C2712ax implements Runnable {

    /* renamed from: a */
    final /* synthetic */ HandWriteHalfView f12110a;

    C2712ax(HandWriteHalfView handWriteHalfView) {
        this.f12110a = handWriteHalfView;
    }

    public void run() {
        if (!Engine.isInitialized()) {
            this.f12110a.f11310m.dismiss();
        } else if (this.f12110a.f11316s) {
            if (this.f12110a.f11312o.getWindowToken() == null) {
                this.f12110a.f11302A.removeCallbacks(this);
                this.f12110a.f11302A.postDelayed(this, 200);
            } else if (!this.f12110a.m11757g() && !this.f12110a.mo8604d()) {
                this.f12110a.mo8602b();
                try {
                    this.f12110a.f11310m.showAtLocation(this.f12110a.f11312o, 80, 0, C2835M.m13017a(this.f12110a.f11312o));
                } catch (RuntimeException e) {
                }
            }
        } else if (this.f12110a.mo8604d()) {
            try {
                this.f12110a.f11310m.dismiss();
            } catch (Exception e2) {
                C1017y.m5219b("HandWriteHalfView", "dismiss warning");
                Engine.getInstance().getWidgetManager().mo9607M();
            }
        }
    }
}
