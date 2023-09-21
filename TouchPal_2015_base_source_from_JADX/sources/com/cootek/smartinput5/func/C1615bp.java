package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.bp */
/* compiled from: SuperDictManager */
class C1615bp implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ C1608bk f5197a;

    C1615bp(C1608bk bkVar) {
        this.f5197a = bkVar;
    }

    public boolean accept(File file, String str) {
        return str.endsWith(C1608bk.f5174a);
    }
}
