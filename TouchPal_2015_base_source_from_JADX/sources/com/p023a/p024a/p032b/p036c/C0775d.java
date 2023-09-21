package com.p023a.p024a.p032b.p036c;

import android.graphics.Bitmap;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.p023a.p024a.p032b.p033a.C0758f;
import com.p023a.p024a.p032b.p036c.C0773c;
import com.p023a.p024a.p032b.p038e.C0790a;
import com.p023a.p024a.p032b.p038e.C0791b;

/* renamed from: com.a.a.b.c.d */
/* compiled from: RoundedVignetteBitmapDisplayer */
public class C0775d extends C0773c {
    public C0775d(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: a */
    public void mo2892a(Bitmap bitmap, C0790a aVar, C0758f fVar) {
        if (!(aVar instanceof C0791b)) {
            throw new IllegalArgumentException("ImageAware should wrap ImageView. ImageViewAware is expected.");
        }
        aVar.mo2975a((Drawable) new C0776a(bitmap, this.f1952a, this.f1953b));
    }

    /* renamed from: com.a.a.b.c.d$a */
    /* compiled from: RoundedVignetteBitmapDisplayer */
    protected static class C0776a extends C0773c.C0774a {
        C0776a(Bitmap bitmap, int i, int i2) {
            super(bitmap, i, i2);
        }

        /* access modifiers changed from: protected */
        public void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            RadialGradient radialGradient = new RadialGradient(this.f1956c.centerX(), (this.f1956c.centerY() * 1.0f) / 0.7f, this.f1956c.centerX() * 1.3f, new int[]{0, 0, 2130706432}, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f, 0.7f);
            radialGradient.setLocalMatrix(matrix);
            this.f1959f.setShader(new ComposeShader(this.f1958e, radialGradient, PorterDuff.Mode.SRC_OVER));
        }
    }
}
