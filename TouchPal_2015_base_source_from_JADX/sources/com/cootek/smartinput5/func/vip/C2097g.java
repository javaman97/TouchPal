package com.cootek.smartinput5.func.vip;

import android.content.Context;
import android.content.DialogInterface;
import com.cootek.smartinput5.func.iab.C1789h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.vip.g */
/* compiled from: PurchaseVipActivity */
class C2097g implements C1789h.C1790a {

    /* renamed from: a */
    final /* synthetic */ PurchaseVipActivity f8967a;

    C2097g(PurchaseVipActivity purchaseVipActivity) {
        this.f8967a = purchaseVipActivity;
    }

    /* renamed from: a */
    public String mo6656a() {
        return null;
    }

    /* renamed from: c */
    public String mo6658c() {
        return C1974m.m9063a(this.f8967a.getApplicationContext(), 17039379);
    }

    /* renamed from: f */
    public DialogInterface.OnClickListener mo6661f() {
        return new C2098h(this);
    }

    /* renamed from: e */
    public DialogInterface.OnDismissListener mo6660e() {
        return null;
    }

    /* renamed from: d */
    public String mo6659d() {
        return C1974m.m9063a(this.f8967a.getApplicationContext(), 17039360);
    }

    /* renamed from: g */
    public DialogInterface.OnClickListener mo6662g() {
        return null;
    }

    /* renamed from: b */
    public String mo6657b() {
        return C1974m.m9063a((Context) this.f8967a, (int) R.string.vi_need_network);
    }
}
