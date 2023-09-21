package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.p077h.C3439h;

/* renamed from: com.facebook.ads.internal.adapters.k */
class C3372k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3370j f14699a;

    C3372k(C3370j jVar) {
        this.f14699a = jVar;
    }

    public void run() {
        if (!this.f14699a.f14698g) {
            if (C3439h.m15071a(this.f14699a.f14692a, this.f14699a.f14693b, this.f14699a.f14694c)) {
                this.f14699a.f14695d.mo10523a();
                boolean unused = this.f14699a.f14698g = true;
                return;
            }
            this.f14699a.f14696e.postDelayed(this.f14699a.f14697f, 1000);
        }
    }
}
