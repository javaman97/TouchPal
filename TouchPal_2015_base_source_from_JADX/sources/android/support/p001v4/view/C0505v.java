package android.support.p001v4.view;

import android.os.Build;
import android.view.MotionEvent;

/* renamed from: android.support.v4.view.v */
/* compiled from: MotionEventCompat */
public class C0505v {

    /* renamed from: a */
    static final C0508c f1129a;

    /* renamed from: b */
    public static final int f1130b = 255;

    /* renamed from: c */
    public static final int f1131c = 5;

    /* renamed from: d */
    public static final int f1132d = 6;

    /* renamed from: e */
    public static final int f1133e = 7;

    /* renamed from: f */
    public static final int f1134f = 8;

    /* renamed from: g */
    public static final int f1135g = 65280;

    /* renamed from: h */
    public static final int f1136h = 8;

    /* renamed from: i */
    public static final int f1137i = 9;

    /* renamed from: j */
    public static final int f1138j = 10;

    /* renamed from: android.support.v4.view.v$c */
    /* compiled from: MotionEventCompat */
    interface C0508c {
        /* renamed from: a */
        int mo1661a(MotionEvent motionEvent);

        /* renamed from: a */
        int mo1662a(MotionEvent motionEvent, int i);

        /* renamed from: b */
        int mo1663b(MotionEvent motionEvent, int i);

        /* renamed from: c */
        float mo1664c(MotionEvent motionEvent, int i);

        /* renamed from: d */
        float mo1665d(MotionEvent motionEvent, int i);
    }

    /* renamed from: android.support.v4.view.v$a */
    /* compiled from: MotionEventCompat */
    static class C0506a implements C0508c {
        C0506a() {
        }

        /* renamed from: a */
        public int mo1662a(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return 0;
            }
            return -1;
        }

        /* renamed from: b */
        public int mo1663b(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return 0;
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        /* renamed from: c */
        public float mo1664c(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return motionEvent.getX();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        /* renamed from: d */
        public float mo1665d(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return motionEvent.getY();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        /* renamed from: a */
        public int mo1661a(MotionEvent motionEvent) {
            return 1;
        }
    }

    /* renamed from: android.support.v4.view.v$b */
    /* compiled from: MotionEventCompat */
    static class C0507b implements C0508c {
        C0507b() {
        }

        /* renamed from: a */
        public int mo1662a(MotionEvent motionEvent, int i) {
            return C0509w.m2890a(motionEvent, i);
        }

        /* renamed from: b */
        public int mo1663b(MotionEvent motionEvent, int i) {
            return C0509w.m2891b(motionEvent, i);
        }

        /* renamed from: c */
        public float mo1664c(MotionEvent motionEvent, int i) {
            return C0509w.m2892c(motionEvent, i);
        }

        /* renamed from: d */
        public float mo1665d(MotionEvent motionEvent, int i) {
            return C0509w.m2893d(motionEvent, i);
        }

        /* renamed from: a */
        public int mo1661a(MotionEvent motionEvent) {
            return C0509w.m2889a(motionEvent);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 5) {
            f1129a = new C0507b();
        } else {
            f1129a = new C0506a();
        }
    }

    /* renamed from: a */
    public static int m2867a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    /* renamed from: b */
    public static int m2869b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & f1135g) >> 8;
    }

    /* renamed from: a */
    public static int m2868a(MotionEvent motionEvent, int i) {
        return f1129a.mo1662a(motionEvent, i);
    }

    /* renamed from: b */
    public static int m2870b(MotionEvent motionEvent, int i) {
        return f1129a.mo1663b(motionEvent, i);
    }

    /* renamed from: c */
    public static float m2871c(MotionEvent motionEvent, int i) {
        return f1129a.mo1664c(motionEvent, i);
    }

    /* renamed from: d */
    public static float m2873d(MotionEvent motionEvent, int i) {
        return f1129a.mo1665d(motionEvent, i);
    }

    /* renamed from: c */
    public static int m2872c(MotionEvent motionEvent) {
        return f1129a.mo1661a(motionEvent);
    }
}
