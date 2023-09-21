package com.cootek.smartinput5.func.nativeads;

import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.func.nativeads.s */
/* compiled from: NativeAdsLoader */
class C1895s implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C1894r f6342a;

    C1895s(C1894r rVar) {
        this.f6342a = rVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (p.f9746O == 200) {
            this.f6342a.mo7014a(p);
            this.f6342a.mo7015d();
        } else if (this.f6342a.f6341c != null) {
            this.f6342a.f6341c.mo7009b();
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        if (this.f6342a.f6341c != null) {
            this.f6342a.f6341c.mo7009b();
        }
    }
}
