package android.support.p001v4.content;

import android.content.Context;
import java.io.File;

/* renamed from: android.support.v4.content.c */
/* compiled from: ContextCompatFroyo */
class C0195c {
    C0195c() {
    }

    /* renamed from: a */
    public static File m802a(Context context) {
        return context.getExternalCacheDir();
    }

    /* renamed from: a */
    public static File m803a(Context context, String str) {
        return context.getExternalFilesDir(str);
    }
}
