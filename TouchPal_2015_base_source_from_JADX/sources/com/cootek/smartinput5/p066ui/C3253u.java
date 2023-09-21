package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.cootek.smartinput5.ui.u */
/* compiled from: ClipboardSimpleAdapter */
class C3253u extends Animation {

    /* renamed from: a */
    final /* synthetic */ int f14326a;

    /* renamed from: b */
    final /* synthetic */ View f14327b;

    /* renamed from: c */
    final /* synthetic */ C2939q f14328c;

    C3253u(C2939q qVar, int i, View view) {
        this.f14328c = qVar;
        this.f14326a = i;
        this.f14327b = view;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.f14326a) * (1.0f - f));
        ViewGroup.LayoutParams layoutParams = this.f14327b.getLayoutParams();
        if (f == 0.0f) {
            i = -2;
        }
        layoutParams.height = i;
        this.f14327b.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
