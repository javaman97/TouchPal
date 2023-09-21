package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.cootek.smartinput5.func.l */
/* compiled from: AttachedPackageManager */
class C1812l implements FileFilter {

    /* renamed from: a */
    final /* synthetic */ String f6024a;

    /* renamed from: b */
    final /* synthetic */ C1811k f6025b;

    C1812l(C1811k kVar, String str) {
        this.f6025b = kVar;
        this.f6024a = str;
    }

    public boolean accept(File file) {
        return file.isFile() && file.getName().startsWith(this.f6024a);
    }
}
