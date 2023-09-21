package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.al */
/* compiled from: HandWriteManager */
class C1436al implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ HandWriteManager f4627a;

    C1436al(HandWriteManager handWriteManager) {
        this.f4627a = handWriteManager;
    }

    public boolean accept(File file, String str) {
        return str.endsWith(HandWriteManager.f4133a);
    }
}
