package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput5.func.C1579bD;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.ui.settings.dE */
/* compiled from: TouchPalCloudActivity */
class C3167dE implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ C3166dD f14222a;

    C3167dE(C3166dD dDVar) {
        this.f14222a = dDVar;
    }

    public boolean accept(File file, String str) {
        if (str == null || !str.endsWith(C1579bD.f4987i)) {
            return false;
        }
        return true;
    }
}
