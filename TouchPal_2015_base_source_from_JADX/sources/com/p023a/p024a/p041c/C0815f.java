package com.p023a.p024a.p041c;

import com.cootek.smartinput5.engine.Storage;
import java.util.Comparator;

/* renamed from: com.a.a.c.f */
/* compiled from: MemoryCacheUtils */
final class C0815f implements Comparator<String> {
    C0815f() {
    }

    /* renamed from: a */
    public int compare(String str, String str2) {
        return str.substring(0, str.lastIndexOf(Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR)).compareTo(str2.substring(0, str2.lastIndexOf(Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR)));
    }
}
