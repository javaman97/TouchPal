package com.facebook.ads;

/* renamed from: com.facebook.ads.f */
class C3342f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3341e f14630a;

    C3342f(C3341e eVar) {
        this.f14630a = eVar;
    }

    public void run() {
        if (this.f14630a.f14629c.f14562d) {
            boolean unused = this.f14630a.f14629c.f14562d = false;
            C3343g gVar = new C3343g(this);
            gVar.setDuration(300);
            gVar.setFillAfter(true);
            this.f14630a.f14629c.startAnimation(gVar);
        }
    }
}
