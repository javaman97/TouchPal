package com.cootek.smartinput5.p066ui.control;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.cootek.smartinput5.ui.control.LinearScrollView */
public class LinearScrollView extends View {

    /* renamed from: a */
    public static final int f12736a = 0;

    /* renamed from: b */
    public static final int f12737b = 1;

    /* renamed from: g */
    public static int[] f12738g = {16842908, 16842909, 16842910, 16842913, 16842914, 16842915, 16842916, 16842917, 16842918, 16842919};

    /* renamed from: h */
    static final /* synthetic */ boolean f12739h;

    /* renamed from: i */
    private static final int f12740i = 12;

    /* renamed from: j */
    private static final int f12741j = 12;

    /* renamed from: c */
    protected C2846V[] f12742c;

    /* renamed from: d */
    protected int f12743d;

    /* renamed from: e */
    protected C2882z f12744e;

    /* renamed from: f */
    boolean f12745f = true;

    /* renamed from: k */
    private boolean f12746k = false;

    /* renamed from: l */
    private int f12747l;

    /* renamed from: m */
    private int f12748m;

    /* renamed from: n */
    private int f12749n;

    /* renamed from: o */
    private float f12750o;

    /* renamed from: p */
    private int f12751p;

    static {
        boolean z;
        if (!LinearScrollView.class.desiredAssertionStatus()) {
            z = true;
        } else {
            z = false;
        }
        f12739h = z;
    }

