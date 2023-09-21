package com.facebook.ads.internal;

import com.cootek.smartinput5.net.cmd.C2261Q;
import com.facebook.ads.C3344h;

/* renamed from: com.facebook.ads.internal.a */
public enum C3346a {
    UNKNOWN_ERROR(-1, "unknown error", false),
    NETWORK_ERROR(1000, "Network Error", true),
    NO_FILL(1001, "No Fill", true),
    LOAD_TOO_FREQUENTLY(1002, "Ad was re-loaded too frequently", true),
    INVALID_PARAMETERS(C2261Q.f9802h, "Ad was requested with invalid parameters", true),
    SERVER_ERROR(2000, "Server Error", true),
    INTERNAL_ERROR(2001, "Internal Error", true),
    START_BEFORE_INIT(2004, "initAd must be called before startAd", true),
    AD_REQUEST_FAILED(1111, "Facebook Ads SDK request for ads failed", false),
    AD_REQUEST_TIMEOUT(1112, "Facebook Ads SDK request for ads timed out", false),
    PARSER_FAILURE(1201, "Failed to parse Facebook Ads SDK delivery response", false),
    UNKNOWN_RESPONSE(1202, "Unknown Facebook Ads SDK delivery response type", false),
    ERROR_MESSAGE(1203, "Facebook Ads SDK delivery response Error message", true),
    NO_AD_PLACEMENT(1302, "Facebook Ads SDK returned no ad placements", false);
    

    /* renamed from: o */
    private final int f14660o;

    /* renamed from: p */
    private final String f14661p;

    /* renamed from: q */
    private final boolean f14662q;

    private C3346a(int i, String str, boolean z) {
        this.f14660o = i;
        this.f14661p = str;
        this.f14662q = z;
    }

    /* renamed from: a */
    public static C3346a m14728a(int i) {
        for (C3346a aVar : values()) {
            if (aVar.mo10571a() == i) {
                return aVar;
            }
        }
        return UNKNOWN_ERROR;
    }

    /* renamed from: a */
    public int mo10571a() {
        return this.f14660o;
    }

    /* renamed from: a */
    public C3393c mo10572a(String str) {
        return new C3393c(this, str);
    }

    /* renamed from: b */
    public C3344h mo10573b(String str) {
        return new C3393c(this, str).mo10679b();
    }

    /* renamed from: b */
    public String mo10574b() {
        return this.f14661p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10575c() {
        return this.f14662q;
    }
}
