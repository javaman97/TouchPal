package android.support.p001v4.widget;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.K */
/* compiled from: ViewDragHelper */
final class C0534K implements Interpolator {
    C0534K() {
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
