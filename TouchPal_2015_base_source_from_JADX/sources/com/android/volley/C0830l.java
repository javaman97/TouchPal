package com.android.volley;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.android.volley.l */
/* compiled from: NetworkResponse */
public class C0830l {

    /* renamed from: a */
    public final int f2184a;

    /* renamed from: b */
    public final byte[] f2185b;

    /* renamed from: c */
    public final Map<String, String> f2186c;

    /* renamed from: d */
    public final boolean f2187d;

    public C0830l(int i, byte[] bArr, Map<String, String> map, boolean z) {
        this.f2184a = i;
        this.f2185b = bArr;
        this.f2186c = map;
        this.f2187d = z;
    }

    public C0830l(byte[] bArr) {
        this(200, bArr, Collections.emptyMap(), false);
    }

    public C0830l(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false);
    }
}
