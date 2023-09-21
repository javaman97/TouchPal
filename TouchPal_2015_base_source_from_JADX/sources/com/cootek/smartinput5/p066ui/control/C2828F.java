package com.cootek.smartinput5.p066ui.control;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;

/* renamed from: com.cootek.smartinput5.ui.control.F */
/* compiled from: LayoutSwitchAnimation */
public class C2828F extends Animation {

    /* renamed from: a */
    int f12646a;

    /* renamed from: b */
    int f12647b;

    /* renamed from: c */
    float f12648c;

    /* renamed from: d */
    float f12649d;

    /* renamed from: e */
    boolean f12650e;

    /* renamed from: f */
    int f12651f;

    /* renamed from: g */
    int f12652g;

    /* renamed from: h */
    Camera f12653h = new Camera();

    public C2828F(boolean z, boolean z2, int i) {
        int i2 = 1;
        this.f12650e = z;
        this.f12651f = z ? 1 : -1;
        this.f12652g = !z2 ? -1 : i2;
        this.f12648c = (float) (z ? 0.95d : 0.05d);
        if (z == z2) {
            this.f12648c = 0.95f;
        } else {
            this.f12648c = 0.05f;
        }
        this.f12649d = (float) i;
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.f12646a = (int) (((float) i) * this.f12648c);
        this.f12647b = i2 / 2;
        setDuration(700);
        if (this.f12650e) {
            setInterpolator(new DecelerateInterpolator());
        } else {
            setInterpolator(new AccelerateInterpolator());
        }
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        Matrix matrix = transformation.getMatrix();
        this.f12653h.save();
        if (!this.f12650e) {
            f = 1.0f - f;
        }
        transformation.setAlpha(1.0f - f);
        this.f12653h.translate(0.0f, 0.0f, this.f12649d * f);
        this.f12653h.rotateY(93.0f * f * ((float) this.f12651f) * ((float) this.f12652g));
        this.f12653h.getMatrix(matrix);
        matrix.preTranslate((float) (-this.f12646a), (float) (-this.f12647b));
        matrix.postTranslate((float) this.f12646a, (float) this.f12647b);
        this.f12653h.restore();
    }

    /* renamed from: a */
    public void mo9269a(int i) {
        this.f12649d = (float) i;
    }
}
