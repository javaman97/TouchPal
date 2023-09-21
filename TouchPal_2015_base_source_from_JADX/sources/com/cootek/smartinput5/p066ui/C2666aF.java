package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.aF */
/* compiled from: HandWriteMaskView */
class C2666aF implements Runnable {

    /* renamed from: a */
    final /* synthetic */ HandWriteMaskView f11983a;

    C2666aF(HandWriteMaskView handWriteMaskView) {
        this.f11983a = handWriteMaskView;
    }

    public void run() {
        if (!Engine.isInitialized()) {
            this.f11983a.m11803l();
        } else if (this.f11983a.f11376q) {
            if (this.f11983a.f11372m.getWindowToken() == null) {
                this.f11983a.f11368G.removeCallbacks(this);
                this.f11983a.f11368G.postDelayed(this, 200);
            } else if (!this.f11983a.m11800j() && !this.f11983a.mo8623g()) {
                this.f11983a.mo8602b();
                try {
                    this.f11983a.f11370k.showAtLocation(this.f11983a.f11372m, 3, this.f11983a.f11364B.mo9254l(), 0);
                } catch (RuntimeException e) {
                }
                this.f11983a.m11802k();
            }
        } else if (this.f11983a.mo8623g()) {
            this.f11983a.m11803l();
        }
    }
}
