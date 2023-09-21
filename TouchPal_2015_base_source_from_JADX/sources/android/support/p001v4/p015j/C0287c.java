package android.support.p001v4.p015j;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.j.c */
/* compiled from: ICUCompatIcs */
class C0287c {

    /* renamed from: a */
    private static final String f725a = "ICUCompatIcs";

    /* renamed from: b */
    private static Method f726b;

    /* renamed from: c */
    private static Method f727c;

    C0287c() {
    }

    static {
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f726b = cls.getMethod("getScript", new Class[]{String.class});
                f727c = cls.getMethod("addLikelySubtags", new Class[]{String.class});
            }
        } catch (Exception e) {
            Log.w(f725a, e);
        }
    }

    /* renamed from: a */
    public static String m1158a(String str) {
        try {
            if (f726b != null) {
                return (String) f726b.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w(f725a, e);
        } catch (InvocationTargetException e2) {
            Log.w(f725a, e2);
        }
        return null;
    }

    /* renamed from: b */
    public static String m1159b(String str) {
        try {
            if (f727c != null) {
                return (String) f727c.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w(f725a, e);
        } catch (InvocationTargetException e2) {
            Log.w(f725a, e2);
        }
        return str;
    }
}
