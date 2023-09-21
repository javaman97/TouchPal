package com.cootek.smartinput5.func.smileypanel.p060c;

import android.view.animation.Animation;
import android.widget.PopupWindow;

/* renamed from: com.cootek.smartinput5.func.smileypanel.c.f */
/* compiled from: EmojiArtItem */
class C2041f implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ PopupWindow f7091a;

    /* renamed from: b */
    final /* synthetic */ C2039d f7092b;

    C2041f(C2039d dVar, PopupWindow popupWindow) {
        this.f7092b = dVar;
        this.f7091a = popupWindow;
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        this.f7092b.mo7401a(this.f7091a);
        this.f7092b.mo7405e();
    }
}
