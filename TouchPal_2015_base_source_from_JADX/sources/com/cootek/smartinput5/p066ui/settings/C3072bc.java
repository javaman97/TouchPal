package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1439ao;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.control.C2826E;

/* renamed from: com.cootek.smartinput5.ui.settings.bc */
/* compiled from: KeyboardMaskProcessor */
public class C3072bc {

    /* renamed from: a */
    public static final int f14020a = 0;

    /* renamed from: b */
    public static final int f14021b = 1;

    /* renamed from: c */
    public static final int f14022c = 2;

    /* renamed from: d */
    public static final int f14023d = 3;

    /* renamed from: e */
    public static final int f14024e = 4;

    /* renamed from: f */
    public static final int f14025f = 5;

    /* renamed from: g */
    public static final int f14026g = 7;

    /* renamed from: h */
    private static String f14027h = "KeyboardMaskProcessor";

    /* renamed from: i */
    private static final int f14028i = 20;

    /* renamed from: j */
    private final double f14029j = 0.35d;

    /* renamed from: k */
    private final double f14030k = 0.5d;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f14031l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f14032m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f14033n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f14034o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f14035p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f14036q;

    /* renamed from: r */
    private final int f14037r;

    /* renamed from: s */
    private C3079f f14038s;

    /* renamed from: t */
    private C3077d f14039t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Context f14040u;

    /* renamed from: com.cootek.smartinput5.ui.settings.bc$d */
    /* compiled from: KeyboardMaskProcessor */
    public interface C3077d {
        /* renamed from: a */
        void mo10095a(int i, int i2, int i3, int i4, int i5, int i6);

        /* renamed from: a */
        void mo10096a(int i, int i2, int i3, int i4, int i5, int i6, int i7);

        /* renamed from: e */
        void mo10103e();
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.bc$f */
    /* compiled from: KeyboardMaskProcessor */
    private interface C3079f {
        /* renamed from: a */
        boolean mo10197a(int i, int i2);
    }

    public C3072bc(Context context, int i, int i2, C3077d dVar) {
        this.f14040u = context;
        this.f14032m = i2;
        this.f14031l = i;
        this.f14039t = dVar;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f14037r = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / 10;
        m14341f();
    }

    /* renamed from: f */
    private void m14341f() {
        if (Engine.isInitialized()) {
            C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
            this.f14035p = this.f14032m - ad.mo9226A();
            this.f14033n = ad.mo9254l();
            this.f14034o = ad.mo9254l() + ad.mo9262t();
            this.f14036q = ad.mo9261s() + this.f14035p;
        }
    }

    /* renamed from: a */
    private C3076c m14323a(int i) {
        switch (i) {
            case 0:
                return new C3078e();
            case 1:
                return new C3080g();
            case 2:
                return new C3081h();
            case 3:
                return new C3074a();
            default:
                return null;
        }
    }

