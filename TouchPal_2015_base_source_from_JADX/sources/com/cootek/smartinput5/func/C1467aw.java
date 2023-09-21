package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.aw */
/* compiled from: InternalStorage */
final class C1467aw implements FilenameFilter {
    C1467aw() {
    }

    public boolean accept(File file, String str) {
        if (C1466av.f4691A.matcher(str).matches()) {
            return true;
        }
        return false;
    }
}
