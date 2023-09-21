package com.cootek.smartinput5.net.login;

import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2240B;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.net.login.k */
/* compiled from: GoogleLoginWebviewActivity */
class C2338k implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ GoogleLoginWebviewActivity f10300a;

    C2338k(GoogleLoginWebviewActivity googleLoginWebviewActivity) {
        this.f10300a = googleLoginWebviewActivity;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        this.f10300a.f10213l.sendEmptyMessage(0);
        if (p != null && (p instanceof C2240B)) {
            boolean unused = this.f10300a.f10212h = false;
            this.f10300a.m10633b(((C2240B) p).mo7776j());
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        this.f10300a.f10213l.sendEmptyMessage(0);
        boolean unused = this.f10300a.f10212h = false;
        this.f10300a.m10625a();
    }
}
