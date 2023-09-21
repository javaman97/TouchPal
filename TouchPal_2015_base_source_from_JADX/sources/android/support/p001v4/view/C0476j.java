package android.support.p001v4.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: android.support.v4.view.j */
/* compiled from: GravityCompat */
public class C0476j {

    /* renamed from: a */
    static final C0477a f1110a;

    /* renamed from: b */
    public static final int f1111b = 8388608;

    /* renamed from: c */
    public static final int f1112c = 8388611;

    /* renamed from: d */
    public static final int f1113d = 8388613;

    /* renamed from: e */
    public static final int f1114e = 8388615;

    /* renamed from: android.support.v4.view.j$a */
    /* compiled from: GravityCompat */
    interface C0477a {
        /* renamed from: a */
        int mo1628a(int i, int i2);

        /* renamed from: a */
        void mo1629a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6);

        /* renamed from: a */
        void mo1630a(int i, int i2, int i3, Rect rect, Rect rect2, int i4);

        /* renamed from: a */
        void mo1631a(int i, Rect rect, Rect rect2, int i2);
    }

    /* renamed from: android.support.v4.view.j$b */
    /* compiled from: GravityCompat */
    static class C0478b implements C0477a {
        C0478b() {
        }

        /* renamed from: a */
        public int mo1628a(int i, int i2) {
            return -8388609 & i;
        }

        /* renamed from: a */
        public void mo1630a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2);
        }

        /* renamed from: a */
        public void mo1629a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2);
        }

        /* renamed from: a */
        public void mo1631a(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2);
        }
    }

    /* renamed from: android.support.v4.view.j$c */
    /* compiled from: GravityCompat */
    static class C0479c implements C0477a {
        C0479c() {
        }

        /* renamed from: a */
        public int mo1628a(int i, int i2) {
            return C0480k.m2730a(i, i2);
        }

        /* renamed from: a */
        public void mo1630a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            C0480k.m2732a(i, i2, i3, rect, rect2, i4);
        }

        /* renamed from: a */
        public void mo1629a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            C0480k.m2731a(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        /* renamed from: a */
        public void mo1631a(int i, Rect rect, Rect rect2, int i2) {
            C0480k.m2733a(i, rect, rect2, i2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f1110a = new C0479c();
        } else {
            f1110a = new C0478b();
        }
    }

    /* renamed from: a */
    public static void m2716a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        f1110a.mo1630a(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: a */
    public static void m2715a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
        f1110a.mo1629a(i, i2, i3, rect, i4, i5, rect2, i6);
    }

    /* renamed from: a */
    public static void m2717a(int i, Rect rect, Rect rect2, int i2) {
        f1110a.mo1631a(i, rect, rect2, i2);
    }

    /* renamed from: a */
    public static int m2714a(int i, int i2) {
        return f1110a.mo1628a(i, i2);
    }
}
