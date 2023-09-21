package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.C0833o;
import com.android.volley.C0837q;
import com.android.volley.C0840s;
import com.android.volley.C0883x;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: com.android.volley.toolbox.l */
/* compiled from: ImageLoader */
public class C0861l {

    /* renamed from: a */
    private final C0837q f2281a;

    /* renamed from: b */
    private int f2282b = 100;

    /* renamed from: c */
    private final C0863b f2283c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashMap<String, C0862a> f2284d = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final HashMap<String, C0862a> f2285e = new HashMap<>();

    /* renamed from: f */
    private final Handler f2286f = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Runnable f2287g;

    /* renamed from: com.android.volley.toolbox.l$b */
    /* compiled from: ImageLoader */
    public interface C0863b {
        /* renamed from: a */
        Bitmap mo3137a(String str);

        /* renamed from: a */
        void mo3138a(String str, Bitmap bitmap);
    }

    /* renamed from: com.android.volley.toolbox.l$d */
    /* compiled from: ImageLoader */
    public interface C0865d extends C0840s.C0841a {
        /* renamed from: a */
        void mo3142a(C0864c cVar, boolean z);
    }

    public C0861l(C0837q qVar, C0863b bVar) {
        this.f2281a = qVar;
        this.f2283c = bVar;
    }

    /* renamed from: a */
    public static C0865d m4805a(ImageView imageView, int i, int i2) {
        return new C0866m(i2, imageView, i);
    }

    /* renamed from: a */
    public boolean mo3132a(String str, int i, int i2) {
        m4808a();
        return this.f2283c.mo3137a(m4814b(str, i, i2)) != null;
    }

    /* renamed from: a */
    public C0864c mo3129a(String str, C0865d dVar) {
        return mo3130a(str, dVar, 0, 0);
    }

    /* renamed from: a */
    public C0864c mo3130a(String str, C0865d dVar, int i, int i2) {
        m4808a();
        String b = m4814b(str, i, i2);
        Bitmap a = this.f2283c.mo3137a(b);
        if (a != null) {
            C0864c cVar = new C0864c(a, str, (String) null, (C0865d) null);
            dVar.mo3142a(cVar, true);
            return cVar;
        }
        C0864c cVar2 = new C0864c((Bitmap) null, str, b, dVar);
        dVar.mo3142a(cVar2, true);
        C0862a aVar = this.f2284d.get(b);
        if (aVar != null) {
            aVar.mo3134a(cVar2);
            return cVar2;
        }
        C0870q qVar = new C0870q(str, new C0867n(this, b), i, i2, Bitmap.Config.RGB_565, new C0868o(this, b));
        this.f2281a.mo3092a(qVar);
        this.f2284d.put(b, new C0862a(qVar, cVar2));
        return cVar2;
    }

    /* renamed from: a */
    public void mo3131a(int i) {
        this.f2282b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4811a(String str, Bitmap bitmap) {
        this.f2283c.mo3138a(str, bitmap);
        C0862a remove = this.f2284d.remove(str);
        if (remove != null) {
            Bitmap unused = remove.f2290c = bitmap;
            m4812a(str, remove);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4813a(String str, C0883x xVar) {
        C0862a remove = this.f2284d.remove(str);
        if (remove != null) {
            remove.mo3135a(xVar);
            m4812a(str, remove);
        }
    }

    /* renamed from: com.android.volley.toolbox.l$c */
    /* compiled from: ImageLoader */
    public class C0864c {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Bitmap f2294b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C0865d f2295c;

        /* renamed from: d */
        private final String f2296d;

        /* renamed from: e */
        private final String f2297e;

        public C0864c(Bitmap bitmap, String str, String str2, C0865d dVar) {
            this.f2294b = bitmap;
            this.f2297e = str;
            this.f2296d = str2;
            this.f2295c = dVar;
        }

        /* renamed from: a */
        public void mo3139a() {
            if (this.f2295c != null) {
                C0862a aVar = (C0862a) C0861l.this.f2284d.get(this.f2296d);
                if (aVar == null) {
                    C0862a aVar2 = (C0862a) C0861l.this.f2285e.get(this.f2296d);
                    if (aVar2 != null) {
                        aVar2.mo3136b(this);
                        if (aVar2.f2292e.size() == 0) {
                            C0861l.this.f2285e.remove(this.f2296d);
                        }
                    }
                } else if (aVar.mo3136b(this)) {
                    C0861l.this.f2284d.remove(this.f2296d);
                }
            }
        }

        /* renamed from: b */
        public Bitmap mo3140b() {
            return this.f2294b;
        }

        /* renamed from: c */
        public String mo3141c() {
            return this.f2297e;
        }
    }

    /* renamed from: com.android.volley.toolbox.l$a */
    /* compiled from: ImageLoader */
    private class C0862a {

        /* renamed from: b */
        private final C0833o<?> f2289b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Bitmap f2290c;

        /* renamed from: d */
        private C0883x f2291d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final LinkedList<C0864c> f2292e = new LinkedList<>();

        public C0862a(C0833o<?> oVar, C0864c cVar) {
            this.f2289b = oVar;
            this.f2292e.add(cVar);
        }

        /* renamed from: a */
        public void mo3135a(C0883x xVar) {
            this.f2291d = xVar;
        }

        /* renamed from: a */
        public C0883x mo3133a() {
            return this.f2291d;
        }

        /* renamed from: a */
        public void mo3134a(C0864c cVar) {
            this.f2292e.add(cVar);
        }

        /* renamed from: b */
        public boolean mo3136b(C0864c cVar) {
            this.f2292e.remove(cVar);
            if (this.f2292e.size() != 0) {
                return false;
            }
            this.f2289b.mo3073i();
            return true;
        }
    }

    /* renamed from: a */
    private void m4812a(String str, C0862a aVar) {
        this.f2285e.put(str, aVar);
        if (this.f2287g == null) {
            this.f2287g = new C0869p(this);
            this.f2286f.postDelayed(this.f2287g, (long) this.f2282b);
        }
    }

    /* renamed from: a */
    private void m4808a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
    }

    /* renamed from: b */
    private static String m4814b(String str, int i, int i2) {
        return new StringBuilder(str.length() + 12).append("#W").append(i).append("#H").append(i2).append(str).toString();
    }
}
