package com.p023a.p024a.p041c;

import com.p023a.p024a.p025a.p026a.C0725b;
import java.io.File;

/* renamed from: com.a.a.c.a */
/* compiled from: DiskCacheUtils */
public final class C0808a {
    private C0808a() {
    }

    /* renamed from: a */
    public static File m4607a(String str, C0725b bVar) {
        File a = bVar.mo2679a(str);
        if (a == null || !a.exists()) {
            return null;
        }
        return a;
    }

    /* renamed from: b */
    public static boolean m4608b(String str, C0725b bVar) {
        File a = bVar.mo2679a(str);
        return a != null && a.exists() && a.delete();
    }
}
