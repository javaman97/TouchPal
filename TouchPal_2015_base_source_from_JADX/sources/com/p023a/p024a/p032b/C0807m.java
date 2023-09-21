package com.p023a.p024a.p032b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.p023a.p024a.p032b.p033a.C0758f;
import com.p023a.p024a.p041c.C0813d;

/* renamed from: com.a.a.b.m */
/* compiled from: ProcessAndDisplayImageTask */
final class C0807m implements Runnable {

    /* renamed from: a */
    private static final String f2124a = "PostProcess image before displaying [%s]";

    /* renamed from: b */
    private final C0794f f2125b;

    /* renamed from: c */
    private final Bitmap f2126c;

    /* renamed from: d */
    private final C0801h f2127d;

    /* renamed from: e */
    private final Handler f2128e;

    public C0807m(C0794f fVar, Bitmap bitmap, C0801h hVar, Handler handler) {
        this.f2125b = fVar;
        this.f2126c = bitmap;
        this.f2127d = hVar;
        this.f2128e = handler;
    }

    public void run() {
        C0813d.m4622a(f2124a, this.f2127d.f2072b);
        C0802i.m4587a(new C0762b(this.f2127d.f2075e.mo2861p().mo3007a(this.f2126c), this.f2127d, this.f2125b, C0758f.MEMORY_CACHE), this.f2127d.f2075e.mo2864s(), this.f2128e, this.f2125b);
    }
}
