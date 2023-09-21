package com.cootek.smartinput5.func;

import com.cootek.smartinput5.func.component.C1645G;
import com.cootek.smartinput5.net.C2220ah;

/* renamed from: com.cootek.smartinput5.func.af */
/* compiled from: GoodsManager */
class C1430af implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f4604a;

    /* renamed from: b */
    final /* synthetic */ C1422ad f4605b;

    C1430af(C1422ad adVar, boolean z) {
        this.f4605b = adVar;
        this.f4604a = z;
    }

    public void run() {
        if (this.f4605b.f4584w == null) {
            C1645G unused = this.f4605b.f4584w = new C1645G((C2220ah.C2221a) null);
        }
        this.f4605b.f4584w.mo7751b(this.f4604a);
    }
}
