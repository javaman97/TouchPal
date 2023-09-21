package com.cootek.smartinput5.net;

import com.cootek.smartinput5.net.C2171E;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2298s;

/* renamed from: com.cootek.smartinput5.net.F */
/* compiled from: IpLocation */
class C2173F implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C2171E.C2172a f9167a;

    /* renamed from: b */
    final /* synthetic */ C2171E f9168b;

    C2173F(C2171E e, C2171E.C2172a aVar) {
        this.f9168b = e;
        this.f9167a = aVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (this.f9167a != null) {
            C2298s sVar = (C2298s) p;
            if (p.f9746O == 200) {
                this.f9167a.mo7622a(sVar.f10099e, sVar.f10100f, sVar.f10101g);
            } else {
                this.f9167a.mo7621a();
            }
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        if (this.f9167a != null) {
            this.f9167a.mo7621a();
        }
    }
}
