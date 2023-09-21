package com.cootek.p042a.p043a;

import android.content.Context;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;

/* renamed from: com.cootek.a.a.a */
/* compiled from: Perf */
public class C0897a {

    /* renamed from: a */
    public static final boolean f2341a = false;

    /* renamed from: b */
    static final String f2342b = "perf";

    /* renamed from: c */
    public static final int f2343c = 0;

    /* renamed from: d */
    public static final int f2344d = 1;

    /* renamed from: e */
    public static final int f2345e = 2;

    /* renamed from: f */
    private static int f2346f = 1;

    /* renamed from: g */
    private static long[] f2347g = new long[C0899c.f2412x];

    /* renamed from: a */
    public static void m4889a(Context context, int i) {
        C0911j.m4974a();
    }

    /* renamed from: a */
    public static boolean m4891a() {
        return true;
    }

    /* renamed from: b */
    public static void m4893b() {
        C0911j.m4974a();
    }

    /* renamed from: c */
    public static void m4894c() {
    }

    /* renamed from: d */
    public static void m4896d() {
    }

    /* renamed from: a */
    public static void m4890a(String str, Bundle bundle) {
        if (str.equalsIgnoreCase(C0899c.f2390b)) {
            C0910i.m4965f();
            m4893b();
        } else if (str.equalsIgnoreCase(C0899c.f2391c)) {
            m4894c();
        } else if (str.equalsIgnoreCase(C0899c.f2392d)) {
            m4896d();
            C0904g.m4916a().mo3415e();
        } else if (str.equalsIgnoreCase(C0899c.f2395g)) {
            String str2 = null;
            if (bundle != null) {
                str2 = bundle.getString(C0899c.f2399k);
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = C0899c.f2387B;
            }
            Debug.startMethodTracing(str2);
        } else if (str.equalsIgnoreCase(C0899c.f2396h)) {
            Debug.stopMethodTracing();
            C0904g.m4916a().mo3413d();
            C0910i.m4965f();
        } else if (str.equalsIgnoreCase(C0899c.f2393e)) {
            if (bundle == null) {
                m4897e();
                return;
            }
            int i = bundle.getInt(C0899c.f2397i);
            long j = bundle.getLong(C0899c.f2398j);
            if (i >= 0 && i < f2347g.length) {
                f2347g[i] = j;
            }
        } else if (str.equalsIgnoreCase(C0899c.f2394f)) {
            int i2 = 0;
            if (bundle != null) {
                i2 = bundle.getInt(C0899c.f2400l);
            }
            m4895c(i2);
        }
    }

    /* renamed from: a */
    public static void m4888a(int i) {
        long b = m4892b(i);
        if (b > 0) {
            try {
                Thread.sleep(b * (((long) (Math.random() * 10.0d)) + 1));
            } catch (InterruptedException e) {
            }
        }
    }

    /* renamed from: e */
    public static void m4897e() {
        for (int i = 0; i < C0899c.f2412x; i++) {
            f2347g[i] = 0;
        }
    }

    /* renamed from: b */
    public static long m4892b(int i) {
        if (i < 0 || i >= f2347g.length) {
            return 0;
        }
        return f2347g[i];
    }

    /* renamed from: c */
    public static void m4895c(int i) {
        f2346f = i;
    }

    /* renamed from: f */
    public static int m4898f() {
        return f2346f;
    }
}
