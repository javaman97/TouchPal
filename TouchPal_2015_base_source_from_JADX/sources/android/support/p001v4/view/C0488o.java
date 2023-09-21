package android.support.p001v4.view;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.o */
/* compiled from: MarginLayoutParamsCompat */
public class C0488o {

    /* renamed from: a */
    static final C0489a f1118a;

    /* renamed from: android.support.v4.view.o$a */
    /* compiled from: MarginLayoutParamsCompat */
    interface C0489a {
        /* renamed from: a */
        int mo1639a(ViewGroup.MarginLayoutParams marginLayoutParams);

        /* renamed from: a */
        void mo1640a(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

        /* renamed from: b */
        int mo1641b(ViewGroup.MarginLayoutParams marginLayoutParams);

        /* renamed from: b */
        void mo1642b(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

        /* renamed from: c */
        void mo1643c(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

        /* renamed from: c */
        boolean mo1644c(ViewGroup.MarginLayoutParams marginLayoutParams);

        /* renamed from: d */
        int mo1645d(ViewGroup.MarginLayoutParams marginLayoutParams);

        /* renamed from: d */
        void mo1646d(ViewGroup.MarginLayoutParams marginLayoutParams, int i);
    }

    /* renamed from: android.support.v4.view.o$b */
    /* compiled from: MarginLayoutParamsCompat */
    static class C0490b implements C0489a {
        C0490b() {
        }

        /* renamed from: a */
        public int mo1639a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.leftMargin;
        }

        /* renamed from: b */
        public int mo1641b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.rightMargin;
        }

        /* renamed from: a */
        public void mo1640a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.leftMargin = i;
        }

        /* renamed from: b */
        public void mo1642b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.rightMargin = i;
        }

        /* renamed from: c */
        public boolean mo1644c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return false;
        }

        /* renamed from: d */
        public int mo1645d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return 0;
        }

        /* renamed from: c */
        public void mo1643c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        }

        /* renamed from: d */
        public void mo1646d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        }
    }

    /* renamed from: android.support.v4.view.o$c */
    /* compiled from: MarginLayoutParamsCompat */
    static class C0491c implements C0489a {
        C0491c() {
        }

        /* renamed from: a */
        public int mo1639a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return C0492p.m2804a(marginLayoutParams);
        }

        /* renamed from: b */
        public int mo1641b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return C0492p.m2806b(marginLayoutParams);
        }

        /* renamed from: a */
        public void mo1640a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            C0492p.m2805a(marginLayoutParams, i);
        }

        /* renamed from: b */
        public void mo1642b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            C0492p.m2807b(marginLayoutParams, i);
        }

        /* renamed from: c */
        public boolean mo1644c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return C0492p.m2809c(marginLayoutParams);
        }

        /* renamed from: d */
        public int mo1645d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return C0492p.m2810d(marginLayoutParams);
        }

        /* renamed from: c */
        public void mo1643c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            C0492p.m2808c(marginLayoutParams, i);
        }

        /* renamed from: d */
        public void mo1646d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            C0492p.m2811d(marginLayoutParams, i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f1118a = new C0491c();
        } else {
            f1118a = new C0490b();
        }
    }

    /* renamed from: a */
    public static int m2772a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return f1118a.mo1639a(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m2774b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return f1118a.mo1641b(marginLayoutParams);
    }

    /* renamed from: a */
    public static void m2773a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        f1118a.mo1640a(marginLayoutParams, i);
    }

    /* renamed from: b */
    public static void m2775b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        f1118a.mo1642b(marginLayoutParams, i);
    }

    /* renamed from: c */
    public static boolean m2777c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return f1118a.mo1644c(marginLayoutParams);
    }

    /* renamed from: d */
    public static int m2778d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return f1118a.mo1645d(marginLayoutParams);
    }

    /* renamed from: c */
    public static void m2776c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        f1118a.mo1643c(marginLayoutParams, i);
    }

    /* renamed from: d */
    public static void m2779d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        f1118a.mo1646d(marginLayoutParams, i);
    }
}
