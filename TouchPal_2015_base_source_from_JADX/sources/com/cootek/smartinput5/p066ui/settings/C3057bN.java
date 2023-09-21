package com.cootek.smartinput5.p066ui.settings;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.bN */
/* compiled from: PluginPreference */
class C3057bN implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ PluginPreference f14005a;

    C3057bN(PluginPreference pluginPreference) {
        this.f14005a = pluginPreference;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        if (this.f14005a.mWidgetFrame == null || x <= this.f14005a.mViewCheck.getRight() + this.f14005a.mWidgetFrame.getLeft()) {
            return false;
        }
        this.f14005a.mViewPos.onTouchEvent(motionEvent);
        return true;
    }
}
