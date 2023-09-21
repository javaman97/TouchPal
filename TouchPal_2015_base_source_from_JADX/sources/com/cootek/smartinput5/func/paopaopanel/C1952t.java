package com.cootek.smartinput5.func.paopaopanel;

import android.view.View;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.t */
/* compiled from: PluginPanelItem */
class C1952t implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ C1950r f6642a;

    C1952t(C1950r rVar) {
        this.f6642a = rVar;
    }

    public boolean onLongClick(View view) {
        if (this.f6642a.f6635p.mo7134i()) {
            return false;
        }
        this.f6642a.f6635p.mo7126a(true);
        Settings.getInstance().setBoolSetting(Settings.PIN_MODE_ENTERED, true);
        C1246d.m6010a(this.f6642a.f6631l).mo4594a(C1246d.f3841cE, true, C1246d.f3839cC);
        return true;
    }
}
