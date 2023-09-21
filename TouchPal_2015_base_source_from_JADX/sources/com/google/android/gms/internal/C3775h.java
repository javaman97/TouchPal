package com.google.android.gms.internal;

import android.os.Looper;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.h */
public final class C3775h {
    /* renamed from: a */
    public static void m16565a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m16566a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m16567b(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    /* renamed from: f */
    public static void m16568f(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            Log.e("Asserts", "checkMainThread: current thread " + Thread.currentThread() + " IS NOT the main thread " + Looper.getMainLooper().getThread() + "!");
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g */
    public static void m16569g(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Log.e("Asserts", "checkNotMainThread: current thread " + Thread.currentThread() + " IS the main thread " + Looper.getMainLooper().getThread() + "!");
            throw new IllegalStateException(str);
        }
    }
}
