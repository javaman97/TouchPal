package com.cootek.smartinput5.func.vip;

import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.iab.C1769ah;
import com.cootek.smartinput5.func.iab.C1778f;
import com.cootek.smartinput5.net.cmd.C2245F;

/* renamed from: com.cootek.smartinput5.func.vip.f */
/* compiled from: PurchaseVipActivity */
class C2096f implements C1769ah.C1771b {

    /* renamed from: a */
    final /* synthetic */ PurchaseVipActivity f8966a;

    C2096f(PurchaseVipActivity purchaseVipActivity) {
        this.f8966a = purchaseVipActivity;
    }

    /* renamed from: a */
    public void mo6765a(int i, int i2, C2245F.C2246a aVar) {
        if (aVar != null) {
            String unused = this.f8966a.f8921v = aVar.mo7797j();
        }
        if (aVar != null && C1730E.m8004c()) {
            C1730E.m8005d().mo6678a(aVar.mo7805r() ? C1778f.f5819am : C1778f.f5818al, aVar.mo7788a());
        }
        this.f8966a.m9508b(2);
    }
}
