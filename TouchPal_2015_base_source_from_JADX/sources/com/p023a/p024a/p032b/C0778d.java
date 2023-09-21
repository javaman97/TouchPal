package com.p023a.p024a.p032b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.p023a.p024a.p025a.p026a.C0725b;
import com.p023a.p024a.p025a.p030b.C0739c;
import com.p023a.p024a.p032b.C0768c;
import com.p023a.p024a.p032b.p033a.C0757e;
import com.p023a.p024a.p032b.p033a.C0758f;
import com.p023a.p024a.p032b.p033a.C0760h;
import com.p023a.p024a.p032b.p038e.C0790a;
import com.p023a.p024a.p032b.p038e.C0791b;
import com.p023a.p024a.p032b.p038e.C0792c;
import com.p023a.p024a.p032b.p039f.C0795a;
import com.p023a.p024a.p032b.p039f.C0796b;
import com.p023a.p024a.p032b.p039f.C0798d;
import com.p023a.p024a.p041c.C0809b;
import com.p023a.p024a.p041c.C0813d;
import com.p023a.p024a.p041c.C0814e;

/* renamed from: com.a.a.b.d */
/* compiled from: ImageLoader */
public class C0778d {

    /* renamed from: a */
    public static final String f1960a = C0778d.class.getSimpleName();

    /* renamed from: b */
    static final String f1961b = "Initialize ImageLoader with configuration";

    /* renamed from: c */
    static final String f1962c = "Destroy ImageLoader";

    /* renamed from: d */
    static final String f1963d = "Load image from memory cache [%s]";

    /* renamed from: e */
    private static final String f1964e = "Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.";

    /* renamed from: f */
    private static final String f1965f = "Wrong arguments were passed to displayImage() method (ImageView reference must not be null)";

    /* renamed from: g */
    private static final String f1966g = "ImageLoader must be init with configuration before using";

    /* renamed from: h */
    private static final String f1967h = "ImageLoader configuration can not be initialized with null";

    /* renamed from: l */
    private static volatile C0778d f1968l;

    /* renamed from: i */
    private C0785e f1969i;

    /* renamed from: j */
    private C0794f f1970j;

    /* renamed from: k */
    private final C0795a f1971k = new C0798d();

    /* renamed from: a */
    public static C0778d m4415a() {
        if (f1968l == null) {
            synchronized (C0778d.class) {
                if (f1968l == null) {
                    f1968l = new C0778d();
                }
            }
        }
        return f1968l;
    }

    protected C0778d() {
    }

