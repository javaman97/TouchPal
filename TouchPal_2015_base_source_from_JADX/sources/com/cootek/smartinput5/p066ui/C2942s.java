package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.cootek.smartinput5.ui.s */
/* compiled from: ClipboardSimpleAdapter */
class C2942s extends Animation {

    /* renamed from: a */
    final /* synthetic */ int f13364a;

    /* renamed from: b */
    final /* synthetic */ View f13365b;

    /* renamed from: c */
    final /* synthetic */ C2939q f13366c;

    C2942s(C2939q qVar, int i, View view) {
        this.f13366c = qVar;
        this.f13364a = i;
        this.f13365b = view;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.f13364a) * f);
        ViewGroup.LayoutParams layoutParams = this.f13365b.getLayoutParams();
        if (f == 1.0f) {
            i = -2;
        }
        layoutParams.height = i;
        this.f13365b.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
