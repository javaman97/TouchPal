package com.google.android.gms.internal;

import android.os.Build;

/* renamed from: com.google.android.gms.internal.as */
public final class C3608as {
    /* renamed from: an */
    public static boolean m15697an() {
        return m15703x(11);
    }

    /* renamed from: ao */
    public static boolean m15698ao() {
        return m15703x(12);
    }

    /* renamed from: ap */
    public static boolean m15699ap() {
        return m15703x(13);
    }

    /* renamed from: aq */
    public static boolean m15700aq() {
        return m15703x(14);
    }

    /* renamed from: ar */
    public static boolean m15701ar() {
        return m15703x(16);
    }

    /* renamed from: as */
    public static boolean m15702as() {
        return m15703x(17);
    }

    /* renamed from: x */
    private static boolean m15703x(int i) {
        return Build.VERSION.SDK_INT >= i;
    }
}
