package android.support.p001v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.E */
/* compiled from: SwipeRefreshLayout */
class C0527E extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f1227a;

    C0527E(SwipeRefreshLayout swipeRefreshLayout) {
        this.f1227a = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        this.f1227a.f1327i.mo1699a(this.f1227a.f1336r + ((0.0f - this.f1227a.f1336r) * f));
    }
}
