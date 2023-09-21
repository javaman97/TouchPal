package com.google.android.gms.maps.internal;

/* renamed from: com.google.android.gms.maps.internal.a */
public final class C3847a {
    /* renamed from: a */
    public static Boolean m16760a(byte b) {
        switch (b) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static byte m16761b(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : 0;
        }
        return -1;
    }
}
