package p018cn.sharesdk.framework;

/* renamed from: cn.sharesdk.framework.h */
class C0653h extends Thread {

    /* renamed from: a */
    final /* synthetic */ String[] f1601a;

    /* renamed from: b */
    final /* synthetic */ C0652g f1602b;

    C0653h(C0652g gVar, String[] strArr) {
        this.f1602b = gVar;
        this.f1601a = strArr;
    }

    public void run() {
        boolean unused = this.f1602b.m3711j();
        this.f1602b.f1592a.doAuthorize(this.f1601a);
    }
}
