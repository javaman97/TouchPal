package com.cootek.smartinput5.net.login;

import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2300u;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.net.login.z */
/* compiled from: TLoginActivity */
class C2353z implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C2373x f10343a;

    /* renamed from: b */
    final /* synthetic */ long f10344b;

    /* renamed from: c */
    final /* synthetic */ TLoginActivity f10345c;

    C2353z(TLoginActivity tLoginActivity, C2373x xVar, long j) {
        this.f10345c = tLoginActivity;
        this.f10343a = xVar;
        this.f10344b = j;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        this.f10345c.m10665b((Object) this.f10343a);
        if (p.f9746O == 200 && p.f9748Q == 0) {
            this.f10345c.m10651a(((C2300u) p).mo7906j());
            C1246d.m6010a(this.f10345c.f10269b).mo4591a("LOGIN/EMAIL_LOGIN", C1246d.f3946r, C1246d.f3933e);
            C1246d.m6010a(this.f10345c.f10269b).mo4589a("LOGIN/EMAIL_LOGIN_TIME", System.currentTimeMillis() - this.f10344b, C1246d.f3933e);
            return;
        }
        this.f10345c.m10670c(16777216 | p.f9748Q);
        C1246d.m6010a(this.f10345c.f10269b).mo4591a("LOGIN/EMAIL_LOGIN", "FAILED_" + p.f9748Q, C1246d.f3933e);
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        this.f10345c.m10665b((Object) this.f10343a);
    }
}