    /* renamed from: a */
    public static int[] m13006a(int[] iArr, int[] iArr2) {
        int i;
        int i2 = 0;
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2)];
        int[] iArr4 = f12738g;
        int length3 = iArr4.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length3) {
            int i6 = iArr4[i3];
            if (i4 < length && iArr[i4] == i6) {
                i = i5 + 1;
                iArr3[i5] = i6;
                i4++;
            } else if (i2 >= length2 || iArr2[i2] != i6) {
                i = i5;
            } else {
                i = i5 + 1;
                iArr3[i5] = i6;
                i2++;
            }
            if (i <= 1 || f12739h || iArr3[i - 1] > iArr3[i - 2]) {
                i3++;
                i5 = i;
            } else {
                throw new AssertionError();
            }
        }
        return iArr3;
    }

    /* renamed from: b */
    public static int[] m13008b(int[] iArr, int[] iArr2) {
        int i = 0;
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr3[i2] = iArr[i2];
            int length2 = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                if (iArr[i2] == iArr2[i3]) {
                    iArr3[i2] = 0;
                    break;
                }
                i3++;
            }
        }
        int i4 = 0;
        while (i4 + i < iArr3.length) {
            while (i4 + i < iArr3.length && iArr3[i4 + i] == 0) {
                i++;
            }
            if (i4 + i >= iArr3.length) {
                break;
            }
            if (i > 0) {
                iArr3[i4] = iArr3[i4 + i];
            }
            i4++;
        }
        return StateSet.trimStateSet(iArr3, i4);
    }

    public LinearScrollView(Context context) {
        super(context);
        m13009c();
    }

    public LinearScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13009c();
    }

    /* renamed from: c */
    private void m13009c() {
        this.f12742c = new C2846V[12];
        this.f12743d = 0;
    }

    /* renamed from: a */
    public void mo9323a(C2846V v) {
        mo9324a(v, -1);
    }

    /* renamed from: a */
    public void mo9324a(C2846V v, int i) {
        ViewGroup.LayoutParams e = v.mo9445e();
        if (e == null && (e = mo9322a()) == null) {
            throw new IllegalArgumentException("generateDefaultLayoutParams() cannot return null");
        }
        mo9326a(v, i, e);
    }

    /* renamed from: a */
    public void mo9325a(C2846V v, int i, int i2) {
        ViewGroup.LayoutParams a = mo9322a();
        a.width = i;
        a.height = i2;
        mo9326a(v, -1, a);
    }

    /* renamed from: a */
    public void mo9327a(C2846V v, ViewGroup.LayoutParams layoutParams) {
        mo9326a(v, -1, layoutParams);
    }

    /* renamed from: a */
    public void mo9326a(C2846V v, int i, ViewGroup.LayoutParams layoutParams) {
        requestLayout();
        invalidate();
        m13005a(v, i, layoutParams, false);
    }

    /* renamed from: a */
    private void m13005a(C2846V v, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        this.f12746k = true;
        if (z) {
            v.f12990s = layoutParams;
        } else {
            v.mo9421a(layoutParams);
        }
        if (i < 0) {
            i = this.f12743d;
        }
        m13007b(v, i);
        m13004a(i);
    }

    public void setGravity(int i) {
        this.f12751p = i;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f12747l == 0) {
            int i5 = i4 - i2;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f12743d; i7++) {
                C2846V v = getChildren()[i7];
                if (v.mo9445e().height == -1) {
                    v.mo9432b().top = 0;
                    v.mo9432b().bottom = i5;
                }
                i6 += v.mo9432b().width();
            }
            if (this.f12746k && (this.f12751p & 7) == 1) {
                this.f12746k = false;
                if (i6 < getWidth()) {
                    int width = (getWidth() - i6) >> 1;
                    for (int i8 = 0; i8 < this.f12743d; i8++) {
                        getChildren()[i8].mo9432b().offset(width, 0);
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i9 = i3 - i;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12743d; i11++) {
            C2846V v2 = getChildren()[i11];
            if (v2.mo9445e().width == -1) {
                v2.mo9432b().left = 0;
                v2.mo9432b().right = i9;
            }
            i10 += v2.mo9432b().height();
        }
        if (this.f12746k && (this.f12751p & 112) == 16) {
            this.f12746k = false;
            if (i10 < getHeight()) {
                int height = (getHeight() - i10) >> 1;
                for (int i12 = 0; i12 < this.f12743d; i12++) {
                    getChildren()[i12].mo9432b().offset(0, height);
                }
            }
        }
    }

    /* renamed from: a */
    private void m13004a(int i) {
        int i2;
        int u;
        int i3;
        int i4;
        int t;
        int i5 = 0;
        int i6 = 0;
        while (i < this.f12743d) {
            if (this.f12747l == 0) {
                if (i > 0) {
                    i6 = this.f12742c[i - 1].mo9432b().right;
                }
                C2846V v = this.f12742c[i];
                Rect b = v.mo9432b();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.mo9445e();
                if (b.isEmpty()) {
                    if (marginLayoutParams.height == -1) {
                        i4 = getHeight();
                    } else if (marginLayoutParams.height == -2) {
                        i4 = v.mo9469u();
                    } else {
                        i4 = marginLayoutParams.height;
                    }
                    if (marginLayoutParams.width >= 0) {
                        t = marginLayoutParams.width;
                    } else {
                        t = v.mo9468t();
                    }
                    b.set(0, 0, t, i4);
                }
                b.offset(i6, i5);
                v.mo9419a(b);
                i6 = b.right;
                i2 = i5;
            } else {
                if (i > 0) {
                    i5 = this.f12742c[i - 1].mo9432b().bottom;
                }
                C2846V v2 = this.f12742c[i];
                Rect b2 = v2.mo9432b();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) v2.mo9445e();
                if (b2.isEmpty()) {
                    if (marginLayoutParams2.height >= 0) {
                        u = marginLayoutParams2.height;
                    } else {
                        u = v2.mo9469u();
                    }
                    if (marginLayoutParams2.width == -1) {
                        i3 = getWidth();
                    } else if (marginLayoutParams2.width == -2) {
                        i3 = v2.mo9468t();
                    } else {
                        i3 = marginLayoutParams2.width;
                    }
                    b2.set(0, 0, i3, u);
                }
                b2.offset(i6, i5);
                v2.mo9419a(b2);
                i2 = b2.bottom;
            }
            i++;
            i6 = i6;
            i5 = i2;
        }
        invalidate(getLeft(), getTop(), getRight(), getBottom());
    }

    /* renamed from: b */
    private void m13007b(C2846V v, int i) {
        C2846V[] vArr = this.f12742c;
        int i2 = this.f12743d;
        int length = vArr.length;
        if (i == i2) {
            if (length == i2) {
                this.f12742c = new C2846V[(length + 12)];
                System.arraycopy(vArr, 0, this.f12742c, 0, length);
                vArr = this.f12742c;
            }
            int i3 = this.f12743d;
            this.f12743d = i3 + 1;
            vArr[i3] = v;
        } else if (i < i2) {
            if (length == i2) {
                this.f12742c = new C2846V[(length + 12)];
                System.arraycopy(vArr, 0, this.f12742c, 0, i);
                System.arraycopy(vArr, i, this.f12742c, i + 1, i2 - i);
                vArr = this.f12742c;
            } else {
                System.arraycopy(vArr, i, vArr, i + 1, i2 - i);
            }
            vArr[i] = v;
            this.f12743d++;
        } else {
            throw new IndexOutOfBoundsException("index=" + i + " count=" + i2);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongCall"})
    public void onDraw(Canvas canvas) {
        for (C2846V v : this.f12742c) {
            if (v != null) {
                v.mo9418a(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                C2846V[] vArr = this.f12742c;
                int length = vArr.length;
                while (i < length) {
                    C2846V v = vArr[i];
                    if (v == null || !v.mo9430a(x, y)) {
                        i++;
                    } else {
                        this.f12744e = v;
                        this.f12744e.mo9426a(true);
                        invalidate(this.f12744e.mo9432b());
                        return true;
                    }
                }
                return true;
            case 1:
                if (this.f12744e == null) {
                    return true;
                }
                C2846V[] vArr2 = this.f12742c;
                int length2 = vArr2.length;
                int i2 = 0;
                while (i2 < length2) {
                    C2846V v2 = vArr2[i2];
                    if (v2 == null || !v2.mo9430a(x, y)) {
                        i2++;
                    } else {
                        this.f12744e.mo9426a(false);
                        invalidate(this.f12744e.mo9432b());
                        if (this.f12744e != v2) {
                            v2.mo9426a(false);
                            invalidate(v2.mo9432b());
                        }
                        this.f12744e = null;
                        v2.mo9471w();
                        return true;
                    }
                }
                return true;
            case 2:
                if (this.f12744e == null) {
                    return true;
                }
                boolean z = false;
                for (C2846V v3 : this.f12742c) {
                    if (v3 != null && v3.mo9430a(x, y)) {
                        if (this.f12744e != v3) {
                            this.f12744e.mo9426a(false);
                            invalidate(this.f12744e.mo9432b());
                            this.f12744e = v3;
                            this.f12744e.mo9426a(true);
                            invalidate(this.f12744e.mo9432b());
                            return true;
                        } else if (!this.f12744e.mo9428a()) {
                            this.f12744e.mo9426a(true);
                            invalidate(this.f12744e.mo9432b());
                            return true;
                        } else {
                            z = true;
                        }
                    }
                }
                if (z || !this.f12744e.mo9428a()) {
                    return true;
                }
                this.f12744e.mo9426a(false);
                invalidate(this.f12744e.mo9432b());
                return true;
            case 3:
                if (this.f12744e == null) {
                    return true;
                }
                this.f12744e.mo9426a(false);
                invalidate(this.f12744e.mo9432b());
                this.f12744e = null;
                setTag((Object) null);
                return true;
            case 4:
                if (this.f12744e == null) {
                    return true;
                }
                this.f12744e.mo9426a(false);
                invalidate(this.f12744e.mo9432b());
                return true;
            default:
                if (this.f12744e != null) {
                    this.f12744e.mo9426a(false);
                    invalidate(this.f12744e.mo9432b());
                    this.f12744e = null;
                    setTag((Object) null);
                }
                return false;
        }
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        int i = 0;
        int i2 = this.f12748m;
        for (C2846V v : this.f12742c) {
            if (v != null) {
                if (this.f12747l == 1) {
                    i += v.mo9432b().height();
                } else {
                    i = Math.max(v.mo9432b().height(), i);
                }
            }
        }
        int paddingTop = i + getPaddingTop() + getPaddingBottom();
        return i2 < paddingTop ? paddingTop : i2;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        int i = 0;
        int i2 = this.f12749n;
        for (C2846V v : this.f12742c) {
            if (v != null) {
                if (this.f12747l == 1) {
                    i = Math.max(v.mo9432b().width(), i);
                } else {
                    i += v.mo9432b().width();
                }
            }
        }
        int paddingLeft = i + getPaddingLeft() + getPaddingRight();
        return i2 < paddingLeft ? paddingLeft : i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ViewGroup.LayoutParams mo9322a() {
        if (this.f12747l == 0) {
            return new ViewGroup.LayoutParams(-2, -2);
        }
        if (this.f12747l == 1) {
            return new ViewGroup.LayoutParams(-1, -2);
        }
        return null;
    }

    public float getWeightSum() {
        return this.f12750o;
    }

    public void setWeightSum(float f) {
        this.f12750o = Math.max(0.0f, f);
    }

    public void setOrientation(int i) {
        this.f12747l = i;
    }

    public C2846V[] getChildren() {
        return this.f12742c;
    }

    public int getChildrenCount() {
        return this.f12743d;
    }

    /* renamed from: b */
    public void mo9328b() {
        m13009c();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public void invalidate(Rect rect) {
        super.invalidate(rect);
    }
}
