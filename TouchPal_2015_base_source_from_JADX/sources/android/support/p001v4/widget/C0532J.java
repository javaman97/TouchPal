package android.support.p001v4.widget;

import android.content.Context;
import android.support.p001v4.view.C0328D;
import android.support.p001v4.view.C0333F;
import android.support.p001v4.view.C0505v;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.J */
/* compiled from: ViewDragHelper */
public class C0532J {

    /* renamed from: L */
    private static final Interpolator f1232L = new C0534K();

    /* renamed from: a */
    public static final int f1233a = -1;

    /* renamed from: b */
    public static final int f1234b = 0;

    /* renamed from: c */
    public static final int f1235c = 1;

    /* renamed from: d */
    public static final int f1236d = 2;

    /* renamed from: e */
    public static final int f1237e = 1;

    /* renamed from: f */
    public static final int f1238f = 2;

    /* renamed from: g */
    public static final int f1239g = 4;

    /* renamed from: h */
    public static final int f1240h = 8;

    /* renamed from: i */
    public static final int f1241i = 15;

    /* renamed from: j */
    public static final int f1242j = 1;

    /* renamed from: k */
    public static final int f1243k = 2;

    /* renamed from: l */
    public static final int f1244l = 3;

    /* renamed from: m */
    private static final String f1245m = "ViewDragHelper";

    /* renamed from: n */
    private static final int f1246n = 20;

    /* renamed from: o */
    private static final int f1247o = 256;

    /* renamed from: p */
    private static final int f1248p = 600;

    /* renamed from: A */
    private int f1249A;

    /* renamed from: B */
    private VelocityTracker f1250B;

    /* renamed from: C */
    private float f1251C;

    /* renamed from: D */
    private float f1252D;

    /* renamed from: E */
    private int f1253E;

    /* renamed from: F */
    private int f1254F;

    /* renamed from: G */
    private C0583r f1255G;

    /* renamed from: H */
    private final C0533a f1256H;

    /* renamed from: I */
    private View f1257I;

    /* renamed from: J */
    private boolean f1258J;

    /* renamed from: K */
    private final ViewGroup f1259K;

    /* renamed from: M */
    private final Runnable f1260M = new C0535L(this);

    /* renamed from: q */
    private int f1261q;

    /* renamed from: r */
    private int f1262r;

    /* renamed from: s */
    private int f1263s = -1;

    /* renamed from: t */
    private float[] f1264t;

    /* renamed from: u */
    private float[] f1265u;

    /* renamed from: v */
    private float[] f1266v;

    /* renamed from: w */
    private float[] f1267w;

    /* renamed from: x */
    private int[] f1268x;

    /* renamed from: y */
    private int[] f1269y;

    /* renamed from: z */
    private int[] f1270z;

    /* renamed from: android.support.v4.widget.J$a */
    /* compiled from: ViewDragHelper */
    public static abstract class C0533a {
        /* renamed from: a */
        public abstract boolean mo1773a(View view, int i);

        /* renamed from: a */
        public void mo1768a(int i) {
        }

        /* renamed from: a */
        public void mo1772a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: b */
        public void mo1776b(View view, int i) {
        }

