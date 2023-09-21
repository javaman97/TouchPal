package android.support.p001v4.content;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;

/* renamed from: android.support.v4.content.i */
/* compiled from: IntentCompat */
public class C0203i {

    /* renamed from: a */
    public static final String f523a = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE";

    /* renamed from: b */
    public static final String f524b = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE";

    /* renamed from: c */
    public static final String f525c = "android.intent.extra.changed_package_list";

    /* renamed from: d */
    public static final String f526d = "android.intent.extra.changed_uid_list";

    /* renamed from: e */
    public static final String f527e = "android.intent.extra.HTML_TEXT";

    /* renamed from: f */
    public static final int f528f = 16384;

    /* renamed from: g */
    public static final int f529g = 32768;

    /* renamed from: h */
    private static final C0204a f530h;

    /* renamed from: android.support.v4.content.i$a */
    /* compiled from: IntentCompat */
    interface C0204a {
        /* renamed from: a */
        Intent mo670a(ComponentName componentName);

        /* renamed from: a */
        Intent mo671a(String str, String str2);

        /* renamed from: b */
        Intent mo672b(ComponentName componentName);
    }

    /* renamed from: android.support.v4.content.i$b */
    /* compiled from: IntentCompat */
    static class C0205b implements C0204a {
        C0205b() {
        }

        /* renamed from: a */
        public Intent mo670a(ComponentName componentName) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(componentName);
            intent.addCategory("android.intent.category.LAUNCHER");
            return intent;
        }

        /* renamed from: a */
        public Intent mo671a(String str, String str2) {
            Intent intent = new Intent(str);
            intent.addCategory(str2);
            return intent;
        }

        /* renamed from: b */
        public Intent mo672b(ComponentName componentName) {
            Intent a = mo670a(componentName);
            a.addFlags(268468224);
            return a;
        }
    }

    /* renamed from: android.support.v4.content.i$c */
    /* compiled from: IntentCompat */
    static class C0206c extends C0205b {
        C0206c() {
        }

        /* renamed from: a */
        public Intent mo670a(ComponentName componentName) {
            return C0208j.m854a(componentName);
        }

        /* renamed from: b */
        public Intent mo672b(ComponentName componentName) {
            return C0208j.m855b(componentName);
        }
    }

    /* renamed from: android.support.v4.content.i$d */
    /* compiled from: IntentCompat */
    static class C0207d extends C0206c {
        C0207d() {
        }

        /* renamed from: a */
        public Intent mo671a(String str, String str2) {
            return C0209k.m856a(str, str2);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 15) {
            f530h = new C0207d();
        } else if (i >= 11) {
            f530h = new C0206c();
        } else {
            f530h = new C0205b();
        }
    }

    private C0203i() {
    }

    /* renamed from: a */
    public static Intent m842a(ComponentName componentName) {
        return f530h.mo670a(componentName);
    }

    /* renamed from: a */
    public static Intent m843a(String str, String str2) {
        return f530h.mo671a(str, str2);
    }

    /* renamed from: b */
    public static Intent m844b(ComponentName componentName) {
        return f530h.mo672b(componentName);
    }
}
