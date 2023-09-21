package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.an */
/* compiled from: HandWriteManager */
class C1438an implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ HandWriteManager f4629a;

    C1438an(HandWriteManager handWriteManager) {
        this.f4629a = handWriteManager;
    }

    public boolean accept(File file, String str) {
        return str.endsWith(".so") || str.endsWith("AUTH") || str.endsWith("AUTH_FOREVER");
    }
}
