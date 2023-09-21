package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.E */
/* compiled from: CurveManager */
class C1343E implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ C1337C f4105a;

    C1343E(C1337C c) {
        this.f4105a = c;
    }

    public boolean accept(File file, String str) {
        return str.endsWith(C1337C.f4087b);
    }
}
