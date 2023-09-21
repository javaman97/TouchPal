package com.p023a.p024a.p025a.p026a.p027a.p028a;

import java.util.concurrent.Callable;

/* renamed from: com.a.a.a.a.a.a.b */
/* compiled from: DiskLruCache */
class C0717b implements Callable<Void> {

    /* renamed from: a */
    final /* synthetic */ C0712a f1778a;

    C0717b(C0712a aVar) {
        this.f1778a = aVar;
    }

    /* renamed from: a */
    public Void call() throws Exception {
        synchronized (this.f1778a) {
            if (this.f1778a.f1756w != null) {
                this.f1778a.m4051o();
                this.f1778a.m4052p();
                if (this.f1778a.m4049m()) {
                    this.f1778a.m4048l();
                    int unused = this.f1778a.f1758y = 0;
                }
            }
        }
        return null;
    }
}
