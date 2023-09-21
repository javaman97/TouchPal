package com.cootek.smartinput5.func;

import com.cootek.smartinput5.func.iab.C1746T;

/* renamed from: com.cootek.smartinput5.func.ai */
/* compiled from: GoodsManager */
class C1433ai implements C1746T.C1750d {

    /* renamed from: a */
    final /* synthetic */ int f4612a;

    /* renamed from: b */
    final /* synthetic */ String f4613b;

    /* renamed from: c */
    final /* synthetic */ boolean f4614c;

    /* renamed from: d */
    final /* synthetic */ C1422ad f4615d;

    C1433ai(C1422ad adVar, int i, String str, boolean z) {
        this.f4615d = adVar;
        this.f4612a = i;
        this.f4613b = str;
        this.f4614c = z;
    }

    /* renamed from: a */
    public void mo5743a(int i) {
        boolean unused = this.f4615d.f4580G = true;
        if (this.f4615d.f4579F) {
            this.f4615d.m6677b(this.f4612a, this.f4613b, this.f4614c);
        }
    }
}
