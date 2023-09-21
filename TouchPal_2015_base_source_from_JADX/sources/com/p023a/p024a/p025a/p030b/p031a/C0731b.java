package com.p023a.p024a.p025a.p030b.p031a;

import android.graphics.Bitmap;
import com.p023a.p024a.p025a.p030b.C0739c;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.a.a.a.b.a.b */
/* compiled from: FuzzyKeyMemoryCache */
public class C0731b implements C0739c {

    /* renamed from: a */
    private final C0739c f1806a;

    /* renamed from: b */
    private final Comparator<String> f1807b;

    public C0731b(C0739c cVar, Comparator<String> comparator) {
        this.f1806a = cVar;
        this.f1807b = comparator;
    }

    /* renamed from: a */
    public boolean mo2736a(String str, Bitmap bitmap) {
        String str2;
        synchronized (this.f1806a) {
            Iterator it = this.f1806a.mo2735a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = (String) it.next();
                if (this.f1807b.compare(str, str2) == 0) {
                    break;
                }
            }
            if (str2 != null) {
                this.f1806a.mo2733a(str2);
            }
        }
        return this.f1806a.mo2736a(str, bitmap);
    }

    /* renamed from: a */
    public Bitmap mo2739b(String str) {
        return (Bitmap) this.f1806a.mo2739b(str);
    }

    /* renamed from: b */
    public Bitmap mo2733a(String str) {
        return (Bitmap) this.f1806a.mo2733a(str);
    }

    /* renamed from: b */
    public void mo2740b() {
        this.f1806a.mo2740b();
    }

    /* renamed from: a */
    public Collection<String> mo2735a() {
        return this.f1806a.mo2735a();
    }
}
