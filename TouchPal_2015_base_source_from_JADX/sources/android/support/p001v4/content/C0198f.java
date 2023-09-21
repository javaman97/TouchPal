package android.support.p001v4.content;

import android.content.Context;
import java.io.File;

/* renamed from: android.support.v4.content.f */
/* compiled from: ContextCompatKitKat */
class C0198f {
    C0198f() {
    }

    /* renamed from: a */
    public static File[] m807a(Context context) {
        return context.getExternalCacheDirs();
    }

    /* renamed from: a */
    public static File[] m808a(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    /* renamed from: b */
    public static File[] m809b(Context context) {
        return context.getObbDirs();
    }
}
