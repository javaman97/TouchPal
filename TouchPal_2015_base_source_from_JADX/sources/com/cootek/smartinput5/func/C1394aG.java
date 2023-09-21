package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.aG */
/* compiled from: LanguageManager */
class C1394aG implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ ArrayList f4406a;

    /* renamed from: b */
    final /* synthetic */ C1389aD f4407b;

    C1394aG(C1389aD aDVar, ArrayList arrayList) {
        this.f4407b = aDVar;
        this.f4406a = arrayList;
    }

    public boolean accept(File file, String str) {
        Iterator it = this.f4406a.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
