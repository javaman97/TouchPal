package com.p023a.p024a.p032b;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.p023a.p024a.p025a.p026a.C0725b;
import com.p023a.p024a.p025a.p026a.p029b.C0726a;
import com.p023a.p024a.p025a.p030b.C0739c;
import com.p023a.p024a.p025a.p030b.p031a.C0731b;
import com.p023a.p024a.p032b.p033a.C0755c;
import com.p023a.p024a.p032b.p033a.C0757e;
import com.p023a.p024a.p032b.p033a.C0759g;
import com.p023a.p024a.p032b.p035b.C0766b;
import com.p023a.p024a.p032b.p037d.C0783b;
import com.p023a.p024a.p032b.p040g.C0800a;
import com.p023a.p024a.p041c.C0813d;
import com.p023a.p024a.p041c.C0814e;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.a.a.b.e */
/* compiled from: ImageLoaderConfiguration */
public final class C0785e {

    /* renamed from: a */
    final Resources f1994a;

    /* renamed from: b */
    final int f1995b;

    /* renamed from: c */
    final int f1996c;

    /* renamed from: d */
    final int f1997d;

    /* renamed from: e */
    final int f1998e;

    /* renamed from: f */
    final C0800a f1999f;

    /* renamed from: g */
    final Executor f2000g;

    /* renamed from: h */
    final Executor f2001h;

    /* renamed from: i */
    final boolean f2002i;

    /* renamed from: j */
    final boolean f2003j;

    /* renamed from: k */
    final int f2004k;

    /* renamed from: l */
    final int f2005l;

    /* renamed from: m */
    final C0759g f2006m;

    /* renamed from: n */
    final C0739c f2007n;

    /* renamed from: o */
    final C0725b f2008o;

    /* renamed from: p */
    final C0783b f2009p;

    /* renamed from: q */
    final C0766b f2010q;

    /* renamed from: r */
    final C0768c f2011r;

    /* renamed from: s */
    final C0783b f2012s;

    /* renamed from: t */
    final C0783b f2013t;

    private C0785e(C0787a aVar) {
        this.f1994a = aVar.f2027h.getResources();
        this.f1995b = aVar.f2028i;
        this.f1996c = aVar.f2029j;
        this.f1997d = aVar.f2030k;
        this.f1998e = aVar.f2031l;
        this.f1999f = aVar.f2032m;
        this.f2000g = aVar.f2033n;
        this.f2001h = aVar.f2034o;
        this.f2004k = aVar.f2037r;
        this.f2005l = aVar.f2038s;
        this.f2006m = aVar.f2040u;
        this.f2008o = aVar.f2045z;
        this.f2007n = aVar.f2044y;
        this.f2011r = aVar.f2025D;
        this.f2009p = aVar.f2023B;
        this.f2010q = aVar.f2024C;
        this.f2002i = aVar.f2035p;
        this.f2003j = aVar.f2036q;
        this.f2012s = new C0788b(this.f2009p);
        this.f2013t = new C0789c(this.f2009p);
        C0813d.m4625a(aVar.f2026E);
    }