        /* renamed from: a */
        public void mo1771a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo1769a(int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo1777b(int i) {
            return false;
        }

        /* renamed from: b */
        public void mo1775b(int i, int i2) {
        }

        /* renamed from: c */
        public int mo1811c(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo1765a(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo1810b(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo1766a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public int mo1774b(View view, int i, int i2) {
            return 0;
        }
    }

    /* renamed from: a */
    public static C0532J m3003a(ViewGroup viewGroup, C0533a aVar) {
        return new C0532J(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: a */
    public static C0532J m3002a(ViewGroup viewGroup, float f, C0533a aVar) {
        C0532J a = m3003a(viewGroup, aVar);
        a.f1262r = (int) (((float) a.f1262r) * (1.0f / f));
        return a;
    }

    private C0532J(Context context, ViewGroup viewGroup, C0533a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f1259K = viewGroup;
            this.f1256H = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f1253E = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f1262r = viewConfiguration.getScaledTouchSlop();
            this.f1251C = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f1252D = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f1255G = C0583r.m3308a(context, f1232L);
        }
    }

    /* renamed from: a */
    public void mo1783a(float f) {
        this.f1252D = f;
    }

    /* renamed from: a */
    public float mo1782a() {
        return this.f1252D;
    }

    /* renamed from: b */
    public int mo1792b() {
        return this.f1261q;
    }

    /* renamed from: a */
    public void mo1784a(int i) {
        this.f1254F = i;
    }

    /* renamed from: c */
    public int mo1798c() {
        return this.f1253E;
    }

    /* renamed from: a */
    public void mo1786a(View view, int i) {
        if (view.getParent() != this.f1259K) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f1259K + ")");
        }
        this.f1257I = view;
        this.f1263s = i;
        this.f1256H.mo1776b(view, i);
        mo1799c(1);
    }

    /* renamed from: d */
    public View mo1801d() {
        return this.f1257I;
    }

    /* renamed from: e */
    public int mo1804e() {
        return this.f1263s;
    }

    /* renamed from: f */
    public int mo1807f() {
        return this.f1262r;
    }

    /* renamed from: g */
    public void mo1808g() {
        this.f1263s = -1;
        m3017i();
        if (this.f1250B != null) {
            this.f1250B.recycle();
            this.f1250B = null;
        }
    }

    /* renamed from: h */
    public void mo1809h() {
        mo1808g();
        if (this.f1261q == 2) {
            int b = this.f1255G.mo1981b();
            int c = this.f1255G.mo1983c();
            this.f1255G.mo1988h();
            int b2 = this.f1255G.mo1981b();
            int c2 = this.f1255G.mo1983c();
            this.f1256H.mo1772a(this.f1257I, b2, c2, b2 - b, c2 - c);
        }
        mo1799c(0);
    }

    /* renamed from: a */
    public boolean mo1789a(View view, int i, int i2) {
        this.f1257I = view;
        this.f1263s = -1;
        return m3011b(i, i2, 0, 0);
    }

    /* renamed from: a */
    public boolean mo1787a(int i, int i2) {
        if (this.f1258J) {
            return m3011b(i, i2, (int) C0328D.m1323a(this.f1250B, this.f1263s), (int) C0328D.m1324b(this.f1250B, this.f1263s));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: b */
    private boolean m3011b(int i, int i2, int i3, int i4) {
        int left = this.f1257I.getLeft();
        int top = this.f1257I.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f1255G.mo1988h();
            mo1799c(0);
            return false;
        }
        this.f1255G.mo1977a(left, top, i5, i6, m3001a(this.f1257I, i5, i6, i3, i4));
        mo1799c(2);
        return true;
    }

    /* renamed from: a */
    private int m3001a(View view, int i, int i2, int i3, int i4) {
        int b = m3009b(i3, (int) this.f1252D, (int) this.f1251C);
        int b2 = m3009b(i4, (int) this.f1252D, (int) this.f1251C);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        return (int) (((b2 != 0 ? ((float) abs4) / ((float) i5) : ((float) abs2) / ((float) i6)) * ((float) m3000a(i2, b2, this.f1256H.mo1810b(view)))) + ((b != 0 ? ((float) abs3) / ((float) i5) : ((float) abs) / ((float) i6)) * ((float) m3000a(i, b, this.f1256H.mo1765a(view)))));
    }

    /* renamed from: a */
    private int m3000a(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f1259K.getWidth();
        int i4 = width / 2;
        float b = (m3008b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * ((float) i4)) + ((float) i4);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(b / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(abs, f1248p);
    }

    /* renamed from: b */
    private int m3009b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            return -i3;
        }
        return i3;
    }

    /* renamed from: a */
    private float m2999a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            return -f3;
        }
        return f3;
    }

