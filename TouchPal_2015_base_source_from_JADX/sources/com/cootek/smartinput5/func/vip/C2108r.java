package com.cootek.smartinput5.func.vip;

import android.view.View;
import com.cootek.smartinput5.func.vip.PurchaseVipActivity;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.func.vip.r */
/* compiled from: PurchaseVipActivity */
class C2108r implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PurchaseVipActivity.C2085b f8981a;

    C2108r(PurchaseVipActivity.C2085b bVar) {
        this.f8981a = bVar;
    }

    public void onClick(View view) {
        if (this.f8981a.f8935g != null) {
            this.f8981a.f8935g.run();
        }
        if (this.f8981a.f8934f != null && PurchaseVipActivity.this.f8912f != null) {
            PurchaseVipActivity.this.f8912f.mo4591a(C1246d.f3883cu, this.f8981a.f8934f, C1246d.f3869cg);
        }
    }
}
