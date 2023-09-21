package com.cootek.smartinput5.func.vip;

import android.content.Context;
import android.content.DialogInterface;
import com.cootek.smartinput5.func.iab.C1789h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.vip.c */
/* compiled from: PurchaseVipActivity */
class C2093c implements C1789h.C1790a {

    /* renamed from: a */
    final /* synthetic */ PurchaseVipActivity f8963a;

    C2093c(PurchaseVipActivity purchaseVipActivity) {
        this.f8963a = purchaseVipActivity;
    }

    /* renamed from: a */
    public String mo6656a() {
        return C1974m.m9063a((Context) this.f8963a, (int) R.string.purchase_vip_success_title);
    }

    /* renamed from: c */
    public String mo6658c() {
        return C1974m.m9063a(this.f8963a.getApplicationContext(), 17039370);
    }

    /* renamed from: f */
    public DialogInterface.OnClickListener mo6661f() {
        return new C2094d(this);
    }

    /* renamed from: e */
    public DialogInterface.OnDismissListener mo6660e() {
        return new C2095e(this);
    }

    /* renamed from: d */
    public String mo6659d() {
        return null;
    }

    /* renamed from: g */
    public DialogInterface.OnClickListener mo6662g() {
        return null;
    }

    /* renamed from: b */
    public String mo6657b() {
        return C1974m.m9063a((Context) this.f8963a, (int) R.string.purchase_vip_success_msg);
    }
}
