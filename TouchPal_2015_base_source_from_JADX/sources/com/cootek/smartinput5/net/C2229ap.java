package com.cootek.smartinput5.net;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.net.ap */
/* compiled from: WebResourceUtils */
final class C2229ap implements FilenameFilter {
    C2229ap() {
    }

    public boolean accept(File file, String str) {
        if (str.endsWith(".etag") || "md5sum.json".equals(str)) {
            return false;
        }
        return true;
    }
}