    /* renamed from: a */
    public static C0785e m4470a(Context context) {
        return new C0787a(context).mo2967c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0757e mo2947a() {
        DisplayMetrics displayMetrics = this.f1994a.getDisplayMetrics();
        int i = this.f1995b;
        if (i <= 0) {
            i = displayMetrics.widthPixels;
        }
        int i2 = this.f1996c;
        if (i2 <= 0) {
            i2 = displayMetrics.heightPixels;
        }
        return new C0757e(i, i2);
    }

    /* renamed from: com.a.a.b.e$a */
    /* compiled from: ImageLoaderConfiguration */
    public static class C0787a {

        /* renamed from: a */
        public static final int f2015a = 3;

        /* renamed from: b */
        public static final int f2016b = 4;

        /* renamed from: c */
        public static final C0759g f2017c = C0759g.FIFO;

        /* renamed from: d */
        private static final String f2018d = "diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other";

        /* renamed from: e */
        private static final String f2019e = "diskCache() and diskCacheFileNameGenerator() calls overlap each other";

        /* renamed from: f */
        private static final String f2020f = "memoryCache() and memoryCacheSize() calls overlap each other";

        /* renamed from: g */
        private static final String f2021g = "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.";

        /* renamed from: A */
        private C0726a f2022A = null;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public C0783b f2023B = null;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public C0766b f2024C;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public C0768c f2025D = null;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public boolean f2026E = false;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Context f2027h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f2028i = 0;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f2029j = 0;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f2030k = 0;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f2031l = 0;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C0800a f2032m = null;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Executor f2033n = null;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public Executor f2034o = null;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f2035p = false;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public boolean f2036q = false;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public int f2037r = 3;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public int f2038s = 4;

        /* renamed from: t */
        private boolean f2039t = false;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public C0759g f2040u = f2017c;

        /* renamed from: v */
        private int f2041v = 0;

        /* renamed from: w */
        private long f2042w = 0;

        /* renamed from: x */
        private int f2043x = 0;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public C0739c f2044y = null;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public C0725b f2045z = null;

        public C0787a(Context context) {
            this.f2027h = context.getApplicationContext();
        }

        /* renamed from: a */
        public C0787a mo2950a(int i, int i2) {
            this.f2028i = i;
            this.f2029j = i2;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C0787a mo2951a(int i, int i2, C0800a aVar) {
            return mo2962b(i, i2, aVar);
        }

        /* renamed from: b */
        public C0787a mo2962b(int i, int i2, C0800a aVar) {
            this.f2030k = i;
            this.f2031l = i2;
            this.f2032m = aVar;
            return this;
        }

        /* renamed from: a */
        public C0787a mo2959a(Executor executor) {
            if (!(this.f2037r == 3 && this.f2038s == 4 && this.f2040u == f2017c)) {
                C0813d.m4629c(f2021g, new Object[0]);
            }
            this.f2033n = executor;
            return this;
        }

        /* renamed from: b */
        public C0787a mo2965b(Executor executor) {
            if (!(this.f2037r == 3 && this.f2038s == 4 && this.f2040u == f2017c)) {
                C0813d.m4629c(f2021g, new Object[0]);
            }
            this.f2034o = executor;
            return this;
        }

        /* renamed from: a */
        public C0787a mo2949a(int i) {
            if (!(this.f2033n == null && this.f2034o == null)) {
                C0813d.m4629c(f2021g, new Object[0]);
            }
            this.f2037r = i;
            return this;
        }

        /* renamed from: b */
        public C0787a mo2961b(int i) {
            if (!(this.f2033n == null && this.f2034o == null)) {
                C0813d.m4629c(f2021g, new Object[0]);
            }
            if (i < 1) {
                this.f2038s = 1;
            } else if (i > 10) {
                this.f2038s = 10;
            } else {
                this.f2038s = i;
            }
            return this;
        }

        /* renamed from: a */
        public C0787a mo2948a() {
            this.f2039t = true;
            return this;
        }

        /* renamed from: a */
        public C0787a mo2955a(C0759g gVar) {
            if (!(this.f2033n == null && this.f2034o == null)) {
                C0813d.m4629c(f2021g, new Object[0]);
            }
            this.f2040u = gVar;
            return this;
        }

        /* renamed from: c */
        public C0787a mo2966c(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("memoryCacheSize must be a positive number");
            }
            if (this.f2044y != null) {
                C0813d.m4629c(f2020f, new Object[0]);
            }
            this.f2041v = i;
            return this;
        }

        /* renamed from: d */
        public C0787a mo2968d(int i) {
            if (i <= 0 || i >= 100) {
                throw new IllegalArgumentException("availableMemoryPercent must be in range (0 < % < 100)");
            }
            if (this.f2044y != null) {
                C0813d.m4629c(f2020f, new Object[0]);
            }
            this.f2041v = (int) (((float) Runtime.getRuntime().maxMemory()) * (((float) i) / 100.0f));
            return this;
        }

        /* renamed from: a */
        public C0787a mo2954a(C0739c cVar) {
            if (this.f2041v != 0) {
                C0813d.m4629c(f2020f, new Object[0]);
            }
            this.f2044y = cVar;
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public C0787a mo2969e(int i) {
            return mo2970f(i);
        }

        /* renamed from: f */
        public C0787a mo2970f(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("maxCacheSize must be a positive number");
            }
            if (this.f2045z != null) {
                C0813d.m4629c(f2018d, new Object[0]);
            }
            this.f2042w = (long) i;
            return this;
        }

        @Deprecated
        /* renamed from: g */
        public C0787a mo2971g(int i) {
            return mo2972h(i);
        }

        /* renamed from: h */
        public C0787a mo2972h(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("maxFileCount must be a positive number");
            }
            if (this.f2045z != null) {
                C0813d.m4629c(f2018d, new Object[0]);
            }
            this.f2043x = i;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C0787a mo2952a(C0726a aVar) {
            return mo2963b(aVar);
        }

        /* renamed from: b */
        public C0787a mo2963b(C0726a aVar) {
            if (this.f2045z != null) {
                C0813d.m4629c(f2019e, new Object[0]);
            }
            this.f2022A = aVar;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C0787a mo2953a(C0725b bVar) {
            return mo2964b(bVar);
        }

        /* renamed from: b */
        public C0787a mo2964b(C0725b bVar) {
            if (this.f2042w > 0 || this.f2043x > 0) {
                C0813d.m4629c(f2018d, new Object[0]);
            }
            if (this.f2022A != null) {
                C0813d.m4629c(f2019e, new Object[0]);
            }
            this.f2045z = bVar;
            return this;
        }

        /* renamed from: a */
        public C0787a mo2958a(C0783b bVar) {
            this.f2023B = bVar;
            return this;
        }

        /* renamed from: a */
        public C0787a mo2956a(C0766b bVar) {
            this.f2024C = bVar;
            return this;
        }

        /* renamed from: a */
        public C0787a mo2957a(C0768c cVar) {
            this.f2025D = cVar;
            return this;
        }

        /* renamed from: b */
        public C0787a mo2960b() {
            this.f2026E = true;
            return this;
        }

        /* renamed from: c */
        public C0785e mo2967c() {
            m4476d();
            return new C0785e(this);
        }

        /* renamed from: d */
        private void m4476d() {
            if (this.f2033n == null) {
                this.f2033n = C0741a.m4213a(this.f2037r, this.f2038s, this.f2040u);
            } else {
                this.f2035p = true;
            }
            if (this.f2034o == null) {
                this.f2034o = C0741a.m4213a(this.f2037r, this.f2038s, this.f2040u);
            } else {
                this.f2036q = true;
            }
            if (this.f2045z == null) {
                if (this.f2022A == null) {
                    this.f2022A = C0741a.m4215b();
                }
                this.f2045z = C0741a.m4208a(this.f2027h, this.f2022A, this.f2042w, this.f2043x);
            }
            if (this.f2044y == null) {
                this.f2044y = C0741a.m4209a(this.f2041v);
            }
            if (this.f2039t) {
                this.f2044y = new C0731b(this.f2044y, C0814e.m4632a());
            }
            if (this.f2023B == null) {
                this.f2023B = C0741a.m4211a(this.f2027h);
            }
            if (this.f2024C == null) {
                this.f2024C = C0741a.m4210a(this.f2026E);
            }
            if (this.f2025D == null) {
                this.f2025D = C0768c.m4339t();
            }
        }
    }

    /* renamed from: com.a.a.b.e$b */
    /* compiled from: ImageLoaderConfiguration */
    private static class C0788b implements C0783b {

        /* renamed from: a */
        private final C0783b f2046a;

        public C0788b(C0783b bVar) {
            this.f2046a = bVar;
        }

        /* renamed from: a */
        public InputStream mo2937a(String str, Object obj) throws IOException {
            switch (C0783b.C0784a.m4466a(str)) {
                case HTTP:
                case HTTPS:
                    throw new IllegalStateException();
                default:
                    return this.f2046a.mo2937a(str, obj);
            }
        }
    }

    /* renamed from: com.a.a.b.e$c */
    /* compiled from: ImageLoaderConfiguration */
    private static class C0789c implements C0783b {

        /* renamed from: a */
        private final C0783b f2047a;

        public C0789c(C0783b bVar) {
            this.f2047a = bVar;
        }

        /* renamed from: a */
        public InputStream mo2937a(String str, Object obj) throws IOException {
            InputStream a = this.f2047a.mo2937a(str, obj);
            switch (C0783b.C0784a.m4466a(str)) {
                case HTTP:
                case HTTPS:
                    return new C0755c(a);
                default:
                    return a;
            }
        }
    }
}
