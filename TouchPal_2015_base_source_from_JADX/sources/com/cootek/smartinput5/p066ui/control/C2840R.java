package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.cootek.smartinput5.p066ui.control.C2875t;

/* renamed from: com.cootek.smartinput5.ui.control.R */
/* compiled from: SpecialEdgeDevice */
public enum C2840R implements C2875t.C2876a {
    samsung_galaxy_s6_edge,
    regular_device;

    /* renamed from: b */
    public abstract String mo9375b();

    /* renamed from: c */
    public abstract String mo9376c();

    /* renamed from: a */
    public static C2875t.C2876a m13035a(Context context) {
        for (C2840R r : values()) {
            String b = r.mo9375b();
            String c = r.mo9376c();
            if (m13036a(b) && m13037b(c)) {
                return r;
            }
        }
        return regular_device;
    }

    /* renamed from: a */
    private static boolean m13036a(String str) {
        return TextUtils.equals(str, Build.MANUFACTURER);
    }

    /* renamed from: b */
    private static boolean m13037b(String str) {
        return TextUtils.equals(str, Build.MODEL);
    }
}
