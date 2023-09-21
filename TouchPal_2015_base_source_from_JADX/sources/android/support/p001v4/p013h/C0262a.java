package android.support.p001v4.p013h;

import android.os.Build;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: android.support.v4.h.a */
/* compiled from: EnvironmentCompat */
public class C0262a {

    /* renamed from: a */
    public static final String f648a = "unknown";

    /* renamed from: b */
    private static final String f649b = "EnvironmentCompat";

    /* renamed from: a */
    public static String m1050a(File file) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0263b.m1051a(file);
        }
        try {
            if (file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath())) {
                return Environment.getExternalStorageState();
            }
        } catch (IOException e) {
            Log.w(f649b, "Failed to resolve canonical path: " + e);
        }
        return f648a;
    }
}
