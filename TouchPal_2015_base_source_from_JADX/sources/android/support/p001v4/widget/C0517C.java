package android.support.p001v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p001v4.view.C0333F;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.C */
/* compiled from: SwipeProgressBar */
final class C0517C {

    /* renamed from: a */
    private static final int f1147a = -1291845632;

    /* renamed from: b */
    private static final int f1148b = Integer.MIN_VALUE;

    /* renamed from: c */
    private static final int f1149c = 1291845632;

    /* renamed from: d */
    private static final int f1150d = 436207616;

    /* renamed from: e */
    private static final int f1151e = 2000;

    /* renamed from: f */
    private static final int f1152f = 1000;

    /* renamed from: g */
    private static final Interpolator f1153g = C0552b.m3201a();

    /* renamed from: h */
    private final Paint f1154h = new Paint();

    /* renamed from: i */
    private final RectF f1155i = new RectF();

    /* renamed from: j */
    private float f1156j;

    /* renamed from: k */
    private long f1157k;

    /* renamed from: l */
    private long f1158l;

    /* renamed from: m */
    private boolean f1159m;

    /* renamed from: n */
    private int f1160n;

    /* renamed from: o */
    private int f1161o;

    /* renamed from: p */
    private int f1162p;

    /* renamed from: q */
    private int f1163q;

    /* renamed from: r */
    private View f1164r;

    /* renamed from: s */
    private Rect f1165s = new Rect();

    public C0517C(View view) {
        this.f1164r = view;
        this.f1160n = f1147a;
        this.f1161o = Integer.MIN_VALUE;
        this.f1162p = f1149c;
        this.f1163q = f1150d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1700a(int i, int i2, int i3, int i4) {
        this.f1160n = i;
        this.f1161o = i2;
        this.f1162p = i3;
        this.f1163q = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1699a(float f) {
        this.f1156j = f;
        this.f1157k = 0;
        C0333F.m1352c(this.f1164r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1698a() {
        if (!this.f1159m) {
            this.f1156j = 0.0f;
            this.f1157k = AnimationUtils.currentAnimationTimeMillis();
            this.f1159m = true;
            this.f1164r.postInvalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1702b() {
        if (this.f1159m) {
            this.f1156j = 0.0f;
            this.f1158l = AnimationUtils.currentAnimationTimeMillis();
            this.f1159m = false;
            this.f1164r.postInvalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1704c() {
        return this.f1159m || this.f1158l > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1701a(Canvas canvas) {
        boolean z;
        int i;
        int width = this.f1165s.width();
        int height = this.f1165s.height();
        int i2 = width / 2;
        int i3 = height / 2;
        int save = canvas.save();
        canvas.clipRect(this.f1165s);
        if (this.f1159m || this.f1158l > 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = (currentAnimationTimeMillis - this.f1157k) / 2000;
            float f = ((float) ((currentAnimationTimeMillis - this.f1157k) % 2000)) / 20.0f;
            if (this.f1159m) {
                z = false;
            } else if (currentAnimationTimeMillis - this.f1158l >= 1000) {
                this.f1158l = 0;
                return;
            } else {
                float interpolation = f1153g.getInterpolation((((float) ((currentAnimationTimeMillis - this.f1158l) % 1000)) / 10.0f) / 100.0f) * ((float) (width / 2));
                this.f1155i.set(((float) i2) - interpolation, 0.0f, interpolation + ((float) i2), (float) height);
                canvas.saveLayerAlpha(this.f1155i, 0, 0);
                z = true;
            }
            if (j == 0) {
                canvas.drawColor(this.f1160n);
            } else if (f >= 0.0f && f < 25.0f) {
                canvas.drawColor(this.f1163q);
            } else if (f >= 25.0f && f < 50.0f) {
                canvas.drawColor(this.f1160n);
            } else if (f < 50.0f || f >= 75.0f) {
                canvas.drawColor(this.f1162p);
            } else {
                canvas.drawColor(this.f1161o);
            }
            if (f >= 0.0f && f <= 25.0f) {
                m2911a(canvas, (float) i2, (float) i3, this.f1160n, ((25.0f + f) * 2.0f) / 100.0f);
            }
            if (f >= 0.0f && f <= 50.0f) {
                m2911a(canvas, (float) i2, (float) i3, this.f1161o, (2.0f * f) / 100.0f);
            }
            if (f >= 25.0f && f <= 75.0f) {
                m2911a(canvas, (float) i2, (float) i3, this.f1162p, ((f - 25.0f) * 2.0f) / 100.0f);
            }
            if (f >= 50.0f && f <= 100.0f) {
                m2911a(canvas, (float) i2, (float) i3, this.f1163q, ((f - 50.0f) * 2.0f) / 100.0f);
            }
            if (f >= 75.0f && f <= 100.0f) {
                m2911a(canvas, (float) i2, (float) i3, this.f1160n, ((f - 75.0f) * 2.0f) / 100.0f);
            }
            if (this.f1156j <= 0.0f || !z) {
                i = save;
            } else {
                canvas.restoreToCount(save);
                i = canvas.save();
                canvas.clipRect(this.f1165s);
                m2912a(canvas, i2, i3);
            }
            C0333F.m1352c(this.f1164r);
            save = i;
        } else if (this.f1156j > 0.0f && ((double) this.f1156j) <= 1.0d) {
            m2912a(canvas, i2, i3);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    private void m2912a(Canvas canvas, int i, int i2) {
        this.f1154h.setColor(this.f1160n);
        canvas.drawCircle((float) i, (float) i2, ((float) i) * this.f1156j, this.f1154h);
    }

    /* renamed from: a */
    private void m2911a(Canvas canvas, float f, float f2, int i, float f3) {
        this.f1154h.setColor(i);
        canvas.save();
        canvas.translate(f, f2);
        float interpolation = f1153g.getInterpolation(f3);
        canvas.scale(interpolation, interpolation);
        canvas.drawCircle(0.0f, 0.0f, f, this.f1154h);
        canvas.restore();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1703b(int i, int i2, int i3, int i4) {
        this.f1165s.left = i;
        this.f1165s.top = i2;
        this.f1165s.right = i3;
        this.f1165s.bottom = i4;
    }
}
