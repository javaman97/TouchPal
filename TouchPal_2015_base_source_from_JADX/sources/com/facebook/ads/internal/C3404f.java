package com.facebook.ads.internal;

import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.facebook.ads.internal.f */
public enum C3404f {
    UNKNOWN(0),
    WEBVIEW_BANNER_LEGACY(4),
    WEBVIEW_BANNER_50(5),
    WEBVIEW_BANNER_90(6),
    WEBVIEW_INTERSTITIAL_UNKNOWN(100),
    WEBVIEW_INTERSTITIAL_HORIZONTAL(Settings.HANDWRITE_WIDTH),
    WEBVIEW_INTERSTITIAL_VERTICAL(102),
    WEBVIEW_INTERSTITIAL_TABLET(Settings.IME_CUR_VERSION),
    NATIVE_UNKNOWN(200),
    NATIVE_250(Settings.ACTIVATE_IDENTIFIER);
    

    /* renamed from: k */
    private final int f14876k;

    private C3404f(int i) {
        this.f14876k = i;
    }

    /* renamed from: a */
    public int mo10703a() {
        return this.f14876k;
    }
}
