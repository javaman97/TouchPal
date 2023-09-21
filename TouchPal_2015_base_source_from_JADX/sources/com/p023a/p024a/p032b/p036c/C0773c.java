package com.p023a.p024a.p032b.p036c;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.p023a.p024a.p032b.p033a.C0758f;
import com.p023a.p024a.p032b.p038e.C0790a;
import com.p023a.p024a.p032b.p038e.C0791b;

/* renamed from: com.a.a.b.c.c */
/* compiled from: RoundedBitmapDisplayer */
public class C0773c implements C0771a {

    /* renamed from: a */
    protected final int f1952a;

    /* renamed from: b */
    protected final int f1953b;

    public C0773c(int i) {
        this(i, 0);
    }

    public C0773c(int i, int i2) {
        this.f1952a = i;
        this.f1953b = i2;
    }

    /* renamed from: a */
    public void mo2892a(Bitmap bitmap, C0790a aVar, C0758f fVar) {
        if (!(aVar instanceof C0791b)) {
            throw new IllegalArgumentException("ImageAware should wrap ImageView. ImageViewAware is expected.");
        }
        aVar.mo2975a((Drawable) new C0774a(bitmap, this.f1952a, this.f1953b));
    }

    /* renamed from: com.a.a.b.c.c$a */
    /* compiled from: RoundedBitmapDisplayer */
    public static class C0774a extends Drawable {

        /* renamed from: a */
        protected final float f1954a;

        /* renamed from: b */
        protected final int f1955b;

        /* renamed from: c */
        protected final RectF f1956c = new RectF();

        /* renamed from: d */
        protected final RectF f1957d;

        /* renamed from: e */
        protected final BitmapShader f1958e;

        /* renamed from: f */
        protected final Paint f1959f;

        public C0774a(Bitmap bitmap, int i, int i2) {
            this.f1954a = (float) i;
            this.f1955b = i2;
            this.f1958e = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.f1957d = new RectF((float) i2, (float) i2, (float) (bitmap.getWidth() - i2), (float) (bitmap.getHeight() - i2));
            this.f1959f = new Paint();
            this.f1959f.setAntiAlias(true);
            this.f1959f.setShader(this.f1958e);
        }

        /* access modifiers changed from: protected */
        public void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            this.f1956c.set((float) this.f1955b, (float) this.f1955b, (float) (rect.width() - this.f1955b), (float) (rect.height() - this.f1955b));
            Matrix matrix = new Matrix();
            matrix.setRectToRect(this.f1957d, this.f1956c, Matrix.ScaleToFit.FILL);
            this.f1958e.setLocalMatrix(matrix);
        }

        public void draw(Canvas canvas) {
            canvas.drawRoundRect(this.f1956c, this.f1954a, this.f1954a, this.f1959f);
        }

        public int getOpacity() {
            return -3;
        }

        public void setAlpha(int i) {
            this.f1959f.setAlpha(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.f1959f.setColorFilter(colorFilter);
        }
    }
}
