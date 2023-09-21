package com.cootek.smartinput5.func.vip;

import android.view.View;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.func.vip.o */
/* compiled from: PurchaseVipActivity */
class C2105o implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PurchaseVipActivity f8978a;

    C2105o(PurchaseVipActivity purchaseVipActivity) {
        this.f8978a = purchaseVipActivity;
    }

    public void onClick(View view) {
        this.f8978a.m9536m();
        if (this.f8978a.f8912f != null) {
            this.f8978a.f8912f.mo4591a(C1246d.f3880cr, C1246d.f3881cs, C1246d.f3867ce);
        }
        C1056a.m5588a().mo4264a(C1056a.f2995z, this.f8978a);
    }
}
