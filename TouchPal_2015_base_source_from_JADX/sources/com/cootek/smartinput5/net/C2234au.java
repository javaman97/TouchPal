package com.cootek.smartinput5.net;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.net.au */
/* compiled from: WebviewManager */
class C2234au implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ String f9449a;

    /* renamed from: b */
    final /* synthetic */ C2232as f9450b;

    C2234au(C2232as asVar, String str) {
        this.f9450b = asVar;
        this.f9449a = str;
    }

    public boolean accept(File file, String str) {
        if (str.equals(this.f9449a)) {
            return false;
        }
        return true;
    }
}
