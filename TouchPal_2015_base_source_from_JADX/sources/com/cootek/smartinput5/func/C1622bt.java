package com.cootek.smartinput5.func;

import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.func.bt */
/* compiled from: TAccountManager */
class C1622bt implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C2373x.C2376b f5210a;

    /* renamed from: b */
    final /* synthetic */ C1617br f5211b;

    C1622bt(C1617br brVar, C2373x.C2376b bVar) {
        this.f5211b = brVar;
        this.f5210a = bVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (p.f9746O == 200) {
            this.f5211b.m7373m();
        }
        if (this.f5210a != null) {
            this.f5210a.mo4601a(p);
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        if (this.f5210a != null) {
            this.f5210a.mo4602b(p);
        }
    }
}
