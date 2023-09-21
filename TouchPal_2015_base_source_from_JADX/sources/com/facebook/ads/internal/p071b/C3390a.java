package com.facebook.ads.internal.p071b;

import com.facebook.ads.internal.C3404f;

/* renamed from: com.facebook.ads.internal.b.a */
public enum C3390a {
    UNKNOWN,
    BANNER,
    INTERSTITIAL,
    NATIVE;

    /* renamed from: com.facebook.ads.internal.b.a$1 */
    static /* synthetic */ class C33911 {

        /* renamed from: b */
        static final /* synthetic */ int[] f14791b = null;

        static {
            f14791b = new int[C3390a.values().length];
            try {
                f14791b[C3390a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f14791b[C3390a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f14791b[C3390a.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            f14790a = new int[C3404f.values().length];
            try {
                f14790a[C3404f.NATIVE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f14790a[C3404f.WEBVIEW_BANNER_50.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f14790a[C3404f.WEBVIEW_BANNER_90.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f14790a[C3404f.WEBVIEW_BANNER_LEGACY.ordinal()] = 4;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f14790a[C3404f.NATIVE_250.ordinal()] = 5;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f14790a[C3404f.WEBVIEW_INTERSTITIAL_HORIZONTAL.ordinal()] = 6;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f14790a[C3404f.WEBVIEW_INTERSTITIAL_VERTICAL.ordinal()] = 7;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f14790a[C3404f.WEBVIEW_INTERSTITIAL_TABLET.ordinal()] = 8;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f14790a[C3404f.WEBVIEW_INTERSTITIAL_UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError e12) {
            }
        }
    }

    /* renamed from: a */
    public static C3390a m14932a(C3404f fVar) {
        switch (fVar) {
            case NATIVE_UNKNOWN:
                return NATIVE;
            case WEBVIEW_BANNER_50:
            case WEBVIEW_BANNER_90:
            case WEBVIEW_BANNER_LEGACY:
            case NATIVE_250:
                return BANNER;
            case WEBVIEW_INTERSTITIAL_HORIZONTAL:
            case WEBVIEW_INTERSTITIAL_VERTICAL:
            case WEBVIEW_INTERSTITIAL_TABLET:
            case WEBVIEW_INTERSTITIAL_UNKNOWN:
                return INTERSTITIAL;
            default:
                return UNKNOWN;
        }
    }
}
