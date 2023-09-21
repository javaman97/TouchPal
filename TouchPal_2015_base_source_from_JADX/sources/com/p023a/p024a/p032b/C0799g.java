package com.p023a.p024a.p032b;

import java.io.File;

/* renamed from: com.a.a.b.g */
/* compiled from: ImageLoaderEngine */
class C0799g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0802i f2069a;

    /* renamed from: b */
    final /* synthetic */ C0794f f2070b;

    C0799g(C0794f fVar, C0802i iVar) {
        this.f2070b = fVar;
        this.f2069a = iVar;
    }

    public void run() {
        File a = this.f2070b.f2055a.f2008o.mo2679a(this.f2069a.mo3008a());
        boolean z = a != null && a.exists();
        this.f2070b.m4556h();
        if (z) {
            this.f2070b.f2057c.execute(this.f2069a);
        } else {
            this.f2070b.f2056b.execute(this.f2069a);
        }
    }
}
