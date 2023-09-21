package android.support.p001v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p000a.C0011l;
import android.support.p000a.C0017r;
import android.support.p001v4.view.C0333F;
import android.support.p001v4.view.C0361P;
import android.support.p001v4.view.C0399a;
import android.support.p001v4.view.C0476j;
import android.support.p001v4.view.C0481l;
import android.support.p001v4.view.p017a.C0418g;
import android.support.p001v4.widget.C0532J;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.cootek.smartinput5.engine.Settings;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* renamed from: android.support.v4.widget.DrawerLayout */
public class DrawerLayout extends ViewGroup {

    /* renamed from: a */
    public static final int f1175a = 0;

    /* renamed from: b */
    public static final int f1176b = 1;

    /* renamed from: c */
    public static final int f1177c = 2;

    /* renamed from: d */
    public static final int f1178d = 0;

    /* renamed from: e */
    public static final int f1179e = 1;

    /* renamed from: f */
    public static final int f1180f = 2;

    /* renamed from: g */
    private static final String f1181g = "DrawerLayout";

    /* renamed from: h */
    private static final int f1182h = 64;

    /* renamed from: i */
    private static final int f1183i = -1728053248;

    /* renamed from: j */
    private static final int f1184j = 160;

    /* renamed from: k */
    private static final int f1185k = 400;

    /* renamed from: l */
    private static final boolean f1186l = false;

    /* renamed from: m */
    private static final boolean f1187m = true;

    /* renamed from: n */
    private static final float f1188n = 1.0f;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final int[] f1189o = {16842931};

    /* renamed from: A */
    private boolean f1190A;

    /* renamed from: B */
    private int f1191B;

    /* renamed from: C */
    private int f1192C;

    /* renamed from: D */
    private boolean f1193D;

    /* renamed from: E */
    private boolean f1194E;

    /* renamed from: F */
    private C0521c f1195F;

    /* renamed from: G */
    private float f1196G;

    /* renamed from: H */
    private float f1197H;

    /* renamed from: I */
    private Drawable f1198I;

    /* renamed from: J */
    private Drawable f1199J;

    /* renamed from: K */
    private CharSequence f1200K;

    /* renamed from: L */
    private CharSequence f1201L;

    /* renamed from: p */
    private final C0520b f1202p;

    /* renamed from: q */
    private int f1203q;

    /* renamed from: r */
    private int f1204r;

    /* renamed from: s */
    private float f1205s;

    /* renamed from: t */
    private Paint f1206t;

    /* renamed from: u */
    private final C0532J f1207u;

    /* renamed from: v */
    private final C0532J f1208v;

    /* renamed from: w */
    private final C0526h f1209w;

    /* renamed from: x */
    private final C0526h f1210x;

    /* renamed from: y */
    private int f1211y;

    /* renamed from: z */
    private boolean f1212z;

    /* renamed from: android.support.v4.widget.DrawerLayout$c */
    public interface C0521c {
        /* renamed from: a */
        void mo350a(int i);

        /* renamed from: a */
        void mo353a(View view);

        /* renamed from: a */
        void mo354a(View view, float f);

        /* renamed from: b */
        void mo358b(View view);
    }

    @C0011l(mo1a = {3, 5, 8388611, 8388613})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.widget.DrawerLayout$d */
    private @interface C0522d {
    }

    @C0011l(mo1a = {0, 1, 2})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.widget.DrawerLayout$e */
    private @interface C0523e {
    }

    @C0011l(mo1a = {0, 1, 2})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.widget.DrawerLayout$g */
    private @interface C0525g {
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$f */
    public static abstract class C0524f implements C0521c {
        /* renamed from: a */
        public void mo354a(View view, float f) {
        }

        /* renamed from: a */
        public void mo353a(View view) {
        }

        /* renamed from: b */
        public void mo358b(View view) {
        }

        /* renamed from: a */
        public void mo350a(int i) {
        }
    }

