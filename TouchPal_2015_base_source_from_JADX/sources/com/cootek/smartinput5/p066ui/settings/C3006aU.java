package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.settings.C3007aV;

/* renamed from: com.cootek.smartinput5.ui.settings.aU */
/* compiled from: KeyboardCustomizeActivity */
class C3006aU implements Runnable {

    /* renamed from: a */
    final /* synthetic */ KeyboardCustomizeActivity f13836a;

    C3006aU(KeyboardCustomizeActivity keyboardCustomizeActivity) {
        this.f13836a = keyboardCustomizeActivity;
    }

    public void run() {
        this.f13836a.f13484e.removeCallbacks(this);
        this.f13836a.m13814h();
        if (this.f13836a.m13815i()) {
            Engine.getInstance().setKeyboardMode(false);
            this.f13836a.m13803a(true);
            Engine.getInstance().getWidgetManager().mo9632af().mo10093a(-1, (int) (0.7d * ((double) this.f13836a.getResources().getDisplayMetrics().heightPixels)));
            Engine.getInstance().getWidgetManager().mo9632af().mo10097a((C3007aV.C3008a) this.f13836a);
            return;
        }
        this.f13836a.m13816j();
        this.f13836a.f13484e.postDelayed(this, 100);
    }
}
