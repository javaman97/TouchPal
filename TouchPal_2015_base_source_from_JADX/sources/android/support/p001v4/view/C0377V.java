package android.support.p001v4.view;

/* renamed from: android.support.v4.view.V */
/* compiled from: ViewPager */
class C0377V implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ViewPager f895a;

    C0377V(ViewPager viewPager) {
        this.f895a = viewPager;
    }

    public void run() {
        this.f895a.setScrollState(0);
        this.f895a.mo1175c();
    }
}
