package com.facebook.ads;

import com.facebook.ads.internal.p077h.C3456v;
import com.google.android.gms.appstate.AppStateClient;

/* renamed from: com.facebook.ads.h */
public class C3344h {

    /* renamed from: a */
    public static final int f14632a = 1000;

    /* renamed from: b */
    public static final int f14633b = 1001;

    /* renamed from: c */
    public static final int f14634c = 1002;

    /* renamed from: d */
    public static final int f14635d = 2000;

    /* renamed from: e */
    public static final int f14636e = 2001;

    /* renamed from: f */
    public static final C3344h f14637f = new C3344h(1000, "Network Error");

    /* renamed from: g */
    public static final C3344h f14638g = new C3344h(1001, "No Fill");

    /* renamed from: h */
    public static final C3344h f14639h = new C3344h(1002, "Ad was re-loaded too frequently");

    /* renamed from: i */
    public static final C3344h f14640i = new C3344h(2000, "Server Error");

    /* renamed from: j */
    public static final C3344h f14641j = new C3344h(2001, "Internal Error");
    @Deprecated

    /* renamed from: k */
    public static final C3344h f14642k = new C3344h(AppStateClient.STATUS_STATE_KEY_NOT_FOUND, "Native ad failed to load due to missing properties");

    /* renamed from: l */
    private final int f14643l;

    /* renamed from: m */
    private final String f14644m;

    public C3344h(int i, String str) {
        str = C3456v.m15103a(str) ? "unknown error" : str;
        this.f14643l = i;
        this.f14644m = str;
    }

    /* renamed from: a */
    public int mo10569a() {
        return this.f14643l;
    }

    /* renamed from: b */
    public String mo10570b() {
        return this.f14644m;
    }
}
