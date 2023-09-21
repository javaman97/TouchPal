package com.p023a.p024a.p025a.p030b;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.a.a.a.b.a */
/* compiled from: BaseMemoryCache */
public abstract class C0729a implements C0739c {

    /* renamed from: a */
    private final Map<String, Reference<Bitmap>> f1804a = Collections.synchronizedMap(new HashMap());

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Reference<Bitmap> mo2734a(Bitmap bitmap);

    /* renamed from: a */
    public Bitmap mo2739b(String str) {
        Reference reference = this.f1804a.get(str);
        if (reference != null) {
            return (Bitmap) reference.get();
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo2736a(String str, Bitmap bitmap) {
        this.f1804a.put(str, mo2734a(bitmap));
        return true;
    }

    /* renamed from: b */
    public Bitmap mo2733a(String str) {
        Reference remove = this.f1804a.remove(str);
        if (remove == null) {
            return null;
        }
        return (Bitmap) remove.get();
    }

    /* renamed from: a */
    public Collection<String> mo2735a() {
        HashSet hashSet;
        synchronized (this.f1804a) {
            hashSet = new HashSet(this.f1804a.keySet());
        }
        return hashSet;
    }

    /* renamed from: b */
    public void mo2740b() {
        this.f1804a.clear();
    }
}
