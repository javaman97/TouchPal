package com.android.volley;

/* renamed from: com.android.volley.p */
/* compiled from: Request */
class C0836p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2218a;

    /* renamed from: b */
    final /* synthetic */ long f2219b;

    /* renamed from: c */
    final /* synthetic */ C0833o f2220c;

    C0836p(C0833o oVar, String str, long j) {
        this.f2220c = oVar;
        this.f2218a = str;
        this.f2219b = j;
    }

    public void run() {
        this.f2220c.f2190b.mo3159a(this.f2218a, this.f2219b);
        this.f2220c.f2190b.mo3158a(toString());
    }
}
