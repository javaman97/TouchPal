package com.cootek.smartinput5.p066ui.settings;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.bP */
/* compiled from: PluginPreference */
class C3059bP implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PluginPreference f14007a;

    C3059bP(PluginPreference pluginPreference) {
        this.f14007a = pluginPreference;
    }

    public void onClick(View view) {
        if (this.f14007a.mOnClickListener != null) {
            this.f14007a.mOnClickListener.mo9935b(this.f14007a);
        }
    }
}
