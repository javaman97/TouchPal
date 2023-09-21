package com.facebook.ads.internal;

import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.e */
public enum C3397e {
    APP_AD(0),
    LINK_AD(1),
    APP_AD_V2(2),
    LINK_AD_V2(3),
    APP_ENGAGEMENT_AD(4),
    AD_CHOICES(5),
    JS_TRIGGER(6),
    JS_TRIGGER_NO_AUTO_IMP_LOGGING(7),
    VIDEO_AD(8),
    INLINE_VIDEO_AD(9),
    BANNER_TO_INTERSTITIAL(10),
    NATIVE_CLOSE_BUTTON(11);
    

    /* renamed from: n */
    private static final C3397e[] f14814n = null;

    /* renamed from: o */
    private static final String f14815o = null;

    /* renamed from: m */
    private final int f14817m;

    static {
        int i;
        f14814n = new C3397e[]{LINK_AD_V2, APP_ENGAGEMENT_AD, AD_CHOICES, JS_TRIGGER_NO_AUTO_IMP_LOGGING, NATIVE_CLOSE_BUTTON};
        JSONArray jSONArray = new JSONArray();
        for (C3397e a : f14814n) {
            jSONArray.put(a.mo10682a());
        }
        f14815o = jSONArray.toString();
    }

    private C3397e(int i) {
        this.f14817m = i;
    }

    /* renamed from: b */
    public static String m14942b() {
        return f14815o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo10682a() {
        return this.f14817m;
    }
}
