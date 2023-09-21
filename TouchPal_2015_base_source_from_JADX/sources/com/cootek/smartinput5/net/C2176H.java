package com.cootek.smartinput5.net;

import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.net.H */
/* compiled from: LBSManager */
class C2176H implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2174G f9216a;

    C2176H(C2174G g) {
        this.f9216a = g;
    }

    public void run() {
        if (C1368X.m6324d()) {
            if (C2188Q.m9853a().mo7686f()) {
                this.f9216a.mo7629d();
            } else if (C2174G.m9760a(this.f9216a) < 5) {
                this.f9216a.f9206M.postDelayed(this, 600000);
            }
        }
    }
}
