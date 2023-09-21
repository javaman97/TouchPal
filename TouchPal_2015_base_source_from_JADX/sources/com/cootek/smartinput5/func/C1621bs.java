package com.cootek.smartinput5.func;

import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2303x;

/* renamed from: com.cootek.smartinput5.func.bs */
/* compiled from: TAccountManager */
class C1621bs implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C1617br.C1618a f5207a;

    /* renamed from: b */
    final /* synthetic */ C1617br f5208b;

    /* renamed from: c */
    private boolean f5209c;

    C1621bs(C1617br brVar, C1617br.C1618a aVar) {
        this.f5208b = brVar;
        this.f5207a = aVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (p != null && p.f9746O == 200 && p.f9748Q == 0) {
            this.f5208b.mo6330a(((C2303x) p).mo7907j());
            this.f5209c = true;
        } else {
            this.f5209c = false;
        }
        if (this.f5207a != null) {
            this.f5207a.mo6073a(this.f5209c);
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        this.f5209c = false;
    }
}
