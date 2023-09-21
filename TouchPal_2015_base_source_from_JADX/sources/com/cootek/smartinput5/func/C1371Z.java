package com.cootek.smartinput5.func;

import com.cootek.smartinput5.func.p053c.C1632c;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.Z */
/* compiled from: FuncManager */
class C1371Z implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ C1368X f4298a;

    C1371Z(C1368X x) {
        this.f4298a = x;
    }

    public boolean accept(File file, String str) {
        if (!str.equals("version.ftd") && !str.equals("paopao.ser") && !str.equals(C1632c.f5298b) && !str.equals("western_curve.usr") && !str.equals("curve_western.usr") && !str.equals(C1466av.f4704m) && !str.equals(C1713e.f5605a) && !str.endsWith(C1337C.f4088c)) {
            return false;
        }
        return true;
    }
}
