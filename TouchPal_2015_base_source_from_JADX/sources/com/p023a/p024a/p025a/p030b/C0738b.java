package com.p023a.p024a.p025a.p030b;

import android.graphics.Bitmap;
import com.p023a.p024a.p041c.C0813d;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.a.a.a.b.b */
/* compiled from: LimitedMemoryCache */
public abstract class C0738b extends C0729a {

    /* renamed from: a */
    private static final int f1819a = 16;

    /* renamed from: b */
    private static final int f1820b = 16777216;

    /* renamed from: c */
    private final int f1821c;

    /* renamed from: d */
    private final AtomicInteger f1822d;

    /* renamed from: e */
    private final List<Bitmap> f1823e = Collections.synchronizedList(new LinkedList());

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo2741b(Bitmap bitmap);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Bitmap mo2742d();

    public C0738b(int i) {
        this.f1821c = i;
        this.f1822d = new AtomicInteger();
        if (i > 16777216) {
            C0813d.m4629c("You set too large memory cache size (more than %1$d Mb)", 16);
        }
    }

    /* renamed from: a */
    public boolean mo2736a(String str, Bitmap bitmap) {
        boolean z = false;
        int b = mo2741b(bitmap);
        int c = mo2753c();
        int i = this.f1822d.get();
        if (b < c) {
            int i2 = i;
            while (i2 + b > c) {
                Bitmap d = mo2742d();
                if (this.f1823e.remove(d)) {
                    i2 = this.f1822d.addAndGet(-mo2741b(d));
                }
            }
            this.f1823e.add(bitmap);
            this.f1822d.addAndGet(b);
            z = true;
        }
        super.mo2736a(str, bitmap);
        return z;
    }

    /* renamed from: b */
    public Bitmap mo2733a(String str) {
        Bitmap a = super.mo2739b(str);
        if (a != null && this.f1823e.remove(a)) {
            this.f1822d.addAndGet(-mo2741b(a));
        }
        return super.mo2733a(str);
    }

    /* renamed from: b */
    public void mo2740b() {
        this.f1823e.clear();
        this.f1822d.set(0);
        super.mo2740b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo2753c() {
        return this.f1821c;
    }
}
