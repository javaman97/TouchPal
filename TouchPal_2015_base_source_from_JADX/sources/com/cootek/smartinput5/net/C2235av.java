package com.cootek.smartinput5.net;

import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2247G;
import com.cootek.smartinput5.net.cmd.C2259P;

/* renamed from: com.cootek.smartinput5.net.av */
/* compiled from: WebviewManager */
class C2235av implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C2373x.C2376b f9451a;

    /* renamed from: b */
    final /* synthetic */ C2232as f9452b;

    C2235av(C2232as asVar, C2373x.C2376b bVar) {
        this.f9452b = asVar;
        this.f9451a = bVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C2247G g = (C2247G) p;
        if (g.f9746O == 200) {
            boolean unused = this.f9452b.m10124a(g);
        } else if (g.f9746O == 304) {
            String str = this.f9452b.m10141m(g.f9600b)[2];
            String b = this.f9452b.m10137i(g.f9600b);
            if (!this.f9452b.m10137i(str).equals(b)) {
                this.f9452b.m10121a(g.f9600b, (String) null, (String) null, this.f9452b.m10136h(str) + b, (String) null);
            }
        }
        if (this.f9451a != null) {
            this.f9451a.mo4601a(p);
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        if (this.f9451a != null) {
            this.f9451a.mo4602b(p);
        }
    }
}
