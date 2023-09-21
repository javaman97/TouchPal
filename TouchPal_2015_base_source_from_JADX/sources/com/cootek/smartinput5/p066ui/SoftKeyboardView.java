package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.p001v4.view.C0505v;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.cootek.p042a.p043a.C0898b;
import com.cootek.p042a.p043a.C0902f;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2829G;
import com.cootek.smartinput5.p066ui.control.C2856c;
import com.emoji.keyboard.touchpal.C3305b;
import com.emoji.keyboard.touchpal.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.cootek.smartinput5.ui.SoftKeyboardView */
public class SoftKeyboardView extends View {

    /* renamed from: Y */
    private static TouchEvent f11541Y = null;

    /* renamed from: b */
    static final int f11542b = 11;

    /* renamed from: d */
    static final int f11543d = -2;

    /* renamed from: e */
    private static final String f11544e = "SoftKeyboardView";

    /* renamed from: f */
    private static final int f11545f = -1;

    /* renamed from: r */
    private static final int f11546r = -1;

    /* renamed from: A */
    private int f11547A;

    /* renamed from: B */
    private int f11548B;

    /* renamed from: C */
    private int f11549C;

    /* renamed from: D */
    private int f11550D;

    /* renamed from: E */
    private final int f11551E;

    /* renamed from: F */
    private final int f11552F;

    /* renamed from: G */
    private boolean f11553G;

    /* renamed from: H */
    private boolean f11554H;

    /* renamed from: I */
    private boolean f11555I;

    /* renamed from: J */
    private boolean f11556J;

    /* renamed from: K */
    private int f11557K;

    /* renamed from: L */
    private Drawable f11558L;

    /* renamed from: M */
    private Drawable f11559M;

    /* renamed from: N */
    private Drawable f11560N;

    /* renamed from: O */
    private Drawable f11561O;

    /* renamed from: P */
    private Drawable f11562P;

    /* renamed from: Q */
    private boolean f11563Q;

    /* renamed from: R */
    private Rect f11564R;

    /* renamed from: S */
    private Rect f11565S;

    /* renamed from: T */
    private WeakReference<Bitmap> f11566T;

    /* renamed from: U */
    private C2817ck f11567U;

    /* renamed from: V */
    private boolean f11568V;

    /* renamed from: W */
    private Canvas f11569W;

    /* renamed from: X */
    private Canvas f11570X;

    /* renamed from: Z */
    private Rect f11571Z;

    /* renamed from: a */
    C2806cb[] f11572a;

    /* renamed from: aa */
    private Paint.FontMetricsInt f11573aa;

    /* renamed from: ab */
    private TypedArray f11574ab;

    /* renamed from: ac */
    private Handler f11575ac;

    /* renamed from: c */
    int[] f11576c;

    /* renamed from: g */
    private C2811cf f11577g;

    /* renamed from: h */
    private int f11578h;

    /* renamed from: i */
    private int f11579i;

    /* renamed from: j */
    private C2856c f11580j;

    /* renamed from: k */
    private Rect f11581k;

    /* renamed from: l */
    private Rect f11582l;

    /* renamed from: m */
    private C2806cb f11583m;

    /* renamed from: n */
    private HashSet<C2806cb> f11584n;

    /* renamed from: o */
    private Rect f11585o;

    /* renamed from: p */
    private int f11586p;

    /* renamed from: q */
    private Paint f11587q;

    /* renamed from: s */
    private int f11588s;

    /* renamed from: t */
    private long f11589t;

    /* renamed from: u */
    private ArrayList<Long> f11590u;

    /* renamed from: v */
    private ArrayList<Long> f11591v;

    /* renamed from: w */
    private int f11592w;

    /* renamed from: x */
    private int f11593x;

    /* renamed from: y */
    private int f11594y;

    /* renamed from: z */
    private int f11595z;

