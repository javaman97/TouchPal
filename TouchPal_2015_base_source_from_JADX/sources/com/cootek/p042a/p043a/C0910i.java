package com.cootek.p042a.p043a;

/* renamed from: com.cootek.a.a.i */
/* compiled from: TempTimeRecorder */
public class C0910i {

    /* renamed from: a */
    public static final int f2465a = 1;

    /* renamed from: b */
    public static final int f2466b = 5;

    /* renamed from: c */
    private static long[] f2467c = new long[5];

    /* renamed from: d */
    private static int[] f2468d = new int[5];

    /* renamed from: e */
    private static long[] f2469e = new long[5];

    /* renamed from: f */
    private static int f2470f;

    /* renamed from: a */
    public static void m4954a(int i) {
        if (i > 1) {
            f2467c = new long[i];
            f2468d = new int[i];
            f2469e = new long[i];
        }
    }

    /* renamed from: a */
    public static void m4953a() {
        m4958b(1);
    }

    /* renamed from: b */
    public static void m4957b() {
        m4960c(1);
    }

    /* renamed from: a */
    public static void m4956a(long j) {
        m4955a(1, j);
    }

    /* renamed from: c */
    public static long m4959c() {
        return m4967g(1);
    }

    /* renamed from: d */
    public static long m4961d() {
        return (long) f2468d[1];
    }

    /* renamed from: e */
    public static void m4963e() {
        m4972i(1);
    }

    /* renamed from: f */
    public static void m4965f() {
        for (int i = 0; i < f2467c.length; i++) {
            f2467c[i] = 0;
            f2468d[i] = 0;
        }
    }

    /* renamed from: b */
    public static void m4958b(int i) {
        f2469e[i] = System.nanoTime();
    }

    /* renamed from: c */
    public static void m4960c(int i) {
        m4955a(i, System.nanoTime() - f2469e[i]);
    }

    /* renamed from: d */
    public static void m4962d(int i) {
        f2470f = i;
        m4958b(i);
        int i2 = f2470f + 1;
        f2470f = i2;
        m4958b(i2);
    }

    /* renamed from: e */
    public static void m4964e(int i) {
        m4960c(f2470f);
        f2470f = i;
        m4958b(i);
    }

    /* renamed from: g */
    public static void m4968g() {
        m4964e(f2470f + 1);
    }

    /* renamed from: f */
    public static void m4966f(int i) {
        if (f2470f - i > 1) {
            m4960c(f2470f);
        }
        m4960c(i);
    }

    /* renamed from: a */
    public static void m4955a(int i, long j) {
        long[] jArr = f2467c;
        jArr[i] = jArr[i] + j;
        int[] iArr = f2468d;
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: g */
    public static long m4967g(int i) {
        return f2467c[i];
    }

    /* renamed from: h */
    public static long m4969h(int i) {
        return (long) f2468d[i];
    }

    /* renamed from: i */
    public static void m4972i(int i) {
        f2467c[i] = 0;
        f2468d[i] = 0;
    }

    /* renamed from: h */
    public static String m4970h() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < f2467c.length; i++) {
            stringBuffer.append("\t");
            stringBuffer.append(i + ". ");
            stringBuffer.append(String.format("count=[%s] ", new Object[]{Long.valueOf(m4969h(i))}));
            stringBuffer.append(String.format("total=[%s] ", new Object[]{C0911j.m4976b(m4967g(i))}));
            if (m4969h(i) > 0) {
                stringBuffer.append(String.format("avg=[%8.4f] ", new Object[]{Double.valueOf(C0911j.m4973a(m4967g(i) / m4969h(i)))}));
            }
            stringBuffer.append(C0911j.f2473c);
        }
        return stringBuffer.toString();
    }

    /* renamed from: i */
    public static String m4971i() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < f2467c.length; i++) {
            stringBuffer.append("\t");
            stringBuffer.append(i);
            stringBuffer.append("\t");
            stringBuffer.append(m4969h(i));
            stringBuffer.append("\t");
            stringBuffer.append(C0911j.m4973a(m4967g(i)));
            stringBuffer.append("\t");
            if (m4969h(i) > 0) {
                stringBuffer.append(C0911j.m4973a(m4967g(i) / m4969h(i)));
                stringBuffer.append("\t");
            }
            stringBuffer.append(C0911j.f2473c);
        }
        return stringBuffer.toString();
    }
}
