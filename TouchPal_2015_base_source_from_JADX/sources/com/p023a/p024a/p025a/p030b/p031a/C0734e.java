package com.p023a.p024a.p025a.p030b.p031a;

import android.graphics.Bitmap;
import com.p023a.p024a.p025a.p030b.C0739c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.a.a.a.b.a.e */
/* compiled from: LimitedAgeMemoryCache */
public class C0734e implements C0739c {

    /* renamed from: a */
    private final C0739c f1812a;

    /* renamed from: b */
    private final long f1813b;

    /* renamed from: c */
    private final Map<String, Long> f1814c = Collections.synchronizedMap(new HashMap());

    public C0734e(C0739c cVar, long j) {
        this.f1812a = cVar;
        this.f1813b = 1000 * j;
    }

    /* renamed from: a */
    public boolean mo2736a(String str, Bitmap bitmap) {
        boolean a = this.f1812a.mo2736a(str, bitmap);
        if (a) {
            this.f1814c.put(str, Long.valueOf(System.currentTimeMillis()));
        }
        return a;
    }

    /* renamed from: a */
    public Bitmap mo2739b(String str) {
        Long l = this.f1814c.get(str);
        if (l != null && System.currentTimeMillis() - l.longValue() > this.f1813b) {
            this.f1812a.mo2733a(str);
            this.f1814c.remove(str);
        }
        return (Bitmap) this.f1812a.mo2739b(str);
    }

    /* renamed from: b */
    public Bitmap mo2733a(String str) {
        this.f1814c.remove(str);
        return (Bitmap) this.f1812a.mo2733a(str);
    }

    /* renamed from: a */
    public Collection<String> mo2735a() {
        return this.f1812a.mo2735a();
    }

    /* renamed from: b */
    public void mo2740b() {
        this.f1812a.mo2740b();
        this.f1814c.clear();
    }
}
