package com.cootek.smartinput5.cropimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;

abstract class ImageViewTouchBase extends ImageView {

    /* renamed from: a */
    private static final String f3603a = "ImageViewTouchBase";

    /* renamed from: p */
    static final float f3604p = 1.25f;

    /* renamed from: b */
    private final Matrix f3605b = new Matrix();

    /* renamed from: c */
    private final float[] f3606c = new float[9];

    /* renamed from: d */
    private C1223a f3607d;

    /* renamed from: e */
    private Runnable f3608e = null;

    /* renamed from: g */
    protected Matrix f3609g = new Matrix();

    /* renamed from: h */
    protected Matrix f3610h = new Matrix();

    /* renamed from: i */
    protected final C1239m f3611i = new C1239m((Bitmap) null);

    /* renamed from: j */
    int f3612j = -1;

    /* renamed from: k */
    int f3613k = -1;

    /* renamed from: l */
    float f3614l;

    /* renamed from: m */
    protected Handler f3615m = new Handler();

    /* renamed from: n */
    protected int f3616n;

    /* renamed from: o */
    protected int f3617o;

    /* renamed from: com.cootek.smartinput5.cropimage.ImageViewTouchBase$a */
    public interface C1223a {
        /* renamed from: a */
        void mo4520a(Bitmap bitmap);
    }

