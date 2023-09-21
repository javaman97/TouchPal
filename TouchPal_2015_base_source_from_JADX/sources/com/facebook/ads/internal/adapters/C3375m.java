package com.facebook.ads.internal.adapters;

import java.util.Locale;

/* renamed from: com.facebook.ads.internal.adapters.m */
public enum C3375m {
    UNKNOWN,
    AN;

    /* renamed from: a */
    public static C3375m m14836a(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        try {
            return (C3375m) Enum.valueOf(C3375m.class, str.toUpperCase(Locale.getDefault()));
        } catch (Exception e) {
            return UNKNOWN;
        }
    }
}
