package p018cn.sharesdk.framework.utils;

import android.util.Log;

/* renamed from: cn.sharesdk.framework.utils.e */
public class C0666e {

    /* renamed from: a */
    protected static C0667a f1631a = new C0667a();

    /* renamed from: b */
    protected static C0668b f1632b = new C0668b();

    /* renamed from: cn.sharesdk.framework.utils.e$a */
    public static class C0667a {

        /* renamed from: a */
        protected int f1633a = 7;

        /* renamed from: b */
        protected String f1634b = "";

        /* renamed from: c */
        protected String f1635c = "";

        protected C0667a() {
        }
    }

    /* renamed from: cn.sharesdk.framework.utils.e$b */
    public static class C0668b {
        /* renamed from: a */
        protected static String m3840a(int i) {
            if (C0666e.f1631a.f1633a <= 3) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                if (i >= 0 && i < stackTrace.length) {
                    StackTraceElement stackTraceElement = stackTrace[i];
                    String fileName = stackTraceElement.getFileName();
                    String className = (fileName == null || fileName.length() <= 0) ? stackTraceElement.getClassName() : C0666e.f1631a.f1635c + "/" + fileName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    String valueOf = String.valueOf(lineNumber);
                    if (lineNumber < 0 && ((valueOf = stackTraceElement.getMethodName()) == null || valueOf.length() <= 0)) {
                        valueOf = "Unknown Source";
                    }
                    return className + "(" + valueOf + ")";
                }
            }
            return C0666e.f1631a.f1635c;
        }

        /* renamed from: a */
        public int mo2497a(int i, String str) {
            return Log.println(i, m3840a(5), mo2498a(str));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo2498a(String str) {
            if (C0666e.f1631a.f1633a > 3) {
                return str;
            }
            return String.format("%s %s", new Object[]{Thread.currentThread().getName(), str});
        }
    }

    /* renamed from: a */
    public static int m3834a(Object obj, Object... objArr) {
        if (f1631a.f1633a > 3) {
            return 0;
        }
        String obj2 = obj.toString();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        return f1632b.mo2497a(3, obj2);
    }

    /* renamed from: a */
    public static int m3835a(Throwable th) {
        if (f1631a.f1633a <= 3) {
            return f1632b.mo2497a(3, Log.getStackTraceString(th));
        }
        return 0;
    }

    /* renamed from: a */
    public static int m3836a(Throwable th, Object obj, Object... objArr) {
        if (f1631a.f1633a > 6) {
            return 0;
        }
        String obj2 = obj.toString();
        StringBuilder sb = new StringBuilder();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        return f1632b.mo2497a(6, sb.append(obj2).append(10).append(Log.getStackTraceString(th)).toString());
    }

    /* renamed from: b */
    public static int m3837b(Object obj, Object... objArr) {
        if (f1631a.f1633a > 4) {
            return 0;
        }
        String obj2 = obj.toString();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        return f1632b.mo2497a(4, obj2);
    }

    /* renamed from: b */
    public static int m3838b(Throwable th) {
        if (f1631a.f1633a <= 6) {
            return f1632b.mo2497a(6, Log.getStackTraceString(th));
        }
        return 0;
    }

    /* renamed from: c */
    public static int m3839c(Object obj, Object... objArr) {
        if (f1631a.f1633a > 6) {
            return 0;
        }
        String obj2 = obj.toString();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        return f1632b.mo2497a(6, obj2);
    }
}
