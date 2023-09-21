package android.support.p001v4.widget;

/* renamed from: android.support.v4.widget.c */
/* compiled from: ContentLoadingProgressBar */
class C0553c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ContentLoadingProgressBar f1395a;

    C0553c(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f1395a = contentLoadingProgressBar;
    }

    public void run() {
        boolean unused = this.f1395a.f1169d = false;
        long unused2 = this.f1395a.f1168c = -1;
        this.f1395a.setVisibility(8);
    }
}
