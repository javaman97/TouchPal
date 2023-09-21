package com.cootek.smartinput5.cropimage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p001v4.view.C0333F;
import android.view.View;
import com.cootek.smartinput5.engine.Settings;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.cropimage.i */
/* compiled from: HighlightView */
class C1232i {

    /* renamed from: b */
    public static final int f3634b = 1;

    /* renamed from: c */
    public static final int f3635c = 2;

    /* renamed from: d */
    public static final int f3636d = 4;

    /* renamed from: e */
    public static final int f3637e = 8;

    /* renamed from: f */
    public static final int f3638f = 16;

    /* renamed from: g */
    public static final int f3639g = 32;

    /* renamed from: m */
    private static final String f3640m = "HighlightView";

    /* renamed from: a */
    View f3641a;

    /* renamed from: h */
    boolean f3642h;

    /* renamed from: i */
    boolean f3643i;

    /* renamed from: j */
    Rect f3644j;

    /* renamed from: k */
    RectF f3645k;

    /* renamed from: l */
    Matrix f3646l;

    /* renamed from: n */
    private C1233a f3647n = C1233a.None;

    /* renamed from: o */
    private RectF f3648o;

    /* renamed from: p */
    private boolean f3649p = false;

    /* renamed from: q */
    private float f3650q;

    /* renamed from: r */
    private final boolean f3651r = false;

    /* renamed from: s */
    private Drawable f3652s;

    /* renamed from: t */
    private Drawable f3653t;

    /* renamed from: u */
    private Drawable f3654u;

    /* renamed from: v */
    private final Paint f3655v = new Paint();

    /* renamed from: w */
    private final Paint f3656w = new Paint();

    /* renamed from: x */
    private final Paint f3657x = new Paint();

    /* renamed from: com.cootek.smartinput5.cropimage.i$a */
    /* compiled from: HighlightView */
    enum C1233a {
        None,
        Move,
        Grow
    }

    public C1232i(View view) {
        this.f3641a = view;
    }

    /* renamed from: d */
    private void m5945d() {
        Resources resources = this.f3641a.getResources();
        this.f3652s = resources.getDrawable(R.drawable.camera_crop_width);
        this.f3653t = resources.getDrawable(R.drawable.camera_crop_height);
    }

    /* renamed from: a */
    public boolean mo4535a() {
        return this.f3642h;
    }

    /* renamed from: a */
    public void mo4534a(boolean z) {
        this.f3642h = z;
    }

