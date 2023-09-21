package com.facebook.ads.internal.p077h;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.internal.h.u */
public class C3455u {

    /* renamed from: a */
    static final int f15010a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    static final ExecutorService f15011b = Executors.newFixedThreadPool(f15010a);

    /* renamed from: c */
    private static volatile boolean f15012c = true;

    /* renamed from: d */
    private final Bitmap f15013d;

    /* renamed from: e */
    private Bitmap f15014e;

    /* renamed from: f */
    private final C3444k f15015f = new C3449p();

    public C3455u(Bitmap bitmap) {
        this.f15013d = bitmap;
    }

    /* renamed from: a */
    public Bitmap mo10786a() {
        return this.f15014e;
    }

    /* renamed from: a */
    public Bitmap mo10787a(int i) {
        this.f15014e = this.f15015f.mo10769a(this.f15013d, (float) i);
        return this.f15014e;
    }
}
