package com.facebook.ads;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.facebook.ads.g */
class C3343g extends Animation {

    /* renamed from: a */
    final /* synthetic */ C3342f f14631a;

    C3343g(C3342f fVar) {
        this.f14631a = fVar;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.f14631a.f14630a.f14627a) + (((float) (this.f14631a.f14630a.f14628b - this.f14631a.f14630a.f14627a)) * f));
        this.f14631a.f14630a.f14629c.getLayoutParams().width = i;
        this.f14631a.f14630a.f14629c.requestLayout();
        this.f14631a.f14630a.f14629c.f14563e.getLayoutParams().width = i - this.f14631a.f14630a.f14628b;
        this.f14631a.f14630a.f14629c.f14563e.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
