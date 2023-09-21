package android.support.p001v4.widget;

/* renamed from: android.support.v4.widget.I */
/* compiled from: SwipeRefreshLayout */
class C0531I implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f1231a;

    C0531I(SwipeRefreshLayout swipeRefreshLayout) {
        this.f1231a = swipeRefreshLayout;
    }

    public void run() {
        boolean unused = this.f1231a.f1344z = true;
        if (this.f1231a.f1327i != null) {
            float unused2 = this.f1231a.f1336r = this.f1231a.f1337s;
            this.f1231a.f1322E.setDuration((long) this.f1231a.f1335q);
            this.f1231a.f1322E.setAnimationListener(this.f1231a.f1324G);
            this.f1231a.f1322E.reset();
            this.f1231a.f1322E.setInterpolator(this.f1231a.f1319A);
            this.f1231a.startAnimation(this.f1231a.f1322E);
        }
        this.f1231a.m3124a(this.f1231a.f1339u + this.f1231a.getPaddingTop(), this.f1231a.f1323F);
    }
}
