package android.support.p001v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p001v4.p013h.C0264c;
import android.support.p001v4.view.p017a.C0418g;
import android.support.p001v4.view.p017a.C0442s;
import android.support.p001v4.widget.C0563i;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.cootek.smartinput5.engine.Settings;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: android.support.v4.view.ViewPager */
public class ViewPager extends ViewGroup {

    /* renamed from: W */
    private static final int f896W = -1;

    /* renamed from: a */
    public static final int f897a = 0;

    /* renamed from: ac */
    private static final int f898ac = 2;

    /* renamed from: aq */
    private static final int f899aq = 0;

    /* renamed from: ar */
    private static final int f900ar = 1;

    /* renamed from: as */
    private static final int f901as = 2;

    /* renamed from: av */
    private static final C0386i f902av = new C0386i();

    /* renamed from: b */
    public static final int f903b = 1;

    /* renamed from: c */
    public static final int f904c = 2;

    /* renamed from: d */
    private static final String f905d = "ViewPager";

    /* renamed from: e */
    private static final boolean f906e = false;

    /* renamed from: f */
    private static final boolean f907f = false;

    /* renamed from: g */
    private static final int f908g = 1;

    /* renamed from: h */
    private static final int f909h = 600;

    /* renamed from: i */
    private static final int f910i = 25;

    /* renamed from: j */
    private static final int f911j = 16;

    /* renamed from: k */
    private static final int f912k = 400;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final int[] f913l = {16842931};

    /* renamed from: n */
    private static final Comparator<C0379b> f914n = new C0375T();

    /* renamed from: o */
    private static final Interpolator f915o = new C0376U();

    /* renamed from: A */
    private Drawable f916A;

    /* renamed from: B */
    private int f917B;

    /* renamed from: C */
    private int f918C;

    /* renamed from: D */
    private float f919D = -3.4028235E38f;

    /* renamed from: E */
    private float f920E = Float.MAX_VALUE;

    /* renamed from: F */
    private int f921F;

    /* renamed from: G */
    private int f922G;

    /* renamed from: H */
    private boolean f923H;

    /* renamed from: I */
    private boolean f924I;

    /* renamed from: J */
    private boolean f925J;

    /* renamed from: K */
    private int f926K = 1;

    /* renamed from: L */
    private boolean f927L;

    /* renamed from: M */
    private boolean f928M;

    /* renamed from: N */
    private boolean f929N;

    /* renamed from: O */
    private int f930O;

    /* renamed from: P */
    private int f931P;

    /* renamed from: Q */
    private int f932Q;

    /* renamed from: R */
    private float f933R;

    /* renamed from: S */
    private float f934S;

    /* renamed from: T */
    private float f935T;

    /* renamed from: U */
    private float f936U;

    /* renamed from: V */
    private int f937V = -1;

    /* renamed from: X */
    private VelocityTracker f938X;

    /* renamed from: Y */
    private int f939Y;

    /* renamed from: Z */
    private int f940Z;

    /* renamed from: aa */
    private int f941aa;

    /* renamed from: ab */
    private int f942ab;

    /* renamed from: ad */
    private boolean f943ad;

    /* renamed from: ae */
    private long f944ae;

    /* renamed from: af */
    private C0563i f945af;

    /* renamed from: ag */
    private C0563i f946ag;

    /* renamed from: ah */
    private boolean f947ah = true;

    /* renamed from: ai */
    private boolean f948ai = false;

    /* renamed from: aj */
    private boolean f949aj;

    /* renamed from: ak */
    private int f950ak;

    /* renamed from: al */
    private C0382e f951al;

    /* renamed from: am */
    private C0382e f952am;

    /* renamed from: an */
    private C0381d f953an;

    /* renamed from: ao */
    private C0383f f954ao;

    /* renamed from: ap */
    private Method f955ap;

    /* renamed from: at */
    private int f956at;

    /* renamed from: au */
    private ArrayList<View> f957au;

    /* renamed from: aw */
    private final Runnable f958aw = new C0377V(this);

    /* renamed from: ax */
    private int f959ax = 0;

    /* renamed from: m */
    private int f960m;

    /* renamed from: p */
    private final ArrayList<C0379b> f961p = new ArrayList<>();

    /* renamed from: q */
    private final C0379b f962q = new C0379b();

    /* renamed from: r */
    private final Rect f963r = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C0510x f964s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f965t;

    /* renamed from: u */
    private int f966u = -1;

    /* renamed from: v */
    private Parcelable f967v = null;

    /* renamed from: w */
    private ClassLoader f968w = null;

    /* renamed from: x */
    private Scroller f969x;

    /* renamed from: y */
    private C0384g f970y;

    /* renamed from: z */
    private int f971z;

    /* renamed from: android.support.v4.view.ViewPager$a */
    interface C0378a {
    }

    /* renamed from: android.support.v4.view.ViewPager$d */
    interface C0381d {
        /* renamed from: a */
        void mo1143a(C0510x xVar, C0510x xVar2);
    }

    /* renamed from: android.support.v4.view.ViewPager$e */
    public interface C0382e {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* renamed from: android.support.v4.view.ViewPager$f */
    public interface C0383f {
        /* renamed from: a */
        void mo1224a(View view, float f);
    }

    /* renamed from: android.support.v4.view.ViewPager$b */
    static class C0379b {

        /* renamed from: a */
        Object f981a;

        /* renamed from: b */
        int f982b;

        /* renamed from: c */
        boolean f983c;

        /* renamed from: d */
        float f984d;

        /* renamed from: e */
        float f985e;

        C0379b() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$h */
    public static class C0385h implements C0382e {
        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }

        public void onPageScrollStateChanged(int i) {
        }
    }

    public ViewPager(Context context) {
        super(context);
        mo1156a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1156a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1156a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f969x = new Scroller(context, f915o);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f932Q = C0356N.m1659a(viewConfiguration);
        this.f939Y = (int) (400.0f * f);
        this.f940Z = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f945af = new C0563i(context);
        this.f946ag = new C0563i(context);
        this.f941aa = (int) (25.0f * f);
        this.f942ab = (int) (2.0f * f);
        this.f930O = (int) (16.0f * f);
        C0333F.m1340a((View) this, (C0399a) new C0380c());
        if (C0333F.m1355d(this) == 0) {
            C0333F.m1357d((View) this, 1);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f958aw);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.f959ax != i) {
            this.f959ax = i;
            if (this.f954ao != null) {
                m1706b(i != 0);
            }
            if (this.f951al != null) {
                this.f951al.onPageScrollStateChanged(i);
            }
        }
    }

