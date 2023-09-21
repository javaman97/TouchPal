package com.android.volley;

/* renamed from: com.android.volley.e */
/* compiled from: CacheDispatcher */
class C0822e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0833o f2163a;

    /* renamed from: b */
    final /* synthetic */ C0821d f2164b;

    C0822e(C0821d dVar, C0833o oVar) {
        this.f2164b = dVar;
        this.f2163a = oVar;
    }

    public void run() {
        try {
            this.f2164b.f2159c.put(this.f2163a);
        } catch (InterruptedException e) {
        }
    }
}
