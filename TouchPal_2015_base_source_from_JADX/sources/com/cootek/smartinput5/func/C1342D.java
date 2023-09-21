package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.D */
/* compiled from: CurveManager */
class C1342D implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ C1337C f4104a;

    C1342D(C1337C c) {
        this.f4104a = c;
    }

    public boolean accept(File file, String str) {
        return str.endsWith(C1337C.f4087b);
    }
}
