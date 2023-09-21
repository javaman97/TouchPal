package com.cootek.smartinput5.p066ui;

import android.view.animation.Animation;

/* renamed from: com.cootek.smartinput5.ui.r */
/* compiled from: ClipboardSimpleAdapter */
class C2941r implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C2939q f13363a;

    C2941r(C2939q qVar) {
        this.f13363a = qVar;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f13363a.f13356k >= 0) {
            this.f13363a.notifyDataSetChanged();
            this.f13363a.f13362q.mo8508b(this.f13363a.f13356k);
            int unused = this.f13363a.f13356k = -1;
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
