package com.cootek.smartinput5.p066ui.settings;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.bO */
/* compiled from: PluginPreference */
class C3058bO implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PluginPreference f14006a;

    C3058bO(PluginPreference pluginPreference) {
        this.f14006a = pluginPreference;
    }

    public void onClick(View view) {
        if (this.f14006a.mOnClickListener != null) {
            this.f14006a.mOnClickListener.mo9934a(this.f14006a);
        }
    }
}
