package com.p023a.p024a.p025a.p030b.p031a;

import android.graphics.Bitmap;
import com.p023a.p024a.p025a.p030b.C0738b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.a.a.a.b.a.c */
/* compiled from: LRULimitedMemoryCache */
public class C0732c extends C0738b {

    /* renamed from: a */
    private static final int f1808a = 10;

    /* renamed from: b */
    private static final float f1809b = 1.1f;

    /* renamed from: c */
    private final Map<String, Bitmap> f1810c = Collections.synchronizedMap(new LinkedHashMap(10, f1809b, true));

    public C0732c(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo2736a(String str, Bitmap bitmap) {
        if (!super.mo2736a(str, bitmap)) {
            return false;
        }
        this.f1810c.put(str, bitmap);
        return true;
    }

    /* renamed from: a */
    public Bitmap mo2739b(String str) {
        this.f1810c.get(str);
        return super.mo2739b(str);
    }

    /* renamed from: b */
    public Bitmap mo2733a(String str) {
        this.f1810c.remove(str);
        return super.mo2733a(str);
    }

    /* renamed from: b */
    public void mo2740b() {
        this.f1810c.clear();
        super.mo2740b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo2741b(Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Bitmap mo2742d() {
        Bitmap bitmap = null;
        synchronized (this.f1810c) {
            Iterator<Map.Entry<String, Bitmap>> it = this.f1810c.entrySet().iterator();
            if (it.hasNext()) {
                bitmap = (Bitmap) it.next().getValue();
                it.remove();
            }
        }
        return bitmap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Reference<Bitmap> mo2734a(Bitmap bitmap) {
        return new WeakReference(bitmap);
    }
}