    /* renamed from: a */
    public void mo4506a(C1223a aVar) {
        this.f3607d = aVar;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3612j = i3 - i;
        this.f3613k = i4 - i2;
        Runnable runnable = this.f3608e;
        if (runnable != null) {
            this.f3608e = null;
            runnable.run();
        }
        if (this.f3611i.mo4551b() != null) {
            m5920a(this.f3611i, this.f3609g);
            setImageMatrix(mo4515e());
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getRepeatCount() == 0) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4 || mo4514d() <= 1.0f) {
            return super.onKeyUp(i, keyEvent);
        }
        mo4503a(1.0f);
        return true;
    }

    public void setImageBitmap(Bitmap bitmap) {
        m5919a(bitmap, 0);
    }

    /* renamed from: a */
    private void m5919a(Bitmap bitmap, int i) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
        }
        Bitmap b = this.f3611i.mo4551b();
        this.f3611i.mo4550a(bitmap);
        this.f3611i.mo4549a(i);
        if (b != null && b != bitmap && this.f3607d != null) {
            this.f3607d.mo4520a(b);
        }
    }

    /* renamed from: c */
    public void mo4512c() {
        mo4505a((Bitmap) null, true);
    }

    /* renamed from: a */
    public void mo4505a(Bitmap bitmap, boolean z) {
        mo4507a(new C1239m(bitmap), z);
    }

    /* renamed from: a */
    public void mo4507a(C1239m mVar, boolean z) {
        if (getWidth() <= 0) {
            this.f3608e = new C1234j(this, mVar, z);
            return;
        }
        if (mVar.mo4551b() != null) {
            m5920a(mVar, this.f3609g);
            m5919a(mVar.mo4551b(), mVar.mo4548a());
        } else {
            this.f3609g.reset();
            setImageBitmap((Bitmap) null);
        }
        if (z) {
            this.f3610h.reset();
        }
        setImageMatrix(mo4515e());
        this.f3614l = mo4516f();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4508a(boolean r8, boolean r9) {
        /*
            r7 = this;
            r6 = 1073741824(0x40000000, float:2.0)
            r0 = 0
            com.cootek.smartinput5.cropimage.m r1 = r7.f3611i
            android.graphics.Bitmap r1 = r1.mo4551b()
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            return
        L_0x000c:
            android.graphics.Matrix r1 = r7.mo4515e()
            android.graphics.RectF r2 = new android.graphics.RectF
            com.cootek.smartinput5.cropimage.m r3 = r7.f3611i
            android.graphics.Bitmap r3 = r3.mo4551b()
            int r3 = r3.getWidth()
            float r3 = (float) r3
            com.cootek.smartinput5.cropimage.m r4 = r7.f3611i
            android.graphics.Bitmap r4 = r4.mo4551b()
            int r4 = r4.getHeight()
            float r4 = (float) r4
            r2.<init>(r0, r0, r3, r4)
            r1.mapRect(r2)
            float r1 = r2.height()
            float r3 = r2.width()
            if (r9 == 0) goto L_0x0094
            int r4 = r7.getHeight()
            float r5 = (float) r4
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0064
            float r4 = (float) r4
            float r1 = r4 - r1
            float r1 = r1 / r6
            float r4 = r2.top
            float r1 = r1 - r4
        L_0x0048:
            if (r8 == 0) goto L_0x0059
            int r4 = r7.getWidth()
            float r5 = (float) r4
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x007e
            float r0 = (float) r4
            float r0 = r0 - r3
            float r0 = r0 / r6
            float r2 = r2.left
            float r0 = r0 - r2
        L_0x0059:
            r7.mo4494a((float) r0, (float) r1)
            android.graphics.Matrix r0 = r7.mo4515e()
            r7.setImageMatrix(r0)
            goto L_0x000b
        L_0x0064:
            float r1 = r2.top
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x006e
            float r1 = r2.top
            float r1 = -r1
            goto L_0x0048
        L_0x006e:
            float r1 = r2.bottom
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0094
            int r1 = r7.getHeight()
            float r1 = (float) r1
            float r4 = r2.bottom
            float r1 = r1 - r4
            goto L_0x0048
        L_0x007e:
            float r3 = r2.left
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0088
            float r0 = r2.left
            float r0 = -r0
            goto L_0x0059
        L_0x0088:
            float r3 = r2.right
            float r5 = (float) r4
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0059
            float r0 = (float) r4
            float r2 = r2.right
            float r0 = r0 - r2
            goto L_0x0059
        L_0x0094:
            r1 = r0
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.cropimage.ImageViewTouchBase.mo4508a(boolean, boolean):void");
    }

    public ImageViewTouchBase(Context context) {
        super(context);
        m5921g();
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5921g();
    }

    /* renamed from: g */
    private void m5921g() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo4502a(Matrix matrix, int i) {
        matrix.getValues(this.f3606c);
        return this.f3606c[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo4501a(Matrix matrix) {
        return mo4502a(matrix, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float mo4514d() {
        return mo4501a(this.f3610h);
    }

    /* renamed from: a */
    private void m5920a(C1239m mVar, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float f = (float) mVar.mo4555f();
        float e = (float) mVar.mo4554e();
        matrix.reset();
        float min = Math.min(Math.min(width / f, 3.0f), Math.min(height / e, 3.0f));
        matrix.postConcat(mVar.mo4552c());
        matrix.postScale(min, min);
        matrix.postTranslate((width - (f * min)) / 2.0f, (height - (e * min)) / 2.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Matrix mo4515e() {
        this.f3605b.set(this.f3609g);
        this.f3605b.postConcat(this.f3610h);
        return this.f3605b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public float mo4516f() {
        if (this.f3611i.mo4551b() == null) {
            return 1.0f;
        }
        return Math.max(((float) this.f3611i.mo4555f()) / ((float) this.f3612j), ((float) this.f3611i.mo4554e()) / ((float) this.f3613k)) * 4.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4495a(float f, float f2, float f3) {
        if (f > this.f3614l) {
            f = this.f3614l;
        }
        float d = f / mo4514d();
        this.f3610h.postScale(d, d, f2, f3);
        setImageMatrix(mo4515e());
        mo4508a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4504a(float f, float f2, float f3, float f4) {
        float d = (f - mo4514d()) / f4;
        float d2 = mo4514d();
        this.f3615m.post(new C1235k(this, f4, System.currentTimeMillis(), d2, d, f2, f3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4503a(float f) {
        mo4495a(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4511b(float f, float f2, float f3) {
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        mo4510b(width - f2, height - f3);
        mo4495a(f, width, height);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4493a() {
        mo4509b(f3604p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4497b() {
        mo4513c(f3604p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4509b(float f) {
        if (mo4514d() < this.f3614l && this.f3611i.mo4551b() != null) {
            this.f3610h.postScale(f, f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
            setImageMatrix(mo4515e());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4513c(float f) {
        if (this.f3611i.mo4551b() != null) {
            float width = ((float) getWidth()) / 2.0f;
            float height = ((float) getHeight()) / 2.0f;
            Matrix matrix = new Matrix(this.f3610h);
            matrix.postScale(1.0f / f, 1.0f / f, width, height);
            if (mo4501a(matrix) < 1.0f) {
                this.f3610h.setScale(1.0f, 1.0f, width, height);
            } else {
                this.f3610h.postScale(1.0f / f, 1.0f / f, width, height);
            }
            setImageMatrix(mo4515e());
            mo4508a(true, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4494a(float f, float f2) {
        this.f3610h.postTranslate(f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4510b(float f, float f2) {
        mo4494a(f, f2);
        setImageMatrix(mo4515e());
    }
}
