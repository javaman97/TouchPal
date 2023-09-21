package com.cootek.smartinput5.func.iab;

import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2250J;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.iab.L */
/* compiled from: IabHelper */
class C1738L implements C1746T.C1750d {

    /* renamed from: a */
    final /* synthetic */ int f5699a;

    /* renamed from: b */
    final /* synthetic */ C1730E f5700b;

    C1738L(C1730E e, int i) {
        this.f5700b = e;
        this.f5699a = i;
    }

    /* renamed from: a */
    public void mo5743a(int i) {
        ArrayList a = this.f5700b.m7956a((ArrayList<C1754V>) this.f5700b.m7990b(this.f5699a));
        if (a != null && a.size() > 0) {
            this.f5700b.m7980a((ArrayList<C2250J.C2251a>) a, (C2373x.C2376b) new C1739M(this));
        }
    }
}
