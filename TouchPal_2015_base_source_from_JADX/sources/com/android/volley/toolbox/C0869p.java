package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.toolbox.C0861l;
import java.util.Iterator;

/* renamed from: com.android.volley.toolbox.p */
/* compiled from: ImageLoader */
class C0869p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0861l f2305a;

    C0869p(C0861l lVar) {
        this.f2305a = lVar;
    }

    public void run() {
        for (C0861l.C0862a aVar : this.f2305a.f2285e.values()) {
            Iterator it = aVar.f2292e.iterator();
            while (it.hasNext()) {
                C0861l.C0864c cVar = (C0861l.C0864c) it.next();
                if (cVar.f2295c != null) {
                    if (aVar.mo3133a() == null) {
                        Bitmap unused = cVar.f2294b = aVar.f2290c;
                        cVar.f2295c.mo3142a(cVar, false);
                    } else {
                        cVar.f2295c.mo3102a(aVar.mo3133a());
                    }
                }
            }
        }
        this.f2305a.f2285e.clear();
        Runnable unused2 = this.f2305a.f2287g = null;
    }
}
