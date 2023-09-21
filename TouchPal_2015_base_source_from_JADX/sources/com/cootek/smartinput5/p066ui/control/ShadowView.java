package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.control.ShadowView */
public class ShadowView extends View {

    /* renamed from: a */
    private Canvas f12815a = new Canvas();

    /* renamed from: b */
    private Paint f12816b = new Paint();

    /* renamed from: c */
    private Bitmap f12817c;

    public ShadowView(Context context) {
        super(context);
    }

    public void buildDrawingCache() {
    }

    public void draw(Canvas canvas) {
        if (this.f12817c != null) {
            canvas.drawBitmap(this.f12817c, 0.0f, 0.0f, this.f12816b);
        } else {
            super.draw(canvas);
        }
    }

    /* renamed from: a */
    public void mo9380a(View view) {
        mo9381a(view, 0, 0, view.getWidth(), view.getHeight());
    }

    /* renamed from: a */
    public void mo9382a(View view, Rect rect) {
        mo9381a(view, rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    public void mo9381a(View view, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 > 0 && i6 > 0 && !(this.f12817c != null && this.f12817c.getWidth() == i5 && this.f12817c.getHeight() == i6)) {
            mo9379a();
            try {
                this.f12817c = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError e) {
            }
        }
        this.f12815a.setBitmap(this.f12817c);
        this.f12815a.translate((float) (-i), (float) (-i2));
        view.draw(this.f12815a);
        this.f12815a.translate((float) i, (float) i2);
    }

    public Bitmap getBitmap() {
        return this.f12817c;
    }

    /* renamed from: a */
    public void mo9379a() {
        if (this.f12817c != null) {
            this.f12817c.recycle();
            this.f12817c = null;
        }
    }
}
