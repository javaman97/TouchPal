package com.google.android.gms.internal;

/* renamed from: com.google.android.gms.internal.bd */
public final class C3670bd {
    /* renamed from: G */
    public static String m16096G(int i) {
        switch (i) {
            case 0:
                return "DAILY";
            case 1:
                return "WEEKLY";
            case 2:
                return "ALL_TIME";
            default:
                throw new IllegalArgumentException("Unknown time span " + i);
        }
    }
}
