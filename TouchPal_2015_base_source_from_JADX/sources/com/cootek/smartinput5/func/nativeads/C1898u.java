package com.cootek.smartinput5.func.nativeads;

import com.cootek.smartinput5.func.nativeads.C1896t;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2294q;

/* renamed from: com.cootek.smartinput5.func.nativeads.u */
/* compiled from: NativeAdsManager */
class C1898u implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C1896t.C1897a f6352a;

    /* renamed from: b */
    final /* synthetic */ C1896t f6353b;

    C1898u(C1896t tVar, C1896t.C1897a aVar) {
        this.f6353b = tVar;
        this.f6352a = aVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (p.f9746O == 200) {
            C1900w j = ((C2294q) p).mo7898j();
            if (j != null) {
                if (this.f6352a != null) {
                    this.f6352a.mo7030a(j);
                }
            } else if (this.f6352a != null) {
                this.f6352a.mo7031a(((C2294q) p).mo7899m());
            }
        } else if (this.f6352a != null) {
            this.f6352a.mo7031a(((C2294q) p).mo7899m());
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        if (this.f6352a != null) {
            this.f6352a.mo7031a(((C2294q) p).mo7899m());
        }
    }
}
