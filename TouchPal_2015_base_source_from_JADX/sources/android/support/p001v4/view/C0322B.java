package android.support.p001v4.view;

import android.os.Build;

/* renamed from: android.support.v4.view.B */
/* compiled from: ScaleGestureDetectorCompat */
public class C0322B {

    /* renamed from: a */
    static final C0326c f815a;

    /* renamed from: android.support.v4.view.B$c */
    /* compiled from: ScaleGestureDetectorCompat */
    interface C0326c {
        /* renamed from: a */
        void mo1031a(Object obj, boolean z);

        /* renamed from: a */
        boolean mo1032a(Object obj);
    }

    /* renamed from: android.support.v4.view.B$a */
    /* compiled from: ScaleGestureDetectorCompat */
    private static class C0324a implements C0326c {
        private C0324a() {
        }

        /* renamed from: a */
        public void mo1031a(Object obj, boolean z) {
        }

        /* renamed from: a */
        public boolean mo1032a(Object obj) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.B$b */
    /* compiled from: ScaleGestureDetectorCompat */
    private static class C0325b implements C0326c {
        private C0325b() {
        }

        /* renamed from: a */
        public void mo1031a(Object obj, boolean z) {
            C0327C.m1321a(obj, z);
        }

        /* renamed from: a */
        public boolean mo1032a(Object obj) {
            return C0327C.m1322a(obj);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f815a = new C0325b();
        } else {
            f815a = new C0324a();
        }
    }

    private C0322B() {
    }

    /* renamed from: a */
    public static void m1313a(Object obj, boolean z) {
        f815a.mo1031a(obj, z);
    }

    /* renamed from: a */
    public static boolean m1314a(Object obj) {
        return f815a.mo1032a(obj);
    }
}
