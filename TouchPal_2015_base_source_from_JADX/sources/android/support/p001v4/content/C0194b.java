package android.support.p001v4.content;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import java.io.File;

/* renamed from: android.support.v4.content.b */
/* compiled from: ContextCompat */
public class C0194b {

    /* renamed from: a */
    private static final String f498a = "Android";

    /* renamed from: b */
    private static final String f499b = "data";

    /* renamed from: c */
    private static final String f500c = "obb";

    /* renamed from: d */
    private static final String f501d = "files";

    /* renamed from: e */
    private static final String f502e = "cache";

    /* renamed from: a */
    public static boolean m797a(Context context, Intent[] intentArr) {
        return m798a(context, intentArr, (Bundle) null);
    }

    /* renamed from: a */
    public static boolean m798a(Context context, Intent[] intentArr, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            C0197e.m806a(context, intentArr, bundle);
            return true;
        } else if (i < 11) {
            return false;
        } else {
            C0196d.m805a(context, intentArr);
            return true;
        }
    }

    /* renamed from: a */
    public static File[] m799a(Context context) {
        File a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return C0198f.m809b(context);
        }
        if (i >= 11) {
            a = C0196d.m804a(context);
        } else {
            a = m796a(Environment.getExternalStorageDirectory(), f498a, f500c, context.getPackageName());
        }
        return new File[]{a};
    }

    /* renamed from: a */
    public static File[] m800a(Context context, String str) {
        File a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return C0198f.m808a(context, str);
        }
        if (i >= 8) {
            a = C0195c.m803a(context, str);
        } else {
            a = m796a(Environment.getExternalStorageDirectory(), f498a, "data", context.getPackageName(), f501d, str);
        }
        return new File[]{a};
    }

    /* renamed from: b */
    public static File[] m801b(Context context) {
        File a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return C0198f.m807a(context);
        }
        if (i >= 8) {
            a = C0195c.m802a(context);
        } else {
            a = m796a(Environment.getExternalStorageDirectory(), f498a, "data", context.getPackageName(), "cache");
        }
        return new File[]{a};
    }

    /* renamed from: a */
    private static File m796a(File file, String... strArr) {
        File file2;
        int length = strArr.length;
        int i = 0;
        File file3 = file;
        while (i < length) {
            String str = strArr[i];
            if (file3 == null) {
                file2 = new File(str);
            } else if (str != null) {
                file2 = new File(file3, str);
            } else {
                file2 = file3;
            }
            i++;
            file3 = file2;
        }
        return file3;
    }
}
