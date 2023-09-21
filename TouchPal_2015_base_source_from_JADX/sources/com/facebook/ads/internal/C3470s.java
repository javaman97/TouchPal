package com.facebook.ads.internal;

import com.facebook.ads.internal.p077h.C3439h;

/* renamed from: com.facebook.ads.internal.s */
class C3470s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3468r f15061a;

    C3470s(C3468r rVar) {
        this.f15061a = rVar;
    }

    public void run() {
        if (C3439h.m15070a(this.f15061a.f15049a)) {
            this.f15061a.mo10802a();
        } else {
            this.f15061a.f15057i.postDelayed(this.f15061a.f15058j, 5000);
        }
    }
}