    /* renamed from: b */
    private float m3008b(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    /* renamed from: a */
    public void mo1785a(int i, int i2, int i3, int i4) {
        if (!this.f1258J) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f1255G.mo1978a(this.f1257I.getLeft(), this.f1257I.getTop(), (int) C0328D.m1323a(this.f1250B, this.f1263s), (int) C0328D.m1324b(this.f1250B, this.f1263s), i, i3, i2, i4);
        mo1799c(2);
    }

    /* renamed from: a */
    public boolean mo1791a(boolean z) {
        boolean z2;
        if (this.f1261q == 2) {
            boolean g = this.f1255G.mo1987g();
            int b = this.f1255G.mo1981b();
            int c = this.f1255G.mo1983c();
            int left = b - this.f1257I.getLeft();
            int top = c - this.f1257I.getTop();
            if (left != 0) {
                this.f1257I.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.f1257I.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f1256H.mo1772a(this.f1257I, b, c, left, top);
            }
            if (g && b == this.f1255G.mo1984d() && c == this.f1255G.mo1985e()) {
                this.f1255G.mo1988h();
                z2 = this.f1255G.mo1980a();
            } else {
                z2 = g;
            }
            if (!z2) {
                if (z) {
                    this.f1259K.post(this.f1260M);
                } else {
                    mo1799c(0);
                }
            }
        }
        return this.f1261q == 2;
    }

    /* renamed from: a */
    private void m3004a(float f, float f2) {
        this.f1258J = true;
        this.f1256H.mo1771a(this.f1257I, f, f2);
        this.f1258J = false;
        if (this.f1261q == 1) {
            mo1799c(0);
        }
    }

    /* renamed from: i */
    private void m3017i() {
        if (this.f1264t != null) {
            Arrays.fill(this.f1264t, 0.0f);
            Arrays.fill(this.f1265u, 0.0f);
            Arrays.fill(this.f1266v, 0.0f);
            Arrays.fill(this.f1267w, 0.0f);
            Arrays.fill(this.f1268x, 0);
            Arrays.fill(this.f1269y, 0);
            Arrays.fill(this.f1270z, 0);
            this.f1249A = 0;
        }
    }

    /* renamed from: f */
    private void m3015f(int i) {
        if (this.f1264t != null) {
            this.f1264t[i] = 0.0f;
            this.f1265u[i] = 0.0f;
            this.f1266v[i] = 0.0f;
            this.f1267w[i] = 0.0f;
            this.f1268x[i] = 0;
            this.f1269y[i] = 0;
            this.f1270z[i] = 0;
            this.f1249A &= (1 << i) ^ -1;
        }
    }

    /* renamed from: g */
    private void m3016g(int i) {
        if (this.f1264t == null || this.f1264t.length <= i) {
            float[] fArr = new float[(i + 1)];
            float[] fArr2 = new float[(i + 1)];
            float[] fArr3 = new float[(i + 1)];
            float[] fArr4 = new float[(i + 1)];
            int[] iArr = new int[(i + 1)];
            int[] iArr2 = new int[(i + 1)];
            int[] iArr3 = new int[(i + 1)];
            if (this.f1264t != null) {
                System.arraycopy(this.f1264t, 0, fArr, 0, this.f1264t.length);
                System.arraycopy(this.f1265u, 0, fArr2, 0, this.f1265u.length);
                System.arraycopy(this.f1266v, 0, fArr3, 0, this.f1266v.length);
                System.arraycopy(this.f1267w, 0, fArr4, 0, this.f1267w.length);
                System.arraycopy(this.f1268x, 0, iArr, 0, this.f1268x.length);
                System.arraycopy(this.f1269y, 0, iArr2, 0, this.f1269y.length);
                System.arraycopy(this.f1270z, 0, iArr3, 0, this.f1270z.length);
            }
            this.f1264t = fArr;
            this.f1265u = fArr2;
            this.f1266v = fArr3;
            this.f1267w = fArr4;
            this.f1268x = iArr;
            this.f1269y = iArr2;
            this.f1270z = iArr3;
        }
    }

    /* renamed from: a */
    private void m3005a(float f, float f2, int i) {
        m3016g(i);
        float[] fArr = this.f1264t;
        this.f1266v[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f1265u;
        this.f1267w[i] = f2;
        fArr2[i] = f2;
        this.f1268x[i] = m3014f((int) f, (int) f2);
        this.f1249A |= 1 << i;
    }

    /* renamed from: c */
    private void m3013c(MotionEvent motionEvent) {
        int c = C0505v.m2872c(motionEvent);
        for (int i = 0; i < c; i++) {
            int b = C0505v.m2870b(motionEvent, i);
            float c2 = C0505v.m2871c(motionEvent, i);
            float d = C0505v.m2873d(motionEvent, i);
            this.f1266v[b] = c2;
            this.f1267w[b] = d;
        }
    }

    /* renamed from: b */
    public boolean mo1794b(int i) {
        return (this.f1249A & (1 << i)) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1799c(int i) {
        if (this.f1261q != i) {
            this.f1261q = i;
            this.f1256H.mo1768a(i);
            if (i == 0) {
                this.f1257I = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo1796b(View view, int i) {
        if (view == this.f1257I && this.f1263s == i) {
            return true;
        }
        if (view == null || !this.f1256H.mo1773a(view, i)) {
            return false;
        }
        this.f1263s = i;
        mo1786a(view, i);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1790a(View view, boolean z, int i, int i2, int i3, int i4) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i3 + scrollX >= childAt.getLeft() && i3 + scrollX < childAt.getRight() && i4 + scrollY >= childAt.getTop() && i4 + scrollY < childAt.getBottom()) {
                    if (mo1790a(childAt, true, i, i2, (i3 + scrollX) - childAt.getLeft(), (i4 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && (C0333F.m1345a(view, -i) || C0333F.m1351b(view, -i2));
    }

    /* renamed from: a */
    public boolean mo1788a(MotionEvent motionEvent) {
        View e;
        View e2;
        int a = C0505v.m2867a(motionEvent);
        int b = C0505v.m2869b(motionEvent);
        if (a == 0) {
            mo1808g();
        }
        if (this.f1250B == null) {
            this.f1250B = VelocityTracker.obtain();
        }
        this.f1250B.addMovement(motionEvent);
        switch (a) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int b2 = C0505v.m2870b(motionEvent, 0);
                m3005a(x, y, b2);
                View e3 = mo1805e((int) x, (int) y);
                if (e3 == this.f1257I && this.f1261q == 2) {
                    mo1796b(e3, b2);
                }
                int i = this.f1268x[b2];
                if ((this.f1254F & i) != 0) {
                    this.f1256H.mo1769a(i & this.f1254F, b2);
                    break;
                }
                break;
            case 1:
            case 3:
                mo1808g();
                break;
            case 2:
                int c = C0505v.m2872c(motionEvent);
                int i2 = 0;
                while (i2 < c) {
                    int b3 = C0505v.m2870b(motionEvent, i2);
                    float c2 = C0505v.m2871c(motionEvent, i2);
                    float d = C0505v.m2873d(motionEvent, i2);
                    float f = c2 - this.f1264t[b3];
                    float f2 = d - this.f1265u[b3];
                    m3010b(f, f2, b3);
                    if (this.f1261q != 1 && ((e = mo1805e((int) c2, (int) d)) == null || !m3007a(e, f, f2) || !mo1796b(e, b3))) {
                        i2++;
                    }
                    m3013c(motionEvent);
                    break;
                }
                m3013c(motionEvent);
            case 5:
                int b4 = C0505v.m2870b(motionEvent, b);
                float c3 = C0505v.m2871c(motionEvent, b);
                float d2 = C0505v.m2873d(motionEvent, b);
                m3005a(c3, d2, b4);
                if (this.f1261q != 0) {
                    if (this.f1261q == 2 && (e2 = mo1805e((int) c3, (int) d2)) == this.f1257I) {
                        mo1796b(e2, b4);
                        break;
                    }
                } else {
                    int i3 = this.f1268x[b4];
                    if ((this.f1254F & i3) != 0) {
                        this.f1256H.mo1769a(i3 & this.f1254F, b4);
                        break;
                    }
                }
                break;
            case 6:
                m3015f(C0505v.m2870b(motionEvent, b));
                break;
        }
        if (this.f1261q == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo1793b(MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        int a = C0505v.m2867a(motionEvent);
        int b = C0505v.m2869b(motionEvent);
        if (a == 0) {
            mo1808g();
        }
        if (this.f1250B == null) {
            this.f1250B = VelocityTracker.obtain();
        }
        this.f1250B.addMovement(motionEvent);
        switch (a) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int b2 = C0505v.m2870b(motionEvent, 0);
                View e = mo1805e((int) x, (int) y);
                m3005a(x, y, b2);
                mo1796b(e, b2);
                int i3 = this.f1268x[b2];
                if ((this.f1254F & i3) != 0) {
                    this.f1256H.mo1769a(i3 & this.f1254F, b2);
                    return;
                }
                return;
            case 1:
                if (this.f1261q == 1) {
                    m3018j();
                }
                mo1808g();
                return;
            case 2:
                if (this.f1261q == 1) {
                    int a2 = C0505v.m2868a(motionEvent, this.f1263s);
                    float c = C0505v.m2871c(motionEvent, a2);
                    float d = C0505v.m2873d(motionEvent, a2);
                    int i4 = (int) (c - this.f1266v[this.f1263s]);
                    int i5 = (int) (d - this.f1267w[this.f1263s]);
                    m3012c(this.f1257I.getLeft() + i4, this.f1257I.getTop() + i5, i4, i5);
                    m3013c(motionEvent);
                    return;
                }
                int c2 = C0505v.m2872c(motionEvent);
                while (i2 < c2) {
                    int b3 = C0505v.m2870b(motionEvent, i2);
                    float c3 = C0505v.m2871c(motionEvent, i2);
                    float d2 = C0505v.m2873d(motionEvent, i2);
                    float f = c3 - this.f1264t[b3];
                    float f2 = d2 - this.f1265u[b3];
                    m3010b(f, f2, b3);
                    if (this.f1261q != 1) {
                        View e2 = mo1805e((int) c3, (int) d2);
                        if (!m3007a(e2, f, f2) || !mo1796b(e2, b3)) {
                            i2++;
                        }
                    }
                    m3013c(motionEvent);
                    return;
                }
                m3013c(motionEvent);
                return;
            case 3:
                if (this.f1261q == 1) {
                    m3004a(0.0f, 0.0f);
                }
                mo1808g();
                return;
            case 5:
                int b4 = C0505v.m2870b(motionEvent, b);
                float c4 = C0505v.m2871c(motionEvent, b);
                float d3 = C0505v.m2873d(motionEvent, b);
                m3005a(c4, d3, b4);
                if (this.f1261q == 0) {
                    mo1796b(mo1805e((int) c4, (int) d3), b4);
                    int i6 = this.f1268x[b4];
                    if ((this.f1254F & i6) != 0) {
                        this.f1256H.mo1769a(i6 & this.f1254F, b4);
                        return;
                    }
                    return;
                } else if (mo1803d((int) c4, (int) d3)) {
                    mo1796b(this.f1257I, b4);
                    return;
                } else {
                    return;
                }
            case 6:
                int b5 = C0505v.m2870b(motionEvent, b);
                if (this.f1261q == 1 && b5 == this.f1263s) {
                    int c5 = C0505v.m2872c(motionEvent);
                    while (true) {
                        if (i2 >= c5) {
                            i = -1;
                        } else {
                            int b6 = C0505v.m2870b(motionEvent, i2);
                            if (b6 != this.f1263s) {
                                if (mo1805e((int) C0505v.m2871c(motionEvent, i2), (int) C0505v.m2873d(motionEvent, i2)) == this.f1257I && mo1796b(this.f1257I, b6)) {
                                    i = this.f1263s;
                                }
                            }
                            i2++;
                        }
                    }
                    if (i == -1) {
                        m3018j();
                    }
                }
                m3015f(b5);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m3010b(float f, float f2, int i) {
        int i2 = 1;
        if (!m3006a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m3006a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m3006a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m3006a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f1269y;
            iArr[i] = iArr[i] | i2;
            this.f1256H.mo1775b(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m3006a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f1268x[i] & i2) != i2 || (this.f1254F & i2) == 0 || (this.f1270z[i] & i2) == i2 || (this.f1269y[i] & i2) == i2) {
            return false;
        }
        if (abs <= ((float) this.f1262r) && abs2 <= ((float) this.f1262r)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f1256H.mo1777b(i2)) {
            int[] iArr = this.f1270z;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f1269y[i] & i2) != 0 || abs <= ((float) this.f1262r)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private boolean m3007a(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.f1256H.mo1765a(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f1256H.mo1810b(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            if (z) {
                if (Math.abs(f) <= ((float) this.f1262r)) {
                    return false;
                }
                return true;
            } else if (!z2) {
                return false;
            } else {
                if (Math.abs(f2) <= ((float) this.f1262r)) {
                    return false;
                }
                return true;
            }
        } else if ((f * f) + (f2 * f2) <= ((float) (this.f1262r * this.f1262r))) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public boolean mo1802d(int i) {
        int length = this.f1264t.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo1795b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo1795b(int i, int i2) {
        boolean z;
        if (!mo1794b(i2)) {
            return false;
        }
        boolean z2 = (i & 1) == 1;
        if ((i & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        float f = this.f1266v[i2] - this.f1264t[i2];
        float f2 = this.f1267w[i2] - this.f1265u[i2];
        if (!z2 || !z) {
            if (z2) {
                if (Math.abs(f) <= ((float) this.f1262r)) {
                    return false;
                }
                return true;
            } else if (!z) {
                return false;
            } else {
                if (Math.abs(f2) <= ((float) this.f1262r)) {
                    return false;
                }
                return true;
            }
        } else if ((f * f) + (f2 * f2) <= ((float) (this.f1262r * this.f1262r))) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo1806e(int i) {
        int length = this.f1268x.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo1800c(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo1800c(int i, int i2) {
        return mo1794b(i2) && (this.f1268x[i2] & i) != 0;
    }

    /* renamed from: j */
    private void m3018j() {
        this.f1250B.computeCurrentVelocity(1000, this.f1251C);
        m3004a(m2999a(C0328D.m1323a(this.f1250B, this.f1263s), this.f1252D, this.f1251C), m2999a(C0328D.m1324b(this.f1250B, this.f1263s), this.f1252D, this.f1251C));
    }

    /* renamed from: c */
    private void m3012c(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int left = this.f1257I.getLeft();
        int top = this.f1257I.getTop();
        if (i3 != 0) {
            i5 = this.f1256H.mo1766a(this.f1257I, i, i3);
            this.f1257I.offsetLeftAndRight(i5 - left);
        } else {
            i5 = i;
        }
        if (i4 != 0) {
            i6 = this.f1256H.mo1774b(this.f1257I, i2, i4);
            this.f1257I.offsetTopAndBottom(i6 - top);
        } else {
            i6 = i2;
        }
        if (i3 != 0 || i4 != 0) {
            this.f1256H.mo1772a(this.f1257I, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: d */
    public boolean mo1803d(int i, int i2) {
        return mo1797b(this.f1257I, i, i2);
    }

    /* renamed from: b */
    public boolean mo1797b(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public View mo1805e(int i, int i2) {
        for (int childCount = this.f1259K.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f1259K.getChildAt(this.f1256H.mo1811c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: f */
    private int m3014f(int i, int i2) {
        int i3 = 0;
        if (i < this.f1259K.getLeft() + this.f1253E) {
            i3 = 1;
        }
        if (i2 < this.f1259K.getTop() + this.f1253E) {
            i3 |= 4;
        }
        if (i > this.f1259K.getRight() - this.f1253E) {
            i3 |= 2;
        }
        if (i2 > this.f1259K.getBottom() - this.f1253E) {
            return i3 | 8;
        }
        return i3;
    }
}
