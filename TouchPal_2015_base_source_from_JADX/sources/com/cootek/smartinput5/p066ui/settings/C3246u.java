package com.cootek.smartinput5.p066ui.settings;

/* renamed from: com.cootek.smartinput5.ui.settings.u */
/* compiled from: BaiduAuthActivity */
class C3246u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f14316a;

    /* renamed from: b */
    final /* synthetic */ long f14317b;

    /* renamed from: c */
    final /* synthetic */ C3245t f14318c;

    C3246u(C3245t tVar, long j, long j2) {
        this.f14318c = tVar;
        this.f14316a = j;
        this.f14317b = j2;
    }

    public void run() {
        this.f14318c.f14315b.f13386k.setMessage(this.f14318c.f14315b.mo7241b(this.f14318c.f14315b.m13637a(this.f14318c.f14314a)) + "  ...  " + ((int) ((((float) this.f14316a) / ((float) this.f14317b)) * 100.0f)) + "%");
    }
}