    /* renamed from: a */
    public boolean mo10189a(int i, int i2, int i3) {
        if (i3 == 0) {
            this.f14038s = new C3075b(i, i2);
            return true;
        } else if (this.f14038s == null) {
            return true;
        } else {
            this.f14038s.mo10197a(i, i2);
            if (i3 == 2) {
                return true;
            }
            m14324a(this.f14033n, this.f14035p, this.f14034o, this.f14036q);
            this.f14038s = null;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo10191b(int i, int i2, int i3) {
        if (i3 == 0) {
            int a = m14320a(i, i2);
            if (a != 5) {
                this.f14038s = m14323a(a);
                return true;
            }
            m14344g();
            return true;
        } else if (this.f14038s == null) {
            return true;
        } else {
            this.f14038s.mo10197a(i, i2);
            if (i3 == 2) {
                return true;
            }
            m14324a(this.f14033n, this.f14035p, this.f14034o, this.f14036q);
            this.f14038s = null;
            return true;
        }
    }

    /* renamed from: g */
    private void m14344g() {
        if (this.f14039t != null) {
            this.f14039t.mo10103e();
        }
    }

    /* renamed from: a */
    private void m14324a(int i, int i2, int i3, int i4) {
        if (this.f14039t != null) {
            this.f14039t.mo10095a(this.f14031l, this.f14032m, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14325a(int i, int i2, int i3, int i4, int i5) {
        if (this.f14039t != null) {
            this.f14039t.mo10096a(this.f14031l, this.f14032m, i, i2, i3, i4, i5);
        }
    }

    /* renamed from: a */
    private int m14320a(int i, int i2) {
        if (m14334c(i, i2)) {
            return 0;
        }
        if (m14337d(i, i2)) {
            return 1;
        }
        if (m14339e(i, i2)) {
            return 2;
        }
        if (m14342f(i, i2)) {
            return 3;
        }
        return 5;
    }

    /* renamed from: b */
    private boolean m14330b(int i, int i2) {
        return i >= i2 - this.f14037r && i <= this.f14037r + i2;
    }

    /* renamed from: c */
    private boolean m14334c(int i, int i2) {
        boolean z;
        if (!m14330b(i, mo10190b()) || i < 0 || m14333c(i2)) {
            z = false;
        } else {
            z = true;
        }
        return z && !m14345h();
    }

    /* renamed from: d */
    private boolean m14337d(int i, int i2) {
        boolean z;
        if (!m14330b(i, mo10192c()) || m14333c(i2)) {
            z = false;
        } else {
            z = true;
        }
        return z && !m14345h();
    }

    /* renamed from: e */
    private boolean m14339e(int i, int i2) {
        return i2 >= 0 && m14330b(i2, mo10193d()) && !m14329b(i);
    }

    /* renamed from: f */
    private boolean m14342f(int i, int i2) {
        return i2 >= 0 && m14330b(i2, mo10194e()) && !m14329b(i) && !m14345h();
    }

    /* renamed from: b */
    private boolean m14329b(int i) {
        return mo10190b() - this.f14037r >= i || i >= mo10192c() + this.f14037r;
    }

    /* renamed from: c */
    private boolean m14333c(int i) {
        return mo10193d() - this.f14037r >= i || i >= mo10194e() + this.f14037r;
    }

    /* renamed from: h */
    private boolean m14345h() {
        boolean z;
        if (Engine.getInstance().getIms().getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), C1549b.f4835f);
        if (z || equals) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int mo10188a() {
        return this.f14032m;
    }

    /* renamed from: b */
    public int mo10190b() {
        return this.f14033n;
    }

    /* renamed from: c */
    public int mo10192c() {
        return this.f14034o;
    }

    /* renamed from: d */
    public int mo10193d() {
        return this.f14035p;
    }

    /* renamed from: e */
    public int mo10194e() {
        return this.f14036q;
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.bc$b */
    /* compiled from: KeyboardMaskProcessor */
    private class C3075b implements C3079f {

        /* renamed from: b */
        private final int f14043b;

        /* renamed from: c */
        private final int f14044c;

        /* renamed from: d */
        private final int f14045d;

        /* renamed from: e */
        private final int f14046e;

        /* renamed from: f */
        private final int f14047f;

        /* renamed from: g */
        private int f14048g;

        public C3075b(int i, int i2) {
            this.f14043b = i;
            this.f14044c = i2;
            this.f14047f = C3072bc.this.f14036q - C3072bc.this.f14035p;
            this.f14045d = C3072bc.this.f14035p;
            this.f14046e = C3072bc.this.f14036q;
            this.f14048g = C3072bc.this.f14032m - Engine.getInstance().getWidgetManager().mo9632af().mo10107i();
        }

        /* renamed from: a */
        public boolean mo10197a(int i, int i2) {
            int c = m14357c(i2);
            int i3 = this.f14046e + c;
            int i4 = c + this.f14045d;
            int i5 = 4;
            boolean b = m14356b(i4);
            boolean a = m14355a(i3);
            if (b && a) {
                int unused = C3072bc.this.f14035p = i4;
                int unused2 = C3072bc.this.f14036q = i3;
            } else if (!b) {
                i5 = 0;
                int unused3 = C3072bc.this.f14035p = C3072bc.this.f14032m - Engine.getInstance().getWidgetManager().mo9632af().mo10107i();
                int unused4 = C3072bc.this.f14036q = C3072bc.this.f14035p + this.f14047f;
            } else if (!a) {
                int unused5 = C3072bc.this.f14036q = C3072bc.this.f14032m;
                int unused6 = C3072bc.this.f14035p = C3072bc.this.f14036q - this.f14047f;
                i5 = 1;
            }
            C3072bc.this.m14325a(C3072bc.this.f14033n, C3072bc.this.f14035p, C3072bc.this.f14034o, C3072bc.this.f14036q, i5);
            return true;
        }

        /* renamed from: a */
        private boolean m14355a(int i) {
            if (i <= C3072bc.this.f14032m) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private boolean m14356b(int i) {
            if (i >= this.f14048g) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private int m14357c(int i) {
            return i - this.f14044c;
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.bc$c */
    /* compiled from: KeyboardMaskProcessor */
    private abstract class C3076c implements C3079f {

        /* renamed from: a */
        private int[] f14049a = mo10195a();

        /* renamed from: c */
        private final int f14051c;

        /* renamed from: d */
        private final int f14052d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract int[] mo10195a();

        /* access modifiers changed from: protected */
        /* renamed from: a_ */
        public abstract int mo10196a_(int i, int i2);

        public C3076c() {
            double d;
            C2917du widgetManager = Engine.getInstance().getWidgetManager();
            int B = widgetManager.mo9630ad().mo9227B();
            if (C1439ao.m6712a(C3072bc.this.f14040u) < 7.0d) {
                d = 0.35d;
            } else {
                d = 0.5d;
            }
            this.f14051c = (int) ((1.0d - d) * ((double) B));
            this.f14052d = widgetManager.mo9632af().mo10108j();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo10199b() {
            return this.f14051c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo10200c() {
            return this.f14052d;
        }

        /* renamed from: a */
        public boolean mo10197a(int i, int i2) {
            C3072bc.this.m14325a(C3072bc.this.f14033n, C3072bc.this.f14035p, C3072bc.this.f14034o, C3072bc.this.f14036q, mo10196a_(i, i2));
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo10198a(boolean z, int i) {
            return C2826E.m12872a(this.f14049a, z, i);
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.bc$e */
    /* compiled from: KeyboardMaskProcessor */
    private class C3078e extends C3076c {
        private C3078e() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int[] mo10195a() {
            C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
            int C = ad.mo9228C();
            int F = ad.mo9231F();
            return new int[]{0, C, F, F + 20};
        }

        /* access modifiers changed from: protected */
        /* renamed from: a_ */
        public int mo10196a_(int i, int i2) {
            if (i <= C3072bc.this.f14034o - mo10199b()) {
                int unused = C3072bc.this.f14033n = mo10198a(true, i);
                if (C3072bc.this.f14033n == 0) {
                    return 2;
                }
                return 4;
            }
            int unused2 = C3072bc.this.f14033n = C3072bc.this.f14034o - mo10199b();
            return 2;
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.bc$g */
    /* compiled from: KeyboardMaskProcessor */
    private class C3080g extends C3076c {
        private C3080g() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int[] mo10195a() {
            C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
            int B = ad.mo9227B();
            int F = B - ad.mo9231F();
            return new int[]{F - 20, F, B - ad.mo9229D(), B};
        }

        /* access modifiers changed from: protected */
        /* renamed from: a_ */
        public int mo10196a_(int i, int i2) {
            if (i >= C3072bc.this.f14033n + mo10199b()) {
                int unused = C3072bc.this.f14034o = mo10198a(false, i);
                if (C3072bc.this.f14034o == C3072bc.this.f14031l) {
                    return 3;
                }
                return 4;
            }
            int unused2 = C3072bc.this.f14034o = C3072bc.this.f14033n + mo10199b();
            return 3;
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.bc$h */
    /* compiled from: KeyboardMaskProcessor */
    private class C3081h extends C3076c {
        private C3081h() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int[] mo10195a() {
            return new int[0];
        }

        /* access modifiers changed from: protected */
        /* renamed from: a_ */
        public int mo10196a_(int i, int i2) {
            int i3 = Engine.getInstance().getWidgetManager().mo9632af().mo10107i();
            int a = C3072bc.this.f14036q - mo10200c();
            int c = C3072bc.this.f14032m - i3;
            if (i2 > a || i2 < c) {
                if (i2 >= a) {
                    int unused = C3072bc.this.f14035p = a;
                } else if (i2 <= c) {
                    int unused2 = C3072bc.this.f14035p = c;
                }
                return 0;
            }
            int unused3 = C3072bc.this.f14035p = i2;
            return 4;
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.bc$a */
    /* compiled from: KeyboardMaskProcessor */
    private class C3074a extends C3076c {
        private C3074a() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int[] mo10195a() {
            C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
            int c = C3072bc.this.f14032m;
            int c2 = C3072bc.this.f14032m - ad.mo9230E();
            return new int[]{c2 - 20, c2, c};
        }

        /* access modifiers changed from: protected */
        /* renamed from: a_ */
        public int mo10196a_(int i, int i2) {
            if (i2 >= C3072bc.this.f14035p + mo10200c()) {
                int unused = C3072bc.this.f14036q = mo10198a(false, i2);
                if (C3072bc.this.f14036q == C3072bc.this.f14032m) {
                    return 1;
                }
                return 4;
            }
            int unused2 = C3072bc.this.f14036q = C3072bc.this.f14035p + mo10200c();
            return 1;
        }
    }
}
