package com.cootek.smartinput5.func.iab;

import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2250J;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.func.iab.G */
/* compiled from: IabHelper */
class C1733G implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ boolean f5686a;

    /* renamed from: b */
    final /* synthetic */ C2250J.C2251a f5687b;

    /* renamed from: c */
    final /* synthetic */ C1730E f5688c;

    C1733G(C1730E e, boolean z, C2250J.C2251a aVar) {
        this.f5688c = e;
        this.f5686a = z;
        this.f5687b = aVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (this.f5686a) {
            this.f5688c.m7975a(p, this.f5687b);
            C1779g.m8166a(p);
        }
        if (p != null && p.f9746O == 200 && p.f9748Q == 0) {
            this.f5688c.m7998b((C2250J) p);
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }
}
