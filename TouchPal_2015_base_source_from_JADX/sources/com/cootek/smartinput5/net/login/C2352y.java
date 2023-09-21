package com.cootek.smartinput5.net.login;

import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2300u;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.net.login.y */
/* compiled from: TLoginActivity */
class C2352y implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C2373x f10339a;

    /* renamed from: b */
    final /* synthetic */ String f10340b;

    /* renamed from: c */
    final /* synthetic */ long f10341c;

    /* renamed from: d */
    final /* synthetic */ TLoginActivity f10342d;

    C2352y(TLoginActivity tLoginActivity, C2373x xVar, String str, long j) {
        this.f10342d = tLoginActivity;
        this.f10339a = xVar;
        this.f10340b = str;
        this.f10341c = j;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        this.f10342d.m10665b((Object) this.f10339a);
        if (p.f9746O == 200 && p.f9748Q == 0) {
            this.f10342d.m10651a(((C2300u) p).mo7906j());
            C1246d.m6010a(this.f10342d.f10269b).mo4591a("LOGIN/3P_LOGIN/" + this.f10340b, C1246d.f3946r, C1246d.f3933e);
            C1246d.m6010a(this.f10342d.f10269b).mo4589a("LOGIN/3P_LOGIN/" + this.f10340b + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3952x, System.currentTimeMillis() - this.f10341c, C1246d.f3933e);
            return;
        }
        this.f10342d.m10670c(16777216 | p.f9748Q);
        C1246d.m6010a(this.f10342d.f10269b).mo4591a("LOGIN/3P_LOGIN/" + this.f10340b, "FAILED_" + p.f9748Q, C1246d.f3933e);
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        this.f10342d.m10665b((Object) this.f10339a);
    }
}