    public void setAdapter(C0510x xVar) {
        if (this.f964s != null) {
            this.f964s.unregisterDataSetObserver(this.f970y);
            this.f964s.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f961p.size(); i++) {
                C0379b bVar = this.f961p.get(i);
                this.f964s.destroyItem((ViewGroup) this, bVar.f982b, bVar.f981a);
            }
            this.f964s.finishUpdate((ViewGroup) this);
            this.f961p.clear();
            m1711j();
            this.f965t = 0;
            scrollTo(0, 0);
        }
        C0510x xVar2 = this.f964s;
        this.f964s = xVar;
        this.f960m = 0;
        if (this.f964s != null) {
            if (this.f970y == null) {
                this.f970y = new C0384g(this, (C0375T) null);
            }
            this.f964s.registerDataSetObserver(this.f970y);
            this.f925J = false;
            boolean z = this.f947ah;
            this.f947ah = true;
            this.f960m = this.f964s.getCount();
            if (this.f966u >= 0) {
                this.f964s.restoreState(this.f967v, this.f968w);
                mo1162a(this.f966u, false, true);
                this.f966u = -1;
                this.f967v = null;
                this.f968w = null;
            } else if (!z) {
                mo1175c();
            } else {
                requestLayout();
            }
        }
        if (this.f953an != null && xVar2 != xVar) {
            this.f953an.mo1143a(xVar2, xVar);
        }
    }

    /* renamed from: j */
    private void m1711j() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f972a) {
                    removeViewAt(i2);
                    i2--;
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public C0510x getAdapter() {
        return this.f964s;
    }

    /* access modifiers changed from: package-private */
    public void setOnAdapterChangeListener(C0381d dVar) {
        this.f953an = dVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        boolean z;
        this.f925J = false;
        if (!this.f947ah) {
            z = true;
        } else {
            z = false;
        }
        mo1162a(i, z, false);
    }

    /* renamed from: a */
    public void mo1161a(int i, boolean z) {
        this.f925J = false;
        mo1162a(i, z, false);
    }

    public int getCurrentItem() {
        return this.f965t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1162a(int i, boolean z, boolean z2) {
        mo1163a(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1163a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.f964s == null || this.f964s.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f965t != i || this.f961p.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f964s.getCount()) {
                i = this.f964s.getCount() - 1;
            }
            int i3 = this.f926K;
            if (i > this.f965t + i3 || i < this.f965t - i3) {
                for (int i4 = 0; i4 < this.f961p.size(); i4++) {
                    this.f961p.get(i4).f983c = true;
                }
            }
            if (this.f965t != i) {
                z3 = true;
            }
            if (this.f947ah) {
                this.f965t = i;
                if (z3 && this.f951al != null) {
                    this.f951al.onPageSelected(i);
                }
                if (z3 && this.f952am != null) {
                    this.f952am.onPageSelected(i);
                }
                requestLayout();
                return;
            }
            mo1157a(i);
            m1699a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m1699a(int i, boolean z, int i2, boolean z2) {
        int i3;
        C0379b b = mo1170b(i);
        if (b != null) {
            i3 = (int) (Math.max(this.f919D, Math.min(b.f985e, this.f920E)) * ((float) getClientWidth()));
        } else {
            i3 = 0;
        }
        if (z) {
            mo1160a(i3, 0, i2);
            if (z2 && this.f951al != null) {
                this.f951al.onPageSelected(i);
            }
            if (z2 && this.f952am != null) {
                this.f952am.onPageSelected(i);
                return;
            }
            return;
        }
        if (z2 && this.f951al != null) {
            this.f951al.onPageSelected(i);
        }
        if (z2 && this.f952am != null) {
            this.f952am.onPageSelected(i);
        }
        m1703a(false);
        scrollTo(i3, 0);
        m1709e(i3);
    }

    public void setOnPageChangeListener(C0382e eVar) {
        this.f951al = eVar;
    }

    /* renamed from: a */
    public void mo1164a(boolean z, C0383f fVar) {
        boolean z2;
        int i = 1;
        if (Build.VERSION.SDK_INT >= 11) {
            boolean z3 = fVar != null;
            if (this.f954ao != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z3 != z2;
            this.f954ao = fVar;
            setChildrenDrawingOrderEnabledCompat(z3);
            if (z3) {
                if (z) {
                    i = 2;
                }
                this.f956at = i;
            } else {
                this.f956at = 0;
            }
            if (z4) {
                mo1175c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.f955ap == null) {
                Class<ViewGroup> cls = ViewGroup.class;
                try {
                    this.f955ap = cls.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (NoSuchMethodException e) {
                    Log.e(f905d, "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.f955ap.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e2) {
                Log.e(f905d, "Error changing children drawing order", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f956at == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.f957au.get(i2).getLayoutParams()).f977f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0382e mo1155a(C0382e eVar) {
        C0382e eVar2 = this.f952am;
        this.f952am = eVar;
        return eVar2;
    }

    public int getOffscreenPageLimit() {
        return this.f926K;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(f905d, "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f926K) {
            this.f926K = i;
            mo1175c();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f971z;
        this.f971z = i;
        int width = getWidth();
        m1698a(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.f971z;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f916A = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f916A;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f916A;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo1153a(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1159a(int i, int i2) {
        mo1160a(i, i2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1160a(int i, int i2, int i3) {
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m1703a(false);
            mo1175c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float a = (((float) i6) * mo1153a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / ((float) clientWidth)))) + ((float) i6);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(1000.0f * Math.abs(a / ((float) abs2))) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i4)) / ((((float) clientWidth) * this.f964s.getPageWidth(this.f965t)) + ((float) this.f971z))) + 1.0f) * 100.0f);
        }
        this.f969x.startScroll(scrollX, scrollY, i4, i5, Math.min(abs, f909h));
        C0333F.m1352c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0379b mo1171b(int i, int i2) {
        C0379b bVar = new C0379b();
        bVar.f982b = i;
        bVar.f981a = this.f964s.instantiateItem((ViewGroup) this, i);
        bVar.f984d = this.f964s.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f961p.size()) {
            this.f961p.add(bVar);
        } else {
            this.f961p.add(i2, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1173b() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int count = this.f964s.getCount();
        this.f960m = count;
        boolean z3 = this.f961p.size() < (this.f926K * 2) + 1 && this.f961p.size() < count;
        boolean z4 = false;
        int i3 = this.f965t;
        boolean z5 = z3;
        int i4 = 0;
        while (i4 < this.f961p.size()) {
            C0379b bVar = this.f961p.get(i4);
            int itemPosition = this.f964s.getItemPosition(bVar.f981a);
            if (itemPosition == -1) {
                i = i4;
                z = z4;
                i2 = i3;
                z2 = z5;
            } else if (itemPosition == -2) {
                this.f961p.remove(i4);
                int i5 = i4 - 1;
                if (!z4) {
                    this.f964s.startUpdate((ViewGroup) this);
                    z4 = true;
                }
                this.f964s.destroyItem((ViewGroup) this, bVar.f982b, bVar.f981a);
                if (this.f965t == bVar.f982b) {
                    i = i5;
                    z = z4;
                    i2 = Math.max(0, Math.min(this.f965t, count - 1));
                    z2 = true;
                } else {
                    i = i5;
                    z = z4;
                    i2 = i3;
                    z2 = true;
                }
            } else if (bVar.f982b != itemPosition) {
                if (bVar.f982b == this.f965t) {
                    i3 = itemPosition;
                }
                bVar.f982b = itemPosition;
                i = i4;
                z = z4;
                i2 = i3;
                z2 = true;
            } else {
                i = i4;
                z = z4;
                i2 = i3;
                z2 = z5;
            }
            z5 = z2;
            i3 = i2;
            z4 = z;
            i4 = i + 1;
        }
        if (z4) {
            this.f964s.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f961p, f914n);
        if (z5) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
                if (!layoutParams.f972a) {
                    layoutParams.f974c = 0.0f;
                }
            }
            mo1162a(i3, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1175c() {
        mo1157a(this.f965t);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ff, code lost:
        if (r2.f982b == r18.f965t) goto L_0x0101;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1157a(int r19) {
        /*
            r18 = this;
            r3 = 0
            r2 = 2
            r0 = r18
            int r4 = r0.f965t
            r0 = r19
            if (r4 == r0) goto L_0x033f
            r0 = r18
            int r2 = r0.f965t
            r0 = r19
            if (r2 >= r0) goto L_0x0030
            r2 = 66
        L_0x0014:
            r0 = r18
            int r3 = r0.f965t
            r0 = r18
            android.support.v4.view.ViewPager$b r3 = r0.mo1170b((int) r3)
            r0 = r19
            r1 = r18
            r1.f965t = r0
            r4 = r3
            r3 = r2
        L_0x0026:
            r0 = r18
            android.support.v4.view.x r2 = r0.f964s
            if (r2 != 0) goto L_0x0033
            r18.m1712k()
        L_0x002f:
            return
        L_0x0030:
            r2 = 17
            goto L_0x0014
        L_0x0033:
            r0 = r18
            boolean r2 = r0.f925J
            if (r2 == 0) goto L_0x003d
            r18.m1712k()
            goto L_0x002f
        L_0x003d:
            android.os.IBinder r2 = r18.getWindowToken()
            if (r2 == 0) goto L_0x002f
            r0 = r18
            android.support.v4.view.x r2 = r0.f964s
            r0 = r18
            r2.startUpdate((android.view.ViewGroup) r0)
            r0 = r18
            int r2 = r0.f926K
            r5 = 0
            r0 = r18
            int r6 = r0.f965t
            int r6 = r6 - r2
            int r11 = java.lang.Math.max(r5, r6)
            r0 = r18
            android.support.v4.view.x r5 = r0.f964s
            int r12 = r5.getCount()
            int r5 = r12 + -1
            r0 = r18
            int r6 = r0.f965t
            int r2 = r2 + r6
            int r13 = java.lang.Math.min(r5, r2)
            r0 = r18
            int r2 = r0.f960m
            if (r12 == r2) goto L_0x00da
            android.content.res.Resources r2 = r18.getResources()     // Catch:{ NotFoundException -> 0x00d0 }
            int r3 = r18.getId()     // Catch:{ NotFoundException -> 0x00d0 }
            java.lang.String r2 = r2.getResourceName(r3)     // Catch:{ NotFoundException -> 0x00d0 }
        L_0x007f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r4 = r4.append(r5)
            r0 = r18
            int r5 = r0.f960m
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ", found: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r12)
            java.lang.String r5 = " Pager id: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " Pager class: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.Class r4 = r18.getClass()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = " Problematic adapter: "
            java.lang.StringBuilder r2 = r2.append(r4)
            r0 = r18
            android.support.v4.view.x r4 = r0.f964s
            java.lang.Class r4 = r4.getClass()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L_0x00d0:
            r2 = move-exception
            int r2 = r18.getId()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            goto L_0x007f
        L_0x00da:
            r6 = 0
            r2 = 0
            r5 = r2
        L_0x00dd:
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            int r2 = r2.size()
            if (r5 >= r2) goto L_0x033c
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.ViewPager$b r2 = (android.support.p001v4.view.ViewPager.C0379b) r2
            int r7 = r2.f982b
            r0 = r18
            int r8 = r0.f965t
            if (r7 < r8) goto L_0x01cf
            int r7 = r2.f982b
            r0 = r18
            int r8 = r0.f965t
            if (r7 != r8) goto L_0x033c
        L_0x0101:
            if (r2 != 0) goto L_0x0339
            if (r12 <= 0) goto L_0x0339
            r0 = r18
            int r2 = r0.f965t
            r0 = r18
            android.support.v4.view.ViewPager$b r2 = r0.mo1171b(r2, r5)
            r10 = r2
        L_0x0110:
            if (r10 == 0) goto L_0x0180
            r9 = 0
            int r8 = r5 + -1
            if (r8 < 0) goto L_0x01d4
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            java.lang.Object r2 = r2.get(r8)
            android.support.v4.view.ViewPager$b r2 = (android.support.p001v4.view.ViewPager.C0379b) r2
        L_0x0121:
            int r14 = r18.getClientWidth()
            if (r14 > 0) goto L_0x01d7
            r6 = 0
        L_0x0128:
            r0 = r18
            int r7 = r0.f965t
            int r7 = r7 + -1
            r16 = r7
            r7 = r9
            r9 = r16
            r17 = r8
            r8 = r5
            r5 = r17
        L_0x0138:
            if (r9 < 0) goto L_0x0142
            int r15 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r15 < 0) goto L_0x0216
            if (r9 >= r11) goto L_0x0216
            if (r2 != 0) goto L_0x01e6
        L_0x0142:
            float r6 = r10.f984d
            int r9 = r8 + 1
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x017b
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            int r2 = r2.size()
            if (r9 >= r2) goto L_0x024c
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            java.lang.Object r2 = r2.get(r9)
            android.support.v4.view.ViewPager$b r2 = (android.support.p001v4.view.ViewPager.C0379b) r2
            r7 = r2
        L_0x0161:
            if (r14 > 0) goto L_0x024f
            r2 = 0
            r5 = r2
        L_0x0165:
            r0 = r18
            int r2 = r0.f965t
            int r2 = r2 + 1
            r16 = r2
            r2 = r7
            r7 = r9
            r9 = r16
        L_0x0171:
            if (r9 >= r12) goto L_0x017b
            int r11 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r11 < 0) goto L_0x029a
            if (r9 <= r13) goto L_0x029a
            if (r2 != 0) goto L_0x025c
        L_0x017b:
            r0 = r18
            r0.m1700a((android.support.p001v4.view.ViewPager.C0379b) r10, (int) r8, (android.support.p001v4.view.ViewPager.C0379b) r4)
        L_0x0180:
            r0 = r18
            android.support.v4.view.x r4 = r0.f964s
            r0 = r18
            int r5 = r0.f965t
            if (r10 == 0) goto L_0x02e8
            java.lang.Object r2 = r10.f981a
        L_0x018c:
            r0 = r18
            r4.setPrimaryItem((android.view.ViewGroup) r0, (int) r5, (java.lang.Object) r2)
            r0 = r18
            android.support.v4.view.x r2 = r0.f964s
            r0 = r18
            r2.finishUpdate((android.view.ViewGroup) r0)
            int r5 = r18.getChildCount()
            r2 = 0
            r4 = r2
        L_0x01a0:
            if (r4 >= r5) goto L_0x02eb
            r0 = r18
            android.view.View r6 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r2 = (android.support.p001v4.view.ViewPager.LayoutParams) r2
            r2.f977f = r4
            boolean r7 = r2.f972a
            if (r7 != 0) goto L_0x01cb
            float r7 = r2.f974c
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x01cb
            r0 = r18
            android.support.v4.view.ViewPager$b r6 = r0.mo1154a((android.view.View) r6)
            if (r6 == 0) goto L_0x01cb
            float r7 = r6.f984d
            r2.f974c = r7
            int r6 = r6.f982b
            r2.f976e = r6
        L_0x01cb:
            int r2 = r4 + 1
            r4 = r2
            goto L_0x01a0
        L_0x01cf:
            int r2 = r5 + 1
            r5 = r2
            goto L_0x00dd
        L_0x01d4:
            r2 = 0
            goto L_0x0121
        L_0x01d7:
            r6 = 1073741824(0x40000000, float:2.0)
            float r7 = r10.f984d
            float r6 = r6 - r7
            int r7 = r18.getPaddingLeft()
            float r7 = (float) r7
            float r15 = (float) r14
            float r7 = r7 / r15
            float r6 = r6 + r7
            goto L_0x0128
        L_0x01e6:
            int r15 = r2.f982b
            if (r9 != r15) goto L_0x0210
            boolean r15 = r2.f983c
            if (r15 != 0) goto L_0x0210
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r15 = r0.f961p
            r15.remove(r5)
            r0 = r18
            android.support.v4.view.x r15 = r0.f964s
            java.lang.Object r2 = r2.f981a
            r0 = r18
            r15.destroyItem((android.view.ViewGroup) r0, (int) r9, (java.lang.Object) r2)
            int r5 = r5 + -1
            int r8 = r8 + -1
            if (r5 < 0) goto L_0x0214
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.ViewPager$b r2 = (android.support.p001v4.view.ViewPager.C0379b) r2
        L_0x0210:
            int r9 = r9 + -1
            goto L_0x0138
        L_0x0214:
            r2 = 0
            goto L_0x0210
        L_0x0216:
            if (r2 == 0) goto L_0x0230
            int r15 = r2.f982b
            if (r9 != r15) goto L_0x0230
            float r2 = r2.f984d
            float r7 = r7 + r2
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x022e
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.ViewPager$b r2 = (android.support.p001v4.view.ViewPager.C0379b) r2
            goto L_0x0210
        L_0x022e:
            r2 = 0
            goto L_0x0210
        L_0x0230:
            int r2 = r5 + 1
            r0 = r18
            android.support.v4.view.ViewPager$b r2 = r0.mo1171b(r9, r2)
            float r2 = r2.f984d
            float r7 = r7 + r2
            int r8 = r8 + 1
            if (r5 < 0) goto L_0x024a
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.ViewPager$b r2 = (android.support.p001v4.view.ViewPager.C0379b) r2
            goto L_0x0210
        L_0x024a:
            r2 = 0
            goto L_0x0210
        L_0x024c:
            r7 = 0
            goto L_0x0161
        L_0x024f:
            int r2 = r18.getPaddingRight()
            float r2 = (float) r2
            float r5 = (float) r14
            float r2 = r2 / r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 + r5
            r5 = r2
            goto L_0x0165
        L_0x025c:
            int r11 = r2.f982b
            if (r9 != r11) goto L_0x0332
            boolean r11 = r2.f983c
            if (r11 != 0) goto L_0x0332
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r11 = r0.f961p
            r11.remove(r7)
            r0 = r18
            android.support.v4.view.x r11 = r0.f964s
            java.lang.Object r2 = r2.f981a
            r0 = r18
            r11.destroyItem((android.view.ViewGroup) r0, (int) r9, (java.lang.Object) r2)
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x0298
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            java.lang.Object r2 = r2.get(r7)
            android.support.v4.view.ViewPager$b r2 = (android.support.p001v4.view.ViewPager.C0379b) r2
        L_0x028a:
            r16 = r6
            r6 = r2
            r2 = r16
        L_0x028f:
            int r9 = r9 + 1
            r16 = r2
            r2 = r6
            r6 = r16
            goto L_0x0171
        L_0x0298:
            r2 = 0
            goto L_0x028a
        L_0x029a:
            if (r2 == 0) goto L_0x02c1
            int r11 = r2.f982b
            if (r9 != r11) goto L_0x02c1
            float r2 = r2.f984d
            float r6 = r6 + r2
            int r7 = r7 + 1
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x02bf
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            java.lang.Object r2 = r2.get(r7)
            android.support.v4.view.ViewPager$b r2 = (android.support.p001v4.view.ViewPager.C0379b) r2
        L_0x02b9:
            r16 = r6
            r6 = r2
            r2 = r16
            goto L_0x028f
        L_0x02bf:
            r2 = 0
            goto L_0x02b9
        L_0x02c1:
            r0 = r18
            android.support.v4.view.ViewPager$b r2 = r0.mo1171b(r9, r7)
            int r7 = r7 + 1
            float r2 = r2.f984d
            float r6 = r6 + r2
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x02e6
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f961p
            java.lang.Object r2 = r2.get(r7)
            android.support.v4.view.ViewPager$b r2 = (android.support.p001v4.view.ViewPager.C0379b) r2
        L_0x02e0:
            r16 = r6
            r6 = r2
            r2 = r16
            goto L_0x028f
        L_0x02e6:
            r2 = 0
            goto L_0x02e0
        L_0x02e8:
            r2 = 0
            goto L_0x018c
        L_0x02eb:
            r18.m1712k()
            boolean r2 = r18.hasFocus()
            if (r2 == 0) goto L_0x002f
            android.view.View r2 = r18.findFocus()
            if (r2 == 0) goto L_0x0330
            r0 = r18
            android.support.v4.view.ViewPager$b r2 = r0.mo1172b((android.view.View) r2)
        L_0x0300:
            if (r2 == 0) goto L_0x030a
            int r2 = r2.f982b
            r0 = r18
            int r4 = r0.f965t
            if (r2 == r4) goto L_0x002f
        L_0x030a:
            r2 = 0
        L_0x030b:
            int r4 = r18.getChildCount()
            if (r2 >= r4) goto L_0x002f
            r0 = r18
            android.view.View r4 = r0.getChildAt(r2)
            r0 = r18
            android.support.v4.view.ViewPager$b r5 = r0.mo1154a((android.view.View) r4)
            if (r5 == 0) goto L_0x032d
            int r5 = r5.f982b
            r0 = r18
            int r6 = r0.f965t
            if (r5 != r6) goto L_0x032d
            boolean r4 = r4.requestFocus(r3)
            if (r4 != 0) goto L_0x002f
        L_0x032d:
            int r2 = r2 + 1
            goto L_0x030b
        L_0x0330:
            r2 = 0
            goto L_0x0300
        L_0x0332:
            r16 = r6
            r6 = r2
            r2 = r16
            goto L_0x028f
        L_0x0339:
            r10 = r2
            goto L_0x0110
        L_0x033c:
            r2 = r6
            goto L_0x0101
        L_0x033f:
            r4 = r3
            r3 = r2
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.view.ViewPager.mo1157a(int):void");
    }

    /* renamed from: k */
    private void m1712k() {
        if (this.f956at != 0) {
            if (this.f957au == null) {
                this.f957au = new ArrayList<>();
            } else {
                this.f957au.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f957au.add(getChildAt(i));
            }
            Collections.sort(this.f957au, f902av);
        }
    }

    /* renamed from: a */
    private void m1700a(C0379b bVar, int i, C0379b bVar2) {
        float f;
        C0379b bVar3;
        C0379b bVar4;
        int count = this.f964s.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = ((float) this.f971z) / ((float) clientWidth);
        } else {
            f = 0.0f;
        }
        if (bVar2 != null) {
            int i2 = bVar2.f982b;
            if (i2 < bVar.f982b) {
                float f2 = bVar2.f985e + bVar2.f984d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f982b && i4 < this.f961p.size()) {
                    Object obj = this.f961p.get(i4);
                    while (true) {
                        bVar4 = (C0379b) obj;
                        if (i3 > bVar4.f982b && i4 < this.f961p.size() - 1) {
                            i4++;
                            obj = this.f961p.get(i4);
                        }
                    }
                    while (i3 < bVar4.f982b) {
                        f2 += this.f964s.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f985e = f2;
                    f2 += bVar4.f984d + f;
                    i3++;
                }
            } else if (i2 > bVar.f982b) {
                int size = this.f961p.size() - 1;
                float f3 = bVar2.f985e;
                int i5 = i2 - 1;
                while (i5 >= bVar.f982b && size >= 0) {
                    Object obj2 = this.f961p.get(size);
                    while (true) {
                        bVar3 = (C0379b) obj2;
                        if (i5 < bVar3.f982b && size > 0) {
                            size--;
                            obj2 = this.f961p.get(size);
                        }
                    }
                    while (i5 > bVar3.f982b) {
                        f3 -= this.f964s.getPageWidth(i5) + f;
                        i5--;
                    }
                    f3 -= bVar3.f984d + f;
                    bVar3.f985e = f3;
                    i5--;
                }
            }
        }
        int size2 = this.f961p.size();
        float f4 = bVar.f985e;
        int i6 = bVar.f982b - 1;
        this.f919D = bVar.f982b == 0 ? bVar.f985e : -3.4028235E38f;
        this.f920E = bVar.f982b == count + -1 ? (bVar.f985e + bVar.f984d) - 1.0f : Float.MAX_VALUE;
        for (int i7 = i - 1; i7 >= 0; i7--) {
            C0379b bVar5 = this.f961p.get(i7);
            float f5 = f4;
            while (i6 > bVar5.f982b) {
                f5 -= this.f964s.getPageWidth(i6) + f;
                i6--;
            }
            f4 = f5 - (bVar5.f984d + f);
            bVar5.f985e = f4;
            if (bVar5.f982b == 0) {
                this.f919D = f4;
            }
            i6--;
        }
        float f6 = bVar.f985e + bVar.f984d + f;
        int i8 = bVar.f982b + 1;
        for (int i9 = i + 1; i9 < size2; i9++) {
            C0379b bVar6 = this.f961p.get(i9);
            float f7 = f6;
            while (i8 < bVar6.f982b) {
                f7 = this.f964s.getPageWidth(i8) + f + f7;
                i8++;
            }
            if (bVar6.f982b == count - 1) {
                this.f920E = (bVar6.f984d + f7) - 1.0f;
            }
            bVar6.f985e = f7;
            f6 = f7 + bVar6.f984d + f;
            i8++;
        }
        this.f948ai = false;
    }

    /* renamed from: android.support.v4.view.ViewPager$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = C0264c.m1052a(new C0387W());

        /* renamed from: a */
        int f978a;

        /* renamed from: b */
        Parcelable f979b;

        /* renamed from: c */
        ClassLoader f980c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f978a);
            parcel.writeParcelable(this.f979b, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f978a + "}";
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f978a = parcel.readInt();
            this.f979b = parcel.readParcelable(classLoader);
            this.f980c = classLoader;
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f978a = this.f965t;
        if (this.f964s != null) {
            savedState.f979b = this.f964s.saveState();
        }
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f964s != null) {
            this.f964s.restoreState(savedState.f979b, savedState.f980c);
            mo1162a(savedState.f978a, false, true);
            return;
        }
        this.f966u = savedState.f978a;
        this.f967v = savedState.f979b;
        this.f968w = savedState.f980c;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams2 = generateLayoutParams(layoutParams);
        } else {
            layoutParams2 = layoutParams;
        }
        LayoutParams layoutParams3 = (LayoutParams) layoutParams2;
        layoutParams3.f972a |= view instanceof C0378a;
        if (!this.f923H) {
            super.addView(view, i, layoutParams2);
        } else if (layoutParams3 == null || !layoutParams3.f972a) {
            layoutParams3.f975d = true;
            addViewInLayout(view, i, layoutParams2);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void removeView(View view) {
        if (this.f923H) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0379b mo1154a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f961p.size()) {
                return null;
            }
            C0379b bVar = this.f961p.get(i2);
            if (this.f964s.isViewFromObject(view, bVar.f981a)) {
                return bVar;
            }
            i = i2 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0379b mo1172b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo1154a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0379b mo1170b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f961p.size()) {
                return null;
            }
            C0379b bVar = this.f961p.get(i3);
            if (bVar.f982b == i) {
                return bVar;
            }
            i2 = i3 + 1;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f947ah = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r0 = getDefaultSize(r0, r14)
            r1 = 0
            int r1 = getDefaultSize(r1, r15)
            r13.setMeasuredDimension(r0, r1)
            int r0 = r13.getMeasuredWidth()
            int r1 = r0 / 10
            int r2 = r13.f930O
            int r1 = java.lang.Math.min(r1, r2)
            r13.f931P = r1
            int r1 = r13.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r13.getPaddingRight()
            int r3 = r0 - r1
            int r0 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r0 = r0 - r1
            int r1 = r13.getPaddingBottom()
            int r5 = r0 - r1
            int r9 = r13.getChildCount()
            r0 = 0
            r8 = r0
        L_0x003b:
            if (r8 >= r9) goto L_0x00bc
            android.view.View r10 = r13.getChildAt(r8)
            int r0 = r10.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x00a5
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r0 = (android.support.p001v4.view.ViewPager.LayoutParams) r0
            if (r0 == 0) goto L_0x00a5
            boolean r1 = r0.f972a
            if (r1 == 0) goto L_0x00a5
            int r1 = r0.f973b
            r6 = r1 & 7
            int r1 = r0.f973b
            r4 = r1 & 112(0x70, float:1.57E-43)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 48
            if (r4 == r7) goto L_0x0069
            r7 = 80
            if (r4 != r7) goto L_0x00a9
        L_0x0069:
            r4 = 1
            r7 = r4
        L_0x006b:
            r4 = 3
            if (r6 == r4) goto L_0x0071
            r4 = 5
            if (r6 != r4) goto L_0x00ac
        L_0x0071:
            r4 = 1
            r6 = r4
        L_0x0073:
            if (r7 == 0) goto L_0x00af
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0077:
            int r4 = r0.width
            r11 = -2
            if (r4 == r11) goto L_0x010f
            r4 = 1073741824(0x40000000, float:2.0)
            int r2 = r0.width
            r11 = -1
            if (r2 == r11) goto L_0x010c
            int r2 = r0.width
        L_0x0085:
            int r11 = r0.height
            r12 = -2
            if (r11 == r12) goto L_0x010a
            r1 = 1073741824(0x40000000, float:2.0)
            int r11 = r0.height
            r12 = -1
            if (r11 == r12) goto L_0x010a
            int r0 = r0.height
        L_0x0093:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r10.measure(r2, r0)
            if (r7 == 0) goto L_0x00b4
            int r0 = r10.getMeasuredHeight()
            int r5 = r5 - r0
        L_0x00a5:
            int r0 = r8 + 1
            r8 = r0
            goto L_0x003b
        L_0x00a9:
            r4 = 0
            r7 = r4
            goto L_0x006b
        L_0x00ac:
            r4 = 0
            r6 = r4
            goto L_0x0073
        L_0x00af:
            if (r6 == 0) goto L_0x0077
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0077
        L_0x00b4:
            if (r6 == 0) goto L_0x00a5
            int r0 = r10.getMeasuredWidth()
            int r3 = r3 - r0
            goto L_0x00a5
        L_0x00bc:
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r13.f921F = r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            r13.f922G = r0
            r0 = 1
            r13.f923H = r0
            r13.mo1175c()
            r0 = 0
            r13.f923H = r0
            int r2 = r13.getChildCount()
            r0 = 0
            r1 = r0
        L_0x00db:
            if (r1 >= r2) goto L_0x0109
            android.view.View r4 = r13.getChildAt(r1)
            int r0 = r4.getVisibility()
            r5 = 8
            if (r0 == r5) goto L_0x0105
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r0 = (android.support.p001v4.view.ViewPager.LayoutParams) r0
            if (r0 == 0) goto L_0x00f5
            boolean r5 = r0.f972a
            if (r5 != 0) goto L_0x0105
        L_0x00f5:
            float r5 = (float) r3
            float r0 = r0.f974c
            float r0 = r0 * r5
            int r0 = (int) r0
            r5 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            int r5 = r13.f922G
            r4.measure(r0, r5)
        L_0x0105:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x00db
        L_0x0109:
            return
        L_0x010a:
            r0 = r5
            goto L_0x0093
        L_0x010c:
            r2 = r3
            goto L_0x0085
        L_0x010f:
            r4 = r2
            r2 = r3
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.view.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m1698a(i, i3, this.f971z, this.f971z);
        }
    }

    /* renamed from: a */
    private void m1698a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f961p.isEmpty()) {
            C0379b b = mo1170b(this.f965t);
            int min = (int) ((b != null ? Math.min(b.f985e, this.f920E) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m1703a(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))));
        scrollTo(paddingLeft, getScrollY());
        if (!this.f969x.isFinished()) {
            this.f969x.startScroll(paddingLeft, 0, (int) (mo1170b(this.f965t).f985e * ((float) i)), 0, this.f969x.getDuration() - this.f969x.timePassed());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0379b a;
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        int i8;
        int i9;
        int childCount = getChildCount();
        int i10 = i3 - i;
        int i11 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i12 = 0;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f972a) {
                    int i14 = layoutParams.f973b & 7;
                    int i15 = layoutParams.f973b & 112;
                    switch (i14) {
                        case 1:
                            i7 = Math.max((i10 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 3:
                            i7 = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            int measuredWidth = (i10 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            i7 = measuredWidth;
                            break;
                        default:
                            i7 = paddingLeft;
                            break;
                    }
                    switch (i15) {
                        case 16:
                            measuredHeight = Math.max((i11 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            int i16 = paddingBottom;
                            i8 = paddingTop;
                            i9 = i16;
                            break;
                        case 48:
                            int measuredHeight2 = childAt.getMeasuredHeight() + paddingTop;
                            int i17 = paddingTop;
                            i9 = paddingBottom;
                            i8 = measuredHeight2;
                            measuredHeight = i17;
                            break;
                        case Settings.SKIN /*80*/:
                            measuredHeight = (i11 - paddingBottom) - childAt.getMeasuredHeight();
                            int measuredHeight3 = paddingBottom + childAt.getMeasuredHeight();
                            i8 = paddingTop;
                            i9 = measuredHeight3;
                            break;
                        default:
                            measuredHeight = paddingTop;
                            int i18 = paddingBottom;
                            i8 = paddingTop;
                            i9 = i18;
                            break;
                    }
                    int i19 = i7 + scrollX;
                    childAt.layout(i19, measuredHeight, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + measuredHeight);
                    i5 = i12 + 1;
                    i6 = i8;
                    paddingBottom = i9;
                    i13++;
                    paddingLeft = paddingLeft;
                    paddingRight = paddingRight;
                    paddingTop = i6;
                    i12 = i5;
                }
            }
            i5 = i12;
            i6 = paddingTop;
            i13++;
            paddingLeft = paddingLeft;
            paddingRight = paddingRight;
            paddingTop = i6;
            i12 = i5;
        }
        int i20 = (i10 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f972a && (a = mo1154a(childAt2)) != null) {
                    int i22 = ((int) (a.f985e * ((float) i20))) + paddingLeft;
                    if (layoutParams2.f975d) {
                        layoutParams2.f975d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (layoutParams2.f974c * ((float) i20)), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f917B = paddingTop;
        this.f918C = i11 - paddingBottom;
        this.f950ak = i12;
        if (this.f947ah) {
            m1699a(this.f965t, false, 0, false);
        }
        this.f947ah = false;
    }

    public void computeScroll() {
        if (this.f969x.isFinished() || !this.f969x.computeScrollOffset()) {
            m1703a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f969x.getCurrX();
        int currY = this.f969x.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m1709e(currX)) {
                this.f969x.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0333F.m1352c(this);
    }

    /* renamed from: e */
    private boolean m1709e(int i) {
        if (this.f961p.size() == 0) {
            this.f949aj = false;
            mo1158a(0, 0.0f, 0);
            if (this.f949aj) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0379b l = m1713l();
        int clientWidth = getClientWidth();
        int i2 = this.f971z + clientWidth;
        float f = ((float) this.f971z) / ((float) clientWidth);
        int i3 = l.f982b;
        float f2 = ((((float) i) / ((float) clientWidth)) - l.f985e) / (l.f984d + f);
        this.f949aj = false;
        mo1158a(i3, f2, (int) (((float) i2) * f2));
        if (this.f949aj) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1158a(int i, float f, int i2) {
        int measuredWidth;
        int i3;
        int i4;
        if (this.f950ak > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (!layoutParams.f972a) {
                    int i6 = paddingRight;
                    i3 = paddingLeft;
                    i4 = i6;
                } else {
                    switch (layoutParams.f973b & 7) {
                        case 1:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            int i7 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i7;
                            break;
                        case 3:
                            int width2 = childAt.getWidth() + paddingLeft;
                            int i8 = paddingLeft;
                            i4 = paddingRight;
                            i3 = width2;
                            measuredWidth = i8;
                            break;
                        case 5:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            int measuredWidth2 = paddingRight + childAt.getMeasuredWidth();
                            i3 = paddingLeft;
                            i4 = measuredWidth2;
                            break;
                        default:
                            measuredWidth = paddingLeft;
                            int i9 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i9;
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                }
                i5++;
                int i10 = i4;
                paddingLeft = i3;
                paddingRight = i10;
            }
        }
        if (this.f951al != null) {
            this.f951al.onPageScrolled(i, f, i2);
        }
        if (this.f952am != null) {
            this.f952am.onPageScrolled(i, f, i2);
        }
        if (this.f954ao != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((LayoutParams) childAt2.getLayoutParams()).f972a) {
                    this.f954ao.mo1224a(childAt2, ((float) (childAt2.getLeft() - scrollX2)) / ((float) getClientWidth()));
                }
            }
        }
        this.f949aj = true;
    }

    /* renamed from: a */
    private void m1703a(boolean z) {
        boolean z2 = this.f959ax == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f969x.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f969x.getCurrX();
            int currY = this.f969x.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f925J = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f961p.size(); i++) {
            C0379b bVar = this.f961p.get(i);
            if (bVar.f983c) {
                bVar.f983c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            C0333F.m1342a((View) this, this.f958aw);
        } else {
            this.f958aw.run();
        }
    }

    /* renamed from: a */
    private boolean m1704a(float f, float f2) {
        return (f < ((float) this.f931P) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f931P)) && f2 < 0.0f);
    }

    /* renamed from: b */
    private void m1706b(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            C0333F.m1337a(getChildAt(i2), i, (Paint) null);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f927L = false;
            this.f928M = false;
            this.f937V = -1;
            if (this.f938X == null) {
                return false;
            }
            this.f938X.recycle();
            this.f938X = null;
            return false;
        }
        if (action != 0) {
            if (this.f927L) {
                return true;
            }
            if (this.f928M) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.f935T = x;
                this.f933R = x;
                float y = motionEvent.getY();
                this.f936U = y;
                this.f934S = y;
                this.f937V = C0505v.m2870b(motionEvent, 0);
                this.f928M = false;
                this.f969x.computeScrollOffset();
                if (this.f959ax == 2 && Math.abs(this.f969x.getFinalX() - this.f969x.getCurrX()) > this.f942ab) {
                    this.f969x.abortAnimation();
                    this.f925J = false;
                    mo1175c();
                    this.f927L = true;
                    m1707c(true);
                    setScrollState(1);
                    break;
                } else {
                    m1703a(false);
                    this.f927L = false;
                    break;
                }
                break;
            case 2:
                int i = this.f937V;
                if (i != -1) {
                    int a = C0505v.m2868a(motionEvent, i);
                    float c = C0505v.m2871c(motionEvent, a);
                    float f = c - this.f933R;
                    float abs = Math.abs(f);
                    float d = C0505v.m2873d(motionEvent, a);
                    float abs2 = Math.abs(d - this.f936U);
                    if (f != 0.0f && !m1704a(this.f933R, f)) {
                        if (mo1166a(this, false, (int) f, (int) c, (int) d)) {
                            this.f933R = c;
                            this.f934S = d;
                            this.f928M = true;
                            return false;
                        }
                    }
                    if (abs > ((float) this.f932Q) && 0.5f * abs > abs2) {
                        this.f927L = true;
                        m1707c(true);
                        setScrollState(1);
                        this.f933R = f > 0.0f ? this.f935T + ((float) this.f932Q) : this.f935T - ((float) this.f932Q);
                        this.f934S = d;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) this.f932Q)) {
                        this.f928M = true;
                    }
                    if (this.f927L && m1708c(c)) {
                        C0333F.m1352c(this);
                        break;
                    }
                }
                break;
            case 6:
                m1702a(motionEvent);
                break;
        }
        if (this.f938X == null) {
            this.f938X = VelocityTracker.obtain();
        }
        this.f938X.addMovement(motionEvent);
        return this.f927L;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z = false;
        if (this.f943ad) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f964s == null || this.f964s.getCount() == 0) {
            return false;
        }
        if (this.f938X == null) {
            this.f938X = VelocityTracker.obtain();
        }
        this.f938X.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f969x.abortAnimation();
                this.f925J = false;
                mo1175c();
                float x = motionEvent.getX();
                this.f935T = x;
                this.f933R = x;
                float y = motionEvent.getY();
                this.f936U = y;
                this.f934S = y;
                this.f937V = C0505v.m2870b(motionEvent, 0);
                break;
            case 1:
                if (this.f927L) {
                    VelocityTracker velocityTracker = this.f938X;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f940Z);
                    int a = (int) C0328D.m1323a(velocityTracker, this.f937V);
                    this.f925J = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C0379b l = m1713l();
                    mo1163a(m1695a(l.f982b, ((((float) scrollX) / ((float) clientWidth)) - l.f985e) / l.f984d, a, (int) (C0505v.m2871c(motionEvent, C0505v.m2868a(motionEvent, this.f937V)) - this.f935T)), true, true, a);
                    this.f937V = -1;
                    m1714m();
                    z = this.f946ag.mo1952c() | this.f945af.mo1952c();
                    break;
                }
                break;
            case 2:
                if (!this.f927L) {
                    int a2 = C0505v.m2868a(motionEvent, this.f937V);
                    float c = C0505v.m2871c(motionEvent, a2);
                    float abs = Math.abs(c - this.f933R);
                    float d = C0505v.m2873d(motionEvent, a2);
                    float abs2 = Math.abs(d - this.f934S);
                    if (abs > ((float) this.f932Q) && abs > abs2) {
                        this.f927L = true;
                        m1707c(true);
                        if (c - this.f935T > 0.0f) {
                            f = this.f935T + ((float) this.f932Q);
                        } else {
                            f = this.f935T - ((float) this.f932Q);
                        }
                        this.f933R = f;
                        this.f934S = d;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f927L) {
                    z = false | m1708c(C0505v.m2871c(motionEvent, C0505v.m2868a(motionEvent, this.f937V)));
                    break;
                }
                break;
            case 3:
                if (this.f927L) {
                    m1699a(this.f965t, true, 0, false);
                    this.f937V = -1;
                    m1714m();
                    z = this.f946ag.mo1952c() | this.f945af.mo1952c();
                    break;
                }
                break;
            case 5:
                int b = C0505v.m2869b(motionEvent);
                this.f933R = C0505v.m2871c(motionEvent, b);
                this.f937V = C0505v.m2870b(motionEvent, b);
                break;
            case 6:
                m1702a(motionEvent);
                this.f933R = C0505v.m2871c(motionEvent, C0505v.m2868a(motionEvent, this.f937V));
                break;
        }
        if (z) {
            C0333F.m1352c(this);
        }
        return true;
    }

    /* renamed from: c */
    private void m1707c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private boolean m1708c(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        this.f933R = f;
        float scrollX = ((float) getScrollX()) + (this.f933R - f);
        int clientWidth = getClientWidth();
        float f3 = ((float) clientWidth) * this.f919D;
        float f4 = ((float) clientWidth) * this.f920E;
        C0379b bVar = this.f961p.get(0);
        C0379b bVar2 = this.f961p.get(this.f961p.size() - 1);
        if (bVar.f982b != 0) {
            f3 = bVar.f985e * ((float) clientWidth);
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f982b != this.f964s.getCount() - 1) {
            f2 = bVar2.f985e * ((float) clientWidth);
            z2 = false;
        } else {
            f2 = f4;
        }
        if (scrollX < f3) {
            if (z) {
                z3 = this.f945af.mo1948a(Math.abs(f3 - scrollX) / ((float) clientWidth));
            }
        } else if (scrollX > f2) {
            if (z2) {
                z3 = this.f946ag.mo1948a(Math.abs(scrollX - f2) / ((float) clientWidth));
            }
            f3 = f2;
        } else {
            f3 = scrollX;
        }
        this.f933R += f3 - ((float) ((int) f3));
        scrollTo((int) f3, getScrollY());
        m1709e((int) f3);
        return z3;
    }

    /* renamed from: l */
    private C0379b m1713l() {
        float f;
        int i;
        C0379b bVar;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        if (clientWidth > 0) {
            f = ((float) this.f971z) / ((float) clientWidth);
        } else {
            f = 0.0f;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        C0379b bVar2 = null;
        while (i3 < this.f961p.size()) {
            C0379b bVar3 = this.f961p.get(i3);
            if (z || bVar3.f982b == i2 + 1) {
                C0379b bVar4 = bVar3;
                i = i3;
                bVar = bVar4;
            } else {
                C0379b bVar5 = this.f962q;
                bVar5.f985e = f2 + f3 + f;
                bVar5.f982b = i2 + 1;
                bVar5.f984d = this.f964s.getPageWidth(bVar5.f982b);
                C0379b bVar6 = bVar5;
                i = i3 - 1;
                bVar = bVar6;
            }
            float f4 = bVar.f985e;
            float f5 = bVar.f984d + f4 + f;
            if (!z && scrollX < f4) {
                return bVar2;
            }
            if (scrollX < f5 || i == this.f961p.size() - 1) {
                return bVar;
            }
            f3 = f4;
            i2 = bVar.f982b;
            z = false;
            f2 = bVar.f984d;
            bVar2 = bVar;
            i3 = i + 1;
        }
        return bVar2;
    }

    /* renamed from: a */
    private int m1695a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f941aa || Math.abs(i2) <= this.f939Y) {
            i = (int) ((i >= this.f965t ? 0.4f : 0.6f) + ((float) i) + f);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f961p.size() > 0) {
            return Math.max(this.f961p.get(0).f982b, Math.min(i, this.f961p.get(this.f961p.size() - 1).f982b));
        }
        return i;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        int a = C0333F.m1334a(this);
        if (a == 0 || (a == 1 && this.f964s != null && this.f964s.getCount() > 1)) {
            if (!this.f945af.mo1947a()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f919D * ((float) width));
                this.f945af.mo1946a(height, width);
                z = false | this.f945af.mo1950a(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f946ag.mo1947a()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f920E + 1.0f)) * ((float) width2));
                this.f946ag.mo1946a(height2, width2);
                z |= this.f946ag.mo1950a(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f945af.mo1951b();
            this.f946ag.mo1951b();
        }
        if (z) {
            C0333F.m1352c(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f971z > 0 && this.f916A != null && this.f961p.size() > 0 && this.f964s != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = ((float) this.f971z) / ((float) width);
            C0379b bVar = this.f961p.get(0);
            float f3 = bVar.f985e;
            int size = this.f961p.size();
            int i = bVar.f982b;
            int i2 = this.f961p.get(size - 1).f982b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                while (i4 > bVar.f982b && i3 < size) {
                    i3++;
                    bVar = this.f961p.get(i3);
                }
                if (i4 == bVar.f982b) {
                    f = (bVar.f985e + bVar.f984d) * ((float) width);
                    f3 = bVar.f985e + bVar.f984d + f2;
                } else {
                    float pageWidth = this.f964s.getPageWidth(i4);
                    f = (f3 + pageWidth) * ((float) width);
                    f3 += pageWidth + f2;
                }
                if (((float) this.f971z) + f > ((float) scrollX)) {
                    this.f916A.setBounds((int) f, this.f917B, (int) (((float) this.f971z) + f + 0.5f), this.f918C);
                    this.f916A.draw(canvas);
                }
                if (f <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public boolean mo1179d() {
        if (this.f927L) {
            return false;
        }
        this.f943ad = true;
        setScrollState(1);
        this.f933R = 0.0f;
        this.f935T = 0.0f;
        if (this.f938X == null) {
            this.f938X = VelocityTracker.obtain();
        } else {
            this.f938X.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f938X.addMovement(obtain);
        obtain.recycle();
        this.f944ae = uptimeMillis;
        return true;
    }

    /* renamed from: e */
    public void mo1185e() {
        if (!this.f943ad) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        VelocityTracker velocityTracker = this.f938X;
        velocityTracker.computeCurrentVelocity(1000, (float) this.f940Z);
        int a = (int) C0328D.m1323a(velocityTracker, this.f937V);
        this.f925J = true;
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        C0379b l = m1713l();
        mo1163a(m1695a(l.f982b, ((((float) scrollX) / ((float) clientWidth)) - l.f985e) / l.f984d, a, (int) (this.f933R - this.f935T)), true, true, a);
        m1714m();
        this.f943ad = false;
    }

    /* renamed from: b */
    public void mo1174b(float f) {
        float f2;
        float f3;
        if (!this.f943ad) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        this.f933R += f;
        float scrollX = ((float) getScrollX()) - f;
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.f919D;
        float f5 = ((float) clientWidth) * this.f920E;
        C0379b bVar = this.f961p.get(0);
        C0379b bVar2 = this.f961p.get(this.f961p.size() - 1);
        if (bVar.f982b != 0) {
            f2 = bVar.f985e * ((float) clientWidth);
        } else {
            f2 = f4;
        }
        if (bVar2.f982b != this.f964s.getCount() - 1) {
            f3 = bVar2.f985e * ((float) clientWidth);
        } else {
            f3 = f5;
        }
        if (scrollX >= f2) {
            if (scrollX > f3) {
                f2 = f3;
            } else {
                f2 = scrollX;
            }
        }
        this.f933R += f2 - ((float) ((int) f2));
        scrollTo((int) f2, getScrollY());
        m1709e((int) f2);
        MotionEvent obtain = MotionEvent.obtain(this.f944ae, SystemClock.uptimeMillis(), 2, this.f933R, 0.0f, 0);
        this.f938X.addMovement(obtain);
        obtain.recycle();
    }

    /* renamed from: f */
    public boolean mo1186f() {
        return this.f943ad;
    }

    /* renamed from: a */
    private void m1702a(MotionEvent motionEvent) {
        int b = C0505v.m2869b(motionEvent);
        if (C0505v.m2870b(motionEvent, b) == this.f937V) {
            int i = b == 0 ? 1 : 0;
            this.f933R = C0505v.m2871c(motionEvent, i);
            this.f937V = C0505v.m2870b(motionEvent, i);
            if (this.f938X != null) {
                this.f938X.clear();
            }
        }
    }

    /* renamed from: m */
    private void m1714m() {
        this.f927L = false;
        this.f928M = false;
        if (this.f938X != null) {
            this.f938X.recycle();
            this.f938X = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f924I != z) {
            this.f924I = z;
        }
    }

    /* renamed from: c */
    public boolean mo1176c(int i) {
        boolean z = true;
        if (this.f964s == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (((float) clientWidth) * this.f919D))) {
                z = false;
            }
            return z;
        } else if (i <= 0) {
            return false;
        } else {
            if (scrollX >= ((int) (((float) clientWidth) * this.f920E))) {
                z = false;
            }
            return z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1166a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (mo1166a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z || !C0333F.m1345a(view, -i)) {
            return false;
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo1165a(keyEvent);
    }

    /* renamed from: a */
    public boolean mo1165a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return mo1180d(17);
            case 22:
                return mo1180d(66);
            case Settings.LOCAL_CLOUD_SEARCH_ENABLED /*61*/:
                if (Build.VERSION.SDK_INT < 11) {
                    return false;
                }
                if (C0481l.m2737a(keyEvent)) {
                    return mo1180d(2);
                }
                if (C0481l.m2738a(keyEvent, 1)) {
                    return mo1180d(1);
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public boolean mo1180d(int i) {
        View view;
        boolean z;
        boolean z2;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ").append(parent2.getClass().getSimpleName());
                    }
                    Log.e(f905d, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus == null || findNextFocus == view) {
            if (i == 17 || i == 1) {
                z2 = mo1187g();
            } else {
                if (i == 66 || i == 2) {
                    z2 = mo1196h();
                }
                z2 = false;
            }
        } else if (i == 17) {
            z2 = (view == null || m1696a(this.f963r, findNextFocus).left < m1696a(this.f963r, view).left) ? findNextFocus.requestFocus() : mo1187g();
        } else {
            if (i == 66) {
                z2 = (view == null || m1696a(this.f963r, findNextFocus).left > m1696a(this.f963r, view).left) ? findNextFocus.requestFocus() : mo1196h();
            }
            z2 = false;
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    /* renamed from: a */
    private Rect m1696a(Rect rect, View view) {
        Rect rect2;
        if (rect == null) {
            rect2 = new Rect();
        } else {
            rect2 = rect;
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo1187g() {
        if (this.f965t <= 0) {
            return false;
        }
        mo1161a(this.f965t - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1196h() {
        if (this.f964s == null || this.f965t >= this.f964s.getCount() - 1) {
            return false;
        }
        mo1161a(this.f965t + 1, true);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0379b a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a = mo1154a(childAt)) != null && a.f982b == this.f965t) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C0379b a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = mo1154a(childAt)) != null && a.f982b == this.f965t) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        C0379b a;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a = mo1154a(childAt)) != null && a.f982b == this.f965t && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0379b a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = mo1154a(childAt)) != null && a.f982b == this.f965t && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: android.support.v4.view.ViewPager$c */
    class C0380c extends C0399a {
        C0380c() {
        }

        /* renamed from: d */
        public void mo1223d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1223d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C0442s b = C0442s.m2339b();
            b.mo1492e(m1742b());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.f964s != null) {
                b.mo1475a(ViewPager.this.f964s.getCount());
                b.mo1485c(ViewPager.this.f965t);
                b.mo1489d(ViewPager.this.f965t);
            }
        }

        /* renamed from: a */
        public void mo1221a(View view, C0418g gVar) {
            super.mo1221a(view, gVar);
            gVar.mo1337b((CharSequence) ViewPager.class.getName());
            gVar.mo1373l(m1742b());
            if (ViewPager.this.mo1176c(1)) {
                gVar.mo1348d(4096);
            }
            if (ViewPager.this.mo1176c(-1)) {
                gVar.mo1348d(8192);
            }
        }

        /* renamed from: a */
        public boolean mo1222a(View view, int i, Bundle bundle) {
            if (super.mo1222a(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (!ViewPager.this.mo1176c(1)) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.f965t + 1);
                    return true;
                case 8192:
                    if (!ViewPager.this.mo1176c(-1)) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.f965t - 1);
                    return true;
                default:
                    return false;
            }
        }

        /* renamed from: b */
        private boolean m1742b() {
            return ViewPager.this.f964s != null && ViewPager.this.f964s.getCount() > 1;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$g */
    private class C0384g extends DataSetObserver {
        private C0384g() {
        }

        /* synthetic */ C0384g(ViewPager viewPager, C0375T t) {
            this();
        }

        public void onChanged() {
            ViewPager.this.mo1173b();
        }

        public void onInvalidated() {
            ViewPager.this.mo1173b();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$LayoutParams */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f972a;

        /* renamed from: b */
        public int f973b;

        /* renamed from: c */
        float f974c = 0.0f;

        /* renamed from: d */
        boolean f975d;

        /* renamed from: e */
        int f976e;

        /* renamed from: f */
        int f977f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f913l);
            this.f973b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$i */
    static class C0386i implements Comparator<View> {
        C0386i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f972a != layoutParams2.f972a) {
                return layoutParams.f972a ? 1 : -1;
            }
            return layoutParams.f976e - layoutParams2.f976e;
        }
    }
}
