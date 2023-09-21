package com.cootek.smartinput5.func;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.cootek.smartinput5.func.Q */
/* compiled from: ExternalStorage */
final class C1360Q implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ String f4218a;

    C1360Q(String str) {
        this.f4218a = str;
    }

    public boolean accept(File file, String str) {
        if (str.startsWith(this.f4218a) && str.length() > this.f4218a.length()) {
            try {
                Long.parseLong(str.substring(this.f4218a.length()));
                return true;
            } catch (NumberFormatException e) {
            }
        }
        return false;
    }
}
