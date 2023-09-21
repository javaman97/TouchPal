package com.p023a.p024a.p032b;

import android.graphics.Bitmap;
import com.p023a.p024a.p032b.p033a.C0758f;
import com.p023a.p024a.p032b.p036c.C0771a;
import com.p023a.p024a.p032b.p038e.C0790a;
import com.p023a.p024a.p032b.p039f.C0795a;
import com.p023a.p024a.p041c.C0813d;

/* renamed from: com.a.a.b.b */
/* compiled from: DisplayBitmapTask */
final class C0762b implements Runnable {

    /* renamed from: a */
    private static final String f1879a = "Display image in ImageAware (loaded from %1$s) [%2$s]";

    /* renamed from: b */
    private static final String f1880b = "ImageAware is reused for another image. Task is cancelled. [%s]";

    /* renamed from: c */
    private static final String f1881c = "ImageAware was collected by GC. Task is cancelled. [%s]";

    /* renamed from: d */
    private final Bitmap f1882d;

    /* renamed from: e */
    private final String f1883e;

    /* renamed from: f */
    private final C0790a f1884f;

    /* renamed from: g */
    private final String f1885g;

    /* renamed from: h */
    private final C0771a f1886h;

    /* renamed from: i */
    private final C0795a f1887i;

    /* renamed from: j */
    private final C0794f f1888j;

    /* renamed from: k */
    private final C0758f f1889k;

    public C0762b(Bitmap bitmap, C0801h hVar, C0794f fVar, C0758f fVar2) {
        this.f1882d = bitmap;
        this.f1883e = hVar.f2071a;
        this.f1884f = hVar.f2073c;
        this.f1885g = hVar.f2072b;
        this.f1886h = hVar.f2075e.mo2862q();
        this.f1887i = hVar.f2076f;
        this.f1888j = fVar;
        this.f1889k = fVar2;
    }

    public void run() {
        if (this.f1884f.mo2979e()) {
            C0813d.m4622a(f1881c, this.f1885g);
            this.f1887i.mo3002b(this.f1883e, this.f1884f.mo2978d());
        } else if (m4297a()) {
            C0813d.m4622a(f1880b, this.f1885g);
            this.f1887i.mo3002b(this.f1883e, this.f1884f.mo2978d());
        } else {
            C0813d.m4622a(f1879a, this.f1889k, this.f1885g);
            this.f1886h.mo2892a(this.f1882d, this.f1884f, this.f1889k);
            this.f1888j.mo2993b(this.f1884f);
            this.f1887i.mo2936a(this.f1883e, this.f1884f.mo2978d(), this.f1882d);
        }
    }

    /* renamed from: a */
    private boolean m4297a() {
        return !this.f1885g.equals(this.f1888j.mo2984a(this.f1884f));
    }
}
