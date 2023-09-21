package com.yahoo.mobile.client.share.search.p096a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: com.yahoo.mobile.client.share.search.a.b */
public final class C4091b extends BitmapDrawable {

    /* renamed from: a */
    private Rect f16573a = new Rect();

    /* renamed from: b */
    private Drawable f16574b;

    /* renamed from: c */
    private Resources f16575c;

    /* renamed from: d */
    private int f16576d;

    public C4091b(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        if (this.f16573a.left < 0) {
            this.f16573a.left = 0;
        }
        if (this.f16573a.right < 0) {
            this.f16573a.right = 0;
        }
        if (this.f16573a.top < 0) {
            this.f16573a.top = 0;
        }
        if (this.f16573a.bottom < 0) {
            this.f16573a.bottom = 0;
        }
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final void draw(Canvas canvas) {
        Rect copyBounds = copyBounds();
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            float f = (float) (copyBounds.right - copyBounds.left);
            int height = bitmap.getHeight() + this.f16573a.top + this.f16573a.bottom;
            int width = bitmap.getWidth() + this.f16573a.left + this.f16573a.right;
            float f2 = (((float) height) * f) / ((float) width);
            float f3 = ((float) copyBounds.top) + f2;
            float f4 = f / ((float) width);
            float f5 = f2 / ((float) height);
            int i = (int) (((float) copyBounds.left) + (((float) this.f16573a.left) * f4));
            int i2 = (int) (((float) copyBounds.right) - (f4 * ((float) this.f16573a.right)));
            int i3 = (int) (((float) copyBounds.top) + (((float) this.f16573a.top) * f5));
            int i4 = (int) (f3 - (f5 * ((float) this.f16573a.bottom)));
            super.setBounds(i, i3, i2, i4);
            super.draw(canvas);
            if (!(this.f16574b != null || this.f16575c == null || this.f16576d == 0)) {
                this.f16574b = this.f16575c.getDrawable(this.f16576d);
            }
            if (this.f16574b != null) {
                this.f16574b.setBounds(i, i3, i2, i4 + 1);
                this.f16574b.setState(getState());
                this.f16574b.draw(canvas);
            }
            super.setBounds(copyBounds);
        }
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        if (this.f16574b != null) {
            this.f16574b.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        if (this.f16574b != null) {
            this.f16574b.setColorFilter(colorFilter);
        }
    }
}
