package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.p066ui.settings.FontDialogPreference;

/* renamed from: com.cootek.smartinput5.ui.settings.ax */
/* compiled from: FontDialogPreference */
class C3038ax implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FontDialogPreference.C2958b f13954a;

    /* renamed from: b */
    final /* synthetic */ FontDialogPreference f13955b;

    C3038ax(FontDialogPreference fontDialogPreference, FontDialogPreference.C2958b bVar) {
        this.f13955b = fontDialogPreference;
        this.f13954a = bVar;
    }

    public void onClick(View view) {
        Settings.getInstance().setBoolSetting(Settings.USE_SYSTEM_DEFAULT_FONT, this.f13954a.f13444b);
        C1624bv.m7423c();
        if (Engine.isInitialized()) {
            Engine.getInstance().getWidgetManager().mo9666w();
        }
        if (this.f13955b.getDialog() != null) {
            this.f13955b.getDialog().dismiss();
        }
    }
}
