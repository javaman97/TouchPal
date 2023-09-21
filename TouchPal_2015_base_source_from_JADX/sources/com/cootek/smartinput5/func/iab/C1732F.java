package com.cootek.smartinput5.func.iab;

import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2286j;

/* renamed from: com.cootek.smartinput5.func.iab.F */
/* compiled from: IabHelper */
class C1732F implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C1746T.C1752f f5683a;

    /* renamed from: b */
    final /* synthetic */ int f5684b;

    /* renamed from: c */
    final /* synthetic */ C1730E f5685c;

    C1732F(C1730E e, C1746T.C1752f fVar, int i) {
        this.f5685c = e;
        this.f5683a = fVar;
        this.f5684b = i;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C2286j jVar;
        int i;
        String str;
        C1779g.m8174b(p);
        if (p != null) {
            jVar = (C2286j) p;
        } else {
            jVar = null;
        }
        if (jVar != null && jVar.f9746O == 200 && jVar.f9748Q == 0) {
            if (jVar == null || jVar.mo7868j() == null) {
                i = -1;
                str = null;
            } else {
                i = jVar.mo7868j().mo7869a();
                str = jVar.mo7868j().mo7870b();
            }
            this.f5685c.m7983a(true, i, str, this.f5683a);
            return;
        }
        C1794k.m8259a(this.f5685c.f5673B, this.f5684b, p, this.f5683a);
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }
}
