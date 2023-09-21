package android.support.p001v4.widget;

import android.content.Context;
import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: android.support.v4.widget.r */
/* compiled from: ScrollerCompat */
public class C0583r {

    /* renamed from: c */
    static final int f1432c = 16;

    /* renamed from: d */
    private static final String f1433d = "ScrollerCompat";

    /* renamed from: a */
    Object f1434a;

    /* renamed from: b */
    C0584a f1435b;

    /* renamed from: android.support.v4.widget.r$a */
    /* compiled from: ScrollerCompat */
    interface C0584a {
        /* renamed from: a */
        Object mo1990a(Context context, Interpolator interpolator);

        /* renamed from: a */
        void mo1991a(Object obj, int i, int i2, int i3);

        /* renamed from: a */
        void mo1992a(Object obj, int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo1993a(Object obj, int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo1994a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

        /* renamed from: a */
        void mo1995a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

        /* renamed from: a */
        boolean mo1996a(Object obj);

        /* renamed from: b */
        int mo1997b(Object obj);

        /* renamed from: b */
        void mo1998b(Object obj, int i, int i2, int i3);

        /* renamed from: c */
        int mo1999c(Object obj);

        /* renamed from: d */
        float mo2000d(Object obj);

        /* renamed from: e */
        boolean mo2001e(Object obj);

        /* renamed from: f */
        void mo2002f(Object obj);

        /* renamed from: g */
        boolean mo2003g(Object obj);

        /* renamed from: h */
        int mo2004h(Object obj);

        /* renamed from: i */
        int mo2005i(Object obj);
    }

    /* renamed from: android.support.v4.widget.r$b */
    /* compiled from: ScrollerCompat */
    static class C0585b implements C0584a {
        C0585b() {
        }

        /* renamed from: a */
        public Object mo1990a(Context context, Interpolator interpolator) {
            return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
        }

        /* renamed from: a */
        public boolean mo1996a(Object obj) {
            return ((Scroller) obj).isFinished();
        }

        /* renamed from: b */
        public int mo1997b(Object obj) {
            return ((Scroller) obj).getCurrX();
        }

        /* renamed from: c */
        public int mo1999c(Object obj) {
            return ((Scroller) obj).getCurrY();
        }

        /* renamed from: d */
        public float mo2000d(Object obj) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo2001e(Object obj) {
            return ((Scroller) obj).computeScrollOffset();
        }

        /* renamed from: a */
        public void mo1992a(Object obj, int i, int i2, int i3, int i4) {
            ((Scroller) obj).startScroll(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo1993a(Object obj, int i, int i2, int i3, int i4, int i5) {
            ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public void mo1994a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ((Scroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        /* renamed from: a */
        public void mo1995a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            ((Scroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        /* renamed from: f */
        public void mo2002f(Object obj) {
            ((Scroller) obj).abortAnimation();
        }

        /* renamed from: a */
        public void mo1991a(Object obj, int i, int i2, int i3) {
        }

        /* renamed from: b */
        public void mo1998b(Object obj, int i, int i2, int i3) {
        }

        /* renamed from: g */
        public boolean mo2003g(Object obj) {
            return false;
        }

        /* renamed from: h */
        public int mo2004h(Object obj) {
            return ((Scroller) obj).getFinalX();
        }

        /* renamed from: i */
        public int mo2005i(Object obj) {
            return ((Scroller) obj).getFinalY();
        }
    }

    /* renamed from: android.support.v4.widget.r$c */
    /* compiled from: ScrollerCompat */
    static class C0586c implements C0584a {
        C0586c() {
        }

        /* renamed from: a */
        public Object mo1990a(Context context, Interpolator interpolator) {
            return C0588s.m3373a(context, interpolator);
        }

        /* renamed from: a */
        public boolean mo1996a(Object obj) {
            return C0588s.m3379a(obj);
        }

        /* renamed from: b */
        public int mo1997b(Object obj) {
            return C0588s.m3380b(obj);
        }

        /* renamed from: c */
        public int mo1999c(Object obj) {
            return C0588s.m3382c(obj);
        }

        /* renamed from: d */
        public float mo2000d(Object obj) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo2001e(Object obj) {
            return C0588s.m3383d(obj);
        }

        /* renamed from: a */
        public void mo1992a(Object obj, int i, int i2, int i3, int i4) {
            C0588s.m3375a(obj, i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo1993a(Object obj, int i, int i2, int i3, int i4, int i5) {
            C0588s.m3376a(obj, i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public void mo1994a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C0588s.m3377a(obj, i, i2, i3, i4, i5, i6, i7, i8);
        }

        /* renamed from: a */
        public void mo1995a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            C0588s.m3378a(obj, i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        }

        /* renamed from: f */
        public void mo2002f(Object obj) {
            C0588s.m3384e(obj);
        }

        /* renamed from: a */
        public void mo1991a(Object obj, int i, int i2, int i3) {
            C0588s.m3374a(obj, i, i2, i3);
        }

        /* renamed from: b */
        public void mo1998b(Object obj, int i, int i2, int i3) {
            C0588s.m3381b(obj, i, i2, i3);
        }

        /* renamed from: g */
        public boolean mo2003g(Object obj) {
            return C0588s.m3385f(obj);
        }

        /* renamed from: h */
        public int mo2004h(Object obj) {
            return C0588s.m3386g(obj);
        }

        /* renamed from: i */
        public int mo2005i(Object obj) {
            return C0588s.m3387h(obj);
        }
    }

    /* renamed from: android.support.v4.widget.r$d */
    /* compiled from: ScrollerCompat */
    static class C0587d extends C0586c {
        C0587d() {
        }

        /* renamed from: d */
        public float mo2000d(Object obj) {
            return C0589t.m3388a(obj);
        }
    }

    /* renamed from: a */
    public static C0583r m3307a(Context context) {
        return m3308a(context, (Interpolator) null);
    }

    /* renamed from: a */
    public static C0583r m3308a(Context context, Interpolator interpolator) {
        return new C0583r(context, interpolator);
    }

    C0583r(Context context, Interpolator interpolator) {
        this(Build.VERSION.SDK_INT, context, interpolator);
    }

    private C0583r(int i, Context context, Interpolator interpolator) {
        if (i >= 14) {
            this.f1435b = new C0587d();
        } else if (i >= 9) {
            this.f1435b = new C0586c();
        } else {
            this.f1435b = new C0585b();
        }
        this.f1434a = this.f1435b.mo1990a(context, interpolator);
    }

    /* renamed from: a */
    public boolean mo1980a() {
        return this.f1435b.mo1996a(this.f1434a);
    }

    /* renamed from: b */
    public int mo1981b() {
        return this.f1435b.mo1997b(this.f1434a);
    }

    /* renamed from: c */
    public int mo1983c() {
        return this.f1435b.mo1999c(this.f1434a);
    }

    /* renamed from: d */
    public int mo1984d() {
        return this.f1435b.mo2004h(this.f1434a);
    }

    /* renamed from: e */
    public int mo1985e() {
        return this.f1435b.mo2005i(this.f1434a);
    }

    /* renamed from: f */
    public float mo1986f() {
        return this.f1435b.mo2000d(this.f1434a);
    }

    /* renamed from: g */
    public boolean mo1987g() {
        return this.f1435b.mo2001e(this.f1434a);
    }

    /* renamed from: a */
    public void mo1976a(int i, int i2, int i3, int i4) {
        this.f1435b.mo1992a(this.f1434a, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo1977a(int i, int i2, int i3, int i4, int i5) {
        this.f1435b.mo1993a(this.f1434a, i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public void mo1978a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f1435b.mo1994a(this.f1434a, i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: a */
    public void mo1979a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f1435b.mo1995a(this.f1434a, i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    /* renamed from: h */
    public void mo1988h() {
        this.f1435b.mo2002f(this.f1434a);
    }

    /* renamed from: a */
    public void mo1975a(int i, int i2, int i3) {
        this.f1435b.mo1991a(this.f1434a, i, i2, i3);
    }

    /* renamed from: b */
    public void mo1982b(int i, int i2, int i3) {
        this.f1435b.mo1998b(this.f1434a, i, i2, i3);
    }

    /* renamed from: i */
    public boolean mo1989i() {
        return this.f1435b.mo2003g(this.f1434a);
    }
}
