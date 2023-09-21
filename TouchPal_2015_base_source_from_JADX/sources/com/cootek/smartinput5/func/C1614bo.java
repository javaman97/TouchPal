package com.cootek.smartinput5.func;

import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1608bk;
import com.cootek.smartinput5.func.p052b.C1549b;

/* renamed from: com.cootek.smartinput5.func.bo */
/* compiled from: SuperDictManager */
class C1614bo implements C1608bk.C1610b {

    /* renamed from: a */
    final /* synthetic */ C1613bn f5196a;

    C1614bo(C1613bn bnVar) {
        this.f5196a = bnVar;
    }

    /* renamed from: i */
    public void mo4252i() {
        if (Settings.isInitialized() && !Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED) && this.f5196a.f5195a.mo6315e(C1549b.f4831b)) {
            C1017y.m5224c("SuperDictManager", "onFileDownloaded set superdict settings");
            Settings.getInstance().setBoolSetting(Settings.SUPER_DICT_DOWNLOADED, true);
            Settings.getInstance().setBoolSetting(Settings.SUPER_DICT_ENABLED_UI, true);
        }
    }
}
