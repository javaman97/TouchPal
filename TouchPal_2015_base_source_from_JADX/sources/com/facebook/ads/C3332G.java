package com.facebook.ads;

import com.facebook.ads.C3509x;
import com.facebook.ads.internal.C3393c;
import com.facebook.ads.internal.C3468r;
import com.facebook.ads.internal.adapters.C3351A;
import com.facebook.ads.internal.p077h.C3446m;
import com.facebook.ads.internal.p077h.C3447n;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.facebook.ads.G */
class C3332G implements C3468r.C3469a {

    /* renamed from: a */
    final /* synthetic */ EnumSet f14601a;

    /* renamed from: b */
    final /* synthetic */ C3330F f14602b;

    C3332G(C3330F f, EnumSet enumSet) {
        this.f14602b = f;
        this.f14601a = enumSet;
    }

    /* renamed from: a */
    public void mo10549a(C3393c cVar) {
        if (this.f14602b.f14598g != null) {
            this.f14602b.f14598g.mo7018a(cVar.mo10679b());
        }
    }

    /* renamed from: a */
    public void mo10550a(List<C3351A> list) {
        C3509x[] xVarArr = new C3509x[list.size()];
        int[] iArr = {0};
        for (int i = 0; i < list.size(); i++) {
            C3351A a = list.get(i);
            ArrayList arrayList = new ArrayList(2);
            if (this.f14601a.contains(C3509x.C3511b.ICON) && a.mo10588d() != null) {
                arrayList.add(a.mo10588d().mo10878a());
            }
            if (this.f14601a.contains(C3509x.C3511b.IMAGE) && a.mo10589e() != null) {
                arrayList.add(a.mo10589e().mo10878a());
            }
            C3447n.m15090a(this.f14602b.f14593b, (List<String>) arrayList, (C3446m) new C3333H(this, xVarArr, i, list, iArr));
        }
    }
}
