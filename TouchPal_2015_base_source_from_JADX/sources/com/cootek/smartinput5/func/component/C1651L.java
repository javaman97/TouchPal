package com.cootek.smartinput5.func.component;

import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2241C;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.func.component.L */
/* compiled from: HotWordIndexer */
class C1651L implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C1648J f5374a;

    C1651L(C1648J j) {
        this.f5374a = j;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C2241C c = (C2241C) p;
        if (c.f9746O == 200 || c.f9746O == 304) {
            String a = this.f5374a.m7535a(c.mo7777j());
            this.f5374a.m7542a(a);
            String unused = this.f5374a.f5370x = a;
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }
}