    /* renamed from: b */
    public void mo4538b(boolean z) {
        this.f3643i = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4531a(Canvas canvas) {
        if (!this.f3643i) {
            canvas.save();
            Path path = new Path();
            if (!mo4535a()) {
                this.f3657x.setColor(C0333F.f835s);
                canvas.drawRect(this.f3644j, this.f3657x);
                return;
            }
            Rect rect = new Rect();
            this.f3641a.getDrawingRect(rect);
            path.addRect(new RectF(this.f3644j), Path.Direction.CW);
            this.f3657x.setColor(-16738561);
            canvas.clipRect(this.f3644j, Region.Op.DIFFERENCE);
            canvas.drawRect(rect, mo4535a() ? this.f3655v : this.f3656w);
            canvas.restore();
            canvas.drawPath(path, this.f3657x);
            if (this.f3647n == C1233a.Grow) {
                int i = this.f3644j.left - 1;
                int i2 = this.f3644j.right + 1;
                int i3 = this.f3644j.top + 1;
                int i4 = this.f3644j.bottom;
                int intrinsicWidth = this.f3652s.getIntrinsicWidth() / 2;
                int intrinsicHeight = this.f3652s.getIntrinsicHeight() / 2;
                int intrinsicHeight2 = this.f3653t.getIntrinsicHeight() / 2;
                int intrinsicWidth2 = this.f3653t.getIntrinsicWidth() / 2;
                int i5 = this.f3644j.left + ((this.f3644j.right - this.f3644j.left) / 2);
                int i6 = this.f3644j.top + ((this.f3644j.bottom - this.f3644j.top) / 2);
                this.f3652s.setBounds(i - intrinsicWidth, i6 - intrinsicHeight, i + intrinsicWidth, i6 + intrinsicHeight);
                this.f3652s.draw(canvas);
                this.f3652s.setBounds(i2 - intrinsicWidth, i6 - intrinsicHeight, i2 + intrinsicWidth, i6 + intrinsicHeight);
                this.f3652s.draw(canvas);
                this.f3653t.setBounds(i5 - intrinsicWidth2, i3 - intrinsicHeight2, i5 + intrinsicWidth2, i3 + intrinsicHeight2);
                this.f3653t.draw(canvas);
                this.f3653t.setBounds(i5 - intrinsicWidth2, i4 - intrinsicHeight2, i5 + intrinsicWidth2, i4 + intrinsicHeight2);
                this.f3653t.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    public void mo4533a(C1233a aVar) {
        if (aVar != this.f3647n) {
            this.f3647n = aVar;
            this.f3641a.invalidate();
        }
    }

    /* renamed from: a */
    public int mo4529a(float f, float f2) {
        int i;
        int i2;
        boolean z = false;
        Rect e = m5946e();
        boolean z2 = f2 >= ((float) e.top) - 20.0f && f2 < ((float) e.bottom) + 20.0f;
        if (f >= ((float) e.left) - 20.0f && f < ((float) e.right) + 20.0f) {
            z = true;
        }
        if (Math.abs(((float) e.left) - f) >= 20.0f || !z2) {
            i = 1;
        } else {
            i = 3;
        }
        if (Math.abs(((float) e.right) - f) < 20.0f && z2) {
            i |= 4;
        }
        if (Math.abs(((float) e.top) - f2) < 20.0f && z) {
            i |= 8;
        }
        if (Math.abs(((float) e.bottom) - f2) >= 20.0f || !z) {
            i2 = i;
        } else {
            i2 = i | 16;
        }
        if (i2 != 1 || !e.contains((int) f, (int) f2)) {
            return i2;
        }
        return 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4530a(int i, float f, float f2) {
        Rect e = m5946e();
        if (i != 1) {
            if (i == 32) {
                mo4537b((this.f3645k.width() / ((float) e.width())) * f, (this.f3645k.height() / ((float) e.height())) * f2);
                return;
            }
            if ((i & 6) == 0) {
                f = 0.0f;
            }
            if ((i & 24) == 0) {
                f2 = 0.0f;
            }
            mo4540c(f * (this.f3645k.width() / ((float) e.width())) * ((float) ((i & 2) != 0 ? -1 : 1)), ((float) ((i & 8) != 0 ? -1 : 1)) * f2 * (this.f3645k.height() / ((float) e.height())));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4537b(float f, float f2) {
        Rect rect = new Rect(this.f3644j);
        this.f3645k.offset(f, f2);
        this.f3645k.offset(Math.max(0.0f, this.f3648o.left - this.f3645k.left), Math.max(0.0f, this.f3648o.top - this.f3645k.top));
        this.f3645k.offset(Math.min(0.0f, this.f3648o.right - this.f3645k.right), Math.min(0.0f, this.f3648o.bottom - this.f3645k.bottom));
        this.f3644j = m5946e();
        rect.union(this.f3644j);
        rect.inset(-10, -10);
        this.f3641a.invalidate(rect);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f9  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4540c(float r9, float r10) {
        /*
            r8 = this;
            r2 = 1103626240(0x41c80000, float:25.0)
            r7 = 1073741824(0x40000000, float:2.0)
            r6 = 0
            boolean r0 = r8.f3649p
            if (r0 == 0) goto L_0x0011
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            float r0 = r8.f3650q
            float r10 = r9 / r0
        L_0x0011:
            android.graphics.RectF r3 = new android.graphics.RectF
            android.graphics.RectF r0 = r8.f3645k
            r3.<init>(r0)
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x010f
            float r0 = r3.width()
            float r1 = r7 * r9
            float r0 = r0 + r1
            android.graphics.RectF r1 = r8.f3648o
            float r1 = r1.width()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x010f
            android.graphics.RectF r0 = r8.f3648o
            float r0 = r0.width()
            float r1 = r3.width()
            float r0 = r0 - r1
            float r9 = r0 / r7
            boolean r0 = r8.f3649p
            if (r0 == 0) goto L_0x010f
            float r0 = r8.f3650q
            float r10 = r9 / r0
            r0 = r10
            r1 = r9
        L_0x0044:
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x006c
            float r4 = r3.height()
            float r5 = r7 * r0
            float r4 = r4 + r5
            android.graphics.RectF r5 = r8.f3648o
            float r5 = r5.height()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x006c
            android.graphics.RectF r0 = r8.f3648o
            float r0 = r0.height()
            float r4 = r3.height()
            float r0 = r0 - r4
            float r0 = r0 / r7
            boolean r4 = r8.f3649p
            if (r4 == 0) goto L_0x006c
            float r1 = r8.f3650q
            float r1 = r1 * r0
        L_0x006c:
            float r1 = -r1
            float r0 = -r0
            r3.inset(r1, r0)
            float r0 = r3.width()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0084
            float r0 = r3.width()
            float r0 = r2 - r0
            float r0 = -r0
            float r0 = r0 / r7
            r3.inset(r0, r6)
        L_0x0084:
            boolean r0 = r8.f3649p
            if (r0 == 0) goto L_0x00e1
            float r0 = r8.f3650q
            float r0 = r2 / r0
        L_0x008c:
            float r1 = r3.height()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x009e
            float r1 = r3.height()
            float r0 = r0 - r1
            float r0 = -r0
            float r0 = r0 / r7
            r3.inset(r6, r0)
        L_0x009e:
            float r0 = r3.left
            android.graphics.RectF r1 = r8.f3648o
            float r1 = r1.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e3
            android.graphics.RectF r0 = r8.f3648o
            float r0 = r0.left
            float r1 = r3.left
            float r0 = r0 - r1
            r3.offset(r0, r6)
        L_0x00b2:
            float r0 = r3.top
            android.graphics.RectF r1 = r8.f3648o
            float r1 = r1.top
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f9
            android.graphics.RectF r0 = r8.f3648o
            float r0 = r0.top
            float r1 = r3.top
            float r0 = r0 - r1
            r3.offset(r6, r0)
        L_0x00c6:
            android.graphics.RectF r0 = r8.f3645k
            r0.set(r3)
            android.graphics.Rect r0 = r8.m5946e()
            r8.f3644j = r0
            android.view.View r0 = r8.f3641a
            r0.invalidate()
            return
        L_0x00d7:
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0011
            float r0 = r8.f3650q
            float r9 = r10 * r0
            goto L_0x0011
        L_0x00e1:
            r0 = r2
            goto L_0x008c
        L_0x00e3:
            float r0 = r3.right
            android.graphics.RectF r1 = r8.f3648o
            float r1 = r1.right
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            float r0 = r3.right
            android.graphics.RectF r1 = r8.f3648o
            float r1 = r1.right
            float r0 = r0 - r1
            float r0 = -r0
            r3.offset(r0, r6)
            goto L_0x00b2
        L_0x00f9:
            float r0 = r3.bottom
            android.graphics.RectF r1 = r8.f3648o
            float r1 = r1.bottom
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            float r0 = r3.bottom
            android.graphics.RectF r1 = r8.f3648o
            float r1 = r1.bottom
            float r0 = r0 - r1
            float r0 = -r0
            r3.offset(r6, r0)
            goto L_0x00c6
        L_0x010f:
            r0 = r10
            r1 = r9
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.cropimage.C1232i.mo4540c(float, float):void");
    }

    /* renamed from: b */
    public Rect mo4536b() {
        return new Rect((int) this.f3645k.left, (int) this.f3645k.top, (int) this.f3645k.right, (int) this.f3645k.bottom);
    }

    /* renamed from: e */
    private Rect m5946e() {
        RectF rectF = new RectF(this.f3645k.left, this.f3645k.top, this.f3645k.right, this.f3645k.bottom);
        this.f3646l.mapRect(rectF);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* renamed from: c */
    public void mo4539c() {
        this.f3644j = m5946e();
    }

    /* renamed from: a */
    public void mo4532a(Matrix matrix, Rect rect, RectF rectF, boolean z, boolean z2) {
        if (z) {
            z2 = true;
        }
        this.f3646l = new Matrix(matrix);
        this.f3645k = rectF;
        this.f3648o = new RectF(rect);
        this.f3649p = z2;
        this.f3650q = this.f3645k.width() / this.f3645k.height();
        this.f3644j = m5946e();
        this.f3655v.setARGB(Settings.CLOUD_HANDWRITING_ENABLED, 50, 50, 50);
        this.f3656w.setARGB(Settings.CLOUD_HANDWRITING_ENABLED, 50, 50, 50);
        this.f3657x.setStrokeWidth(3.0f);
        this.f3657x.setStyle(Paint.Style.STROKE);
        this.f3657x.setAntiAlias(true);
        this.f3647n = C1233a.None;
        m5945d();
    }
}
