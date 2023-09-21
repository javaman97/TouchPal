package com.p023a.p024a.p041c;

import android.util.Log;
import com.p023a.p024a.p032b.C0778d;

/* renamed from: com.a.a.c.d */
/* compiled from: L */
public final class C0813d {

    /* renamed from: a */
    private static final String f2135a = "%1$s\n%2$s";

    /* renamed from: b */
    private static volatile boolean f2136b = false;

    /* renamed from: c */
    private static volatile boolean f2137c = true;

    private C0813d() {
    }

    @Deprecated
    /* renamed from: a */
    public static void m4620a() {
        m4628b(true);
    }

    @Deprecated
    /* renamed from: b */
    public static void m4626b() {
        m4628b(false);
    }

    /* renamed from: a */
    public static void m4625a(boolean z) {
        f2136b = z;
    }

    /* renamed from: b */
    public static void m4628b(boolean z) {
        f2137c = z;
    }

    /* renamed from: a */
    public static void m4622a(String str, Object... objArr) {
        if (f2136b) {
            m4621a(3, (Throwable) null, str, objArr);
        }
    }

    /* renamed from: b */
    public static void m4627b(String str, Object... objArr) {
        m4621a(4, (Throwable) null, str, objArr);
    }

    /* renamed from: c */
    public static void m4629c(String str, Object... objArr) {
        m4621a(5, (Throwable) null, str, objArr);
    }

    /* renamed from: a */
    public static void m4623a(Throwable th) {
        m4621a(6, th, (String) null, new Object[0]);
    }

    /* renamed from: d */
    public static void m4630d(String str, Object... objArr) {
        m4621a(6, (Throwable) null, str, objArr);
    }

    /* renamed from: a */
    public static void m4624a(Throwable th, String str, Object... objArr) {
        m4621a(6, th, str, objArr);
    }

    /* renamed from: a */
    private static void m4621a(int i, Throwable th, String str, Object... objArr) {
        String str2;
        if (f2137c) {
            if (objArr.length > 0) {
                str2 = String.format(str, objArr);
            } else {
                str2 = str;
            }
            if (th != null) {
                if (str2 == null) {
                    str2 = th.getMessage();
                }
                str2 = String.format(f2135a, new Object[]{str2, Log.getStackTraceString(th)});
            }
            Log.println(i, C0778d.f1960a, str2);
        }
    }
}
