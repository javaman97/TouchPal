package android.support.p001v4.view;

import android.os.Build;
import android.view.VelocityTracker;

/* renamed from: android.support.v4.view.D */
/* compiled from: VelocityTrackerCompat */
public class C0328D {

    /* renamed from: a */
    static final C0331c f816a;

    /* renamed from: android.support.v4.view.D$c */
    /* compiled from: VelocityTrackerCompat */
    interface C0331c {
        /* renamed from: a */
        float mo1033a(VelocityTracker velocityTracker, int i);

        /* renamed from: b */
        float mo1034b(VelocityTracker velocityTracker, int i);
    }

    /* renamed from: android.support.v4.view.D$a */
    /* compiled from: VelocityTrackerCompat */
    static class C0329a implements C0331c {
        C0329a() {
        }

        /* renamed from: a */
        public float mo1033a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getXVelocity();
        }

        /* renamed from: b */
        public float mo1034b(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getYVelocity();
        }
    }

    /* renamed from: android.support.v4.view.D$b */
    /* compiled from: VelocityTrackerCompat */
    static class C0330b implements C0331c {
        C0330b() {
        }

        /* renamed from: a */
        public float mo1033a(VelocityTracker velocityTracker, int i) {
            return C0332E.m1331a(velocityTracker, i);
        }

        /* renamed from: b */
        public float mo1034b(VelocityTracker velocityTracker, int i) {
            return C0332E.m1332b(velocityTracker, i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f816a = new C0330b();
        } else {
            f816a = new C0329a();
        }
    }

    /* renamed from: a */
    public static float m1323a(VelocityTracker velocityTracker, int i) {
        return f816a.mo1033a(velocityTracker, i);
    }

    /* renamed from: b */
    public static float m1324b(VelocityTracker velocityTracker, int i) {
        return f816a.mo1034b(velocityTracker, i);
    }
}
