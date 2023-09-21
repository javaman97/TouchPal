package com.cootek.smartinput5.net.login;

import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2248H;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.net.login.B */
/* compiled from: TLoginActivity */
class C2316B implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C2373x f10181a;

    /* renamed from: b */
    final /* synthetic */ long f10182b;

    /* renamed from: c */
    final /* synthetic */ TLoginActivity f10183c;

    C2316B(TLoginActivity tLoginActivity, C2373x xVar, long j) {
        this.f10183c = tLoginActivity;
        this.f10181a = xVar;
        this.f10182b = j;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        this.f10183c.m10665b((Object) this.f10181a);
        if (p.f9746O == 200 && p.f9748Q == 0) {
            this.f10183c.m10651a(((C2248H) p).mo7812j());
            C1246d.m6010a(this.f10183c.f10269b).mo4591a("LOGIN/REGISTER", C1246d.f3946r, C1246d.f3933e);
            C1246d.m6010a(this.f10183c.f10269b).mo4589a("LOGIN/REGISTER_TIME", System.currentTimeMillis() - this.f10182b, C1246d.f3933e);
            return;
        }
        this.f10183c.m10670c(16777216 | p.f9748Q);
        C1246d.m6010a(this.f10183c.f10269b).mo4591a("LOGIN/REGISTER", "FAILED_" + p.f9748Q, C1246d.f3933e);
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        this.f10183c.m10665b((Object) this.f10181a);
    }
}
