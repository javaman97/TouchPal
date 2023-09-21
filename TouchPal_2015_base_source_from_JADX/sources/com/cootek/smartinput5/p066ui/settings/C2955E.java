package com.cootek.smartinput5.p066ui.settings;

/* renamed from: com.cootek.smartinput5.ui.settings.E */
/* compiled from: BaiduAuthActivity */
class C2955E implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f13427a;

    /* renamed from: b */
    final /* synthetic */ long f13428b;

    /* renamed from: c */
    final /* synthetic */ C2954D f13429c;

    C2955E(C2954D d, long j, long j2) {
        this.f13429c = d;
        this.f13427a = j;
        this.f13428b = j2;
    }

    public void run() {
        this.f13429c.f13426b.f13386k.setMessage(this.f13429c.f13426b.mo7241b(this.f13429c.f13426b.m13637a(this.f13429c.f13425a)) + "  ...  " + ((int) ((((float) this.f13427a) / ((float) this.f13428b)) * 100.0f)) + "%");
    }
}
