package android.support.p001v4.view;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.U */
/* compiled from: ViewPager */
final class C0376U implements Interpolator {
    C0376U() {
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
