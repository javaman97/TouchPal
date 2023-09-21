package android.support.p001v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p001v4.view.C0333F;
import android.support.p001v4.view.C0505v;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;

/* renamed from: android.support.v4.widget.a */
/* compiled from: AutoScrollHelper */
public abstract class C0548a implements View.OnTouchListener {

    /* renamed from: A */
    private static final int f1346A = 315;

    /* renamed from: B */
    private static final int f1347B = 1575;

    /* renamed from: C */
    private static final float f1348C = Float.MAX_VALUE;

    /* renamed from: D */
    private static final float f1349D = 0.2f;

    /* renamed from: E */
    private static final float f1350E = 1.0f;

    /* renamed from: F */
    private static final int f1351F = ViewConfiguration.getTapTimeout();

    /* renamed from: G */
    private static final int f1352G = 500;

    /* renamed from: H */
    private static final int f1353H = 500;

    /* renamed from: a */
    public static final float f1354a = 0.0f;

    /* renamed from: b */
    public static final float f1355b = Float.MAX_VALUE;

    /* renamed from: c */
    public static final float f1356c = 0.0f;

    /* renamed from: d */
    public static final int f1357d = 0;

    /* renamed from: e */
    public static final int f1358e = 1;

    /* renamed from: f */
    public static final int f1359f = 2;

    /* renamed from: g */
    private static final int f1360g = 0;

    /* renamed from: h */
    private static final int f1361h = 1;

    /* renamed from: z */
    private static final int f1362z = 1;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C0550a f1363i = new C0550a();

    /* renamed from: j */
    private final Interpolator f1364j = new AccelerateInterpolator();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final View f1365k;

    /* renamed from: l */
    private Runnable f1366l;

    /* renamed from: m */
    private float[] f1367m = {0.0f, 0.0f};

    /* renamed from: n */
    private float[] f1368n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o */
    private int f1369o;

    /* renamed from: p */
    private int f1370p;

    /* renamed from: q */
    private float[] f1371q = {0.0f, 0.0f};

    /* renamed from: r */
    private float[] f1372r = {0.0f, 0.0f};

    /* renamed from: s */
    private float[] f1373s = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: t */
    private boolean f1374t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f1375u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f1376v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f1377w;

    /* renamed from: x */
    private boolean f1378x;

    /* renamed from: y */
    private boolean f1379y;

    /* renamed from: a */
    public abstract void mo1888a(int i, int i2);

    /* renamed from: e */
    public abstract boolean mo1899e(int i);

    /* renamed from: f */
    public abstract boolean mo1900f(int i);

    public C0548a(View view) {
        this.f1365k = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        mo1885a((float) i, (float) i);
        mo1890b((float) i2, (float) i2);
        mo1886a(1);
        mo1898e(Float.MAX_VALUE, Float.MAX_VALUE);
        mo1896d(f1349D, f1349D);
        mo1894c(1.0f, 1.0f);
        mo1891b(f1351F);
        mo1895c((int) SearchStatusData.RESPONSE_STATUS_SERVER_ERROR);
        mo1897d((int) SearchStatusData.RESPONSE_STATUS_SERVER_ERROR);
    }

    /* renamed from: a */
    public C0548a mo1887a(boolean z) {
        if (this.f1378x && !z) {
            m3166e();
        }
        this.f1378x = z;
        return this;
    }

    /* renamed from: a */
    public boolean mo1889a() {
        return this.f1378x;
    }

    /* renamed from: b */
    public C0548a mo1892b(boolean z) {
        this.f1379y = z;
        return this;
    }

    /* renamed from: b */
    public boolean mo1893b() {
        return this.f1379y;
    }

