package com.facebook.ads.internal.p076g;

import com.facebook.ads.internal.p073d.C3396a;
import com.facebook.ads.internal.p075f.C3405a;
import com.facebook.ads.internal.p075f.C3410e;
import com.facebook.ads.internal.p077h.C3435e;

/* renamed from: com.facebook.ads.internal.g.d */
class C3421d extends C3410e {

    /* renamed from: a */
    final /* synthetic */ C3417b f14930a;

    C3421d(C3417b bVar) {
        this.f14930a = bVar;
    }

    /* renamed from: a */
    public void mo10714a() {
        C3396a.m14938b("Facebook Ads SDK req start delay=" + (System.currentTimeMillis() - this.f14930a.f14923g) + "ms");
    }

    /* renamed from: a */
    public void mo10715a(int i, String str) {
        C3435e.m15054b(this.f14930a.f14921e);
        C3396a.m14939c("Facebook Ads SDK req complete " + (System.currentTimeMillis() - this.f14930a.f14923g) + "ms ");
        C3405a unused = this.f14930a.f14922f = null;
        this.f14930a.m15017a(str);
    }

    /* renamed from: a */
    public void mo10719a(Throwable th, String str) {
        C3435e.m15054b(this.f14930a.f14921e);
        C3396a.m14941e("Facebook Ads SDK req failed " + (System.currentTimeMillis() - this.f14930a.f14923g) + "ms " + str + " " + th);
        C3405a unused = this.f14930a.f14922f = null;
    }
}
