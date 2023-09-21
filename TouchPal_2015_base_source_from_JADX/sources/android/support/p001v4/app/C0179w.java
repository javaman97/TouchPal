package android.support.p001v4.app;

/* renamed from: android.support.v4.app.w */
/* compiled from: FragmentManager */
class C0179w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f477a;

    /* renamed from: b */
    final /* synthetic */ int f478b;

    /* renamed from: c */
    final /* synthetic */ C0176t f479c;

    C0179w(C0176t tVar, String str, int i) {
        this.f479c = tVar;
        this.f477a = str;
        this.f478b = i;
    }

    public void run() {
        this.f479c.mo576a(this.f479c.f469u.mHandler, this.f477a, -1, this.f478b);
    }
}
