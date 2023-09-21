package com.p023a.p024a.p032b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.p023a.p024a.p032b.C0768c;
import com.p023a.p024a.p032b.p033a.C0753b;
import com.p023a.p024a.p032b.p033a.C0756d;
import com.p023a.p024a.p032b.p033a.C0757e;
import com.p023a.p024a.p032b.p033a.C0758f;
import com.p023a.p024a.p032b.p033a.C0760h;
import com.p023a.p024a.p032b.p035b.C0766b;
import com.p023a.p024a.p032b.p035b.C0767c;
import com.p023a.p024a.p032b.p037d.C0783b;
import com.p023a.p024a.p032b.p038e.C0790a;
import com.p023a.p024a.p032b.p039f.C0795a;
import com.p023a.p024a.p032b.p039f.C0796b;
import com.p023a.p024a.p041c.C0811c;
import com.p023a.p024a.p041c.C0813d;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.a.a.b.i */
/* compiled from: LoadAndDisplayImageTask */
final class C0802i implements C0811c.C0812a, Runnable {

    /* renamed from: f */
    private static final String f2079f = "ImageLoader is paused. Waiting...  [%s]";

    /* renamed from: g */
    private static final String f2080g = ".. Resume loading [%s]";

    /* renamed from: h */
    private static final String f2081h = "Delay %d ms before loading...  [%s]";

    /* renamed from: i */
    private static final String f2082i = "Start display image task [%s]";

    /* renamed from: j */
    private static final String f2083j = "Image already is loading. Waiting... [%s]";

    /* renamed from: k */
    private static final String f2084k = "...Get cached bitmap from memory after waiting. [%s]";

    /* renamed from: l */
    private static final String f2085l = "Load image from network [%s]";

    /* renamed from: m */
    private static final String f2086m = "Load image from disk cache [%s]";

    /* renamed from: n */
    private static final String f2087n = "Resize image in disk cache [%s]";

    /* renamed from: o */
    private static final String f2088o = "PreProcess image before caching in memory [%s]";

    /* renamed from: p */
    private static final String f2089p = "PostProcess image before displaying [%s]";

    /* renamed from: q */
    private static final String f2090q = "Cache image in memory [%s]";

    /* renamed from: r */
    private static final String f2091r = "Cache image on disk [%s]";

    /* renamed from: s */
    private static final String f2092s = "Process image before cache on disk [%s]";

    /* renamed from: t */
    private static final String f2093t = "ImageAware is reused for another image. Task is cancelled. [%s]";

    /* renamed from: u */
    private static final String f2094u = "ImageAware was collected by GC. Task is cancelled. [%s]";

    /* renamed from: v */
    private static final String f2095v = "Task was interrupted [%s]";

    /* renamed from: w */
    private static final String f2096w = "Pre-processor returned null [%s]";

    /* renamed from: x */
    private static final String f2097x = "Post-processor returned null [%s]";

    /* renamed from: y */
    private static final String f2098y = "Bitmap processor for disk cache returned null [%s]";

    /* renamed from: A */
    private final C0801h f2099A;

    /* renamed from: B */
    private final Handler f2100B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C0785e f2101C;

    /* renamed from: D */
    private final C0783b f2102D;

    /* renamed from: E */
    private final C0783b f2103E;

    /* renamed from: F */
    private final C0783b f2104F;

    /* renamed from: G */
    private final C0766b f2105G;

    /* renamed from: H */
    private final String f2106H;

    /* renamed from: I */
    private final C0757e f2107I;

    /* renamed from: J */
    private final boolean f2108J;

    /* renamed from: K */
    private C0758f f2109K = C0758f.NETWORK;

    /* renamed from: a */
    final String f2110a;

    /* renamed from: b */
    final C0790a f2111b;

    /* renamed from: c */
    final C0768c f2112c;

    /* renamed from: d */
    final C0795a f2113d;

    /* renamed from: e */
    final C0796b f2114e;

    /* renamed from: z */
    private final C0794f f2115z;

    public C0802i(C0794f fVar, C0801h hVar, Handler handler) {
        this.f2115z = fVar;
        this.f2099A = hVar;
        this.f2100B = handler;
        this.f2101C = fVar.f2055a;
        this.f2102D = this.f2101C.f2009p;
        this.f2103E = this.f2101C.f2012s;
        this.f2104F = this.f2101C.f2013t;
        this.f2105G = this.f2101C.f2010q;
        this.f2110a = hVar.f2071a;
        this.f2106H = hVar.f2072b;
        this.f2111b = hVar.f2073c;
        this.f2107I = hVar.f2074d;
        this.f2112c = hVar.f2075e;
        this.f2113d = hVar.f2076f;
        this.f2114e = hVar.f2077g;
        this.f2108J = this.f2112c.mo2864s();
    }

