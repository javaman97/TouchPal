package android.support.p001v4.widget;

/* renamed from: android.support.v4.widget.d */
/* compiled from: ContentLoadingProgressBar */
class C0554d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ContentLoadingProgressBar f1396a;

    C0554d(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f1396a = contentLoadingProgressBar;
    }

    public void run() {
        boolean unused = this.f1396a.f1170e = false;
        if (!this.f1396a.f1171f) {
            long unused2 = this.f1396a.f1168c = System.currentTimeMillis();
            this.f1396a.setVisibility(0);
        }
    }
}
