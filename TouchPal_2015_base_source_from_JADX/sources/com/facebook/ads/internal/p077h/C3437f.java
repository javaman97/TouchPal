package com.facebook.ads.internal.p077h;

import java.util.Locale;

/* renamed from: com.facebook.ads.internal.h.f */
public enum C3437f {
    NONE,
    INSTALLED,
    NOT_INSTALLED;

    /* renamed from: a */
    public static C3437f m15057a(String str) {
        if (C3456v.m15103a(str)) {
            return NONE;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException e) {
            return NONE;
        }
    }
}
