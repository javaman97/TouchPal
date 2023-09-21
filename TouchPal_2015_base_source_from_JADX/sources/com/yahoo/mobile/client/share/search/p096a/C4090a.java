package com.yahoo.mobile.client.share.search.p096a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: com.yahoo.mobile.client.share.search.a.a */
public final class C4090a extends Drawable {

    /* renamed from: a */
    private Bitmap f16566a;

    /* renamed from: b */
    private Paint f16567b = new Paint();

    /* renamed from: c */
    private Matrix f16568c = new Matrix();

    /* renamed from: d */
    private BitmapShader f16569d;

    /* renamed from: e */
    private int f16570e;

    /* renamed from: f */
    private int f16571f;

    /* renamed from: g */
    private int f16572g;

    public C4090a(Resources resources, Bitmap bitmap) {
        this.f16570e = resources.getDisplayMetrics().densityDpi;
        this.f16571f = bitmap.getScaledWidth(this.f16570e);
        this.f16572g = bitmap.getScaledHeight(this.f16570e);
        this.f16566a = bitmap;
        this.f16567b.setAntiAlias(true);
        this.f16567b.setDither(true);
        this.f16569d = new BitmapShader(this.f16566a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        float f = this.f16571f > this.f16572g ? ((float) this.f16571f) / ((float) this.f16572g) : 1.0f;
        this.f16568c.setScale(f, f);
        if (this.f16571f >= this.f16572g) {
            this.f16568c.preTranslate(((float) (this.f16572g - this.f16571f)) / 2.0f, 0.0f);
        } else {
            this.f16568c.preTranslate(0.0f, ((float) (this.f16571f - this.f16572g)) / 2.0f);
        }
        this.f16569d.setLocalMatrix(this.f16568c);
        this.f16567b.setShader(this.f16569d);
    }

    public final void draw(Canvas canvas) {
        canvas.drawOval(new RectF(getBounds()), this.f16567b);
    }

    public final void setAlpha(int i) {
        this.f16567b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16567b.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicWidth() {
        return this.f16571f;
    }

    public final int getIntrinsicHeight() {
        return this.f16571f;
    }
}
