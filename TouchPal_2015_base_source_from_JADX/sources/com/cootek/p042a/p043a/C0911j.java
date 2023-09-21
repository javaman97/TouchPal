package com.cootek.p042a.p043a;

import com.cootek.smartinput5.func.C1389aD;

/* renamed from: com.cootek.a.a.j */
/* compiled from: Utils */
public class C0911j {

    /* renamed from: a */
    public static final boolean f2471a = false;

    /* renamed from: b */
    public static final String f2472b = "perf";

    /* renamed from: c */
    public static final String f2473c = "\n";

    /* renamed from: d */
    public static long f2474d;

    /* renamed from: a */
    public static void m4974a() {
        f2474d = System.nanoTime();
    }

    /* renamed from: b */
    public static long m4975b() {
        return System.nanoTime() - f2474d;
    }

    /* renamed from: a */
    public static double m4973a(long j) {
        return ((double) j) / 1000000.0d;
    }

    /* renamed from: b */
    public static String m4976b(long j) {
        return String.format("%5.2f", new Object[]{Float.valueOf(((float) ((5000 + j) / 10000)) / 100.0f)});
    }

    /* renamed from: c */
    public static String m4977c(long j) {
        int i = (int) (j / 1000000000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.format("%02d", new Object[]{Integer.valueOf(i / 60)}));
        stringBuffer.append(":");
        stringBuffer.append(String.format("%02d", new Object[]{Integer.valueOf(i % 60)}));
        stringBuffer.append(C1389aD.f4374j);
        stringBuffer.append(String.format("%06.2f", new Object[]{Float.valueOf(((float) (((j % 1000000000) + 5000) / 10000)) / 100.0f)}));
        return stringBuffer.toString();
    }

    /* renamed from: d */
    static long m4978d(long j) {
        return (long) ((int) (((j / 100000) + 5) / 10));
    }

    /* renamed from: e */
    static long m4979e(long j) {
        return 1000000 * j;
    }
}
