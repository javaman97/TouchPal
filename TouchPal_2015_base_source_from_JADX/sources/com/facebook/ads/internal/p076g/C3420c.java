package com.facebook.ads.internal.p076g;

import android.content.Context;
import com.facebook.ads.internal.C3346a;
import com.facebook.ads.internal.p073d.C3396a;
import com.facebook.ads.internal.p074e.C3401d;
import com.facebook.ads.internal.p074e.C3403e;
import com.facebook.ads.internal.p075f.C3405a;
import com.facebook.ads.internal.p075f.C3412g;

/* renamed from: com.facebook.ads.internal.g.c */
class C3420c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f14927a;

    /* renamed from: b */
    final /* synthetic */ C3401d f14928b;

    /* renamed from: c */
    final /* synthetic */ C3417b f14929c;

    C3420c(C3417b bVar, Context context, C3401d dVar) {
        this.f14929c = bVar;
        this.f14927a = context;
        this.f14928b = dVar;
    }

    public void run() {
        C3403e.m14969b(this.f14927a);
        this.f14929c.f14917a = this.f14928b.mo10702g();
        C3396a.m14938b(this.f14929c.f14917a.toString());
        try {
            C3405a unused = this.f14929c.f14922f = new C3405a(this.f14927a, this.f14928b.f14843i);
            this.f14929c.f14922f.mo10704a(this.f14929c.f14925i, new C3412g(this.f14929c.f14917a), this.f14929c.m15018b());
        } catch (Exception e) {
            this.f14929c.m15013a(C3346a.AD_REQUEST_FAILED.mo10572a(e.getMessage()));
        }
    }
}
