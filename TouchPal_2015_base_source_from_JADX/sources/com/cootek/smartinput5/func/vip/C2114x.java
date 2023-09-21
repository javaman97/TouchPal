package com.cootek.smartinput5.func.vip;

import android.content.Context;
import android.content.DialogInterface;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.func.vip.x */
/* compiled from: VipInfoActivity */
class C2114x implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ VipInfoActivity f8987a;

    C2114x(VipInfoActivity vipInfoActivity) {
        this.f8987a = vipInfoActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f8987a.f8953a != null) {
            this.f8987a.f8953a.mo4591a(C1246d.f3875cm, C1246d.f3878cp, C1246d.f3867ce);
        }
        if (!C1584bI.m7141a((Context) this.f8987a, (Runnable) null, false)) {
            this.f8987a.m9608t();
        }
    }
}
