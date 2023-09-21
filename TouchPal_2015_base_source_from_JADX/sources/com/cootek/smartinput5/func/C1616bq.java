package com.cootek.smartinput5.func;

import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1608bk;
import com.cootek.smartinput5.func.p052b.C1549b;

/* renamed from: com.cootek.smartinput5.func.bq */
/* compiled from: SuperDictManager */
class C1616bq implements C1608bk.C1610b {

    /* renamed from: a */
    final /* synthetic */ String f5198a;

    /* renamed from: b */
    final /* synthetic */ C1608bk f5199b;

    C1616bq(C1608bk bkVar, String str) {
        this.f5199b = bkVar;
        this.f5198a = str;
    }

    /* renamed from: i */
    public void mo4252i() {
        if (Settings.isInitialized() && TextUtils.equals(this.f5198a, C1549b.f4831b)) {
            Settings.getInstance().setBoolSetting(Settings.SUPER_DICT_DOWNLOADED, false);
            Settings.getInstance().setBoolSetting(Settings.SUPER_DICT_ENABLED_UI, false);
        }
    }
}
