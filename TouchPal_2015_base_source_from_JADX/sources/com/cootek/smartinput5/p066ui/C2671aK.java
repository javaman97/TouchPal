package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.aK */
/* compiled from: HandWriteView */
class C2671aK implements Runnable {

    /* renamed from: a */
    final /* synthetic */ HandWriteView f11992a;

    C2671aK(HandWriteView handWriteView) {
        this.f11992a = handWriteView;
    }

    public void run() {
        if (!Engine.isInitialized()) {
            try {
                this.f11992a.f11420m.dismiss();
            } catch (Exception e) {
            }
        } else if (this.f11992a.f11432y) {
            if (this.f11992a.f11426s.getWindowToken() == null) {
                this.f11992a.f11407L.removeCallbacks(this);
                this.f11992a.f11407L.postDelayed(this, 200);
            } else if (!this.f11992a.mo8631d()) {
                this.f11992a.mo8602b();
                this.f11992a.m11820b(true);
            }
        } else if (this.f11992a.mo8631d()) {
            try {
                this.f11992a.f11420m.dismiss();
            } catch (Exception e2) {
                C1017y.m5219b("HandWriteView", "dismiss warning");
                Engine.getInstance().getWidgetManager().mo9607M();
            }
        }
    }
}
