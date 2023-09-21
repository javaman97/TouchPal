package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.am */
/* compiled from: HandWriteManager */
class C1437am implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ HandWriteManager f4628a;

    C1437am(HandWriteManager handWriteManager) {
        this.f4628a = handWriteManager;
    }

    public boolean accept(File file, String str) {
        return str.endsWith(HandWriteManager.f4133a);
    }
}