    public SoftKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.keyboardViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SoftKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        this.f11584n = new HashSet<>();
        this.f11586p = 255;
        this.f11576c = new int[11];
        this.f11589t = 0;
        this.f11590u = new ArrayList<>();
        this.f11591v = new ArrayList<>();
        this.f11553G = true;
        this.f11554H = false;
        this.f11555I = false;
        this.f11556J = false;
        this.f11557K = 0;
        this.f11564R = new Rect();
        this.f11565S = new Rect();
        this.f11571Z = null;
        this.f11573aa = null;
        this.f11575ac = new C2883cp(this);
        this.f11574ab = context.obtainStyledAttributes(attributeSet, C3305b.C3322q.SoftKeyboardView, i, 0);
        this.f11567U = m11917a(this.f11574ab);
        C1602bh n = C1368X.m6320c().mo5841n();
        m11934i();
        this.f11552F = context.getResources().getInteger(R.integer.title_leftright_denominator);
        this.f11551E = context.getResources().getInteger(R.integer.title_leftright_numerator);
        this.f11580j = new C2856c(true);
        this.f11580j.setAntiAlias(true);
        this.f11580j.setTextAlign(Paint.Align.CENTER);
        this.f11580j.setAlpha(255);
        C1602bh.C1605c m = n.mo6287m();
        if (m.f5164a) {
            this.f11580j.setShadowLayer((float) m.f5166c, (float) m.f5167d, (float) m.f5168e, m.f5165b);
        }
        this.f11587q = new Paint();
        int d = n.mo6267d((int) R.dimen.button_padding);
        this.f11581k = new Rect(d, d, d, d);
        this.f11582l = new Rect();
        if (f11541Y == null) {
            f11541Y = getTouchEvent();
        }
        f11541Y.setDisplayMetrics(context.getResources().getDisplayMetrics());
        int surfaceSubType = Engine.getInstance().getSurfaceSubType();
        if (this.f11567U == C2817ck.KEYBOARD && m11928b(surfaceSubType)) {
            z = true;
        }
        this.f11555I = z;
        this.f11556J = this.f11555I;
        this.f11554H = true;
    }

    /* renamed from: a */
    private C2817ck m11917a(TypedArray typedArray) {
        return C2817ck.m12805a(typedArray.getInteger(15, 0));
    }

    /* renamed from: b */
    private boolean m11928b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public void setKeyboard(C2811cf cfVar) {
        mo8733b();
        if (this.f11577g != null) {
            this.f11577g.f12546S = null;
        }
        this.f11577g = cfVar;
        this.f11577g.f12546S = this;
        List<C2806cb> q = this.f11577g.mo9195q();
        this.f11572a = (C2806cb[]) q.toArray(new C2806cb[q.size()]);
        requestLayout();
        this.f11568V = true;
        mo8725a();
        mo8734c();
        this.f11585o = null;
    }

    public void setKeyboardData(C2811cf cfVar) {
        mo8733b();
        if (this.f11577g != null) {
            this.f11577g.f12546S = null;
        }
        this.f11577g = cfVar;
        this.f11577g.f12546S = this;
        List<C2806cb> q = this.f11577g.mo9195q();
        this.f11572a = (C2806cb[]) q.toArray(new C2806cb[q.size()]);
        mo8725a();
    }

    /* renamed from: a */
    public void mo8725a() {
        this.f11566T = null;
        this.f11586p = 255;
    }

    /* renamed from: b */
    public void mo8733b() {
        if (this.f11577g != null) {
            this.f11588s = -1;
            MotionEvent obtain = MotionEvent.obtain(0, 0, 3, 0.0f, 0.0f, 0);
            boolean z = false;
            for (int i = 0; i < this.f11576c.length; i++) {
                if (this.f11576c[i] != -2) {
                    int i2 = this.f11576c[i];
                    if (i2 != -1 && i2 < this.f11572a.length) {
                        this.f11572a[i2].onMotionEvent(obtain, false);
                    } else if (!z) {
                        this.f11577g.mo9180a(obtain);
                        z = true;
                    }
                }
            }
            obtain.recycle();
        }
        Arrays.fill(this.f11576c, -2);
    }

    public C2811cf getKeyboard() {
        return this.f11577g;
    }

    /* renamed from: c */
    public void mo8734c() {
        this.f11564R.union(0, 0, getWidth(), getHeight());
        this.f11563Q = true;
        invalidate();
    }

    /* renamed from: a */
    public void mo8726a(int i) {
        if (this.f11572a != null && i >= 0 && i < this.f11572a.length) {
            mo8732a(this.f11572a[i]);
        }
    }

    /* renamed from: a */
    public void mo8732a(C2806cb cbVar) {
        if (cbVar != null) {
            this.f11584n.add(cbVar);
            this.f11575ac.sendMessage(this.f11575ac.obtainMessage(0, cbVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11920a(C2806cb cbVar, boolean z) {
        this.f11565S.set(cbVar.f12453x + getPaddingLeft(), cbVar.f12454y + getPaddingTop(), cbVar.f12453x + cbVar.width + getPaddingLeft(), cbVar.f12454y + cbVar.height + getPaddingTop());
        if (this.f11584n.contains(cbVar)) {
            this.f11584n.remove(cbVar);
            this.f11583m = cbVar;
            this.f11564R.union(this.f11565S);
            m11931f();
            if (z) {
                invalidate(this.f11565S);
            }
            cbVar.mSoftKeyInfo.needUpdate = false;
        } else if (z) {
            invalidate(this.f11565S);
        }
    }

    /* renamed from: b */
    private void m11927b(Canvas canvas) {
        if (m11930e()) {
            if (this.f11569W == this.f11570X) {
                this.f11569W = null;
                this.f11568V = true;
            }
            this.f11555I = this.f11556J;
            return;
        }
        this.f11569W = this.f11570X;
        this.f11555I = false;
        this.f11566T = null;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11568V = true;
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        C0904g.m4916a().mo3404a(C0898b.KBD_DRAW);
        this.f11570X = canvas;
        m11927b(canvas);
        if (this.f11554H) {
            Bitmap buffer = getBuffer();
            if (!m11930e() || this.f11563Q || buffer == null || buffer.isRecycled() || this.f11568V) {
                m11931f();
                bitmap = getBuffer();
            } else {
                bitmap = buffer;
            }
            if (this.f11584n.size() > 0) {
                for (C2806cb a : (C2806cb[]) this.f11584n.toArray(new C2806cb[this.f11584n.size()])) {
                    m11920a(a, false);
                }
            }
            if (bitmap != null && m11930e()) {
                this.f11587q.setAlpha(this.f11586p);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f11587q);
            }
        } else {
            super.draw(canvas);
        }
        this.f11570X = null;
        C1060e.m5598b().mo4271a(C1060e.C1062b.kbd_draw);
        C0904g.m4916a().mo3409b(C0898b.KBD_DRAW);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap buffer = getBuffer();
        if (this.f11563Q || buffer == null || buffer.isRecycled() || this.f11568V) {
            m11931f();
        }
        canvas.drawBitmap(buffer, 0.0f, 0.0f, (Paint) null);
    }

    private Bitmap getBuffer() {
        if (this.f11566T != null) {
            return (Bitmap) this.f11566T.get();
        }
        return null;
    }

    /* renamed from: b */
    private void m11926b(int i, int i2) {
        Bitmap buffer = getBuffer();
        if (!m11930e()) {
            return;
        }
        if (this.f11569W == null || buffer == null || buffer.isRecycled() || buffer.getWidth() < i || buffer.getHeight() < i2) {
            int max = Math.max(1, i);
            int max2 = Math.max(1, i2);
            if (this.f11577g != null) {
                max = Math.max(max, this.f11577g.mo9194p());
                max2 = Math.max(max2, this.f11577g.mo9193o());
            }
            this.f11566T = Engine.getInstance().getWidgetManager().mo9606L().mo9706a(this.f11567U, max, max2);
            Bitmap bitmap = (Bitmap) this.f11566T.get();
            if (bitmap == null) {
                this.f11553G = false;
                this.f11569W = this.f11570X;
                m11927b(this.f11569W);
                mo8734c();
            } else if (this.f11569W == null || this.f11569W == this.f11570X) {
                this.f11569W = new Canvas(bitmap);
            } else {
                this.f11569W.setBitmap(bitmap);
            }
        }
    }

    /* renamed from: e */
    private boolean m11930e() {
        return this.f11553G;
    }

    /* renamed from: a */
    private void m11918a(Canvas canvas, boolean z) {
        if (m11930e()) {
            canvas.clipRect(this.f11564R, Region.Op.REPLACE);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    /* renamed from: c */
    private boolean m11929c(Canvas canvas) {
        Drawable drawable = this.f11558L;
        if (drawable == null) {
            return false;
        }
        if (this.f11577g.f12540M != null) {
            drawable.setBounds(this.f11577g.f12540M);
        } else {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        mo8730a(drawable, canvas);
        return true;
    }

    /* renamed from: a */
    private boolean m11922a(Canvas canvas, int i, int i2) {
        canvas.translate((float) (-i), (float) (-i2));
        boolean c = m11929c(canvas);
        canvas.translate((float) i, (float) i2);
        return c;
    }

    /* renamed from: f */
    private void m11931f() {
        boolean z;
        boolean z2;
        Drawable drawable;
        boolean z3;
        Bitmap bitmap;
        boolean z4;
        boolean z5;
        Canvas canvas;
        boolean z6;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float textSize;
        Paint.Align align;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        Paint.Align align2;
        String str;
        float f11;
        float f12;
        float f13;
        float f14;
        String str2;
        boolean z7;
        float f15;
        float f16;
        float f17;
        Paint.Align align3;
        Drawable drawable2;
        int idByKey;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Canvas canvas2;
        boolean z8;
        if (this.f11577g != null && Engine.isInitialized()) {
            if (m11930e() || this.f11570X != null) {
                C0904g.m4916a().mo3404a(C0898b.KBD_BUF_DRAW);
                Bitmap buffer = getBuffer();
                if (!m11930e() || buffer == null || buffer.isRecycled() || this.f11568V) {
                    m11926b(this.f11577g.mo9192n(), this.f11577g.mo9134g());
                    if (m11930e()) {
                        mo8734c();
                    }
                    this.f11568V = false;
                }
                if (this.f11569W == null) {
                    C1060e.m5598b().mo4271a(C1060e.C1062b.kbd_buf_draw);
                    C0904g.m4916a().mo3409b(C0898b.KBD_BUF_DRAW);
                    return;
                }
                Canvas canvas3 = this.f11569W;
                C2856c cVar = this.f11580j;
                Rect rect = this.f11564R;
                Rect rect2 = this.f11581k;
                Rect rect3 = this.f11582l;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                C2806cb[] cbVarArr = this.f11572a;
                C2806cb cbVar = this.f11583m;
                C2929h L = Engine.getInstance().getWidgetManager().mo9606L();
                C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
                C1602bh n = C1368X.m6320c().mo5841n();
                boolean z9 = false;
                boolean z10 = false;
                if (cbVar != null && (cbVar.f12453x + paddingLeft) - 1 <= rect.left && (cbVar.f12454y + paddingTop) - 1 <= rect.top && cbVar.f12453x + cbVar.width + paddingLeft + 1 >= rect.right && cbVar.f12454y + cbVar.height + paddingTop + 1 >= rect.bottom) {
                    z10 = true;
                }
                if (!m11930e()) {
                    z = false;
                } else {
                    z = z10;
                }
                boolean z11 = false;
                if (!z) {
                    m11918a(canvas3, true);
                    z9 = true;
                    if (this.f11554H) {
                        z11 = m11929c(canvas3);
                    }
                }
                int length = cbVarArr.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    boolean z12 = z2;
                    if (i2 >= length) {
                        break;
                    }
                    C2806cb cbVar2 = cbVarArr[i2];
                    if (z && cbVar != cbVar2) {
                        z2 = z12;
                    } else if (!cbVar2.getVisible()) {
                        z2 = z12;
                    } else if (m11930e() || canvas3.getClipBounds().intersect(cbVar2.f12453x + paddingLeft, cbVar2.f12454y + paddingTop, cbVar2.f12453x + cbVar2.width + paddingLeft, cbVar2.f12454y + cbVar2.height + paddingTop)) {
                        cbVar2.updateRendingDrawable();
                        SoftKeyInfo softKeyInfo = cbVar2.mSoftKeyInfo;
                        if (cbVar2.background != null) {
                            drawable = cbVar2.background;
                        } else if (cbVar2.backgroundType == 0) {
                            drawable = this.f11559M;
                        } else {
                            drawable = this.f11560N;
                        }
                        if (drawable == null) {
                            z2 = z12;
                        } else {
                            Integer foreColor = cbVar2.getForeColor();
                            if (foreColor != null) {
                                cVar.setColor(foreColor.intValue());
                            } else if (cbVar2.backgroundType == 0) {
                                cVar.setColor(this.f11547A);
                            } else {
                                cVar.setColor(this.f11549C);
                            }
                            int[] currentDrawableState = cbVar2.getCurrentDrawableState();
                            drawable.setState(currentDrawableState);
                            if (!z || !this.f11555I || this.f11557K <= 0 || !((currentDrawableState == null || currentDrawableState.length == 0) && cbVar2.backgroundType == 0)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (this.f11554H) {
                                C2809cd softKeyDrawInfo = cbVar2.getSoftKeyDrawInfo();
                                softKeyDrawInfo.f12458c = currentDrawableState;
                                if (cbVar2.isCachable()) {
                                    bitmap2 = L.mo9705a(softKeyDrawInfo);
                                } else {
                                    bitmap2 = null;
                                }
                                if (bitmap2 != null) {
                                    if (!z || z9) {
                                        z8 = z9;
                                    } else {
                                        if (!canvas3.getClipBounds().equals(this.f11564R)) {
                                            m11918a(canvas3, true);
                                        } else {
                                            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
                                        }
                                        z8 = true;
                                    }
                                    m11933h();
                                    canvas3.drawBitmap(bitmap2, (float) (cbVar2.f12453x + paddingLeft), (float) (cbVar2.f12454y + paddingTop), (Paint) null);
                                    z9 = z8;
                                    z2 = z12;
                                } else {
                                    if (z3) {
                                        Bitmap b = L.mo9707b(softKeyDrawInfo);
                                        m11933h();
                                        if (b != null) {
                                            canvas2 = new Canvas(b);
                                            if (z && !z9) {
                                                m11918a(canvas3, true);
                                                z9 = true;
                                            }
                                            z4 = m11922a(canvas2, cbVar2.f12453x + paddingLeft, cbVar2.f12454y + paddingTop);
                                            Bitmap bitmap4 = b;
                                            z5 = z9;
                                            bitmap3 = bitmap4;
                                        } else {
                                            z4 = z12;
                                            canvas2 = canvas3;
                                            Bitmap bitmap5 = b;
                                            z5 = z9;
                                            bitmap3 = bitmap5;
                                        }
                                    } else {
                                        z4 = z12;
                                        z5 = z9;
                                        bitmap3 = bitmap2;
                                        canvas2 = canvas3;
                                    }
                                    if (!z4) {
                                        if (z && !z5) {
                                            m11918a(canvas3, true);
                                            z5 = true;
                                        }
                                        z4 = m11929c(canvas3);
                                        bitmap = bitmap3;
                                        canvas = canvas2;
                                    } else {
                                        bitmap = bitmap3;
                                        canvas = canvas2;
                                    }
                                }
                            } else {
                                bitmap = null;
                                z4 = z12;
                                z5 = z9;
                                canvas = canvas3;
                            }
                            if (!z || z5) {
                                z6 = z5;
                            } else {
                                m11918a(canvas3, true);
                                z6 = true;
                            }
                            Rect bounds = drawable.getBounds();
                            if (!(cbVar2.width == bounds.right && cbVar2.height == bounds.bottom)) {
                                drawable.setBounds(0, 0, cbVar2.width, cbVar2.height);
                            }
                            canvas3.translate((float) (cbVar2.f12453x + paddingLeft), (float) (cbVar2.f12454y + paddingTop));
                            mo8730a(drawable, canvas);
                            drawable.getPadding(rect3);
                            int i3 = (cbVar2.width - rect3.left) - rect3.right;
                            int i4 = (cbVar2.height - rect3.top) - rect3.bottom;
                            if (((double) rect2.left) > ((double) cbVar2.width) * 0.1d) {
                                rect2.left = (int) (((double) cbVar2.width) * 0.1d);
                                rect2.right = rect2.left;
                            }
                            int i5 = (cbVar2.width - rect2.left) - rect2.right;
                            int i6 = (cbVar2.height - rect2.top) - rect2.bottom;
                            if (cbVar2.icon != null && cbVar2.icon.isVisible()) {
                                cbVar2.refreshIconColor();
                                cbVar2.icon.setState(currentDrawableState);
                                if (cbVar2.foreIconType == 1) {
                                    canvas.translate((float) rect3.left, (float) rect3.top);
                                    cbVar2.icon.setBounds(0, 0, i3, i4);
                                    mo8730a(cbVar2.icon, canvas);
                                    canvas.translate((float) (-rect3.left), (float) (-rect3.top));
                                } else {
                                    int i7 = (cbVar2.width - rect3.left) - rect3.right;
                                    int i8 = (cbVar2.height - rect3.top) - rect3.bottom;
                                    int intrinsicWidth = (int) (((double) cbVar2.icon.getIntrinsicWidth()) * ad.mo9252j());
                                    int intrinsicHeight = (int) (((double) cbVar2.icon.getIntrinsicHeight()) * ad.mo9252j());
                                    int i9 = rect3.left + ((i7 - intrinsicWidth) / 2);
                                    int i10 = (((i8 - intrinsicHeight) * 24) / 50) + rect3.top;
                                    if (i9 <= rect3.left) {
                                        i9 = rect3.left + 2;
                                        intrinsicHeight = (int) ((((float) i7) / ((float) intrinsicWidth)) * ((float) intrinsicHeight));
                                        i10 = (((i8 - intrinsicHeight) * 24) / 50) + rect3.top;
                                        intrinsicWidth = i7;
                                    }
                                    if (i10 <= rect3.top) {
                                        i10 = rect3.top + 2;
                                        intrinsicWidth = (int) ((((float) i8) / ((float) intrinsicHeight)) * ((float) intrinsicWidth));
                                        i9 = ((i7 - intrinsicWidth) / 2) + rect3.left;
                                        intrinsicHeight = i8;
                                    }
                                    canvas.translate((float) i9, (float) i10);
                                    cbVar2.icon.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                                    mo8730a(cbVar2.icon, canvas);
                                    canvas.translate((float) (-i9), (float) (-i10));
                                }
                            }
                            if (cbVar2.mFunctionSettingId != null && (idByKey = Settings.getInstance().getIdByKey(cbVar2.mFunctionSettingId)) >= 0 && Settings.getInstance().getBoolSetting(idByKey)) {
                                Drawable a = n.mo6249a((int) R.drawable.new_tag);
                                a.setBounds(rect3.left, rect3.top, i3, i4);
                                mo8730a(a, canvas);
                            }
                            if (cbVar2.hasLongPressIcon) {
                                if (cbVar2.longPressIcon != null) {
                                    drawable2 = cbVar2.longPressIcon;
                                } else if (cbVar2.backgroundType == 0) {
                                    drawable2 = this.f11562P;
                                } else {
                                    drawable2 = this.f11561O;
                                }
                                canvas.translate((float) rect3.left, (float) rect3.top);
                                drawable2.setBounds(0, 0, i3, i4);
                                mo8730a(drawable2, canvas);
                                canvas.translate((float) (-rect3.left), (float) (-rect3.top));
                            }
                            if (softKeyInfo.printTitle != 0) {
                                if ((softKeyInfo.printTitle & 2) != 0) {
                                    if ((softKeyInfo.printTitle & 1) != 0) {
                                        String str3 = softKeyInfo.mainTitle;
                                        cVar.setTypeface(C1624bv.m7418a());
                                        if (cbVar2.mSoftKeyInfo.needUpdate || cbVar2.mainOnlyAdjustedTextSize == -1) {
                                            cbVar2.mainOnlyAdjustedTextSize = m11916a(cbVar2, softKeyInfo.printTitle);
                                            cVar.setTextSize((float) cbVar2.mainOnlyAdjustedTextSize);
                                            if (cbVar2.mainTitleRef != null) {
                                                str = cbVar2.mainTitleRef;
                                            } else {
                                                str = str3;
                                            }
                                            while (cVar.measureText(str) + ((float) rect2.left) + ((float) rect2.right) > ((float) i5)) {
                                                cbVar2.mainOnlyAdjustedTextSize--;
                                                cVar.setTextSize((float) cbVar2.mainOnlyAdjustedTextSize);
                                            }
                                        }
                                        cVar.setTextSize((float) cbVar2.mainOnlyAdjustedTextSize);
                                        float a2 = C2829G.m12926a((Paint) cVar, str3);
                                        Paint.Align align4 = null;
                                        if (cbVar2.mainTextPos == null) {
                                            if (cbVar2.mainTextXAlign == null || cbVar2.mainTextXAlign == Paint.Align.CENTER) {
                                                f9 = ((float) ((i5 / 2) + rect2.left)) - a2;
                                            } else {
                                                align4 = cVar.getTextAlign();
                                                f9 = (m11914a(i5, 0, cbVar2.mainTextXAlign, cVar) + ((float) rect2.left)) - a2;
                                            }
                                            if (cbVar2.mainTextYAlign != null) {
                                                f10 = m11925b(i6, 0, cbVar2.mainTextYAlign, cVar) + ((float) rect2.top);
                                                align2 = align4;
                                            } else {
                                                f10 = m11915a((Paint) cVar, ((float) ((i6 * 20) / 50)) + ((cVar.getTextSize() - cVar.descent()) / 2.0f) + ((float) rect2.top), str3);
                                                if (softKeyInfo.mainTitle == null || softKeyInfo.mainTitle.length() <= 0 || this.f11571Z.bottom <= 0 || Character.isLetter(softKeyInfo.mainTitle.charAt(0))) {
                                                    align2 = align4;
                                                } else {
                                                    f10 -= (float) this.f11571Z.bottom;
                                                    cVar.setTextSize(cVar.getTextSize() - ((float) this.f11571Z.bottom));
                                                    align2 = align4;
                                                }
                                            }
                                        } else {
                                            if (cbVar2.mainTextXAlign != null) {
                                                align4 = cVar.getTextAlign();
                                                f8 = (m11914a(i5, cbVar2.mainTextPos.x, cbVar2.mainTextXAlign, cVar) + ((float) rect2.left)) - a2;
                                            } else {
                                                f8 = ((float) cbVar2.mainTextPos.x) - a2;
                                            }
                                            if (cbVar2.mainTextYAlign != null) {
                                                f10 = m11925b(i6, cbVar2.mainTextPos.y, cbVar2.mainTextYAlign, cVar) + ((float) rect2.top);
                                                align2 = align4;
                                            } else {
                                                f10 = (float) cbVar2.mainTextPos.y;
                                                align2 = align4;
                                            }
                                        }
                                        mo8728a(canvas, str3, f9, f10, cVar);
                                        if (align2 != null) {
                                            cVar.setTextAlign(align2);
                                        }
                                    } else if ((softKeyInfo.printTitle & 12) != 0) {
                                        cVar.setTypeface(C1624bv.m7418a());
                                        cVar.setTextSize((float) m11916a(cbVar2, softKeyInfo.printTitle));
                                        String str4 = softKeyInfo.leftTitle;
                                        if (cbVar2.mainTitleRef != null) {
                                            str4 = cbVar2.mainTitleRef;
                                        }
                                        int textSize2 = (int) cVar.getTextSize();
                                        while (cVar.measureText(str4) + ((float) rect2.left) + ((float) rect2.right) > ((float) i5)) {
                                            textSize2--;
                                            cVar.setTextSize((float) textSize2);
                                        }
                                        float a3 = C2829G.m12926a((Paint) cVar, softKeyInfo.leftTitle);
                                        if (cbVar2.leftTextPos == null) {
                                            f = ((float) (((i5 / this.f11552F) * this.f11551E) + rect2.left)) - a3;
                                            f2 = ((float) ((i6 * 20) / 50)) + ((cVar.getTextSize() - cVar.descent()) / 2.0f) + ((float) rect2.top);
                                            m11915a((Paint) cVar, f2, softKeyInfo.leftTitle);
                                        } else {
                                            f = ((float) cbVar2.leftTextPos.x) - a3;
                                            f2 = (float) cbVar2.leftTextPos.y;
                                        }
                                        mo8728a(canvas, softKeyInfo.leftTitle, f, f2, cVar);
                                        float a4 = C2829G.m12926a((Paint) cVar, softKeyInfo.rightTitle);
                                        if (cbVar2.rightTextPos == null) {
                                            f3 = (((float) (((i5 / this.f11552F) * (this.f11552F - this.f11551E)) + rect2.left)) - a4) + 3.0f;
                                            f4 = ((float) ((i6 * 20) / 50)) + ((cVar.getTextSize() - cVar.descent()) / 2.0f) + ((float) rect2.top);
                                            m11915a((Paint) cVar, f4, softKeyInfo.rightTitle);
                                        } else {
                                            f3 = ((float) cbVar2.rightTextPos.x) - a4;
                                            f4 = (float) cbVar2.rightTextPos.y;
                                        }
                                        mo8728a(canvas, softKeyInfo.rightTitle, f3, f4, cVar);
                                    }
                                    cVar.setTypeface(C1624bv.m7418a());
                                    cVar.setTextSize((float) m11916a(cbVar2, 2));
                                    if (cbVar2.backgroundType == 0) {
                                        cVar.setColor(this.f11548B);
                                    } else {
                                        cVar.setColor(this.f11550D);
                                    }
                                    float a5 = C2829G.m12926a((Paint) cVar, softKeyInfo.altTitle);
                                    Paint.Align align5 = null;
                                    if (cbVar2.altTextPos != null) {
                                        if (cbVar2.altTextXAlign != null) {
                                            align5 = cVar.getTextAlign();
                                            f7 = (m11914a(i5, cbVar2.altTextPos.x, cbVar2.altTextXAlign, cVar) + ((float) rect2.left)) - a5;
                                        } else {
                                            f7 = ((float) cbVar2.altTextPos.x) - a5;
                                        }
                                        if (cbVar2.altTextYAlign != null) {
                                            textSize = ((float) rect2.top) + m11925b(i6, cbVar2.altTextPos.y, cbVar2.altTextYAlign, cVar);
                                            align = align5;
                                            f6 = f7;
                                        } else {
                                            textSize = (float) cbVar2.altTextPos.y;
                                            align = align5;
                                            f6 = f7;
                                        }
                                    } else if (cbVar2.altTextInCorner) {
                                        Paint.Align textAlign = cVar.getTextAlign();
                                        cVar.setTextAlign(Paint.Align.RIGHT);
                                        float f18 = ((float) (i5 - rect2.right)) - a5;
                                        textSize = ((float) rect2.top) + ((float) ((i6 * 75) / 100)) + ((cVar.getTextSize() - cVar.descent()) / 2.0f);
                                        if (((double) cVar.getTextSize()) >= ((double) cbVar2.height) * 0.25d) {
                                            cVar.setTextSize((float) ((int) (((double) cbVar2.height) * 0.25d)));
                                        }
                                        align = textAlign;
                                        f6 = f18;
                                    } else {
                                        if (cbVar2.altTextXAlign == null || cbVar2.altTextXAlign == Paint.Align.CENTER) {
                                            f5 = ((float) ((i5 / 2) + rect2.left)) - a5;
                                        } else {
                                            align5 = cVar.getTextAlign();
                                            f5 = (m11914a(i5, cbVar2.altTextPos.x, cbVar2.altTextXAlign, cVar) + ((float) rect2.left)) - a5;
                                        }
                                        if (cbVar2.altTextYAlign != null) {
                                            textSize = ((float) rect2.top) + m11925b(i6, cbVar2.altTextPos.y, cbVar2.altTextYAlign, cVar);
                                            align = align5;
                                            f6 = f5;
                                        } else {
                                            textSize = ((float) rect2.top) + ((float) ((i6 * 37) / 50)) + ((cVar.getTextSize() - cVar.descent()) / 2.0f);
                                            align = align5;
                                            f6 = f5;
                                        }
                                    }
                                    mo8728a(canvas, softKeyInfo.altTitle, f6, textSize, cVar);
                                    if (align != null) {
                                        cVar.setTextAlign(align);
                                    }
                                } else if ((softKeyInfo.printTitle & 1) != 0 && !TextUtils.isEmpty(softKeyInfo.mainTitle)) {
                                    String str5 = softKeyInfo.mainTitle;
                                    cVar.setTypeface(C1624bv.m7418a());
                                    if (cbVar2.mMaxDisplay != -1 && str5.length() > cbVar2.mMaxDisplay && cbVar2.mMaxDisplay - 1 >= 0) {
                                        str5 = str5.substring(0, cbVar2.mMaxDisplay - 1).concat("..");
                                    }
                                    boolean z13 = cbVar2.splitWord;
                                    if (z13) {
                                        String[] split = str5.split(" ");
                                        if (split.length > 1) {
                                            str2 = "";
                                            int length2 = split.length;
                                            int i11 = 0;
                                            while (i11 < length2) {
                                                String str6 = split[i11];
                                                if (str6.length() <= str2.length()) {
                                                    str6 = str2;
                                                }
                                                i11++;
                                                str2 = str6;
                                            }
                                            z7 = z13;
                                        } else {
                                            str2 = str5;
                                            z7 = false;
                                        }
                                    } else {
                                        str2 = str5;
                                        z7 = z13;
                                    }
                                    if (cbVar2.mSoftKeyInfo.needUpdate || cbVar2.mainOnlyAdjustedTextSize == -1) {
                                        cbVar2.isMultiLineMode = false;
                                        cbVar2.mainOnlyAdjustedTextSize = m11916a(cbVar2, softKeyInfo.printTitle);
                                        cVar.setTextSize((float) cbVar2.mainOnlyAdjustedTextSize);
                                        if (cVar.measureText(str2) + ((float) rect2.left) + ((float) rect2.right) > ((float) i5)) {
                                            if (cbVar2.allowMultiLine) {
                                                while (true) {
                                                    if (cVar.measureText(str2) + ((float) rect2.left) + ((float) rect2.right) <= ((float) i5)) {
                                                        break;
                                                    }
                                                    cbVar2.mainOnlyAdjustedTextSize -= 2;
                                                    if (cbVar2.mainOnlyAdjustedTextSize <= this.f11593x) {
                                                        cbVar2.mainOnlyAdjustedTextSize = this.f11593x;
                                                        cbVar2.isMultiLineMode = true;
                                                        cbVar2.layoutMainOnlyText(i5, i6, cVar);
                                                        break;
                                                    }
                                                    cVar.setTextSize((float) cbVar2.mainOnlyAdjustedTextSize);
                                                }
                                            } else {
                                                while (cVar.measureText(str2) + ((float) rect2.left) + ((float) rect2.right) > ((float) i5)) {
                                                    cbVar2.mainOnlyAdjustedTextSize--;
                                                    cVar.setTextSize((float) cbVar2.mainOnlyAdjustedTextSize);
                                                }
                                            }
                                        }
                                    }
                                    cVar.setTextSize((float) cbVar2.mainOnlyAdjustedTextSize);
                                    if (cbVar2 instanceof SoftFilter) {
                                        cbVar2.mainOnlyAdjustedTextSize = -1;
                                    }
                                    if (cbVar2.isMultiLineMode) {
                                        float f19 = -cVar.ascent();
                                        float fontSpacing = cVar.getFontSpacing();
                                        float size = (((float) i6) - (((float) cbVar2.lineInfo.size()) * fontSpacing)) / 2.0f;
                                        int i12 = 0;
                                        int i13 = 0;
                                        Iterator<Integer> it = cbVar2.lineInfo.iterator();
                                        while (true) {
                                            int i14 = i13;
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            int intValue = it.next().intValue();
                                            mo8729a(canvas, str2, i12, i12 + intValue, (float) ((i5 / 2) + rect2.left), (((float) i14) * fontSpacing) + ((float) rect2.top) + size + f19, cVar);
                                            i12 += intValue;
                                            i13 = i14 + 1;
                                        }
                                    } else if (z7) {
                                        cVar.setTextSize((float) cbVar2.mainOnlyTextSize);
                                        String str7 = softKeyInfo.mainTitle;
                                        String[] split2 = str7.split(" ");
                                        float f20 = -cVar.ascent();
                                        float fontSpacing2 = cVar.getFontSpacing();
                                        float length3 = (((float) i6) - (((float) split2.length) * fontSpacing2)) / 2.0f;
                                        float a6 = C2829G.m12926a((Paint) cVar, str7);
                                        int i15 = 0;
                                        while (true) {
                                            int i16 = i15;
                                            if (i16 >= split2.length) {
                                                break;
                                            }
                                            mo8728a(canvas, split2[i16], ((float) ((i5 / 2) + rect2.left)) - a6, (((float) i16) * fontSpacing2) + ((float) rect2.top) + length3 + f20, cVar);
                                            i15 = i16 + 1;
                                        }
                                    } else {
                                        Paint.Align align6 = null;
                                        float a7 = C2829G.m12926a((Paint) cVar, str2);
                                        if (cbVar2.mainTextPos == null) {
                                            if (cbVar2.mainTextXAlign == null || cbVar2.mainTextXAlign == Paint.Align.CENTER) {
                                                f16 = ((((float) i5) / 2.0f) + ((float) rect2.left)) - a7;
                                            } else {
                                                align6 = cVar.getTextAlign();
                                                f16 = (m11914a(i5, 0, cbVar2.mainTextXAlign, cVar) + ((float) rect2.left)) - a7;
                                            }
                                            if (cbVar2.mainTextYAlign == null || cbVar2.mainTextYAlign == Paint.Align.CENTER) {
                                                f17 = m11915a((Paint) cVar, ((float) ((i6 * 24) / 50)) + ((cVar.getTextSize() - cVar.descent()) / 2.0f) + ((float) rect2.top), str2);
                                                align3 = align6;
                                            } else {
                                                f17 = m11925b(i6, 0, cbVar2.mainTextYAlign, cVar) + ((float) rect2.top);
                                                align3 = align6;
                                            }
                                        } else {
                                            if (cbVar2.mainTextXAlign != null) {
                                                align6 = cVar.getTextAlign();
                                                f15 = (m11914a(i5, cbVar2.mainTextPos.x, cbVar2.mainTextXAlign, cVar) + ((float) rect2.left)) - a7;
                                            } else {
                                                f15 = ((float) cbVar2.mainTextPos.x) - a7;
                                            }
                                            if (cbVar2.mainTextYAlign != null) {
                                                f17 = m11925b(i6, cbVar2.mainTextPos.y, cbVar2.mainTextYAlign, cVar) + ((float) rect2.top);
                                                align3 = align6;
                                            } else {
                                                f17 = (float) cbVar2.mainTextPos.y;
                                                align3 = align6;
                                            }
                                        }
                                        mo8728a(canvas, str2, f16, f17, cVar);
                                        if (align3 != null) {
                                            cVar.setTextAlign(align3);
                                        }
                                    }
                                } else if ((softKeyInfo.printTitle & 12) != 0) {
                                    cVar.setTypeface(C1624bv.m7418a());
                                    cVar.setTextSize((float) m11916a(cbVar2, softKeyInfo.printTitle));
                                    String str8 = softKeyInfo.leftTitle;
                                    if (cbVar2.mainTitleRef != null) {
                                        str8 = cbVar2.mainTitleRef;
                                    }
                                    int textSize3 = (int) cVar.getTextSize();
                                    while (cVar.measureText(str8) + ((float) rect2.left) + ((float) rect2.right) > ((float) i5)) {
                                        textSize3--;
                                        cVar.setTextSize((float) textSize3);
                                    }
                                    float a8 = C2829G.m12926a((Paint) cVar, softKeyInfo.leftTitle);
                                    if (cbVar2.leftTextPos == null) {
                                        f11 = ((float) (((i5 / this.f11552F) * this.f11551E) + rect2.left)) - a8;
                                        f12 = m11915a((Paint) cVar, ((float) ((i6 * 24) / 50)) + ((cVar.getTextSize() - cVar.descent()) / 2.0f) + ((float) rect2.top), softKeyInfo.leftTitle);
                                    } else {
                                        f11 = ((float) cbVar2.leftTextPos.x) - a8;
                                        f12 = (float) cbVar2.leftTextPos.y;
                                    }
                                    mo8728a(canvas, softKeyInfo.leftTitle, f11, f12, cVar);
                                    float a9 = C2829G.m12926a((Paint) cVar, softKeyInfo.rightTitle);
                                    if (cbVar2.rightTextPos == null) {
                                        f13 = (((float) (((i5 / this.f11552F) * (this.f11552F - this.f11551E)) + rect2.left)) - a9) + 3.0f;
                                        f14 = m11915a((Paint) cVar, ((float) ((i6 * 24) / 50)) + ((cVar.getTextSize() - cVar.descent()) / 2.0f) + ((float) rect2.top), softKeyInfo.rightTitle);
                                    } else {
                                        f13 = ((float) cbVar2.rightTextPos.x) - a9;
                                        f14 = (float) cbVar2.rightTextPos.y;
                                    }
                                    mo8728a(canvas, softKeyInfo.rightTitle, f13, f14, cVar);
                                }
                            }
                            if (!(!z3 || bitmap == null || canvas == canvas3)) {
                                canvas3.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            }
                            canvas3.translate((float) ((-cbVar2.f12453x) - paddingLeft), (float) ((-cbVar2.f12454y) - paddingTop));
                            cbVar2.mSoftKeyInfo.needUpdate = false;
                            z2 = z4;
                            z9 = z6;
                        }
                    } else {
                        z2 = z12;
                    }
                    i = i2 + 1;
                }
                if (this.f11585o != null) {
                    canvas3.clipRect(this.f11585o, Region.Op.REPLACE);
                    canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                this.f11583m = null;
                this.f11563Q = false;
                this.f11564R.setEmpty();
                C1060e.m5598b().mo4271a(C1060e.C1062b.kbd_buf_draw);
                C0904g.m4916a().mo3409b(C0898b.KBD_BUF_DRAW);
            }
        }
    }

    /* renamed from: a */
    private float m11915a(Paint paint, float f, String str) {
        if (str == null || paint == null) {
            return f;
        }
        if (this.f11571Z == null) {
            this.f11571Z = new Rect();
        }
        paint.getTextBounds(str, 0, str.length(), this.f11571Z);
        if (this.f11573aa == null) {
            this.f11573aa = new Paint.FontMetricsInt();
        }
        paint.getFontMetricsInt(this.f11573aa);
        int i = this.f11573aa.ascent - this.f11571Z.top;
        int i2 = this.f11571Z.bottom - this.f11573aa.descent;
        if (i > 0 && i2 > 0) {
            return f + ((float) (i - i2));
        }
        if (i > 0) {
            return f + ((float) i);
        }
        if (i2 > 0) {
            return f - ((float) i2);
        }
        return f;
    }

    /* renamed from: a */
    private boolean m11924a(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f11577g.f12587w;
        }
        if (!this.f11577g.f12587w || C2829G.m12929a(str.charAt(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private float m11914a(int i, int i2, Paint.Align align, Paint paint) {
        paint.setTextAlign(align);
        if (align == Paint.Align.LEFT) {
            return (float) i2;
        }
        if (align == Paint.Align.CENTER) {
            return (float) ((i / 2) + i2);
        }
        if (align == Paint.Align.RIGHT) {
            return (float) (i - i2);
        }
        return 0.0f;
    }

    /* renamed from: b */
    private float m11925b(int i, int i2, Paint.Align align, Paint paint) {
        if (align == Paint.Align.LEFT) {
            return ((float) i2) + (paint.getTextSize() - paint.descent());
        }
        if (align == Paint.Align.CENTER) {
            return ((float) ((i / 2) + i2)) + ((paint.getTextSize() - paint.descent()) / 2.0f);
        }
        if (align == Paint.Align.RIGHT) {
            return ((float) (i - i2)) - paint.descent();
        }
        return 0.0f;
    }

    private static TouchEvent getTouchEvent() {
        String str;
        if (Integer.parseInt(Build.VERSION.SDK) < 5) {
            str = "com.cootek.smartinput5.ui.TouchEvent4";
        } else {
            str = "com.cootek.smartinput5.ui.TouchEvent5_";
        }
        try {
            return (TouchEvent) Class.forName(str).asSubclass(TouchEvent.class).newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    private boolean m11923a(MotionEvent motionEvent) {
        if (motionEvent == null || !Engine.isInitialized() || Engine.getInstance().isInputPaused() || f11541Y.degenerateMultiTouch(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int a;
        if (!C1368X.m6324d() || !Engine.isInitialized()) {
            return false;
        }
        C0904g.m4916a().mo3414d(C0902f.C0903a.SHOW_KEYBOARD);
        int action = (motionEvent.getAction() & C0505v.f1135g) >> 8;
        boolean z2 = (motionEvent.getAction() & 255) == 5;
        if (action > 0 && z2) {
            if (action == 1) {
                this.f11590u.add(Long.valueOf((motionEvent.getEventTime() - motionEvent.getDownTime()) * 1000000));
            } else if (action > 1) {
                this.f11591v.add(Long.valueOf((motionEvent.getEventTime() - motionEvent.getDownTime()) * 1000000));
            }
        }
        if (motionEvent.getAction() != 1 || (a = mo8724a((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || a >= this.f11572a.length) {
            z = false;
        } else {
            C2806cb cbVar = this.f11572a[a];
            if (!cbVar.isNormalKey() || !cbVar.isInside(this.f11578h, this.f11579i)) {
                z = true;
            } else {
                C0904g.m4916a().mo3412c(C0902f.C0903a.CLICK);
                z = false;
            }
        }
        if (Engine.getInstance().getSurfaceType() != 1 || z) {
            C0904g.m4916a().mo3414d(C0902f.C0903a.CLICK);
            if (motionEvent.getAction() == 1) {
                this.f11590u.clear();
                this.f11591v.clear();
            }
        } else if (motionEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f11589t;
            if (currentTimeMillis > 0 && currentTimeMillis < 2000) {
                C0904g.m4916a().mo3405a(C0898b.OP, currentTimeMillis * 1000000);
            }
            this.f11589t = System.currentTimeMillis();
            C0904g.m4916a().mo3414d(C0902f.C0903a.CLICK);
        } else if (motionEvent.getAction() == 1) {
            C0904g.m4916a().mo3405a(C0898b.DOWN_UP, (System.currentTimeMillis() - this.f11589t) * 1000000);
            C1060e.m5598b().mo4271a(C1060e.C1062b.keyUp);
            Iterator<Long> it = this.f11590u.iterator();
            while (it.hasNext()) {
                C0904g.m4916a().mo3405a(C0898b.DOWN_2, it.next().longValue());
            }
            Iterator<Long> it2 = this.f11591v.iterator();
            while (it2.hasNext()) {
                C0904g.m4916a().mo3405a(C0898b.DOWN_3, it2.next().longValue());
            }
            this.f11590u.clear();
            this.f11591v.clear();
        }
        if (m11923a(motionEvent)) {
            return true;
        }
        if (this.f11555I && motionEvent.getAction() == 1) {
            m11932g();
        }
        boolean doEvent = f11541Y.doEvent(motionEvent, this);
        if (!this.f11577g.f12572ad) {
            return doEvent;
        }
        Engine.getInstance().processEvent();
        this.f11577g.f12572ad = false;
        return doEvent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8731a(MotionEvent motionEvent, int i, boolean z) {
        int i2;
        if (i < 11) {
            if (this.f11577g.f12539L != null) {
                HandWriteMask p = Engine.getInstance().getWidgetManager().mo9659p();
                if (!p.mo8614b() && p.mo8613a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return;
                }
            }
            int action = motionEvent.getAction();
            if (this.f11576c[i] != -2) {
                i2 = this.f11576c[i];
            } else if (action == 0) {
                i2 = mo8724a((int) motionEvent.getX(), (int) motionEvent.getY());
                this.f11576c[i] = i2;
            } else {
                i2 = -1;
            }
            if (i2 != -1 && i2 < this.f11572a.length) {
                C2806cb cbVar = this.f11572a[i2];
                if (action == 3 || (action == 1 && (!z || (z && cbVar.mCombineFlag == 0)))) {
                    this.f11576c[i] = -2;
                }
                cbVar.onMotionEvent(motionEvent, z);
                if (action == 0) {
                    this.f11578h = (int) motionEvent.getX();
                    this.f11579i = (int) motionEvent.getY();
                }
            } else if (action == 3 || action == 1) {
                this.f11576c[i] = -2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r4.getVisible() != false) goto L_0x0017;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo8724a(int r7, int r8) {
        /*
            r6 = this;
            r0 = -1
            com.cootek.smartinput5.ui.cb[] r2 = r6.f11572a
            com.cootek.smartinput5.ui.cb[] r1 = r6.f11572a
            int r3 = r1.length
            r1 = 0
        L_0x0007:
            if (r1 >= r3) goto L_0x001f
            r4 = r2[r1]
            boolean r5 = r4.isInside(r7, r8)
            if (r5 == 0) goto L_0x001a
            boolean r2 = r4.getVisible()
            if (r2 == 0) goto L_0x001f
        L_0x0017:
            if (r1 != r0) goto L_0x001d
        L_0x0019:
            return r0
        L_0x001a:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x001d:
            r0 = r1
            goto L_0x0019
        L_0x001f:
            r1 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.p066ui.SoftKeyboardView.mo8724a(int, int):int");
    }

    /* renamed from: a */
    public static void m11921a(boolean z) {
        C1368X.m6320c().mo5841n().mo6285l();
        C1368X.m6320c().mo5841n().mo6264b(z);
        C2806cb.updateAttrId(z);
    }

    /* renamed from: d */
    public void mo8735d() {
        int a = mo8724a(this.f11578h, this.f11579i);
        if (a >= 0 && a < this.f11572a.length) {
            this.f11572a[a].showExtendSurface(this.f11578h);
        }
    }

    /* renamed from: a */
    private int m11916a(C2806cb cbVar, int i) {
        int i2;
        if ((i & 2) == 0) {
            i2 = cbVar.mainOnlyTextSize != -1 ? cbVar.mainOnlyTextSize : this.f11577g.f12584t != -1 ? this.f11577g.f12584t : this.f11592w;
        } else if (2 == i) {
            i2 = cbVar.altTextSize != -1 ? cbVar.altTextSize : this.f11577g.f12586v != -1 ? this.f11577g.f12586v : this.f11595z;
        } else {
            i2 = cbVar.mainTextSize != -1 ? cbVar.mainTextSize : this.f11577g.f12585u != -1 ? this.f11577g.f12585u : this.f11594y;
        }
        return (int) (((double) i2) * Engine.getInstance().getWidgetManager().mo9630ad().mo9252j());
    }

    public void setCurrentPointerId(int i) {
        this.f11588s = i;
    }

    /* renamed from: g */
    private void m11932g() {
        this.f11557K = 1;
    }

    /* renamed from: h */
    private void m11933h() {
        if (this.f11557K > 0) {
            this.f11557K--;
        }
    }

    public void setClipRegion(Rect rect) {
        this.f11585o = rect;
    }

    public void setViewAlpha(int i) {
        this.f11586p = i;
    }

    /* renamed from: a */
    public void mo8730a(Drawable drawable, Canvas canvas) {
        drawable.draw(canvas);
    }

    /* renamed from: a */
    public void mo8728a(Canvas canvas, String str, float f, float f2, Paint paint) {
        canvas.drawText(str, f, f2, paint);
    }

    /* renamed from: a */
    public void mo8729a(Canvas canvas, String str, int i, int i2, float f, float f2, Paint paint) {
        canvas.drawText(str, i, i2, f, f2, paint);
    }

    /* renamed from: i */
    private void m11934i() {
        int indexCount = this.f11574ab.getIndexCount();
        C1602bh n = C1368X.m6320c().mo5841n();
        for (int i = 0; i < indexCount; i++) {
            int index = this.f11574ab.getIndex(i);
            int resourceId = this.f11574ab.getResourceId(index, 0);
            switch (index) {
                case 1:
                    this.f11558L = n.mo6250a(resourceId, this.f11567U.mo9209a());
                    setBackgroundDrawable(this.f11558L);
                    break;
                case 2:
                    this.f11559M = n.mo6250a(resourceId, this.f11567U.mo9210b());
                    break;
                case 3:
                    this.f11560N = n.mo6250a(resourceId, this.f11567U.mo9211c());
                    break;
                case 4:
                    this.f11561O = n.mo6250a(resourceId, this.f11567U.mo9212d());
                    break;
                case 5:
                    this.f11562P = n.mo6250a(resourceId, this.f11567U.mo9213e());
                    break;
                case 6:
                    this.f11592w = n.mo6265c(this.f11574ab.getResourceId(index, 18));
                    break;
                case 7:
                    this.f11593x = n.mo6265c(this.f11574ab.getResourceId(index, 12));
                    break;
                case 8:
                    this.f11594y = n.mo6265c(this.f11574ab.getResourceId(index, 18));
                    break;
                case 9:
                    this.f11595z = n.mo6265c(this.f11574ab.getResourceId(index, 18));
                    break;
                case 11:
                    this.f11547A = n.mo6248a(resourceId, C2787cK.KEY_TEXT);
                    break;
                case 12:
                    this.f11548B = n.mo6248a(resourceId, C2787cK.KEY_TEXT);
                    break;
                case 13:
                    this.f11549C = n.mo6248a(resourceId, C2787cK.KEY_TEXT);
                    break;
                case 14:
                    this.f11550D = n.mo6248a(resourceId, C2787cK.KEY_TEXT);
                    break;
            }
        }
    }

    /* renamed from: a */
    public void mo8727a(Canvas canvas) {
        m11934i();
        Bitmap buffer = getBuffer();
        if (buffer != null) {
            buffer.recycle();
        }
        draw(canvas);
    }
}