    public void run() {
        if (!m4588b() && !m4590c()) {
            ReentrantLock reentrantLock = this.f2099A.f2078h;
            C0813d.m4622a(f2082i, this.f2106H);
            if (reentrantLock.isLocked()) {
                C0813d.m4622a(f2083j, this.f2106H);
            }
            reentrantLock.lock();
            try {
                m4597i();
                Bitmap bitmap = (Bitmap) this.f2101C.f2007n.mo2739b(this.f2106H);
                if (bitmap == null || bitmap.isRecycled()) {
                    bitmap = m4592d();
                    if (bitmap != null) {
                        m4597i();
                        m4603o();
                        if (this.f2112c.mo2849d()) {
                            C0813d.m4622a(f2088o, this.f2106H);
                            bitmap = this.f2112c.mo2860o().mo3007a(bitmap);
                            if (bitmap == null) {
                                C0813d.m4630d(f2096w, this.f2106H);
                            }
                        }
                        if (bitmap != null && this.f2112c.mo2853h()) {
                            C0813d.m4622a(f2090q, this.f2106H);
                            this.f2101C.f2007n.mo2736a(this.f2106H, bitmap);
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f2109K = C0758f.MEMORY_CACHE;
                    C0813d.m4622a(f2084k, this.f2106H);
                }
                if (bitmap != null && this.f2112c.mo2850e()) {
                    C0813d.m4622a(f2089p, this.f2106H);
                    bitmap = this.f2112c.mo2861p().mo3007a(bitmap);
                    if (bitmap == null) {
                        C0813d.m4630d(f2097x, this.f2106H);
                    }
                }
                m4597i();
                m4603o();
                reentrantLock.unlock();
                m4587a(new C0762b(bitmap, this.f2099A, this.f2115z, this.f2109K), this.f2108J, this.f2100B, this.f2115z);
            } catch (C0803a e) {
                m4595g();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: b */
    private boolean m4588b() {
        AtomicBoolean d = this.f2115z.mo2996d();
        if (d.get()) {
            synchronized (this.f2115z.mo2997e()) {
                if (d.get()) {
                    C0813d.m4622a(f2079f, this.f2106H);
                    try {
                        this.f2115z.mo2997e().wait();
                        C0813d.m4622a(f2080g, this.f2106H);
                    } catch (InterruptedException e) {
                        C0813d.m4630d(f2095v, this.f2106H);
                        return true;
                    }
                }
            }
        }
        return m4598j();
    }

    /* renamed from: c */
    private boolean m4590c() {
        if (!this.f2112c.mo2851f()) {
            return false;
        }
        C0813d.m4622a(f2081h, Integer.valueOf(this.f2112c.mo2857l()), this.f2106H);
        try {
            Thread.sleep((long) this.f2112c.mo2857l());
            return m4598j();
        } catch (InterruptedException e) {
            C0813d.m4630d(f2095v, this.f2106H);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r0.getHeight() > 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        r6 = r0;
        r0 = null;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        r6 = r0;
        r0 = null;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bb, code lost:
        r6 = r0;
        r0 = null;
        r1 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e A[ExcHandler: a (r0v9 'e' com.a.a.b.i$a A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m4592d() throws com.p023a.p024a.p032b.C0802i.C0803a {
        /*
            r7 = this;
            r1 = 0
            com.a.a.b.e r0 = r7.f2101C     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            com.a.a.a.a.b r0 = r0.f2008o     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            java.lang.String r2 = r7.f2110a     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            java.io.File r0 = r0.mo2679a(r2)     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            if (r0 == 0) goto L_0x00cf
            boolean r2 = r0.exists()     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            if (r2 == 0) goto L_0x00cf
            java.lang.String r2 = "Load image from disk cache [%s]"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            r4 = 0
            java.lang.String r5 = r7.f2106H     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            r3[r4] = r5     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            com.p023a.p024a.p041c.C0813d.m4622a(r2, r3)     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            com.a.a.b.a.f r2 = com.p023a.p024a.p032b.p033a.C0758f.DISC_CACHE     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            r7.f2109K = r2     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            r7.m4597i()     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            com.a.a.b.d.b$a r2 = com.p023a.p024a.p032b.p037d.C0783b.C0784a.FILE     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            java.lang.String r0 = r2.mo2945b(r0)     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
            android.graphics.Bitmap r0 = r7.m4584a((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0096, a -> 0x009e, IOException -> 0x00a0, OutOfMemoryError -> 0x00ad, Throwable -> 0x00ba }
        L_0x0035:
            if (r0 == 0) goto L_0x0043
            int r2 = r0.getWidth()     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            if (r2 <= 0) goto L_0x0043
            int r2 = r0.getHeight()     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            if (r2 > 0) goto L_0x0095
        L_0x0043:
            java.lang.String r2 = "Load image from network [%s]"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            r4 = 0
            java.lang.String r5 = r7.f2106H     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            r3[r4] = r5     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            com.p023a.p024a.p041c.C0813d.m4622a(r2, r3)     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            com.a.a.b.a.f r2 = com.p023a.p024a.p032b.p033a.C0758f.NETWORK     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            r7.f2109K = r2     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            java.lang.String r2 = r7.f2110a     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            com.a.a.b.c r3 = r7.f2112c     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            boolean r3 = r3.mo2854i()     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            if (r3 == 0) goto L_0x007a
            boolean r3 = r7.m4593e()     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            if (r3 == 0) goto L_0x007a
            com.a.a.b.e r3 = r7.f2101C     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            com.a.a.a.a.b r3 = r3.f2008o     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            java.lang.String r4 = r7.f2110a     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            java.io.File r3 = r3.mo2679a(r4)     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            if (r3 == 0) goto L_0x007a
            com.a.a.b.d.b$a r2 = com.p023a.p024a.p032b.p037d.C0783b.C0784a.FILE     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            java.lang.String r2 = r2.mo2945b(r3)     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
        L_0x007a:
            r7.m4597i()     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            android.graphics.Bitmap r0 = r7.m4584a((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            if (r0 == 0) goto L_0x008f
            int r2 = r0.getWidth()     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            if (r2 <= 0) goto L_0x008f
            int r2 = r0.getHeight()     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            if (r2 > 0) goto L_0x0095
        L_0x008f:
            com.a.a.b.a.b$a r2 = com.p023a.p024a.p032b.p033a.C0753b.C0754a.DECODING_ERROR     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
            r3 = 0
            r7.m4586a((com.p023a.p024a.p032b.p033a.C0753b.C0754a) r2, (java.lang.Throwable) r3)     // Catch:{ IllegalStateException -> 0x00cd, a -> 0x009e, IOException -> 0x00cb, OutOfMemoryError -> 0x00c9, Throwable -> 0x00c7 }
        L_0x0095:
            return r0
        L_0x0096:
            r0 = move-exception
            r0 = r1
        L_0x0098:
            com.a.a.b.a.b$a r2 = com.p023a.p024a.p032b.p033a.C0753b.C0754a.NETWORK_DENIED
            r7.m4586a((com.p023a.p024a.p032b.p033a.C0753b.C0754a) r2, (java.lang.Throwable) r1)
            goto L_0x0095
        L_0x009e:
            r0 = move-exception
            throw r0
        L_0x00a0:
            r0 = move-exception
            r6 = r0
            r0 = r1
            r1 = r6
        L_0x00a4:
            com.p023a.p024a.p041c.C0813d.m4623a((java.lang.Throwable) r1)
            com.a.a.b.a.b$a r2 = com.p023a.p024a.p032b.p033a.C0753b.C0754a.IO_ERROR
            r7.m4586a((com.p023a.p024a.p032b.p033a.C0753b.C0754a) r2, (java.lang.Throwable) r1)
            goto L_0x0095
        L_0x00ad:
            r0 = move-exception
            r6 = r0
            r0 = r1
            r1 = r6
        L_0x00b1:
            com.p023a.p024a.p041c.C0813d.m4623a((java.lang.Throwable) r1)
            com.a.a.b.a.b$a r2 = com.p023a.p024a.p032b.p033a.C0753b.C0754a.OUT_OF_MEMORY
            r7.m4586a((com.p023a.p024a.p032b.p033a.C0753b.C0754a) r2, (java.lang.Throwable) r1)
            goto L_0x0095
        L_0x00ba:
            r0 = move-exception
            r6 = r0
            r0 = r1
            r1 = r6
        L_0x00be:
            com.p023a.p024a.p041c.C0813d.m4623a((java.lang.Throwable) r1)
            com.a.a.b.a.b$a r2 = com.p023a.p024a.p032b.p033a.C0753b.C0754a.UNKNOWN
            r7.m4586a((com.p023a.p024a.p032b.p033a.C0753b.C0754a) r2, (java.lang.Throwable) r1)
            goto L_0x0095
        L_0x00c7:
            r1 = move-exception
            goto L_0x00be
        L_0x00c9:
            r1 = move-exception
            goto L_0x00b1
        L_0x00cb:
            r1 = move-exception
            goto L_0x00a4
        L_0x00cd:
            r2 = move-exception
            goto L_0x0098
        L_0x00cf:
            r0 = r1
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p023a.p024a.p032b.C0802i.m4592d():android.graphics.Bitmap");
    }

    /* renamed from: a */
    private Bitmap m4584a(String str) throws IOException {
        String str2 = str;
        return this.f2105G.mo2827a(new C0767c(this.f2106H, str2, this.f2110a, this.f2107I, this.f2111b.mo2977c(), m4596h(), this.f2112c));
    }

    /* renamed from: e */
    private boolean m4593e() throws C0803a {
        C0813d.m4622a(f2091r, this.f2106H);
        try {
            boolean f = m4594f();
            if (!f) {
                return f;
            }
            int i = this.f2101C.f1997d;
            int i2 = this.f2101C.f1998e;
            if (i <= 0 && i2 <= 0) {
                return f;
            }
            C0813d.m4622a(f2087n, this.f2106H);
            m4589b(i, i2);
            return f;
        } catch (IOException e) {
            C0813d.m4623a((Throwable) e);
            return false;
        }
    }

    /* renamed from: f */
    private boolean m4594f() throws IOException {
        return this.f2101C.f2008o.mo2681a(this.f2110a, m4596h().mo2937a(this.f2110a, this.f2112c.mo2859n()), this);
    }

    /* renamed from: b */
    private boolean m4589b(int i, int i2) throws IOException {
        File a = this.f2101C.f2008o.mo2679a(this.f2110a);
        if (a != null && a.exists()) {
            Bitmap a2 = this.f2105G.mo2827a(new C0767c(this.f2106H, C0783b.C0784a.FILE.mo2945b(a.getAbsolutePath()), this.f2110a, new C0757e(i, i2), C0760h.FIT_INSIDE, m4596h(), new C0768c.C0770a().mo2873a(this.f2112c).mo2871a(C0756d.IN_SAMPLE_INT).mo2888d()));
            if (!(a2 == null || this.f2101C.f1999f == null)) {
                C0813d.m4622a(f2092s, this.f2106H);
                a2 = this.f2101C.f1999f.mo3007a(a2);
                if (a2 == null) {
                    C0813d.m4630d(f2098y, this.f2106H);
                }
            }
            Bitmap bitmap = a2;
            if (bitmap != null) {
                boolean a3 = this.f2101C.f2008o.mo2680a(this.f2110a, bitmap);
                bitmap.recycle();
                return a3;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3009a(int i, int i2) {
        return this.f2108J || m4591c(i, i2);
    }

    /* renamed from: c */
    private boolean m4591c(int i, int i2) {
        if (m4604p() || m4598j()) {
            return false;
        }
        if (this.f2114e != null) {
            m4587a(new C0804j(this, i, i2), false, this.f2100B, this.f2115z);
        }
        return true;
    }

    /* renamed from: a */
    private void m4586a(C0753b.C0754a aVar, Throwable th) {
        if (!this.f2108J && !m4604p() && !m4598j()) {
            m4587a(new C0805k(this, aVar, th), false, this.f2100B, this.f2115z);
        }
    }

    /* renamed from: g */
    private void m4595g() {
        if (!this.f2108J && !m4604p()) {
            m4587a(new C0806l(this), false, this.f2100B, this.f2115z);
        }
    }

    /* renamed from: h */
    private C0783b m4596h() {
        if (this.f2115z.mo2998f()) {
            return this.f2103E;
        }
        if (this.f2115z.mo2999g()) {
            return this.f2104F;
        }
        return this.f2102D;
    }

    /* renamed from: i */
    private void m4597i() throws C0803a {
        m4599k();
        m4601m();
    }

    /* renamed from: j */
    private boolean m4598j() {
        return m4600l() || m4602n();
    }

    /* renamed from: k */
    private void m4599k() throws C0803a {
        if (m4600l()) {
            throw new C0803a();
        }
    }

    /* renamed from: l */
    private boolean m4600l() {
        if (!this.f2111b.mo2979e()) {
            return false;
        }
        C0813d.m4622a(f2094u, this.f2106H);
        return true;
    }

    /* renamed from: m */
    private void m4601m() throws C0803a {
        if (m4602n()) {
            throw new C0803a();
        }
    }

    /* renamed from: n */
    private boolean m4602n() {
        if (!(!this.f2106H.equals(this.f2115z.mo2984a(this.f2111b)))) {
            return false;
        }
        C0813d.m4622a(f2093t, this.f2106H);
        return true;
    }

    /* renamed from: o */
    private void m4603o() throws C0803a {
        if (m4604p()) {
            throw new C0803a();
        }
    }

    /* renamed from: p */
    private boolean m4604p() {
        if (!Thread.interrupted()) {
            return false;
        }
        C0813d.m4622a(f2095v, this.f2106H);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo3008a() {
        return this.f2110a;
    }

    /* renamed from: a */
    static void m4587a(Runnable runnable, boolean z, Handler handler, C0794f fVar) {
        if (z) {
            runnable.run();
        } else if (handler == null) {
            fVar.mo2990a(runnable);
        } else {
            handler.post(runnable);
        }
    }

    /* renamed from: com.a.a.b.i$a */
    /* compiled from: LoadAndDisplayImageTask */
    class C0803a extends Exception {
        C0803a() {
        }
    }
}
