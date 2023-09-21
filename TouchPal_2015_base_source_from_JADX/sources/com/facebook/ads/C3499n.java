package com.facebook.ads;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.facebook.ads.n */
class C3499n extends Animation {

    /* renamed from: a */
    final /* synthetic */ AdView f15138a;

    /* renamed from: b */
    private boolean f15139b = false;

    /* renamed from: c */
    private boolean f15140c = false;

    C3499n(AdView adView) {
        this.f15138a = adView;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        double d = 3.141592653589793d * ((double) f);
        float f2 = (float) ((180.0d * d) / 3.141592653589793d);
        if (f >= 0.5f) {
            f2 -= 180.0f;
            if (!this.f15139b) {
                this.f15139b = true;
                this.f15138a.f14573j.setVisibility(0);
                this.f15138a.f14572i.setVisibility(4);
                View h = this.f15138a.f14572i;
                View unused = this.f15138a.f14572i = this.f15138a.f14573j;
                View unused2 = this.f15138a.f14573j = h;
            }
        }
        if (this.f15140c) {
            f2 = -f2;
        }
        Camera camera = new Camera();
        Matrix matrix = transformation.getMatrix();
        camera.save();
        camera.translate(0.0f, 0.0f, (float) (Math.sin(d) * 150.0d));
        camera.rotateY(f2);
        camera.getMatrix(matrix);
        camera.restore();
        int width = this.f15138a.getWidth() / 2;
        int height = this.f15138a.getHeight() / 2;
        matrix.preTranslate((float) (-width), (float) (-height));
        matrix.postTranslate((float) width, (float) height);
    }
}
