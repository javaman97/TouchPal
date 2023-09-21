package com.p023a.p024a.p032b;

import com.p023a.p024a.p032b.p033a.C0753b;

/* renamed from: com.a.a.b.k */
/* compiled from: LoadAndDisplayImageTask */
class C0805k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0753b.C0754a f2120a;

    /* renamed from: b */
    final /* synthetic */ Throwable f2121b;

    /* renamed from: c */
    final /* synthetic */ C0802i f2122c;

    C0805k(C0802i iVar, C0753b.C0754a aVar, Throwable th) {
        this.f2122c = iVar;
        this.f2120a = aVar;
        this.f2121b = th;
    }

    public void run() {
        if (this.f2122c.f2112c.mo2848c()) {
            this.f2122c.f2111b.mo2975a(this.f2122c.f2112c.mo2847c(this.f2122c.f2101C.f1994a));
        }
        this.f2122c.f2113d.mo3001a(this.f2122c.f2110a, this.f2122c.f2111b.mo2978d(), new C0753b(this.f2120a, this.f2121b));
    }
}