    /* renamed from: a */
    public synchronized void mo2904a(C0785e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException(f1967h);
        } else if (this.f1969i == null) {
            C0813d.m4622a(f1961b, new Object[0]);
            this.f1970j = new C0794f(eVar);
            this.f1969i = eVar;
        } else {
            C0813d.m4629c(f1964e, new Object[0]);
        }
    }

    /* renamed from: b */
    public boolean mo2924b() {
        return this.f1969i != null;
    }

    /* renamed from: a */
    public void mo2914a(String str, C0790a aVar) {
        mo2917a(str, aVar, (C0768c) null, (C0795a) null, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2918a(String str, C0790a aVar, C0795a aVar2) {
        mo2917a(str, aVar, (C0768c) null, aVar2, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2915a(String str, C0790a aVar, C0768c cVar) {
        mo2917a(str, aVar, cVar, (C0795a) null, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2916a(String str, C0790a aVar, C0768c cVar, C0795a aVar2) {
        mo2917a(str, aVar, cVar, aVar2, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2917a(String str, C0790a aVar, C0768c cVar, C0795a aVar2, C0796b bVar) {
        C0795a aVar3;
        C0768c cVar2;
        m4416m();
        if (aVar == null) {
            throw new IllegalArgumentException(f1965f);
        }
        if (aVar2 == null) {
            aVar3 = this.f1971k;
        } else {
            aVar3 = aVar2;
        }
        if (cVar == null) {
            cVar2 = this.f1969i.f2011r;
        } else {
            cVar2 = cVar;
        }
        if (TextUtils.isEmpty(str)) {
            this.f1970j.mo2993b(aVar);
            aVar3.mo3000a(str, aVar.mo2978d());
            if (cVar2.mo2846b()) {
                aVar.mo2975a(cVar2.mo2845b(this.f1969i.f1994a));
            } else {
                aVar.mo2975a((Drawable) null);
            }
            aVar3.mo2936a(str, aVar.mo2978d(), (Bitmap) null);
            return;
        }
        C0757e a = C0809b.m4612a(aVar, this.f1969i.mo2947a());
        String a2 = C0814e.m4631a(str, a);
        this.f1970j.mo2987a(aVar, a2);
        aVar3.mo3000a(str, aVar.mo2978d());
        Bitmap bitmap = (Bitmap) this.f1969i.f2007n.mo2739b(a2);
        if (bitmap == null || bitmap.isRecycled()) {
            if (cVar2.mo2844a()) {
                aVar.mo2975a(cVar2.mo2843a(this.f1969i.f1994a));
            } else if (cVar2.mo2852g()) {
                aVar.mo2975a((Drawable) null);
            }
            C0802i iVar = new C0802i(this.f1970j, new C0801h(str, aVar, a, a2, cVar2, aVar3, bVar, this.f1970j.mo2985a(str)), m4414a(cVar2));
            if (cVar2.mo2864s()) {
                iVar.run();
            } else {
                this.f1970j.mo2988a(iVar);
            }
        } else {
            C0813d.m4622a(f1963d, a2);
            if (cVar2.mo2850e()) {
                C0807m mVar = new C0807m(this.f1970j, bitmap, new C0801h(str, aVar, a, a2, cVar2, aVar3, bVar, this.f1970j.mo2985a(str)), m4414a(cVar2));
                if (cVar2.mo2864s()) {
                    mVar.run();
                } else {
                    this.f1970j.mo2989a(mVar);
                }
            } else {
                cVar2.mo2862q().mo2892a(bitmap, aVar, C0758f.MEMORY_CACHE);
                aVar3.mo2936a(str, aVar.mo2978d(), bitmap);
            }
        }
    }

    /* renamed from: a */
    public void mo2905a(String str, ImageView imageView) {
        mo2917a(str, (C0790a) new C0791b(imageView), (C0768c) null, (C0795a) null, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2906a(String str, ImageView imageView, C0768c cVar) {
        mo2917a(str, (C0790a) new C0791b(imageView), cVar, (C0795a) null, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2909a(String str, ImageView imageView, C0795a aVar) {
        mo2917a(str, (C0790a) new C0791b(imageView), (C0768c) null, aVar, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2907a(String str, ImageView imageView, C0768c cVar, C0795a aVar) {
        mo2908a(str, imageView, cVar, aVar, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2908a(String str, ImageView imageView, C0768c cVar, C0795a aVar, C0796b bVar) {
        mo2917a(str, (C0790a) new C0791b(imageView), cVar, aVar, bVar);
    }

    /* renamed from: a */
    public void mo2919a(String str, C0795a aVar) {
        mo2911a(str, (C0757e) null, (C0768c) null, aVar, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2912a(String str, C0757e eVar, C0795a aVar) {
        mo2911a(str, eVar, (C0768c) null, aVar, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2913a(String str, C0768c cVar, C0795a aVar) {
        mo2911a(str, (C0757e) null, cVar, aVar, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2910a(String str, C0757e eVar, C0768c cVar, C0795a aVar) {
        mo2911a(str, eVar, cVar, aVar, (C0796b) null);
    }

    /* renamed from: a */
    public void mo2911a(String str, C0757e eVar, C0768c cVar, C0795a aVar, C0796b bVar) {
        C0768c cVar2;
        m4416m();
        if (eVar == null) {
            eVar = this.f1969i.mo2947a();
        }
        if (cVar == null) {
            cVar2 = this.f1969i.f2011r;
        } else {
            cVar2 = cVar;
        }
        mo2917a(str, (C0790a) new C0792c(str, eVar, C0760h.CROP), cVar2, aVar, bVar);
    }

    /* renamed from: a */
    public Bitmap mo2898a(String str) {
        return mo2900a(str, (C0757e) null, (C0768c) null);
    }

    /* renamed from: a */
    public Bitmap mo2901a(String str, C0768c cVar) {
        return mo2900a(str, (C0757e) null, cVar);
    }

    /* renamed from: a */
    public Bitmap mo2899a(String str, C0757e eVar) {
        return mo2900a(str, eVar, (C0768c) null);
    }

    /* renamed from: a */
    public Bitmap mo2900a(String str, C0757e eVar, C0768c cVar) {
        if (cVar == null) {
            cVar = this.f1969i.f2011r;
        }
        C0768c d = new C0768c.C0770a().mo2873a(cVar).mo2891f(true).mo2888d();
        C0780a aVar = new C0780a();
        mo2910a(str, eVar, d, (C0795a) aVar);
        return aVar.mo2935a();
    }

    /* renamed from: m */
    private void m4416m() {
        if (this.f1969i == null) {
            throw new IllegalStateException(f1966g);
        }
    }

    /* renamed from: c */
    public C0739c mo2925c() {
        m4416m();
        return this.f1969i.f2007n;
    }

    /* renamed from: d */
    public void mo2926d() {
        m4416m();
        this.f1969i.f2007n.mo2740b();
    }

    @Deprecated
    /* renamed from: e */
    public C0725b mo2927e() {
        return mo2928f();
    }

    /* renamed from: f */
    public C0725b mo2928f() {
        m4416m();
        return this.f1969i.f2008o;
    }

    @Deprecated
    /* renamed from: g */
    public void mo2929g() {
        mo2930h();
    }

    /* renamed from: h */
    public void mo2930h() {
        m4416m();
        this.f1969i.f2008o.mo2684c();
    }

    /* renamed from: a */
    public String mo2903a(C0790a aVar) {
        return this.f1970j.mo2984a(aVar);
    }

    /* renamed from: a */
    public String mo2902a(ImageView imageView) {
        return this.f1970j.mo2984a((C0790a) new C0791b(imageView));
    }

    /* renamed from: b */
    public void mo2922b(C0790a aVar) {
        this.f1970j.mo2993b(aVar);
    }

    /* renamed from: b */
    public void mo2921b(ImageView imageView) {
        this.f1970j.mo2993b((C0790a) new C0791b(imageView));
    }

    /* renamed from: a */
    public void mo2920a(boolean z) {
        this.f1970j.mo2991a(z);
    }

    /* renamed from: b */
    public void mo2923b(boolean z) {
        this.f1970j.mo2994b(z);
    }

    /* renamed from: i */
    public void mo2931i() {
        this.f1970j.mo2986a();
    }

    /* renamed from: j */
    public void mo2932j() {
        this.f1970j.mo2992b();
    }

    /* renamed from: k */
    public void mo2933k() {
        this.f1970j.mo2995c();
    }

    /* renamed from: l */
    public void mo2934l() {
        if (this.f1969i != null) {
            C0813d.m4622a(f1962c, new Object[0]);
        }
        mo2933k();
        this.f1969i.f2008o.mo2682b();
        this.f1970j = null;
        this.f1969i = null;
    }

    /* renamed from: a */
    private static Handler m4414a(C0768c cVar) {
        Handler r = cVar.mo2863r();
        if (cVar.mo2864s()) {
            return null;
        }
        if (r == null && Looper.myLooper() == Looper.getMainLooper()) {
            return new Handler();
        }
        return r;
    }

    /* renamed from: com.a.a.b.d$a */
    /* compiled from: ImageLoader */
    private static class C0780a extends C0798d {

        /* renamed from: a */
        private Bitmap f1972a;

        private C0780a() {
        }

        /* renamed from: a */
        public void mo2936a(String str, View view, Bitmap bitmap) {
            this.f1972a = bitmap;
        }

        /* renamed from: a */
        public Bitmap mo2935a() {
            return this.f1972a;
        }
    }
}
