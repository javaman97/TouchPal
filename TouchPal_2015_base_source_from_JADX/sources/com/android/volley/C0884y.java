package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import com.cootek.smartinput5.func.C1389aD;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.android.volley.y */
/* compiled from: VolleyLog */
public class C0884y {

    /* renamed from: a */
    public static String f2330a = "Volley";

    /* renamed from: b */
    public static boolean f2331b = Log.isLoggable(f2330a, 2);

    /* renamed from: a */
    public static void m4875a(String str) {
        m4878b("Changing log tag to %s", str);
        f2330a = str;
        f2331b = Log.isLoggable(f2330a, 2);
    }

    /* renamed from: a */
    public static void m4876a(String str, Object... objArr) {
        if (f2331b) {
            Log.v(f2330a, m4882e(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m4878b(String str, Object... objArr) {
        Log.d(f2330a, m4882e(str, objArr));
    }

    /* renamed from: c */
    public static void m4880c(String str, Object... objArr) {
        Log.e(f2330a, m4882e(str, objArr));
    }

    /* renamed from: a */
    public static void m4877a(Throwable th, String str, Object... objArr) {
        Log.e(f2330a, m4882e(str, objArr), th);
    }

    /* renamed from: d */
    public static void m4881d(String str, Object... objArr) {
        Log.wtf(f2330a, m4882e(str, objArr));
    }

    /* renamed from: b */
    public static void m4879b(Throwable th, String str, Object... objArr) {
        Log.wtf(f2330a, m4882e(str, objArr), th);
    }

    /* renamed from: e */
    private static String m4882e(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClass().equals(C0884y.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + C1389aD.f4374j + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }

    /* renamed from: com.android.volley.y$a */
    /* compiled from: VolleyLog */
    static class C0885a {

        /* renamed from: a */
        public static final boolean f2332a = C0884y.f2331b;

        /* renamed from: b */
        private static final long f2333b = 0;

        /* renamed from: c */
        private final List<C0886a> f2334c = new ArrayList();

        /* renamed from: d */
        private boolean f2335d = false;

        C0885a() {
        }

        /* renamed from: com.android.volley.y$a$a */
        /* compiled from: VolleyLog */
        private static class C0886a {

            /* renamed from: a */
            public final String f2336a;

            /* renamed from: b */
            public final long f2337b;

            /* renamed from: c */
            public final long f2338c;

            public C0886a(String str, long j, long j2) {
                this.f2336a = str;
                this.f2337b = j;
                this.f2338c = j2;
            }
        }

        /* renamed from: a */
        public synchronized void mo3159a(String str, long j) {
            if (this.f2335d) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f2334c.add(new C0886a(str, j, SystemClock.elapsedRealtime()));
        }

        /* renamed from: a */
        public synchronized void mo3158a(String str) {
            this.f2335d = true;
            long a = m4883a();
            if (a > 0) {
                long j = this.f2334c.get(0).f2338c;
                C0884y.m4878b("(%-4d ms) %s", Long.valueOf(a), str);
                long j2 = j;
                for (C0886a next : this.f2334c) {
                    long j3 = next.f2338c;
                    C0884y.m4878b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(next.f2337b), next.f2336a);
                    j2 = j3;
                }
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            if (!this.f2335d) {
                mo3158a("Request on the loose");
                C0884y.m4880c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        /* renamed from: a */
        private long m4883a() {
            if (this.f2334c.size() == 0) {
                return 0;
            }
            return this.f2334c.get(this.f2334c.size() - 1).f2338c - this.f2334c.get(0).f2338c;
        }
    }
}
