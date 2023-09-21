package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.j */
public abstract class C3777j implements SafeParcelable {

    /* renamed from: bo */
    private static final Object f15848bo = new Object();

    /* renamed from: bp */
    private static ClassLoader f15849bp = null;

    /* renamed from: bq */
    private static Integer f15850bq = null;

    /* renamed from: br */
    private boolean f15851br = false;

    /* renamed from: a */
    private static boolean m16570a(Class<?> cls) {
        try {
            return SafeParcelable.NULL.equals(cls.getField("NULL").get((Object) null));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public static boolean m16571h(String str) {
        ClassLoader u = m16572u();
        if (u == null) {
            return true;
        }
        try {
            return m16570a(u.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: u */
    protected static ClassLoader m16572u() {
        ClassLoader classLoader;
        synchronized (f15848bo) {
            classLoader = f15849bp;
        }
        return classLoader;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public static Integer m16573v() {
        Integer num;
        synchronized (f15848bo) {
            num = f15850bq;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo12354w() {
        return this.f15851br;
    }
}
