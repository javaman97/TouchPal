package com.facebook.ads;

import com.facebook.ads.C3509x;
import com.facebook.ads.internal.C3389b;
import com.facebook.ads.internal.C3393c;
import com.facebook.ads.internal.adapters.C3351A;
import com.facebook.ads.internal.p077h.C3446m;
import com.facebook.ads.internal.p077h.C3447n;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.facebook.ads.y */
class C3516y extends C3389b {

    /* renamed from: a */
    final /* synthetic */ EnumSet f15214a;

    /* renamed from: b */
    final /* synthetic */ C3509x f15215b;

    C3516y(C3509x xVar, EnumSet enumSet) {
        this.f15215b = xVar;
        this.f15214a = enumSet;
    }

    /* renamed from: a */
    public void mo10670a() {
        if (this.f15215b.f15178h != null) {
            this.f15215b.f15178h.mo10791d();
        }
    }

    /* renamed from: a */
    public void mo10672a(C3351A a) {
        if (a != null) {
            ArrayList arrayList = new ArrayList(2);
            if (this.f15214a.contains(C3509x.C3511b.ICON) && a.mo10588d() != null) {
                arrayList.add(a.mo10588d().mo10878a());
            }
            if (this.f15214a.contains(C3509x.C3511b.IMAGE) && a.mo10589e() != null) {
                arrayList.add(a.mo10589e().mo10878a());
            }
            C3447n.m15090a(this.f15215b.f15174d, (List<String>) arrayList, (C3446m) new C3517z(this, a));
        }
    }

    /* renamed from: a */
    public void mo10673a(C3393c cVar) {
        if (this.f15215b.f15176f != null) {
            this.f15215b.f15176f.mo7021a(this.f15215b, cVar.mo10679b());
        }
    }

    /* renamed from: b */
    public void mo10674b() {
        if (this.f15215b.f15176f != null) {
            this.f15215b.f15176f.mo7022b(this.f15215b);
        }
    }

    /* renamed from: c */
    public void mo10675c() {
        throw new IllegalStateException("Native ads manager their own impressions.");
    }
}
