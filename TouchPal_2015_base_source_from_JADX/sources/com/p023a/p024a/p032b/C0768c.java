package com.p023a.p024a.p032b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.p023a.p024a.p032b.p033a.C0756d;
import com.p023a.p024a.p032b.p036c.C0771a;
import com.p023a.p024a.p032b.p040g.C0800a;

/* renamed from: com.a.a.b.c */
/* compiled from: DisplayImageOptions */
public final class C0768c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f1910a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f1911b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f1912c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Drawable f1913d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Drawable f1914e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Drawable f1915f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f1916g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final boolean f1917h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final boolean f1918i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C0756d f1919j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final BitmapFactory.Options f1920k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final int f1921l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final boolean f1922m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Object f1923n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C0800a f1924o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C0800a f1925p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C0771a f1926q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Handler f1927r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final boolean f1928s;

    private C0768c(C0770a aVar) {
        this.f1910a = aVar.f1929a;
        this.f1911b = aVar.f1930b;
        this.f1912c = aVar.f1931c;
        this.f1913d = aVar.f1932d;
        this.f1914e = aVar.f1933e;
        this.f1915f = aVar.f1934f;
        this.f1916g = aVar.f1935g;
        this.f1917h = aVar.f1936h;
        this.f1918i = aVar.f1937i;
        this.f1919j = aVar.f1938j;
        this.f1920k = aVar.f1939k;
        this.f1921l = aVar.f1940l;
        this.f1922m = aVar.f1941m;
        this.f1923n = aVar.f1942n;
        this.f1924o = aVar.f1943o;
        this.f1925p = aVar.f1944p;
        this.f1926q = aVar.f1945q;
        this.f1927r = aVar.f1946r;
        this.f1928s = aVar.f1947s;
    }

    /* renamed from: a */
    public boolean mo2844a() {
        return (this.f1913d == null && this.f1910a == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean mo2846b() {
        return (this.f1914e == null && this.f1911b == 0) ? false : true;
    }

    /* renamed from: c */
    public boolean mo2848c() {
        return (this.f1915f == null && this.f1912c == 0) ? false : true;
    }

    /* renamed from: d */
    public boolean mo2849d() {
        return this.f1924o != null;
    }

    /* renamed from: e */
    public boolean mo2850e() {
        return this.f1925p != null;
    }

    /* renamed from: f */
    public boolean mo2851f() {
        return this.f1921l > 0;
    }

    /* renamed from: a */
    public Drawable mo2843a(Resources resources) {
        return this.f1910a != 0 ? resources.getDrawable(this.f1910a) : this.f1913d;
    }

    /* renamed from: b */
    public Drawable mo2845b(Resources resources) {
        return this.f1911b != 0 ? resources.getDrawable(this.f1911b) : this.f1914e;
    }

    /* renamed from: c */
    public Drawable mo2847c(Resources resources) {
        return this.f1912c != 0 ? resources.getDrawable(this.f1912c) : this.f1915f;
    }

    /* renamed from: g */
    public boolean mo2852g() {
        return this.f1916g;
    }

    /* renamed from: h */
    public boolean mo2853h() {
        return this.f1917h;
    }

    /* renamed from: i */
    public boolean mo2854i() {
        return this.f1918i;
    }

    /* renamed from: j */
    public C0756d mo2855j() {
        return this.f1919j;
    }

    /* renamed from: k */
    public BitmapFactory.Options mo2856k() {
        return this.f1920k;
    }

    /* renamed from: l */
    public int mo2857l() {
        return this.f1921l;
    }

    /* renamed from: m */
    public boolean mo2858m() {
        return this.f1922m;
    }

    /* renamed from: n */
    public Object mo2859n() {
        return this.f1923n;
    }

    /* renamed from: o */
    public C0800a mo2860o() {
        return this.f1924o;
    }

    /* renamed from: p */
    public C0800a mo2861p() {
        return this.f1925p;
    }

    /* renamed from: q */
    public C0771a mo2862q() {
        return this.f1926q;
    }

    /* renamed from: r */
    public Handler mo2863r() {
        return this.f1927r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo2864s() {
        return this.f1928s;
    }

    /* renamed from: com.a.a.b.c$a */
    /* compiled from: DisplayImageOptions */
    public static class C0770a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f1929a = 0;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f1930b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f1931c = 0;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Drawable f1932d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Drawable f1933e = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Drawable f1934f = null;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f1935g = false;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f1936h = false;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f1937i = false;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C0756d f1938j = C0756d.IN_SAMPLE_POWER_OF_2;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public BitmapFactory.Options f1939k = new BitmapFactory.Options();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f1940l = 0;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public boolean f1941m = false;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Object f1942n = null;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C0800a f1943o = null;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public C0800a f1944p = null;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C0771a f1945q = C0741a.m4217c();
        /* access modifiers changed from: private */

        /* renamed from: r */
        public Handler f1946r = null;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public boolean f1947s = false;

        public C0770a() {
            this.f1939k.inPurgeable = true;
            this.f1939k.inInputShareable = true;
        }

        @Deprecated
        /* renamed from: a */
        public C0770a mo2866a(int i) {
            this.f1929a = i;
            return this;
        }

        /* renamed from: b */
        public C0770a mo2878b(int i) {
            this.f1929a = i;
            return this;
        }

        /* renamed from: a */
        public C0770a mo2869a(Drawable drawable) {
            this.f1932d = drawable;
            return this;
        }

        /* renamed from: c */
        public C0770a mo2883c(int i) {
            this.f1930b = i;
            return this;
        }

        /* renamed from: b */
        public C0770a mo2879b(Drawable drawable) {
            this.f1933e = drawable;
            return this;
        }

        /* renamed from: d */
        public C0770a mo2886d(int i) {
            this.f1931c = i;
            return this;
        }

        /* renamed from: c */
        public C0770a mo2884c(Drawable drawable) {
            this.f1934f = drawable;
            return this;
        }

        /* renamed from: a */
        public C0770a mo2865a() {
            this.f1935g = true;
            return this;
        }

        /* renamed from: a */
        public C0770a mo2876a(boolean z) {
            this.f1935g = z;
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C0770a mo2877b() {
            this.f1936h = true;
            return this;
        }

        /* renamed from: b */
        public C0770a mo2881b(boolean z) {
            this.f1936h = z;
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C0770a mo2882c() {
            return mo2887d(true);
        }

        @Deprecated
        /* renamed from: c */
        public C0770a mo2885c(boolean z) {
            return mo2887d(z);
        }

        /* renamed from: d */
        public C0770a mo2887d(boolean z) {
            this.f1937i = z;
            return this;
        }

        /* renamed from: a */
        public C0770a mo2871a(C0756d dVar) {
            this.f1938j = dVar;
            return this;
        }

        /* renamed from: a */
        public C0770a mo2867a(Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("bitmapConfig can't be null");
            }
            this.f1939k.inPreferredConfig = config;
            return this;
        }

        /* renamed from: a */
        public C0770a mo2868a(BitmapFactory.Options options) {
            if (options == null) {
                throw new IllegalArgumentException("decodingOptions can't be null");
            }
            this.f1939k = options;
            return this;
        }

        /* renamed from: e */
        public C0770a mo2889e(int i) {
            this.f1940l = i;
            return this;
        }

        /* renamed from: a */
        public C0770a mo2875a(Object obj) {
            this.f1942n = obj;
            return this;
        }

        /* renamed from: e */
        public C0770a mo2890e(boolean z) {
            this.f1941m = z;
            return this;
        }

        /* renamed from: a */
        public C0770a mo2874a(C0800a aVar) {
            this.f1943o = aVar;
            return this;
        }

        /* renamed from: b */
        public C0770a mo2880b(C0800a aVar) {
            this.f1944p = aVar;
            return this;
        }

        /* renamed from: a */
        public C0770a mo2872a(C0771a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("displayer can't be null");
            }
            this.f1945q = aVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0770a mo2891f(boolean z) {
            this.f1947s = z;
            return this;
        }

        /* renamed from: a */
        public C0770a mo2870a(Handler handler) {
            this.f1946r = handler;
            return this;
        }

        /* renamed from: a */
        public C0770a mo2873a(C0768c cVar) {
            this.f1929a = cVar.f1910a;
            this.f1930b = cVar.f1911b;
            this.f1931c = cVar.f1912c;
            this.f1932d = cVar.f1913d;
            this.f1933e = cVar.f1914e;
            this.f1934f = cVar.f1915f;
            this.f1935g = cVar.f1916g;
            this.f1936h = cVar.f1917h;
            this.f1937i = cVar.f1918i;
            this.f1938j = cVar.f1919j;
            this.f1939k = cVar.f1920k;
            this.f1940l = cVar.f1921l;
            this.f1941m = cVar.f1922m;
            this.f1942n = cVar.f1923n;
            this.f1943o = cVar.f1924o;
            this.f1944p = cVar.f1925p;
            this.f1945q = cVar.f1926q;
            this.f1946r = cVar.f1927r;
            this.f1947s = cVar.f1928s;
            return this;
        }

        /* renamed from: d */
        public C0768c mo2888d() {
            return new C0768c(this);
        }
    }

    /* renamed from: t */
    public static C0768c m4339t() {
        return new C0770a().mo2888d();
    }
}