    /* renamed from: a */
    public C0548a mo1885a(float f, float f2) {
        this.f1373s[0] = f / 1000.0f;
        this.f1373s[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public C0548a mo1890b(float f, float f2) {
        this.f1372r[0] = f / 1000.0f;
        this.f1372r[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C0548a mo1894c(float f, float f2) {
        this.f1371q[0] = f / 1000.0f;
        this.f1371q[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: a */
    public C0548a mo1886a(int i) {
        this.f1369o = i;
        return this;
    }

    /* renamed from: d */
    public C0548a mo1896d(float f, float f2) {
        this.f1367m[0] = f;
        this.f1367m[1] = f2;
        return this;
    }

    /* renamed from: e */
    public C0548a mo1898e(float f, float f2) {
        this.f1368n[0] = f;
        this.f1368n[1] = f2;
        return this;
    }

    /* renamed from: b */
    public C0548a mo1891b(int i) {
        this.f1370p = i;
        return this;
    }

    /* renamed from: c */
    public C0548a mo1895c(int i) {
        this.f1363i.mo1904a(i);
        return this;
    }

    /* renamed from: d */
    public C0548a mo1897d(int i) {
        this.f1363i.mo1906b(i);
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (!this.f1378x) {
            return false;
        }
        switch (C0505v.m2867a(motionEvent)) {
            case 0:
                this.f1376v = true;
                this.f1374t = false;
                break;
            case 1:
            case 3:
                m3166e();
                break;
            case 2:
                break;
        }
        this.f1363i.mo1903a(m3153a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f1365k.getWidth()), m3153a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f1365k.getHeight()));
        if (!this.f1377w && m3162c()) {
            m3164d();
        }
        if (!this.f1379y || !this.f1377w) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m3162c() {
        C0550a aVar = this.f1363i;
        int f = aVar.mo1910f();
        int e = aVar.mo1909e();
        return (f != 0 && mo1900f(f)) || (e != 0 && mo1899e(e));
    }

    /* renamed from: d */
    private void m3164d() {
        if (this.f1366l == null) {
            this.f1366l = new C0551b();
        }
        this.f1377w = true;
        this.f1375u = true;
        if (this.f1374t || this.f1370p <= 0) {
            this.f1366l.run();
        } else {
            C0333F.m1343a(this.f1365k, this.f1366l, (long) this.f1370p);
        }
        this.f1374t = true;
    }

    /* renamed from: e */
    private void m3166e() {
        if (this.f1375u) {
            this.f1377w = false;
        } else {
            this.f1363i.mo1905b();
        }
    }

    /* renamed from: a */
    private float m3153a(int i, float f, float f2, float f3) {
        float a = m3152a(this.f1367m[i], f2, this.f1368n[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1371q[i];
        float f5 = this.f1372r[i];
        float f6 = this.f1373s[i];
        float f7 = f4 * f3;
        if (a > 0.0f) {
            return m3157b(a * f7, f5, f6);
        }
        return -m3157b((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    private float m3152a(float f, float f2, float f3, float f4) {
        float interpolation;
        float b = m3157b(f * f2, 0.0f, f3);
        float f5 = m3168f(f2 - f4, b) - m3168f(f4, b);
        if (f5 < 0.0f) {
            interpolation = -this.f1364j.getInterpolation(-f5);
        } else if (f5 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f1364j.getInterpolation(f5);
        }
        return m3157b(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: f */
    private float m3168f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f1369o) {
            case 0:
            case 1:
                if (f >= f2) {
                    return 0.0f;
                }
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (!this.f1377w || this.f1369o != 1) {
                    return 0.0f;
                }
                return 1.0f;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m3158b(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static float m3157b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m3169f() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1365k.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: android.support.v4.widget.a$b */
    /* compiled from: AutoScrollHelper */
    private class C0551b implements Runnable {
        private C0551b() {
        }

        public void run() {
            if (C0548a.this.f1377w) {
                if (C0548a.this.f1375u) {
                    boolean unused = C0548a.this.f1375u = false;
                    C0548a.this.f1363i.mo1902a();
                }
                C0550a c = C0548a.this.f1363i;
                if (c.mo1907c() || !C0548a.this.m3162c()) {
                    boolean unused2 = C0548a.this.f1377w = false;
                    return;
                }
                if (C0548a.this.f1376v) {
                    boolean unused3 = C0548a.this.f1376v = false;
                    C0548a.this.m3169f();
                }
                c.mo1908d();
                C0548a.this.mo1888a(c.mo1911g(), c.mo1912h());
                C0333F.m1342a(C0548a.this.f1365k, (Runnable) this);
            }
        }
    }

    /* renamed from: android.support.v4.widget.a$a */
    /* compiled from: AutoScrollHelper */
    private static class C0550a {

        /* renamed from: a */
        private int f1380a;

        /* renamed from: b */
        private int f1381b;

        /* renamed from: c */
        private float f1382c;

        /* renamed from: d */
        private float f1383d;

        /* renamed from: e */
        private long f1384e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f1385f = 0;

        /* renamed from: g */
        private int f1386g = 0;

        /* renamed from: h */
        private int f1387h = 0;

        /* renamed from: i */
        private long f1388i = -1;

        /* renamed from: j */
        private float f1389j;

        /* renamed from: k */
        private int f1390k;

        /* renamed from: a */
        public void mo1904a(int i) {
            this.f1380a = i;
        }

        /* renamed from: b */
        public void mo1906b(int i) {
            this.f1381b = i;
        }

        /* renamed from: a */
        public void mo1902a() {
            this.f1384e = AnimationUtils.currentAnimationTimeMillis();
            this.f1388i = -1;
            this.f1385f = this.f1384e;
            this.f1389j = 0.5f;
            this.f1386g = 0;
            this.f1387h = 0;
        }

        /* renamed from: b */
        public void mo1905b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1390k = C0548a.m3158b((int) (currentAnimationTimeMillis - this.f1384e), 0, this.f1381b);
            this.f1389j = m3189a(currentAnimationTimeMillis);
            this.f1388i = currentAnimationTimeMillis;
        }

        /* renamed from: c */
        public boolean mo1907c() {
            return this.f1388i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1388i + ((long) this.f1390k);
        }

        /* renamed from: a */
        private float m3189a(long j) {
            if (j < this.f1384e) {
                return 0.0f;
            }
            if (this.f1388i < 0 || j < this.f1388i) {
                return C0548a.m3157b(((float) (j - this.f1384e)) / ((float) this.f1380a), 0.0f, 1.0f) * 0.5f;
            }
            return (C0548a.m3157b(((float) (j - this.f1388i)) / ((float) this.f1390k), 0.0f, 1.0f) * this.f1389j) + (1.0f - this.f1389j);
        }

        /* renamed from: a */
        private float m3188a(float f) {
            return (-4.0f * f * f) + (4.0f * f);
        }

        /* renamed from: d */
        public void mo1908d() {
            if (this.f1385f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a = m3188a(m3189a(currentAnimationTimeMillis));
            long j = currentAnimationTimeMillis - this.f1385f;
            this.f1385f = currentAnimationTimeMillis;
            this.f1386g = (int) (((float) j) * a * this.f1382c);
            this.f1387h = (int) (((float) j) * a * this.f1383d);
        }

        /* renamed from: a */
        public void mo1903a(float f, float f2) {
            this.f1382c = f;
            this.f1383d = f2;
        }

        /* renamed from: e */
        public int mo1909e() {
            return (int) (this.f1382c / Math.abs(this.f1382c));
        }

        /* renamed from: f */
        public int mo1910f() {
            return (int) (this.f1383d / Math.abs(this.f1383d));
        }

        /* renamed from: g */
        public int mo1911g() {
            return this.f1386g;
        }

        /* renamed from: h */
        public int mo1912h() {
            return this.f1387h;
        }
    }
}
