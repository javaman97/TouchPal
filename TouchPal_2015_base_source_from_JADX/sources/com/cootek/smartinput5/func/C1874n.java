package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.n */
/* compiled from: AttachedPackageManager */
class C1874n implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ C1811k f6252a;

    C1874n(C1811k kVar) {
        this.f6252a = kVar;
    }

    public boolean accept(File file, String str) {
        return str.endsWith(".apk");
    }
}
