package com.cootek.smartinput5.func.vip;

import android.content.DialogInterface;
import com.cootek.smartinput5.func.iab.C1789h;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.vip.C */
/* compiled from: VipInfoActivity */
class C2069C implements C1789h.C1790a {

    /* renamed from: a */
    final /* synthetic */ VipInfoActivity f8880a;

    C2069C(VipInfoActivity vipInfoActivity) {
        this.f8880a = vipInfoActivity;
    }

    /* renamed from: a */
    public String mo6656a() {
        return null;
    }

    /* renamed from: c */
    public String mo6658c() {
        return this.f8880a.m9577b((int) R.string.ok);
    }

    /* renamed from: f */
    public DialogInterface.OnClickListener mo6661f() {
        return new C2070D(this);
    }

    /* renamed from: e */
    public DialogInterface.OnDismissListener mo6660e() {
        return null;
    }

    /* renamed from: d */
    public String mo6659d() {
        return this.f8880a.m9577b((int) R.string.cancel);
    }

    /* renamed from: g */
    public DialogInterface.OnClickListener mo6662g() {
        return null;
    }

    /* renamed from: b */
    public String mo6657b() {
        return this.f8880a.m9577b((int) R.string.logout_confirm_msg);
    }
}
