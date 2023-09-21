package p018cn.sharesdk.framework;

/* renamed from: cn.sharesdk.framework.i */
class C0654i extends Thread {

    /* renamed from: a */
    final /* synthetic */ int f1603a;

    /* renamed from: b */
    final /* synthetic */ Object f1604b;

    /* renamed from: c */
    final /* synthetic */ C0652g f1605c;

    C0654i(C0652g gVar, int i, Object obj) {
        this.f1605c = gVar;
        this.f1603a = i;
        this.f1604b = obj;
    }

    public void run() {
        boolean unused = this.f1605c.m3711j();
        if (this.f1605c.f1592a.checkAuthorize(this.f1603a, this.f1604b)) {
            this.f1605c.mo2407c(this.f1603a, this.f1604b);
        }
    }
}
