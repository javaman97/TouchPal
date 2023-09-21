package com.cootek.smartinput5.net.login;

import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.net.login.f */
/* compiled from: FindPasswordActivity */
class C2333f implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ long f10294a;

    /* renamed from: b */
    final /* synthetic */ FindPasswordActivity f10295b;

    C2333f(FindPasswordActivity findPasswordActivity, long j) {
        this.f10295b = findPasswordActivity;
        this.f10294a = j;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (p.f9746O == 200 && p.f9748Q == 0) {
            this.f10295b.m10618b();
            C1246d.m6010a(this.f10295b.f10193b).mo4591a("LOGIN/FIND_PWD", C1246d.f3946r, C1246d.f3933e);
            C1246d.m6010a(this.f10295b.f10193b).mo4589a("LOGIN/FIND_PWD_TIME", System.currentTimeMillis() - this.f10294a, C1246d.f3933e);
            return;
        }
        this.f10295b.m10612a(16777216 | p.f9748Q);
        C1246d.m6010a(this.f10295b.f10193b).mo4591a("LOGIN/FIND_PWD", "FAILED_" + p.f9748Q, C1246d.f3933e);
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        this.f10295b.m10612a(1);
    }
}
