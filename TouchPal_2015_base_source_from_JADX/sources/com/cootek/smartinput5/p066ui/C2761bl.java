package com.cootek.smartinput5.p066ui;

import android.view.animation.Animation;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.bl */
/* compiled from: LogoItem */
class C2761bl implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C2759bj f12322a;

    C2761bl(C2759bj bjVar) {
        this.f12322a = bjVar;
    }

    public void onAnimationStart(Animation animation) {
        if (this.f12322a.f12315b != null) {
            this.f12322a.mo9040q_();
            Settings.getInstance().setBoolSetting(Settings.SHOW_PAOPAO_INDICATOR, true);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        this.f12322a.m12599p();
    }
}
