package com.facebook.ads;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.facebook.ads.d */
class C3340d extends Animation {

    /* renamed from: a */
    final /* synthetic */ int f14624a;

    /* renamed from: b */
    final /* synthetic */ int f14625b;

    /* renamed from: c */
    final /* synthetic */ AdChoicesView f14626c;

    C3340d(AdChoicesView adChoicesView, int i, int i2) {
        this.f14626c = adChoicesView;
        this.f14624a = i;
        this.f14625b = i2;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.f14624a) + (((float) (this.f14625b - this.f14624a)) * f));
        this.f14626c.getLayoutParams().width = i;
        this.f14626c.requestLayout();
        this.f14626c.f14563e.getLayoutParams().width = i - this.f14624a;
        this.f14626c.f14563e.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
