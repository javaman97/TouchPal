package android.support.p001v4.widget;

/* renamed from: android.support.v4.widget.H */
/* compiled from: SwipeRefreshLayout */
class C0530H implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f1230a;

    C0530H(SwipeRefreshLayout swipeRefreshLayout) {
        this.f1230a = swipeRefreshLayout;
    }

    public void run() {
        boolean unused = this.f1230a.f1344z = true;
        this.f1230a.m3124a(this.f1230a.f1339u + this.f1230a.getPaddingTop(), this.f1230a.f1323F);
    }
}
