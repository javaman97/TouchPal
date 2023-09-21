package com.cootek.smartinput5.net;

import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2254L;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.net.ak */
/* compiled from: UploadInfoChecker */
class C2224ak implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C2223aj f9389a;

    C2224ak(C2223aj ajVar) {
        this.f9389a = ajVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (p.f9746O == 200 && p.f9748Q == 0) {
            this.f9389a.f9388a.mo7752i();
        } else {
            this.f9389a.f9388a.mo6538f();
        }
        if (p.f9748Q == 1003 && C2188Q.m9853a().mo7685e()) {
            new C2373x(new C2254L()).mo8060a((C2373x.C2376b) null);
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        this.f9389a.f9388a.mo6538f();
    }
}
