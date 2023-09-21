package com.cootek.smartinput5.p066ui.settings;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.bS */
/* compiled from: PluginSettings */
class C3062bS implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ PluginSettings f14010a;

    C3062bS(PluginSettings pluginSettings) {
        this.f14010a = pluginSettings;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        view.getLocationOnScreen(this.f14010a.f13593h);
        if (this.f14010a.f13587b == null || !this.f14010a.f13587b.isShowing()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            int unused = this.f14010a.f13595j = y + this.f14010a.f13593h[1];
            int unused2 = this.f14010a.f13597l = 0;
            return true;
        } else if (motionEvent.getAction() == 2) {
            int a = (this.f14010a.f13593h[1] + y) - this.f14010a.f13595j;
            if (Math.abs(this.f14010a.f13597l - a) <= this.f14010a.f13587b.getHeight() / 5) {
                return true;
            }
            this.f14010a.f13587b.update(0, this.f14010a.f13596k + a, this.f14010a.f13587b.getWidth(), this.f14010a.f13587b.getHeight());
            int unused3 = this.f14010a.f13597l = a;
            return true;
        } else if (motionEvent.getAction() != 1) {
            return true;
        } else {
            this.f14010a.m13932b(x, y + this.f14010a.f13593h[1]);
            int unused4 = this.f14010a.f13596k = this.f14010a.m13922a(this.f14010a.f13591f);
            return true;
        }
    }
}
