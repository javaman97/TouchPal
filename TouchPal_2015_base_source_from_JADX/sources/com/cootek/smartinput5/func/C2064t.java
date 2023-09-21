package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.t */
/* compiled from: CellDictManager */
class C2064t implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ C1960r f8847a;

    C2064t(C1960r rVar) {
        this.f8847a = rVar;
    }

    public boolean accept(File file, String str) {
        return str.endsWith(C1960r.f6678a);
    }
}
