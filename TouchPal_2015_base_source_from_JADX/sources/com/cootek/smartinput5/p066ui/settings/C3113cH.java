package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.settings.cH */
/* compiled from: SkinCustomizeActivity */
class C3113cH implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SkinCustomizeActivity f14121a;

    C3113cH(SkinCustomizeActivity skinCustomizeActivity) {
        this.f14121a = skinCustomizeActivity;
    }

    public void run() {
        if (Engine.isInitialized()) {
            this.f14121a.m14044r();
            Settings.getInstance().disableTemporarySettingMode();
        }
    }
}
