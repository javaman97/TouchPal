package android.support.p001v4.app;

/* renamed from: android.support.v4.app.x */
/* compiled from: FragmentManager */
class C0180x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f480a;

    /* renamed from: b */
    final /* synthetic */ int f481b;

    /* renamed from: c */
    final /* synthetic */ C0176t f482c;

    C0180x(C0176t tVar, int i, int i2) {
        this.f482c = tVar;
        this.f480a = i;
        this.f481b = i2;
    }

    public void run() {
        this.f482c.mo576a(this.f482c.f469u.mHandler, (String) null, this.f480a, this.f481b);
    }
}
