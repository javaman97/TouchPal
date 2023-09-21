package com.p023a.p024a.p025a.p030b.p031a;

import android.graphics.Bitmap;
import com.p023a.p024a.p025a.p030b.C0738b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.a.a.a.b.a.g */
/* compiled from: UsingFreqLimitedMemoryCache */
public class C0736g extends C0738b {

    /* renamed from: a */
    private final Map<Bitmap, Integer> f1818a = Collections.synchronizedMap(new HashMap());

    public C0736g(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo2736a(String str, Bitmap bitmap) {
        if (!super.mo2736a(str, bitmap)) {
            return false;
        }
        this.f1818a.put(bitmap, 0);
        return true;
    }

    /* renamed from: a */
    public Bitmap mo2739b(String str) {
        Integer num;
        Bitmap a = super.mo2739b(str);
        if (!(a == null || (num = this.f1818a.get(a)) == null)) {
            this.f1818a.put(a, Integer.valueOf(num.intValue() + 1));
        }
        return a;
    }

    /* renamed from: b */
    public Bitmap mo2733a(String str) {
        Bitmap a = super.mo2739b(str);
        if (a != null) {
            this.f1818a.remove(a);
        }
        return super.mo2733a(str);
    }

    /* renamed from: b */
    public void mo2740b() {
        this.f1818a.clear();
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
        Bitmap bitmap;
        Integer num;
        Bitmap bitmap2 = null;
        Set<Map.Entry<Bitmap, Integer>> entrySet = this.f1818a.entrySet();
        synchronized (this.f1818a) {
            Integer num2 = null;
            for (Map.Entry next : entrySet) {
                if (bitmap2 == null) {
                    bitmap = (Bitmap) next.getKey();
                    num = (Integer) next.getValue();
                } else {
                    Integer num3 = (Integer) next.getValue();
                    if (num3.intValue() < num2.intValue()) {
                        Bitmap bitmap3 = (Bitmap) next.getKey();
                        num = num3;
                        bitmap = bitmap3;
                    } else {
                        bitmap = bitmap2;
                        num = num2;
                    }
                }
                bitmap2 = bitmap;
                num2 = num;
            }
        }
        this.f1818a.remove(bitmap2);
        return bitmap2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Reference<Bitmap> mo2734a(Bitmap bitmap) {
        return new WeakReference(bitmap);
    }
}
