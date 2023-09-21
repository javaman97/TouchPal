package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.m */
/* compiled from: AttachedPackageManager */
class C1842m implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ String f6137a;

    /* renamed from: b */
    final /* synthetic */ String[] f6138b;

    /* renamed from: c */
    final /* synthetic */ C1811k f6139c;

    C1842m(C1811k kVar, String str, String[] strArr) {
        this.f6139c = kVar;
        this.f6137a = str;
        this.f6138b = strArr;
    }

    public boolean accept(File file, String str) {
        if (str.endsWith(this.f6137a)) {
            return true;
        }
        if (this.f6138b != null) {
            for (String equals : this.f6138b) {
                if (str.equals(equals)) {
                    return true;
                }
            }
        }
        return false;
    }
}
