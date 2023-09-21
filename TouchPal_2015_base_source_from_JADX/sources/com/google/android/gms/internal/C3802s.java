package com.google.android.gms.internal;

/* renamed from: com.google.android.gms.internal.s */
public final class C3802s {
    /* renamed from: a */
    public static void m16672a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m16673a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m16674a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static <T> T m16675b(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static void m16676b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m16677c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static <T> T m16678d(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }
}
