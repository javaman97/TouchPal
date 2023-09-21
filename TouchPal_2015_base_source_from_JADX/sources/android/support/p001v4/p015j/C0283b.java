package android.support.p001v4.p015j;

import android.os.Build;

/* renamed from: android.support.v4.j.b */
/* compiled from: ICUCompat */
public class C0283b {

    /* renamed from: a */
    private static final C0284a f724a;

    /* renamed from: android.support.v4.j.b$a */
    /* compiled from: ICUCompat */
    interface C0284a {
        /* renamed from: a */
        String mo853a(String str);

        /* renamed from: b */
        String mo854b(String str);
    }

    /* renamed from: android.support.v4.j.b$b */
    /* compiled from: ICUCompat */
    static class C0285b implements C0284a {
        C0285b() {
        }

        /* renamed from: a */
        public String mo853a(String str) {
            return null;
        }

        /* renamed from: b */
        public String mo854b(String str) {
            return str;
        }
    }

    /* renamed from: android.support.v4.j.b$c */
    /* compiled from: ICUCompat */
    static class C0286c implements C0284a {
        C0286c() {
        }

        /* renamed from: a */
        public String mo853a(String str) {
            return C0287c.m1158a(str);
        }

        /* renamed from: b */
        public String mo854b(String str) {
            return C0287c.m1159b(str);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f724a = new C0286c();
        } else {
            f724a = new C0285b();
        }
    }

    /* renamed from: a */
    public static String m1150a(String str) {
        return f724a.mo853a(str);
    }

    /* renamed from: b */
    public static String m1151b(String str) {
        return f724a.mo854b(str);
    }
}
