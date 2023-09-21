package android.support.p001v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.D */
/* compiled from: SwipeRefreshLayout */
class C0518D extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f1174a;

    C0518D(SwipeRefreshLayout swipeRefreshLayout) {
        this.f1174a = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = 0;
        if (this.f1174a.f1331m != this.f1174a.f1329k) {
            i = this.f1174a.f1331m + ((int) (((float) (this.f1174a.f1329k - this.f1174a.f1331m)) * f));
        }
        int top = i - this.f1174a.f1328j.getTop();
        int top2 = this.f1174a.f1328j.getTop();
        if (top + top2 < 0) {
            top = 0 - top2;
        }
        this.f1174a.setTargetOffsetTopAndBottom(top);
    }
}
