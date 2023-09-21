package com.p023a.p024a.p025a.p030b.p031a;

import android.graphics.Bitmap;
import com.p023a.p024a.p025a.p030b.C0738b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.a.a.a.b.a.a */
/* compiled from: FIFOLimitedMemoryCache */
public class C0730a extends C0738b {

    /* renamed from: a */
    private final List<Bitmap> f1805a = Collections.synchronizedList(new LinkedList());

    public C0730a(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo2736a(String str, Bitmap bitmap) {
        if (!super.mo2736a(str, bitmap)) {
            return false;
        }
        this.f1805a.add(bitmap);
        return true;
    }

    /* renamed from: b */
    public Bitmap mo2733a(String str) {
        Bitmap a = super.mo2739b(str);
        if (a != null) {
            this.f1805a.remove(a);
        }
        return super.mo2733a(str);
    }

    /* renamed from: b */
    public void mo2740b() {
        this.f1805a.clear();
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
        return this.f1805a.remove(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Reference<Bitmap> mo2734a(Bitmap bitmap) {
        return new WeakReference(bitmap);
    }
}
