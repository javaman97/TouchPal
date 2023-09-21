package com.facebook.ads.internal.p076g;

import android.support.p001v4.p013h.C0262a;
import com.facebook.ads.internal.p077h.C3456v;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.g.a */
public enum C3416a {
    UNKNOWN(C0262a.f648a),
    BANNER("banner"),
    INTERSTITIAL("interstitial"),
    NATIVE("native");
    

    /* renamed from: e */
    private String f14914e;

    private C3416a(String str) {
        this.f14914e = str;
    }

    /* renamed from: a */
    public static C3416a m15010a(String str) {
        if (C3456v.m15103a(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (Exception e) {
            return UNKNOWN;
        }
    }

    public String toString() {
        return this.f14914e;
    }
}