    public DrawerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1202p = new C0520b();
        this.f1204r = f1183i;
        this.f1206t = new Paint();
        this.f1190A = true;
        float f = getResources().getDisplayMetrics().density;
        this.f1203q = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        this.f1209w = new C0526h(3);
        this.f1210x = new C0526h(5);
        this.f1207u = C0532J.m3002a((ViewGroup) this, 1.0f, (C0532J.C0533a) this.f1209w);
        this.f1207u.mo1784a(1);
        this.f1207u.mo1783a(f2);
        this.f1209w.mo1770a(this.f1207u);
        this.f1208v = C0532J.m3002a((ViewGroup) this, 1.0f, (C0532J.C0533a) this.f1210x);
        this.f1208v.mo1784a(2);
        this.f1208v.mo1783a(f2);
        this.f1210x.mo1770a(this.f1208v);
        setFocusableInTouchMode(true);
        C0333F.m1357d((View) this, 1);
        C0333F.m1340a((View) this, (C0399a) new C0519a());
        C0361P.m1666a((ViewGroup) this, false);
    }

    /* renamed from: a */
    public void mo1717a(Drawable drawable, int i) {
        int a = C0476j.m2714a(i, C0333F.m1369i(this));
        if ((a & 3) == 3) {
            this.f1198I = drawable;
            invalidate();
        }
        if ((a & 5) == 5) {
            this.f1199J = drawable;
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo1713a(int i, int i2) {
        mo1717a(getResources().getDrawable(i), i2);
    }

    public void setScrimColor(int i) {
        this.f1204r = i;
        invalidate();
    }

    public void setDrawerListener(C0521c cVar) {
        this.f1195F = cVar;
    }

    public void setDrawerLockMode(int i) {
        mo1724b(i, 3);
        mo1724b(i, 5);
    }

    /* renamed from: b */
    public void mo1724b(int i, int i2) {
        int a = C0476j.m2714a(i2, C0333F.m1369i(this));
        if (a == 3) {
            this.f1191B = i;
        } else if (a == 5) {
            this.f1192C = i;
        }
        if (i != 0) {
            (a == 3 ? this.f1207u : this.f1208v).mo1808g();
        }
        switch (i) {
            case 1:
                View c = mo1727c(a);
                if (c != null) {
                    mo1746i(c);
                    return;
                }
                return;
            case 2:
                View c2 = mo1727c(a);
                if (c2 != null) {
                    mo1744h(c2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo1715a(int i, View view) {
        if (!mo1740g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a " + "drawer with appropriate layout_gravity");
        }
        mo1724b(i, ((LayoutParams) view.getLayoutParams()).f1213a);
    }

    /* renamed from: a */
    public int mo1710a(int i) {
        int a = C0476j.m2714a(i, C0333F.m1369i(this));
        if (a == 3) {
            return this.f1191B;
        }
        if (a == 5) {
            return this.f1192C;
        }
        return 0;
    }

    /* renamed from: a */
    public int mo1711a(View view) {
        int e = mo1735e(view);
        if (e == 3) {
            return this.f1191B;
        }
        if (e == 5) {
            return this.f1192C;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo1716a(int i, CharSequence charSequence) {
        int a = C0476j.m2714a(i, C0333F.m1369i(this));
        if (a == 3) {
            this.f1200K = charSequence;
        } else if (a == 5) {
            this.f1201L = charSequence;
        }
    }

    @C0017r
    /* renamed from: b */
    public CharSequence mo1722b(int i) {
        int a = C0476j.m2714a(i, C0333F.m1369i(this));
        if (a == 3) {
            return this.f1200K;
        }
        if (a == 5) {
            return this.f1201L;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1714a(int i, int i2, View view) {
        int i3 = 1;
        int b = this.f1207u.mo1792b();
        int b2 = this.f1208v.mo1792b();
        if (!(b == 1 || b2 == 1)) {
            i3 = (b == 2 || b2 == 2) ? 2 : 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.f1214b == 0.0f) {
                mo1725b(view);
            } else if (layoutParams.f1214b == 1.0f) {
                mo1729c(view);
            }
        }
        if (i3 != this.f1211y) {
            this.f1211y = i3;
            if (this.f1195F != null) {
                this.f1195F.mo350a(i3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1725b(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.f1216d) {
            layoutParams.f1216d = false;
            if (this.f1195F != null) {
                this.f1195F.mo358b(view);
            }
            View childAt = getChildAt(0);
            if (childAt != null) {
                C0333F.m1357d(childAt, 1);
            }
            C0333F.m1357d(view, 4);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1729c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f1216d) {
            layoutParams.f1216d = true;
            if (this.f1195F != null) {
                this.f1195F.mo353a(view);
            }
            View childAt = getChildAt(0);
            if (childAt != null) {
                C0333F.m1357d(childAt, 4);
            }
            C0333F.m1357d(view, 1);
            sendAccessibilityEvent(32);
            view.requestFocus();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1718a(View view, float f) {
        if (this.f1195F != null) {
            this.f1195F.mo354a(view, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1726b(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f1214b) {
            layoutParams.f1214b = f;
            mo1718a(view, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo1733d(View view) {
        return ((LayoutParams) view.getLayoutParams()).f1214b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo1735e(View view) {
        return C0476j.m2714a(((LayoutParams) view.getLayoutParams()).f1213a, C0333F.m1369i(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1720a(View view, int i) {
        return (mo1735e(view) & i) == i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo1712a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((LayoutParams) childAt.getLayoutParams()).f1216d) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1730c(View view, float f) {
        float d = mo1733d(view);
        int width = view.getWidth();
        int i = ((int) (((float) width) * f)) - ((int) (d * ((float) width)));
        if (!mo1720a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo1726b(view, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo1727c(int i) {
        int a = C0476j.m2714a(i, C0333F.m1369i(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo1735e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    static String m2928d(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1190A = true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1190A = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r5 != 0) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            r1 = 300(0x12c, float:4.2E-43)
            r4 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.getMode(r12)
            int r5 = android.view.View.MeasureSpec.getMode(r13)
            int r2 = android.view.View.MeasureSpec.getSize(r12)
            int r0 = android.view.View.MeasureSpec.getSize(r13)
            if (r3 != r10) goto L_0x001b
            if (r5 == r10) goto L_0x0046
        L_0x001b:
            boolean r6 = r11.isInEditMode()
            if (r6 == 0) goto L_0x0048
            if (r3 != r7) goto L_0x0040
        L_0x0023:
            if (r5 != r7) goto L_0x0044
            r1 = r0
        L_0x0026:
            r11.setMeasuredDimension(r2, r1)
            int r5 = r11.getChildCount()
            r3 = r4
        L_0x002e:
            if (r3 >= r5) goto L_0x0109
            android.view.View r6 = r11.getChildAt(r3)
            int r0 = r6.getVisibility()
            r7 = 8
            if (r0 != r7) goto L_0x0050
        L_0x003c:
            int r0 = r3 + 1
            r3 = r0
            goto L_0x002e
        L_0x0040:
            if (r3 != 0) goto L_0x0023
            r2 = r1
            goto L_0x0023
        L_0x0044:
            if (r5 == 0) goto L_0x0026
        L_0x0046:
            r1 = r0
            goto L_0x0026
        L_0x0048:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r0.<init>(r1)
            throw r0
        L_0x0050:
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.support.v4.widget.DrawerLayout$LayoutParams r0 = (android.support.p001v4.widget.DrawerLayout.LayoutParams) r0
            boolean r7 = r11.mo1738f((android.view.View) r6)
            if (r7 == 0) goto L_0x0077
            int r7 = r0.leftMargin
            int r7 = r2 - r7
            int r8 = r0.rightMargin
            int r7 = r7 - r8
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
            int r8 = r0.topMargin
            int r8 = r1 - r8
            int r0 = r0.bottomMargin
            int r0 = r8 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            r6.measure(r7, r0)
            goto L_0x003c
        L_0x0077:
            boolean r7 = r11.mo1740g((android.view.View) r6)
            if (r7 == 0) goto L_0x00da
            int r7 = r11.mo1735e((android.view.View) r6)
            r7 = r7 & 7
            r8 = r4 & r7
            if (r8 == 0) goto L_0x00bc
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Child drawer has absolute gravity "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = m2928d((int) r7)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " but this "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "DrawerLayout"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " already has a "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "drawer view along that edge"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            int r7 = r11.f1203q
            int r8 = r0.leftMargin
            int r7 = r7 + r8
            int r8 = r0.rightMargin
            int r7 = r7 + r8
            int r8 = r0.width
            int r7 = getChildMeasureSpec(r12, r7, r8)
            int r8 = r0.topMargin
            int r9 = r0.bottomMargin
            int r8 = r8 + r9
            int r0 = r0.height
            int r0 = getChildMeasureSpec(r13, r8, r0)
            r6.measure(r7, r0)
            goto L_0x003c
        L_0x00da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Child "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " at index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " does not have a valid layout_gravity - must be Gravity.LEFT, "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "Gravity.RIGHT or Gravity.NO_GRAVITY"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        this.f1212z = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (mo1738f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo1720a(childAt, 3)) {
                        i5 = ((int) (((float) measuredWidth) * layoutParams.f1214b)) + (-measuredWidth);
                        f = ((float) (measuredWidth + i5)) / ((float) measuredWidth);
                    } else {
                        i5 = i6 - ((int) (((float) measuredWidth) * layoutParams.f1214b));
                        f = ((float) (i6 - i5)) / ((float) measuredWidth);
                    }
                    boolean z2 = f != layoutParams.f1214b;
                    switch (layoutParams.f1213a & 112) {
                        case 16:
                            int i8 = i4 - i2;
                            int i9 = (i8 - measuredHeight) / 2;
                            if (i9 < layoutParams.topMargin) {
                                i9 = layoutParams.topMargin;
                            } else if (i9 + measuredHeight > i8 - layoutParams.bottomMargin) {
                                i9 = (i8 - layoutParams.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i5, i9, measuredWidth + i5, measuredHeight + i9);
                            break;
                        case Settings.SKIN /*80*/:
                            int i10 = i4 - i2;
                            childAt.layout(i5, (i10 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i10 - layoutParams.bottomMargin);
                            break;
                        default:
                            childAt.layout(i5, layoutParams.topMargin, measuredWidth + i5, measuredHeight + layoutParams.topMargin);
                            break;
                    }
                    if (z2) {
                        mo1726b(childAt, f);
                    }
                    int i11 = layoutParams.f1214b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        this.f1212z = false;
        this.f1190A = false;
    }

    public void requestLayout() {
        if (!this.f1212z) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f1214b);
        }
        this.f1205s = f;
        if (this.f1207u.mo1791a(true) || this.f1208v.mo1791a(true)) {
            C0333F.m1352c(this);
        }
    }

    /* renamed from: m */
    private static boolean m2934m(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean f = mo1738f(view);
        int i2 = 0;
        int width = getWidth();
        int save = canvas.save();
        if (f) {
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m2934m(childAt) && mo1740g(childAt)) {
                    if (childAt.getHeight() < height) {
                        i = width;
                    } else if (mo1720a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right <= i2) {
                            right = i2;
                        }
                        i2 = right;
                        i = width;
                    } else {
                        i = childAt.getLeft();
                        if (i < width) {
                        }
                    }
                    i3++;
                    width = i;
                }
                i = width;
                i3++;
                width = i;
            }
            canvas.clipRect(i2, 0, width, getHeight());
        }
        int i4 = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.f1205s > 0.0f && f) {
            this.f1206t.setColor((((int) (((float) ((this.f1204r & C0333F.f835s) >>> 24)) * this.f1205s)) << 24) | (this.f1204r & C0333F.f834r));
            canvas.drawRect((float) i2, 0.0f, (float) i4, (float) getHeight(), this.f1206t);
        } else if (this.f1198I != null && mo1720a(view, 3)) {
            int intrinsicWidth = this.f1198I.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f1207u.mo1798c()), 1.0f));
            this.f1198I.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f1198I.setAlpha((int) (255.0f * max));
            this.f1198I.draw(canvas);
        } else if (this.f1199J != null && mo1720a(view, 5)) {
            int intrinsicWidth2 = this.f1199J.getIntrinsicWidth();
            int left = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left)) / ((float) this.f1208v.mo1798c()), 1.0f));
            this.f1199J.setBounds(left - intrinsicWidth2, view.getTop(), left, view.getBottom());
            this.f1199J.setAlpha((int) (255.0f * max2));
            this.f1199J.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo1738f(View view) {
        return ((LayoutParams) view.getLayoutParams()).f1213a == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo1740g(View view) {
        return (C0476j.m2714a(((LayoutParams) view.getLayoutParams()).f1213a, C0333F.m1369i(view)) & 7) != 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r1 = 1
            r2 = 0
            int r0 = android.support.p001v4.view.C0505v.m2867a(r8)
            android.support.v4.widget.J r3 = r7.f1207u
            boolean r3 = r3.mo1788a((android.view.MotionEvent) r8)
            android.support.v4.widget.J r4 = r7.f1208v
            boolean r4 = r4.mo1788a((android.view.MotionEvent) r8)
            r3 = r3 | r4
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0063;
                case 2: goto L_0x004e;
                case 3: goto L_0x0063;
                default: goto L_0x0016;
            }
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r3 != 0) goto L_0x0025
            if (r0 != 0) goto L_0x0025
            boolean r0 = r7.m2930e()
            if (r0 != 0) goto L_0x0025
            boolean r0 = r7.f1194E
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r2 = r1
        L_0x0026:
            return r2
        L_0x0027:
            float r0 = r8.getX()
            float r4 = r8.getY()
            r7.f1196G = r0
            r7.f1197H = r4
            float r5 = r7.f1205s
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x006b
            android.support.v4.widget.J r5 = r7.f1207u
            int r0 = (int) r0
            int r4 = (int) r4
            android.view.View r0 = r5.mo1805e(r0, r4)
            boolean r0 = r7.mo1738f((android.view.View) r0)
            if (r0 == 0) goto L_0x006b
            r0 = r1
        L_0x0049:
            r7.f1193D = r2
            r7.f1194E = r2
            goto L_0x0017
        L_0x004e:
            android.support.v4.widget.J r0 = r7.f1207u
            r4 = 3
            boolean r0 = r0.mo1802d(r4)
            if (r0 == 0) goto L_0x0016
            android.support.v4.widget.DrawerLayout$h r0 = r7.f1209w
            r0.mo1767a()
            android.support.v4.widget.DrawerLayout$h r0 = r7.f1210x
            r0.mo1767a()
            r0 = r2
            goto L_0x0017
        L_0x0063:
            r7.mo1719a((boolean) r1)
            r7.f1193D = r2
            r7.f1194E = r2
            goto L_0x0016
        L_0x006b:
            r0 = r2
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View a;
        this.f1207u.mo1793b(motionEvent);
        this.f1208v.mo1793b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f1196G = x;
                this.f1197H = y;
                this.f1193D = false;
                this.f1194E = false;
                break;
            case 1:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View e = this.f1207u.mo1805e((int) x2, (int) y2);
                if (e != null && mo1738f(e)) {
                    float f = x2 - this.f1196G;
                    float f2 = y2 - this.f1197H;
                    int f3 = this.f1207u.mo1807f();
                    if ((f * f) + (f2 * f2) < ((float) (f3 * f3)) && (a = mo1712a()) != null) {
                        z = mo1711a(a) == 2;
                        mo1719a(z);
                        this.f1193D = false;
                        break;
                    }
                }
                z = true;
                mo1719a(z);
                this.f1193D = false;
            case 3:
                mo1719a(true);
                this.f1193D = false;
                this.f1194E = false;
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1193D = z;
        if (z) {
            mo1719a(true);
        }
    }

    /* renamed from: b */
    public void mo1723b() {
        mo1719a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1719a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (mo1740g(childAt) && (!z || layoutParams.f1215c)) {
                int width = childAt.getWidth();
                if (mo1720a(childAt, 3)) {
                    z2 |= this.f1207u.mo1789a(childAt, -width, childAt.getTop());
                } else {
                    z2 |= this.f1208v.mo1789a(childAt, getWidth(), childAt.getTop());
                }
                layoutParams.f1215c = false;
            }
        }
        this.f1209w.mo1767a();
        this.f1210x.mo1767a();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: h */
    public void mo1744h(View view) {
        if (!mo1740g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.f1190A) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f1214b = 1.0f;
            layoutParams.f1216d = true;
        } else if (mo1720a(view, 3)) {
            this.f1207u.mo1789a(view, 0, view.getTop());
        } else {
            this.f1208v.mo1789a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    /* renamed from: e */
    public void mo1736e(int i) {
        View c = mo1727c(i);
        if (c == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m2928d(i));
        }
        mo1744h(c);
    }

    /* renamed from: i */
    public void mo1746i(View view) {
        if (!mo1740g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.f1190A) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f1214b = 0.0f;
            layoutParams.f1216d = false;
        } else if (mo1720a(view, 3)) {
            this.f1207u.mo1789a(view, -view.getWidth(), view.getTop());
        } else {
            this.f1208v.mo1789a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    /* renamed from: f */
    public void mo1737f(int i) {
        View c = mo1727c(i);
        if (c == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m2928d(i));
        }
        mo1746i(c);
    }

    /* renamed from: j */
    public boolean mo1747j(View view) {
        if (mo1740g(view)) {
            return ((LayoutParams) view.getLayoutParams()).f1216d;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: g */
    public boolean mo1739g(int i) {
        View c = mo1727c(i);
        if (c != null) {
            return mo1747j(c);
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo1748k(View view) {
        if (mo1740g(view)) {
            return ((LayoutParams) view.getLayoutParams()).f1214b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: h */
    public boolean mo1745h(int i) {
        View c = mo1727c(i);
        if (c != null) {
            return mo1748k(c);
        }
        return false;
    }

    /* renamed from: e */
    private boolean m2930e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f1215c) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: f */
    private boolean m2931f() {
        return m2932g() != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public View m2932g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo1740g(childAt) && mo1748k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1728c() {
        if (!this.f1194E) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f1194E = true;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m2931f()) {
            return super.onKeyDown(i, keyEvent);
        }
        C0481l.m2740b(keyEvent);
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View g = m2932g();
        if (g != null && mo1711a(g) == 0) {
            mo1723b();
        }
        return g != null;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View c;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!(savedState.f1217a == 0 || (c = mo1727c(savedState.f1217a)) == null)) {
            mo1744h(c);
        }
        mo1724b(savedState.f1218b, 3);
        mo1724b(savedState.f1219c, 5);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            if (mo1740g(childAt)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1216d) {
                    savedState.f1217a = layoutParams.f1213a;
                    break;
                }
            }
            i++;
        }
        savedState.f1218b = this.f1191B;
        savedState.f1219c = this.f1192C;
        return savedState;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (i > 0 || (i < 0 && getChildCount() > 0)) {
            C0333F.m1357d(view, 4);
            C0333F.m1340a(view, (C0399a) this.f1202p);
        } else {
            C0333F.m1357d(view, 1);
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m2935n(View view) {
        return (C0333F.m1355d(view) == 4 || C0333F.m1355d(view) == 2) ? false : true;
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$SavedState */
    protected static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0561g();

        /* renamed from: a */
        int f1217a = 0;

        /* renamed from: b */
        int f1218b = 0;

        /* renamed from: c */
        int f1219c = 0;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1217a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1217a);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$h */
    private class C0526h extends C0532J.C0533a {

        /* renamed from: b */
        private final int f1224b;

        /* renamed from: c */
        private C0532J f1225c;

        /* renamed from: d */
        private final Runnable f1226d = new C0562h(this);

        public C0526h(int i) {
            this.f1224b = i;
        }

        /* renamed from: a */
        public void mo1770a(C0532J j) {
            this.f1225c = j;
        }

        /* renamed from: a */
        public void mo1767a() {
            DrawerLayout.this.removeCallbacks(this.f1226d);
        }

        /* renamed from: a */
        public boolean mo1773a(View view, int i) {
            return DrawerLayout.this.mo1740g(view) && DrawerLayout.this.mo1720a(view, this.f1224b) && DrawerLayout.this.mo1711a(view) == 0;
        }

        /* renamed from: a */
        public void mo1768a(int i) {
            DrawerLayout.this.mo1714a(this.f1224b, i, this.f1225c.mo1801d());
        }

        /* renamed from: a */
        public void mo1772a(View view, int i, int i2, int i3, int i4) {
            float width;
            int width2 = view.getWidth();
            if (DrawerLayout.this.mo1720a(view, 3)) {
                width = ((float) (width2 + i)) / ((float) width2);
            } else {
                width = ((float) (DrawerLayout.this.getWidth() - i)) / ((float) width2);
            }
            DrawerLayout.this.mo1726b(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: b */
        public void mo1776b(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f1215c = false;
            m2984b();
        }

        /* renamed from: b */
        private void m2984b() {
            int i = 3;
            if (this.f1224b == 3) {
                i = 5;
            }
            View c = DrawerLayout.this.mo1727c(i);
            if (c != null) {
                DrawerLayout.this.mo1746i(c);
            }
        }

        /* renamed from: a */
        public void mo1771a(View view, float f, float f2) {
            int width;
            float d = DrawerLayout.this.mo1733d(view);
            int width2 = view.getWidth();
            if (DrawerLayout.this.mo1720a(view, 3)) {
                width = (f > 0.0f || (f == 0.0f && d > 0.5f)) ? 0 : -width2;
            } else {
                width = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
                    width -= width2;
                }
            }
            this.f1225c.mo1787a(width, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: a */
        public void mo1769a(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f1226d, 160);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m2985c() {
            View view;
            int i;
            int i2 = 0;
            int c = this.f1225c.mo1798c();
            boolean z = this.f1224b == 3;
            if (z) {
                View c2 = DrawerLayout.this.mo1727c(3);
                if (c2 != null) {
                    i2 = -c2.getWidth();
                }
                int i3 = i2 + c;
                view = c2;
                i = i3;
            } else {
                View c3 = DrawerLayout.this.mo1727c(5);
                int width = DrawerLayout.this.getWidth() - c;
                view = c3;
                i = width;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo1711a(view) == 0) {
                this.f1225c.mo1789a(view, i, view.getTop());
                ((LayoutParams) view.getLayoutParams()).f1215c = true;
                DrawerLayout.this.invalidate();
                m2984b();
                DrawerLayout.this.mo1728c();
            }
        }

        /* renamed from: b */
        public boolean mo1777b(int i) {
            return false;
        }

        /* renamed from: b */
        public void mo1775b(int i, int i2) {
            View c;
            if ((i & 1) == 1) {
                c = DrawerLayout.this.mo1727c(3);
            } else {
                c = DrawerLayout.this.mo1727c(5);
            }
            if (c != null && DrawerLayout.this.mo1711a(c) == 0) {
                this.f1225c.mo1786a(c, i2);
            }
        }

        /* renamed from: a */
        public int mo1765a(View view) {
            return view.getWidth();
        }

        /* renamed from: a */
        public int mo1766a(View view, int i, int i2) {
            if (DrawerLayout.this.mo1720a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: b */
        public int mo1774b(View view, int i, int i2) {
            return view.getTop();
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$LayoutParams */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1213a;

        /* renamed from: b */
        float f1214b;

        /* renamed from: c */
        boolean f1215c;

        /* renamed from: d */
        boolean f1216d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1213a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1189o);
            this.f1213a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1213a = 0;
        }

        public LayoutParams(int i, int i2, int i3) {
            this(i, i2);
            this.f1213a = i3;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1213a = 0;
            this.f1213a = layoutParams.f1213a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1213a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1213a = 0;
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$a */
    class C0519a extends C0399a {

        /* renamed from: c */
        private final Rect f1221c = new Rect();

        C0519a() {
        }

        /* renamed from: a */
        public void mo1221a(View view, C0418g gVar) {
            C0418g a = C0418g.m1983a(gVar);
            super.mo1221a(view, a);
            gVar.mo1337b((CharSequence) DrawerLayout.class.getName());
            gVar.mo1335b(view);
            ViewParent j = C0333F.m1371j(view);
            if (j instanceof View) {
                gVar.mo1350d((View) j);
            }
            m2968a(gVar, a);
            a.mo1387x();
            m2969a(gVar, (ViewGroup) view);
        }

        /* renamed from: d */
        public void mo1223d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1223d(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        /* renamed from: b */
        public boolean mo1301b(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence b;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo1301b(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View a = DrawerLayout.this.m2932g();
            if (!(a == null || (b = DrawerLayout.this.mo1722b(DrawerLayout.this.mo1735e(a))) == null)) {
                text.add(b);
            }
            return true;
        }

        /* renamed from: a */
        private void m2969a(C0418g gVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m2935n(childAt)) {
                    gVar.mo1343c(childAt);
                }
            }
        }

        /* renamed from: a */
        public boolean mo1300a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.m2935n(view)) {
                return super.mo1300a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: a */
        private void m2968a(C0418g gVar, C0418g gVar2) {
            Rect rect = this.f1221c;
            gVar2.mo1329a(rect);
            gVar.mo1334b(rect);
            gVar2.mo1342c(rect);
            gVar.mo1349d(rect);
            gVar.mo1355e(gVar2.mo1374l());
            gVar.mo1330a(gVar2.mo1382t());
            gVar.mo1337b(gVar2.mo1384u());
            gVar.mo1352d(gVar2.mo1386w());
            gVar.mo1369j(gVar2.mo1379q());
            gVar.mo1364h(gVar2.mo1377o());
            gVar.mo1346c(gVar2.mo1370j());
            gVar.mo1353d(gVar2.mo1372k());
            gVar.mo1360f(gVar2.mo1375m());
            gVar.mo1363g(gVar2.mo1376n());
            gVar.mo1367i(gVar2.mo1378p());
            gVar.mo1348d(gVar2.mo1354e());
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$b */
    final class C0520b extends C0399a {
        C0520b() {
        }

        /* renamed from: a */
        public void mo1221a(View view, C0418g gVar) {
            super.mo1221a(view, gVar);
            if (!DrawerLayout.m2935n(view)) {
                gVar.mo1350d((View) null);
            }
        }
    }
}
