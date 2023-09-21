package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.ax */
/* compiled from: InternalStorage */
final class C1468ax implements FilenameFilter {
    C1468ax() {
    }

    public boolean accept(File file, String str) {
        if (C1466av.f4691A.matcher(str).matches()) {
            return false;
        }
        return true;
    }
}
