package android.support.p001v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.C0333F;
import android.support.p001v4.view.C0399a;
import android.support.p001v4.view.p017a.C0418g;
import android.support.p001v4.widget.C0532J;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.SlidingPaneLayout */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: a */
    static final C0542f f1272a;

    /* renamed from: b */
    private static final String f1273b = "SlidingPaneLayout";

    /* renamed from: c */
    private static final int f1274c = 32;

    /* renamed from: d */
    private static final int f1275d = -858993460;

    /* renamed from: f */
    private static final int f1276f = 400;

    /* renamed from: e */
    private int f1277e;

    /* renamed from: g */
    private int f1278g;

    /* renamed from: h */
    private Drawable f1279h;

    /* renamed from: i */
    private Drawable f1280i;

    /* renamed from: j */
    private final int f1281j;

    /* renamed from: k */
    private boolean f1282k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public View f1283l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1284m;

    /* renamed from: n */
    private float f1285n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f1286o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f1287p;

    /* renamed from: q */
    private int f1288q;

    /* renamed from: r */
    private float f1289r;

    /* renamed from: s */
    private float f1290s;

    /* renamed from: t */
    private C0540d f1291t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C0532J f1292u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f1293v;

    /* renamed from: w */
    private boolean f1294w;

    /* renamed from: x */
    private final Rect f1295x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final ArrayList<C0538b> f1296y;

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$d */
    public interface C0540d {
        /* renamed from: a */
        void mo1863a(View view);

        /* renamed from: a */
        void mo1864a(View view, float f);

        /* renamed from: b */
        void mo1865b(View view);
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$f */
    interface C0542f {
        /* renamed from: a */
        void mo1866a(SlidingPaneLayout slidingPaneLayout, View view);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            f1272a = new C0545i();
        } else if (i >= 16) {
            f1272a = new C0544h();
        } else {
            f1272a = new C0543g();
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$e */
    public static class C0541e implements C0540d {
        /* renamed from: a */
        public void mo1864a(View view, float f) {
        }

        /* renamed from: a */
        public void mo1863a(View view) {
        }

        /* renamed from: b */
        public void mo1865b(View view) {
        }
    }

    public SlidingPaneLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1277e = f1275d;
        this.f1294w = true;
        this.f1295x = new Rect();
        this.f1296y = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f1281j = (int) ((32.0f * f) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        C0333F.m1340a((View) this, (C0399a) new C0537a());
        C0333F.m1357d((View) this, 1);
        this.f1292u = C0532J.m3002a((ViewGroup) this, 0.5f, (C0532J.C0533a) new C0539c());
        this.f1292u.mo1783a(f * 400.0f);
    }

    public void setParallaxDistance(int i) {
        this.f1288q = i;
        requestLayout();
    }

    public int getParallaxDistance() {
        return this.f1288q;
    }

    public void setSliderFadeColor(int i) {
        this.f1277e = i;
    }

    public int getSliderFadeColor() {
        return this.f1277e;
    }

    public void setCoveredFadeColor(int i) {
        this.f1278g = i;
    }

    public int getCoveredFadeColor() {
        return this.f1278g;
    }

    public void setPanelSlideListener(C0540d dVar) {
        this.f1291t = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1816a(View view) {
        if (this.f1291t != null) {
            this.f1291t.mo1864a(view, this.f1284m);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1820b(View view) {
        if (this.f1291t != null) {
            this.f1291t.mo1863a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1821c(View view) {
        if (this.f1291t != null) {
            this.f1291t.mo1865b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1826d(View view) {
        int width;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean i8 = m3081i();
        int width2 = i8 ? getWidth() - getPaddingRight() : getPaddingLeft();
        if (i8) {
            width = getPaddingLeft();
        } else {
            width = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view == null || !m3078f(view)) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt != view) {
                if (i8) {
                    i5 = width;
                } else {
                    i5 = width2;
                }
                int max = Math.max(i5, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                if (i8) {
                    i6 = width2;
                } else {
                    i6 = width;
                }
                int min = Math.min(i6, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max < i4 || max2 < i2 || min > i3 || min2 > i) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                childAt.setVisibility(i7);
                i9++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1815a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: f */
    private static boolean m3078f(View view) {
        if (C0333F.m1373k(view)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            return false;
        }
        Drawable background = view.getBackground();
        if (background == null) {
            return false;
        }
        if (background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1294w = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1294w = true;
        int size = this.f1296y.size();
        for (int i = 0; i < size; i++) {
            this.f1296y.get(i).run();
        }
        this.f1296y.clear();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int paddingTop;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int makeMeasureSpec3;
        int makeMeasureSpec4;
        int i7;
        int i8;
        boolean z;
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            if (mode2 == 0) {
                if (!isInEditMode()) {
                    throw new IllegalStateException("Height must not be UNSPECIFIED");
                } else if (mode2 == 0) {
                    i3 = Integer.MIN_VALUE;
                    i4 = size;
                    i5 = 300;
                }
            }
            i3 = mode2;
            i4 = size;
            i5 = size2;
        } else if (!isInEditMode()) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        } else if (mode == Integer.MIN_VALUE) {
            i3 = mode2;
            i4 = size;
            i5 = size2;
        } else {
            if (mode == 0) {
                i3 = mode2;
                i4 = 300;
                i5 = size2;
            }
            i3 = mode2;
            i4 = size;
            i5 = size2;
        }
        switch (i3) {
            case Integer.MIN_VALUE:
                i6 = 0;
                paddingTop = (i5 - getPaddingTop()) - getPaddingBottom();
                break;
            case 1073741824:
                i6 = (i5 - getPaddingTop()) - getPaddingBottom();
                paddingTop = i6;
                break;
            default:
                i6 = 0;
                paddingTop = -1;
                break;
        }
        boolean z2 = false;
        int paddingLeft = (i4 - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e(f1273b, "onMeasure: More than two child views are not supported.");
        }
        this.f1283l = null;
        int i9 = 0;
        int i10 = paddingLeft;
        int i11 = i6;
        float f2 = 0.0f;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f1300c = false;
                i7 = i10;
                f = f2;
                i8 = i11;
                z = z2;
            } else {
                if (layoutParams.f1298a > 0.0f) {
                    f2 += layoutParams.f1298a;
                    if (layoutParams.width == 0) {
                        i7 = i10;
                        f = f2;
                        i8 = i11;
                        z = z2;
                    }
                }
                int i12 = layoutParams.leftMargin + layoutParams.rightMargin;
                if (layoutParams.width == -2) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i12, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i12, 1073741824);
                } else {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                } else if (layoutParams.height == -1) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                } else {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i3 == Integer.MIN_VALUE && measuredHeight > i11) {
                    i11 = Math.min(measuredHeight, paddingTop);
                }
                int i13 = i10 - measuredWidth;
                boolean z3 = i13 < 0;
                layoutParams.f1299b = z3;
                boolean z4 = z3 | z2;
                if (layoutParams.f1299b) {
                    this.f1283l = childAt;
                }
                i7 = i13;
                i8 = i11;
                float f3 = f2;
                z = z4;
                f = f3;
            }
            i9++;
            z2 = z;
            i11 = i8;
            f2 = f;
            i10 = i7;
        }
        if (z2 || f2 > 0.0f) {
            int i14 = paddingLeft - this.f1281j;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() != 8) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        boolean z5 = layoutParams2.width == 0 && layoutParams2.f1298a > 0.0f;
                        int measuredWidth2 = z5 ? 0 : childAt2.getMeasuredWidth();
                        if (!z2 || childAt2 == this.f1283l) {
                            if (layoutParams2.f1298a > 0.0f) {
                                if (layoutParams2.width != 0) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                } else if (layoutParams2.height == -2) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                } else if (layoutParams2.height == -1) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                                }
                                if (z2) {
                                    int i16 = paddingLeft - (layoutParams2.rightMargin + layoutParams2.leftMargin);
                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                    if (measuredWidth2 != i16) {
                                        childAt2.measure(makeMeasureSpec5, makeMeasureSpec);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((int) ((layoutParams2.f1298a * ((float) Math.max(0, i10))) / f2)) + measuredWidth2, 1073741824), makeMeasureSpec);
                                }
                            }
                        } else if (layoutParams2.width < 0 && (measuredWidth2 > i14 || layoutParams2.f1298a > 0.0f)) {
                            if (!z5) {
                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            } else if (layoutParams2.height == -2) {
                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                            } else if (layoutParams2.height == -1) {
                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                            } else {
                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), makeMeasureSpec2);
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i4, getPaddingTop() + i11 + getPaddingBottom());
        this.f1282k = z2;
        if (this.f1292u.mo1792b() != 0 && !z2) {
            this.f1292u.mo1809h();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int width;
        int i9;
        boolean i10 = m3081i();
        if (i10) {
            this.f1292u.mo1784a(2);
        } else {
            this.f1292u.mo1784a(1);
        }
        int i11 = i3 - i;
        int paddingRight = i10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = i10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f1294w) {
            this.f1284m = (!this.f1282k || !this.f1293v) ? 0.0f : 1.0f;
        }
        int i12 = 0;
        int i13 = paddingRight;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                width = paddingRight;
                i9 = i13;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f1299b) {
                    int min = (Math.min(paddingRight, (i11 - paddingLeft) - this.f1281j) - i13) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f1286o = min;
                    int i14 = i10 ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.f1300c = ((i13 + i14) + min) + (measuredWidth / 2) > i11 - paddingLeft;
                    int i15 = (int) (((float) min) * this.f1284m);
                    i6 = i13 + i14 + i15;
                    this.f1284m = ((float) i15) / ((float) this.f1286o);
                    i5 = 0;
                } else if (!this.f1282k || this.f1288q == 0) {
                    i5 = 0;
                    i6 = paddingRight;
                } else {
                    i5 = (int) ((1.0f - this.f1284m) * ((float) this.f1288q));
                    i6 = paddingRight;
                }
                if (i10) {
                    i8 = (i11 - i6) + i5;
                    i7 = i8 - measuredWidth;
                } else {
                    i7 = i6 - i5;
                    i8 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                width = childAt.getWidth() + paddingRight;
                i9 = i6;
            }
            i12++;
            paddingRight = width;
            i13 = i9;
        }
        if (this.f1294w) {
            if (this.f1282k) {
                if (this.f1288q != 0) {
                    m3064a(this.f1284m);
                }
                if (((LayoutParams) this.f1283l.getLayoutParams()).f1300c) {
                    m3068a(this.f1283l, this.f1284m, this.f1277e);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    m3068a(getChildAt(i16), 0.0f, this.f1277e);
                }
            }
            mo1826d(this.f1283l);
        }
        this.f1294w = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f1294w = true;
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f1282k) {
            this.f1293v = view == this.f1283l;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r2 = 0
            r1 = 1
            int r3 = android.support.p001v4.view.C0505v.m2867a(r8)
            boolean r0 = r7.f1282k
            if (r0 != 0) goto L_0x002d
            if (r3 != 0) goto L_0x002d
            int r0 = r7.getChildCount()
            if (r0 <= r1) goto L_0x002d
            android.view.View r0 = r7.getChildAt(r1)
            if (r0 == 0) goto L_0x002d
            android.support.v4.widget.J r4 = r7.f1292u
            float r5 = r8.getX()
            int r5 = (int) r5
            float r6 = r8.getY()
            int r6 = (int) r6
            boolean r0 = r4.mo1797b((android.view.View) r0, (int) r5, (int) r6)
            if (r0 != 0) goto L_0x0041
            r0 = r1
        L_0x002b:
            r7.f1293v = r0
        L_0x002d:
            boolean r0 = r7.f1282k
            if (r0 == 0) goto L_0x0037
            boolean r0 = r7.f1287p
            if (r0 == 0) goto L_0x0043
            if (r3 == 0) goto L_0x0043
        L_0x0037:
            android.support.v4.widget.J r0 = r7.f1292u
            r0.mo1808g()
            boolean r2 = super.onInterceptTouchEvent(r8)
        L_0x0040:
            return r2
        L_0x0041:
            r0 = r2
            goto L_0x002b
        L_0x0043:
            r0 = 3
            if (r3 == r0) goto L_0x0048
            if (r3 != r1) goto L_0x004e
        L_0x0048:
            android.support.v4.widget.J r0 = r7.f1292u
            r0.mo1808g()
            goto L_0x0040
        L_0x004e:
            switch(r3) {
                case 0: goto L_0x005e;
                case 1: goto L_0x0051;
                case 2: goto L_0x0082;
                default: goto L_0x0051;
            }
        L_0x0051:
            r0 = r2
        L_0x0052:
            android.support.v4.widget.J r3 = r7.f1292u
            boolean r3 = r3.mo1788a((android.view.MotionEvent) r8)
            if (r3 != 0) goto L_0x005c
            if (r0 == 0) goto L_0x0040
        L_0x005c:
            r2 = r1
            goto L_0x0040
        L_0x005e:
            r7.f1287p = r2
            float r0 = r8.getX()
            float r3 = r8.getY()
            r7.f1289r = r0
            r7.f1290s = r3
            android.support.v4.widget.J r4 = r7.f1292u
            android.view.View r5 = r7.f1283l
            int r0 = (int) r0
            int r3 = (int) r3
            boolean r0 = r4.mo1797b((android.view.View) r5, (int) r0, (int) r3)
            if (r0 == 0) goto L_0x0051
            android.view.View r0 = r7.f1283l
            boolean r0 = r7.mo1830e((android.view.View) r0)
            if (r0 == 0) goto L_0x0051
            r0 = r1
            goto L_0x0052
        L_0x0082:
            float r0 = r8.getX()
            float r3 = r8.getY()
            float r4 = r7.f1289r
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            float r4 = r7.f1290s
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            android.support.v4.widget.J r4 = r7.f1292u
            int r4 = r4.mo1807f()
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0051
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            android.support.v4.widget.J r0 = r7.f1292u
            r0.mo1808g()
            r7.f1287p = r1
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1282k) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1292u.mo1793b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f1289r = x;
                this.f1290s = y;
                return true;
            case 1:
                if (!mo1830e(this.f1283l)) {
                    return true;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f = x2 - this.f1289r;
                float f2 = y2 - this.f1290s;
                int f3 = this.f1292u.mo1807f();
                if ((f * f) + (f2 * f2) >= ((float) (f3 * f3)) || !this.f1292u.mo1797b(this.f1283l, (int) x2, (int) y2)) {
                    return true;
                }
                m3071a(this.f1283l, 0);
                return true;
            default:
                return true;
        }
    }

    /* renamed from: a */
    private boolean m3071a(View view, int i) {
        if (!this.f1294w && !mo1817a(0.0f, i)) {
            return false;
        }
        this.f1293v = false;
        return true;
    }

    /* renamed from: b */
    private boolean m3073b(View view, int i) {
        if (!this.f1294w && !mo1817a(1.0f, i)) {
            return false;
        }
        this.f1293v = true;
        return true;
    }

    @Deprecated
    /* renamed from: b */
    public void mo1819b() {
        mo1822c();
    }

    /* renamed from: c */
    public boolean mo1822c() {
        return m3073b(this.f1283l, 0);
    }

    @Deprecated
    /* renamed from: d */
    public void mo1825d() {
        mo1829e();
    }

    /* renamed from: e */
    public boolean mo1829e() {
        return m3071a(this.f1283l, 0);
    }

    /* renamed from: f */
    public boolean mo1831f() {
        return !this.f1282k || this.f1284m == 1.0f;
    }

    @Deprecated
    /* renamed from: g */
    public boolean mo1832g() {
        return this.f1282k;
    }

    /* renamed from: h */
    public boolean mo1839h() {
        return this.f1282k;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3065a(int i) {
        if (this.f1283l == null) {
            this.f1284m = 0.0f;
            return;
        }
        boolean i2 = m3081i();
        LayoutParams layoutParams = (LayoutParams) this.f1283l.getLayoutParams();
        int width = this.f1283l.getWidth();
        if (i2) {
            i = (getWidth() - i) - width;
        }
        this.f1284m = ((float) (i - ((i2 ? layoutParams.rightMargin : layoutParams.leftMargin) + (i2 ? getPaddingRight() : getPaddingLeft())))) / ((float) this.f1286o);
        if (this.f1288q != 0) {
            m3064a(this.f1284m);
        }
        if (layoutParams.f1300c) {
            m3068a(this.f1283l, this.f1284m, this.f1277e);
        }
        mo1816a(this.f1283l);
    }

    /* renamed from: a */
    private void m3068a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (16777215 & i);
            if (layoutParams.f1301d == null) {
                layoutParams.f1301d = new Paint();
            }
            layoutParams.f1301d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (C0333F.m1364g(view) != 2) {
                C0333F.m1337a(view, 2, layoutParams.f1301d);
            }
            m3080g(view);
        } else if (C0333F.m1364g(view) != 0) {
            if (layoutParams.f1301d != null) {
                layoutParams.f1301d.setColorFilter((ColorFilter) null);
            }
            C0538b bVar = new C0538b(view);
            this.f1296y.add(bVar);
            C0333F.m1342a((View) this, (Runnable) bVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save(2);
        if (this.f1282k && !layoutParams.f1299b && this.f1283l != null) {
            canvas.getClipBounds(this.f1295x);
            if (m3081i()) {
                this.f1295x.left = Math.max(this.f1295x.left, this.f1283l.getRight());
            } else {
                this.f1295x.right = Math.min(this.f1295x.right, this.f1283l.getLeft());
            }
            canvas.clipRect(this.f1295x);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            drawChild = super.drawChild(canvas, view, j);
        } else if (!layoutParams.f1300c || this.f1284m <= 0.0f) {
            if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            drawChild = super.drawChild(canvas, view, j);
        } else {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, (float) view.getLeft(), (float) view.getTop(), layoutParams.f1301d);
                drawChild = false;
            } else {
                Log.e(f1273b, "drawChild: child view " + view + " returned null drawing cache");
                drawChild = super.drawChild(canvas, view, j);
            }
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m3080g(View view) {
        f1272a.mo1866a(this, view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1817a(float f, int i) {
        int paddingLeft;
        if (!this.f1282k) {
            return false;
        }
        boolean i2 = m3081i();
        LayoutParams layoutParams = (LayoutParams) this.f1283l.getLayoutParams();
        if (i2) {
            paddingLeft = (int) (((float) getWidth()) - ((((float) (layoutParams.rightMargin + getPaddingRight())) + (((float) this.f1286o) * f)) + ((float) this.f1283l.getWidth())));
        } else {
            paddingLeft = (int) (((float) (layoutParams.leftMargin + getPaddingLeft())) + (((float) this.f1286o) * f));
        }
        if (!this.f1292u.mo1789a(this.f1283l, paddingLeft, this.f1283l.getTop())) {
            return false;
        }
        mo1815a();
        C0333F.m1352c(this);
        return true;
    }

    public void computeScroll() {
        if (!this.f1292u.mo1791a(true)) {
            return;
        }
        if (!this.f1282k) {
            this.f1292u.mo1809h();
        } else {
            C0333F.m1352c(this);
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f1279h = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f1280i = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(getResources().getDrawable(i));
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int left;
        int i;
        super.draw(canvas);
        if (m3081i()) {
            drawable = this.f1280i;
        } else {
            drawable = this.f1279h;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m3081i()) {
                i = childAt.getRight();
                left = i + intrinsicWidth;
            } else {
                left = childAt.getLeft();
                i = left - intrinsicWidth;
            }
            drawable.setBounds(i, top, left, bottom);
            drawable.draw(canvas);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3064a(float r10) {
        /*
            r9 = this;
            r1 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r9.m3081i()
            android.view.View r0 = r9.f1283l
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r0 = (android.support.p001v4.widget.SlidingPaneLayout.LayoutParams) r0
            boolean r2 = r0.f1300c
            if (r2 == 0) goto L_0x0030
            if (r3 == 0) goto L_0x002d
            int r0 = r0.rightMargin
        L_0x0017:
            if (r0 > 0) goto L_0x0030
            r0 = 1
        L_0x001a:
            int r4 = r9.getChildCount()
            r2 = r1
        L_0x001f:
            if (r2 >= r4) goto L_0x005d
            android.view.View r5 = r9.getChildAt(r2)
            android.view.View r1 = r9.f1283l
            if (r5 != r1) goto L_0x0032
        L_0x0029:
            int r1 = r2 + 1
            r2 = r1
            goto L_0x001f
        L_0x002d:
            int r0 = r0.leftMargin
            goto L_0x0017
        L_0x0030:
            r0 = r1
            goto L_0x001a
        L_0x0032:
            float r1 = r9.f1285n
            float r1 = r8 - r1
            int r6 = r9.f1288q
            float r6 = (float) r6
            float r1 = r1 * r6
            int r1 = (int) r1
            r9.f1285n = r10
            float r6 = r8 - r10
            int r7 = r9.f1288q
            float r7 = (float) r7
            float r6 = r6 * r7
            int r6 = (int) r6
            int r1 = r1 - r6
            if (r3 == 0) goto L_0x0048
            int r1 = -r1
        L_0x0048:
            r5.offsetLeftAndRight(r1)
            if (r0 == 0) goto L_0x0029
            if (r3 == 0) goto L_0x0058
            float r1 = r9.f1285n
            float r1 = r1 - r8
        L_0x0052:
            int r6 = r9.f1278g
            r9.m3068a(r5, r1, r6)
            goto L_0x0029
        L_0x0058:
            float r1 = r9.f1285n
            float r1 = r8 - r1
            goto L_0x0052
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.widget.SlidingPaneLayout.m3064a(float):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1818a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (mo1818a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z) {
            if (!m3081i()) {
                i = -i;
            }
            if (!C0333F.m1345a(view, i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo1830e(View view) {
        if (view == null) {
            return false;
        }
        return this.f1282k && ((LayoutParams) view.getLayoutParams()).f1300c && this.f1284m > 0.0f;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1302a = mo1839h() ? mo1831f() : this.f1293v;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f1302a) {
            mo1822c();
        } else {
            mo1829e();
        }
        this.f1293v = savedState.f1302a;
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$c */
    private class C0539c extends C0532J.C0533a {
        private C0539c() {
        }

        /* renamed from: a */
        public boolean mo1773a(View view, int i) {
            if (SlidingPaneLayout.this.f1287p) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f1299b;
        }

        /* renamed from: a */
        public void mo1768a(int i) {
            if (SlidingPaneLayout.this.f1292u.mo1792b() != 0) {
                return;
            }
            if (SlidingPaneLayout.this.f1284m == 0.0f) {
                SlidingPaneLayout.this.mo1826d(SlidingPaneLayout.this.f1283l);
                SlidingPaneLayout.this.mo1821c(SlidingPaneLayout.this.f1283l);
                boolean unused = SlidingPaneLayout.this.f1293v = false;
                return;
            }
            SlidingPaneLayout.this.mo1820b(SlidingPaneLayout.this.f1283l);
            boolean unused2 = SlidingPaneLayout.this.f1293v = true;
        }

        /* renamed from: b */
        public void mo1776b(View view, int i) {
            SlidingPaneLayout.this.mo1815a();
        }

        /* renamed from: a */
        public void mo1772a(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.m3065a(i);
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: a */
        public void mo1771a(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.m3081i()) {
                int paddingRight = layoutParams.rightMargin + SlidingPaneLayout.this.getPaddingRight();
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f1284m > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f1286o;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f1283l.getWidth();
            } else {
                paddingLeft = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.f1284m > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f1286o;
                }
            }
            SlidingPaneLayout.this.f1292u.mo1787a(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: a */
        public int mo1765a(View view) {
            return SlidingPaneLayout.this.f1286o;
        }

        /* renamed from: a */
        public int mo1766a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f1283l.getLayoutParams();
            if (SlidingPaneLayout.this.m3081i()) {
                int width = SlidingPaneLayout.this.getWidth() - ((layoutParams.rightMargin + SlidingPaneLayout.this.getPaddingRight()) + SlidingPaneLayout.this.f1283l.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f1286o);
            }
            int paddingLeft = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f1286o + paddingLeft);
        }

        /* renamed from: b */
        public int mo1774b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public void mo1775b(int i, int i2) {
            SlidingPaneLayout.this.f1292u.mo1786a(SlidingPaneLayout.this.f1283l, i2);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$LayoutParams */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f1297e = {16843137};

        /* renamed from: a */
        public float f1298a = 0.0f;

        /* renamed from: b */
        boolean f1299b;

        /* renamed from: c */
        boolean f1300c;

        /* renamed from: d */
        Paint f1301d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1298a = layoutParams.f1298a;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1297e);
            this.f1298a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$SavedState */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0516B();

        /* renamed from: a */
        boolean f1302a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f1302a = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1302a ? 1 : 0);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$g */
    static class C0543g implements C0542f {
        C0543g() {
        }

        /* renamed from: a */
        public void mo1866a(SlidingPaneLayout slidingPaneLayout, View view) {
            C0333F.m1336a(slidingPaneLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$h */
    static class C0544h extends C0543g {

        /* renamed from: a */
        private Method f1308a;

        /* renamed from: b */
        private Field f1309b;

        C0544h() {
            try {
                this.f1308a = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
            } catch (NoSuchMethodException e) {
                Log.e(SlidingPaneLayout.f1273b, "Couldn't fetch getDisplayList method; dimming won't work right.", e);
            }
            try {
                this.f1309b = View.class.getDeclaredField("mRecreateDisplayList");
                this.f1309b.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(SlidingPaneLayout.f1273b, "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
            }
        }

        /* renamed from: a */
        public void mo1866a(SlidingPaneLayout slidingPaneLayout, View view) {
            if (this.f1308a == null || this.f1309b == null) {
                view.invalidate();
                return;
            }
            try {
                this.f1309b.setBoolean(view, true);
                this.f1308a.invoke(view, (Object[]) null);
            } catch (Exception e) {
                Log.e(SlidingPaneLayout.f1273b, "Error refreshing display list state", e);
            }
            super.mo1866a(slidingPaneLayout, view);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$i */
    static class C0545i extends C0543g {
        C0545i() {
        }

        /* renamed from: a */
        public void mo1866a(SlidingPaneLayout slidingPaneLayout, View view) {
            C0333F.m1338a(view, ((LayoutParams) view.getLayoutParams()).f1301d);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$a */
    class C0537a extends C0399a {

        /* renamed from: c */
        private final Rect f1304c = new Rect();

        C0537a() {
        }

        /* renamed from: a */
        public void mo1221a(View view, C0418g gVar) {
            C0418g a = C0418g.m1983a(gVar);
            super.mo1221a(view, a);
            m3097a(gVar, a);
            a.mo1387x();
            gVar.mo1337b((CharSequence) SlidingPaneLayout.class.getName());
            gVar.mo1335b(view);
            ViewParent j = C0333F.m1371j(view);
            if (j instanceof View) {
                gVar.mo1350d((View) j);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!mo1861b(childAt) && childAt.getVisibility() == 0) {
                    C0333F.m1357d(childAt, 1);
                    gVar.mo1343c(childAt);
                }
            }
        }

        /* renamed from: d */
        public void mo1223d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1223d(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        /* renamed from: a */
        public boolean mo1300a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!mo1861b(view)) {
                return super.mo1300a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo1861b(View view) {
            return SlidingPaneLayout.this.mo1830e(view);
        }

        /* renamed from: a */
        private void m3097a(C0418g gVar, C0418g gVar2) {
            Rect rect = this.f1304c;
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
            gVar.mo1359f(gVar2.mo1358f());
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$b */
    private class C0538b implements Runnable {

        /* renamed from: a */
        final View f1305a;

        C0538b(View view) {
            this.f1305a = view;
        }

        public void run() {
            if (this.f1305a.getParent() == SlidingPaneLayout.this) {
                C0333F.m1337a(this.f1305a, 0, (Paint) null);
                SlidingPaneLayout.this.m3080g(this.f1305a);
            }
            SlidingPaneLayout.this.f1296y.remove(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m3081i() {
        return C0333F.m1369i(this) == 1;
    }
}
