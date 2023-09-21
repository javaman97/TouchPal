package com.facebook.ads;

import com.facebook.ads.internal.adapters.C3351A;
import com.facebook.ads.internal.p074e.C3400c;
import com.facebook.ads.internal.p077h.C3446m;
import java.util.List;

/* renamed from: com.facebook.ads.H */
class C3333H implements C3446m {

    /* renamed from: a */
    final /* synthetic */ C3509x[] f14603a;

    /* renamed from: b */
    final /* synthetic */ int f14604b;

    /* renamed from: c */
    final /* synthetic */ List f14605c;

    /* renamed from: d */
    final /* synthetic */ int[] f14606d;

    /* renamed from: e */
    final /* synthetic */ C3332G f14607e;

    C3333H(C3332G g, C3509x[] xVarArr, int i, List list, int[] iArr) {
        this.f14607e = g;
        this.f14603a = xVarArr;
        this.f14604b = i;
        this.f14605c = list;
        this.f14606d = iArr;
    }

    /* renamed from: a */
    public void mo10551a() {
        this.f14603a[this.f14604b] = new C3509x(this.f14607e.f14602b.f14593b, (C3351A) this.f14605c.get(this.f14604b), (C3400c) null);
        int[] iArr = this.f14606d;
        iArr[0] = iArr[0] + 1;
        if (this.f14606d[0] == this.f14605c.size()) {
            boolean unused = this.f14607e.f14602b.f14600i = true;
            this.f14607e.f14602b.f14596e.clear();
            int unused2 = this.f14607e.f14602b.f14597f = 0;
            for (C3509x xVar : this.f14603a) {
                if (xVar != null) {
                    this.f14607e.f14602b.f14596e.add(xVar);
                }
            }
            if (this.f14607e.f14602b.f14598g != null) {
                this.f14607e.f14602b.f14598g.mo7017a();
            }
        }
    }
}
