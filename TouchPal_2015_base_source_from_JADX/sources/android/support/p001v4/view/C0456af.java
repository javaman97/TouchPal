package android.support.p001v4.view;

import android.view.View;

/* renamed from: android.support.v4.view.af */
/* compiled from: ViewPropertyAnimatorCompatJB */
class C0456af {
    C0456af() {
    }

    /* renamed from: a */
    public static void m2607a(View view, Runnable runnable) {
        view.animate().withStartAction(runnable);
    }

    /* renamed from: b */
    public static void m2608b(View view, Runnable runnable) {
        view.animate().withEndAction(runnable);
    }

    /* renamed from: a */
    public static void m2606a(View view) {
        view.animate().withLayer();
    }
}
