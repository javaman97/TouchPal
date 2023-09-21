package com.facebook.ads;

import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.facebook.ads.k */
public enum C3496k {
    BANNER_320_50(Settings.CLIPBOARD_NOTIFICATION_SHOWN, 50),
    INTERSTITIAL(0, 0),
    BANNER_HEIGHT_50(-1, 50),
    BANNER_HEIGHT_90(-1, 90),
    RECTANGLE_HEIGHT_250(-1, Settings.VIBRATE_TIME);
    

    /* renamed from: f */
    private final int f15134f;

    /* renamed from: g */
    private final int f15135g;

    private C3496k(int i, int i2) {
        this.f15134f = i;
        this.f15135g = i2;
    }

    /* renamed from: a */
    public int mo10840a() {
        return this.f15134f;
    }

    /* renamed from: b */
    public int mo10841b() {
        return this.f15135g;
    }
}
